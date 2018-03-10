/**
 * This file is part of the SUNFISH project (http://www.sunfishproject.eu/).
 * 
 * Copyright 2017 Cybernetica AS
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
     * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
$(document).ready(function() {
    $("#sendSearch").submit(function(e) {
        e.preventDefault();
    });
    getList();
});

getList = function() {
    var jwt = localStorage.getItem('json-web-token');
    if (jwt) {
        var payload = {
            'jwt': jwt 
        };

        $.ajax({
            url: '/rest/search',
            type: 'get',
            headers: payload,
            success: function(data) {
                renderList(data.list);
            }
        });
    }
}

renderList = function(listData) {
    var len = listData.length;

    var searches = document.getElementById("accordion");
    searches.innerHTML = "";

    if (len == 0) searches.innerHTML = "No entries";

    var filesListHTML = '';

    for (var i = 0; i < len; i++) {
        var e = listData[i];

        var tooltip = `<div data-toggle="tooltip" data-placement="left" 
            title="${e.hits} results"><span class="badge badge-primary badge-pill">${e.hits}</span></div>`
        if (e.hits === 0) {
            tooltip = `<div data-toggle="tooltip" data-placement="left" 
            title="results pending"><img src="/img/clock.svg" alt="" height="24"></div>`
        }

        filesListHTML += `<li class="justify-content-between">
                         <span><tt>${e.filename}</tt></span>
                         (${e.rocuname})
                         </li>`;

        // Add a new review box if the next `element` has another reviewId:
        if (i+1 == len || listData[i+1].id != e.id) {
            var stringtemplate = `
                <div class="card panel">
                    <div class="card-header" role="tab" data-toggle="collapse" data-parent="#accordion" href="#collapse${i+1}">
                    <div class="d-flex w-100 justify-content-between">
                        <div><small class="text-muted"><span data-toggle="tooltip" 
                        data-placement="bottom" title="${e.date}">${e.htime}</span></small></div>
                        <span class="mb-1">${e.keyword}</span>
                        ${tooltip}
                    </div>
                    </div>`;
            if (e.hits > 0) {
                stringtemplate += `<div id="collapse${i+1}" class="collapse" role="tabpanel">
                    <div class="card-block ml-3 mt-2 justify-content-between flex-column align-items-start">
                        <h6>Matching documents:</h6>
                        <ul>
                            ${filesListHTML}
                        </ul>
                    </div>
                    </div>`;
            }
            stringtemplate += `</div>`;

            searches.insertAdjacentHTML('beforeend', stringtemplate);
            filesListHTML = '';
        }
    }
    $('[data-toggle="tooltip"]').tooltip();  
}

search = function() {
    var jwt = localStorage.getItem('json-web-token');
    var btn = document.getElementById("searchbtn");
    if (jwt) {
        var payload = {
            'jwt': jwt,
            'keyword': $('#searchterm').val()
        };

        btn.innerHTML = `<i class="fa fa-circle-notch fa-spin"></i> Searching`;
        $.post('/search/send', payload)
            .done(function(data) {
                console.log(data);
                $("#sendSearch").trigger("reset");
                // Refresh the data, but wait a couple of seconds for the
                // automatic approvals to come in:
                window.setTimeout(function () { getList(); }, 3000);
                btn.innerHTML = "Search";
            })
            .fail(function() {
                console.log("Fail");
                btn.innerHTML = "Search";
            }
        );
    }
} 