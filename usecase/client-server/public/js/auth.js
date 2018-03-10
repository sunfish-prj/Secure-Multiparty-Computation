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
    $("#login").submit(function(e) {
        e.preventDefault();
    });
    authorizeUser();
    console.log('Username: ' + localStorage.getItem('username'));
    console.log('Vetting level: ' + localStorage.getItem('clearance'));
});

// Performs authentication on when user tries to log in
var auth = function() {
    var username = $('#username').val();
    var password = $('#password').val();
    var redirectUrl = '/';

    $.post('/auth/login', {'username': username, 'password': password})
    .done(function(data) {
        localStorage.setItem('json-web-token', data.token);
        localStorage.setItem('username', data.username);
        localStorage.setItem('name', data.name);
        localStorage.setItem('clearance', data.clearance);
        window.location.replace(redirectUrl);
    })
    .fail(function() {
        $("#login").trigger('reset');
    });
};

var authorizeUser = function() {
    var path = window.location.pathname;
    var jwt = localStorage.getItem('json-web-token');
    if (jwt === null) {
        if (path !== "/login/") {
            window.location.replace("/login/");
        }
        return;
    }

    var payload = {
        'jwt': jwt
    }
    $.post('/auth', payload)
        .done(function(data) {
            if (path === "/login/" || path === "/") {
                window.location.replace('/search/');
            } else {
                var logindata = document.getElementById('logindata');
                logindata.innerHTML = `Logged in as: ${localStorage.getItem('name')}`;
                var clearancedata = document.getElementById('clearancedata');
                clearancedata.innerHTML = `Vetting level: ${localStorage.getItem('clearance')}`;
            }
        })
        .fail(function() {
            if (path !== "/login/") {
                window.location.replace("/login/");
            }
        });
}

var logout = function() {
    localStorage.removeItem('json-web-token');
    localStorage.removeItem('username');
    localStorage.removeItem('clearance');
    window.location.replace("/login/");
}