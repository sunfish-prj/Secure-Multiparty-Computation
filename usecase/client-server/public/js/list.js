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
    $("#sendDocument").submit(function(e) {
        e.preventDefault();
    });
    getList();
});

var getList = function() {
    var jwt = localStorage.getItem('json-web-token');
    if (jwt) {
        var payload = {
            'jwt': jwt 
        };

        $.ajax({
            url: '/rest/list',
            type: 'get',
            headers: payload,
            success: function(data) {
                renderList(data.list);
            }
        });
    }
}

var renderList = function(listdata) {
    var len = listdata.length;

    var accordion = document.getElementById("accordion");
    accordion.innerHTML = "";

    if (len == 0) accordion.innerHTML = "No entries";

    for (var i = 0; i < len; i++) {
        var show = "";
        if (i === len-1) {
            show = "show";
        }

        var filename = listdata[i].filename;
        var keywords = listdata[i].keywords;
        var confidentiality = listdata[i].confidentiality;
        var covered = listdata[i].covered ? "(covered)" : "";

        var numKeywords = keywords.split(", ").length;
        var stringtemplate = `
            <div class="card panel">
                <div class="card-header" role="tab" data-toggle="collapse" data-parent="#accordion" href="#collapse${i+1}">
                <span>
                    ${filename}
                    <span style="float:right;" class="badge badge-secondary badge-pill" data-toggle="tooltip" data-placement="left" title="${numKeywords} keyword(s)">${numKeywords}</span>
                </span>
                </div>
                <div id="collapse${i+1}" class="collapse ${show}" role="tabpanel">
                <div class="card-block ml-3 mt-2 justify-content-between flex-column align-items-start">
                    <small><tt>${filename}</tt></small>
                    <p><b>Confidentiality:</b> ${confidentiality} ${covered}<br>
                    <b>Keywords:</b> ${keywords}</p>
                </div>
                </div>
            </div>`;
        accordion.insertAdjacentHTML('afterbegin', stringtemplate);
        $(function () {
            $('[data-toggle="tooltip"]').tooltip()
        })
    }
}

var send = function() {
    console.log("here!");
    var jwt = localStorage.getItem('json-web-token');
    var name = $('#filenameSlot').val();
    var conf = $('#confidentialitySlot').val();
    var covered = $('#coveredSlot').is(':checked');
    var keywords = $('#keywordsSlot').val();

    var btn = document.getElementById("senddoc");
    covered = (covered) ? 1 : 0;
    
    var payload = {
        jwt: jwt,
        name: name,
        confidentiality: conf,
        covered: covered,
        keywords: keywords
    }

    btn.innerHTML = `<i class="fa fa-circle-notch fa-spin"></i> Uploading`;
    $.post('/list/send', payload)
        .done(function(data) {
            console.log(data);
            $("#sendDocument").trigger("reset");
            getList();
            btn.innerHTML = "Upload";
        })
        .fail(function() {
            console.log("Fail");
            btn.innerHTML = "Upload";
        });
};