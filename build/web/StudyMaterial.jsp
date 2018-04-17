<%-- 
    Document   : StudentDashboard
    Created on : Apr 16, 2018, 3:22:23 AM
    Author     : Shashwat Kadam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width,initial-scale=1.0">
        <title>VIRTUAL CLASS</title>
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.css">
        <link href="https://fonts.googleapis.com/css?family=Titillium+Web" rel="stylesheet">
        <script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <style>
            .jumbotron{
                background-color: #ff2d52;
                color: white;
            }
            a {
                color: black;
            }
            .btn{
                border-radius: 0px;
            }
            .btn-danger{
                color:white;
            }
            .list{
                margin: 2cm 2cm 2cm 2cm;

            }
            .list-group{
                padding : 8px 14px;
                font-size: 2em;
                font-family: 'Titillium Web', sans-serif;
            }

        </style>
        <!--<script>
            function displayList() {
                var COList = document.getElementById('CO');
                var CPLList = document.getElementsById('CPL');
                var AWPList = document.getElementsById('AWP');
                var SLList = document.getElementsById('SL');
                var nothing = document.getElementById('nothing');

                var selected = document.getElementById('subject').value;
                switch (selected) {
                    case "CO":
                        COList.style.defineProperty("display", "block");
                        break;
                    case "CPL":
                        CPLList.style.defineProperty("display", "block");
                        break;
                    case "AWP":
                        AWPList.style.defineProperty("display", "block");
                        break;
                    case "SL":
                        SLList.style.defineProperty("display", "block");
                        break;
                    default:
                        nothing.style.defineProperty("display", "block");
                        break;
                }
            }
        </script>-->    
    </head>
    <body>
        <% session = request.getSession();%>
        <div class="jumbotron text-center">
            <h1>Study material</h1>
            
        </div>
        <div class="row">
            <div class="col-lg-3">
                <button type="button" class="btn btn-block btn-default"><a href="EditProfile.jsp">Profile</a></button>
            </div>
            <div class="col-lg-3">
                <button type="button" class="btn btn-block btn-info"><a href="StudyMaterial.jsp">Study Material</a></button>
            </div>
            <div class="col-lg-3">
                <button type="button" class="btn btn-block btn-default"><a href="QnA.jsp">Q & A</a></button>
            </div>
            <div class="col-lg-3">
                <button type="button" class="btn btn-block btn-danger"><a href="LogoutServlet">Log-Out</a></button>
            </div>
        </div> 

        <!--<div class="container">
            <select id="subject" class="form-control">
                <option value="null">-SELECT-</option>
                <option value="CO">Computer Organization</option>
                <option value="CPL">Concepts of Programming Languages</option>
                <option value="AWP">Advanced Web Programming</option>
                <option value="SL">Software Lab</option>
            </select>
            <button type='button' onclick='displayList();'>Click Me</button>
        </div>-->
        <div class="CO" id='CO'>
            <div class="list">
                <fieldset>
                    <legend>Computer Organization</legend>
                    <ul class="list-group">
                        <li class="list-group-item"><a href="#">Computer Organization by Karl Hamacher (5th Edition)</a></li>
                        <li class="list-group-item"><a href="#">Computer Organization and Architecture By Heuring and Jordan</a></li>
                        <li class="list-group-item"><a href="#">Computer Organization and Design by David Patterson and John Henessey</a></li>
                    </ul>
                </fieldset>    
            </div>
        </div>
        <br>
        <div class="CPL" id='CPL'>
            <div class="list">
                <fieldset>
                    <legend>Concepts of Programming Languages</legend>
                    <ul class="list-group">
                        <li class="list-group-item"><a href="#">Concepts of Programming languages by Morris and Pratt</a></li>
                        <li class="list-group-item"><a href="#"><b>Programming Language Pragmatics by Michael Scott</b></a></li>
                        <li class="list-group-item"><a href="#">Programming Languages - concepts and constructs - Ravi Sethi</a></li>
                    </ul>
                </fieldset>
            </div>
        </div>
        <br>
        <div class="AWP" id='AWP'>
            <div class="list">
                <fieldset>
                    <legend>Advanced Web-programming</legend>
                    <ul class="list-group">
                        <li class="list-group-item"><a href="http://www.javatpoint.com">Java T Point</a></li>
                        <li class="list-group-item"><a href="http://www.geeksforgeeks.org">GeeksForGeeks.org</a></li>
                        <li class="list-group-item"><a href="#"><strong>Java - The Complete Reference by Herbert Schildt</strong></a></li>
                    </ul>
                </fieldset>
            </div>
        </div>
        <br>
        <div class="SL" id='SL'>
            <div class="list">
                <fieldset>
                    <legend>Software Lab</legend>
                    <ul class="list-group">
                        <li class="list-group-item"><a href="#">Computer Organization by Karl Hamacher (5th Edition)</a></li>
                        <li class="list-group-item"><a href="#">Computer Organization and Architecture By Heuring and Jordan</a></li>
                        <li class="list-group-item"><a href="#">Computer Organization and Design by David Patterson and John Henessey</a></li>
                    </ul>
                </fieldset>
            </div>
        </div>
        <br>
        <!--<div class="nothing" id='nothing'>
            <div class="list">
                <h1 style="font-size:3em; font-family:'Titillium Web',sans-serif;">Please Select A Subject!</h1>
            </div>
        </div>-->
    </body>
</html>
