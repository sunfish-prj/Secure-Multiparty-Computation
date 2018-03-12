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
    getList(); 
});

var open = 0;

var getList = function() {
    var jwt = localStorage.getItem('json-web-token');
    if (jwt) {
        var payload = {
            'jwt': jwt
        };

        $.ajax({
            url: '/rest/review',
            type: 'get',
            headers: payload,
            success: function(data) {
                renderList(data.list);
            }
        });
    }
}

var renderList = function(listData) {
    var len = listData.length;
    var accordion = document.getElementById("accordion");
    accordion.innerHTML = "";

    if (len === 0) {
        accordion.innerHTML = "No entries"
    }

    var filesListHTML = '';
    var rowApproval = 0; // Approval level to show for the entire search.

    for (var i = 0; i < len; i++) {
        var element = listData[i];
        // console.log("Processing", element);

        var rowbadge = "";
        var filebadge = "";
        if (element.approval == -1) {
            rowApproval = -1;
            filebadge = `<button data-rocuid=${element.rocuid} data-searchid=${element.searchid} 
                    data-elementid=${i} data-reviewid=${element.id}
                    data-fileid="${element.fileid}" data-filename="${element.filename}"
                    class="btn btn-success btn-sm mt-1">Approve</button>`;

        } else if (element.approval == 0) {
            filebadge = `<img src="/img/check.svg" alt="" height="24" data-toggle="tooltip" 
                    data-placement="right" title="automatically approved">`;
        } else if (element.approval == 1) {
            if (rowApproval == 0) rowApproval = 1;
            filebadge = `<img src="/img/verified.svg" alt="" height="22" data-toggle="tooltip" 
                    data-placement="right" title="manually approved">`;
        }

        var covered = "";
        if (element.covered === "1") {
            covered = `(Covered data)`;
        }

        filesListHTML += `<li class="justify-content-between">
                         <span><tt>${element.filename}</tt> ${covered}</span>
                         ${filebadge}
                         </li>`;

        // Add a new review box if the next `element` has another reviewId:
        if (i+1 == len || listData[i+1].id != element.id) {
            console.log("Change in review id");

            rowbadge = `<div>
                    <span class="badge badge-primary badge-pill" data-toggle="tooltip" 
                    data-placement="left" title="${element.hits} matching document(s)">${element.hits}</span>
                    <img src="/img/check.svg" alt="" height="24" data-toggle="tooltip" 
                    data-placement="left" title="automatically approved">
                    </div>`;
            if (rowApproval == -1) {
                rowbadge = `<div>
                        <span class="badge badge-primary badge-pill" data-toggle="tooltip" 
                        data-placement="left" title="${element.hits} matching document(s)">${element.hits}</span>
                        <img src="/img/clock.svg" alt="" height="24" data-toggle="tooltip" 
                        data-placement="left" title="decision needed">
                        </div>`;
            } else if (rowApproval == 1) {
                rowbadge = `<div>
                        <span class="badge badge-primary badge-pill" data-toggle="tooltip" 
                        data-placement="left" title="${element.hits} matching document(s)">${element.hits}</span>
                        <img src="/img/verified.svg" alt="" height="22" data-toggle="tooltip" 
                        data-placement="left" title="manually approved">
                        </div>`;                
            }

            var show = "";
            if (element.id == parseInt(open)) show = "show";

            var stringtemplate = `
                <div class="card panel">
                    <div class="card-header" role="tab" data-toggle="collapse" data-parent="#accordion" href="#collapse${i+1}">
                    <div class="d-flex w-100 justify-content-between">
                        <div><small class="text-muted"><span data-toggle="tooltip" 
                        data-placement="bottom" title="${element.date}">${element.htime}</span></small></div>
                        <span class="mb-1">${element.keyword}</span>
                        ${rowbadge}
                    </div>
                    </div>
                    <div id="collapse${i+1}" class="collapse ${show}" role="tabpanel">
                    <div class="card-block ml-3 mt-2 justify-content-between flex-column align-items-start">
                        <p>Search by <b>${element.username} (<span data-toggle="tooltip" data-placement="top" title="${vLvlToString(element.clearance)}">${element.clearance}</span>)</b> from ${element.rocuname}</p>
                        <p>
                        <h6>Matching documents:</h6>
                        <ul>
                            ${filesListHTML}
                        </ul>
                        </p>
                    </div>
                    </div>
                </div>`;
            accordion.insertAdjacentHTML('beforeend', stringtemplate);
            filesListHTML = '';
            rowApproval = 0;
        }
    }

    // when the button is pressed
    $(".btn.btn-success.btn-sm").click(function(){
        var jwt = localStorage.getItem('json-web-token');
        open = $(this).attr('data-reviewid');
        if (jwt) {
            var payload = {
                'jwt': jwt,
                'reviewid': $(this).attr('data-reviewid'),
                'rocuid': $(this).attr('data-rocuid'),
                'searchid': $(this).attr('data-searchid'),
                'fileid': $(this).attr('data-fileid')
            };

            $.post('/review/send', payload)
                .done(function(data) {
                    getList();
                })
                .fail(function() {
                    console.log("Fail");
                }
            );
        }
    });
    $('[data-toggle="tooltip"]').tooltip();

    // $(function () {
    //     $('[data-toggle="tooltip"]').tooltip()
    // })
    // console.log(listData);
}

var vLvlToString = function(vlvl) {
    if (vlvl == 'CTC') return 'Counter Terrorism Check';
    else if (vlvl == 'SC') return 'Security Check';
    else if (vlvl == 'DV') return 'Developed Vetting';
    return '';
}