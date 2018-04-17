<%-- 
    Document   : index
    Created on : Apr 11, 2018, 9:07:25 PM
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
        <script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script>

            function Validate1() {

                var form = document.getElementsById('login');
                var UserName = document.getElementById('uname');
                //var password = document.getElementById('pass');

                if (UserName === null || UserName == "") {
                    window.alert("User Name Cannot be Empty!");
                    return false;
                } else {
                    return true;
                }

            }
            /*function Validate2() {
                //var fname = document.getElementById('fname');
                //var lname = document.getElementById('lname');
                var U_Name = document.getElementById('u_name');
                var Password1 = document.getElementById('pass1');
                var Password2 = document.getElementById('pass2');

                if (Password1 !== Password2) {
                    window.alert("Passswords do not match!");
                    return false;
                } else {
                    return true;
                }
            }*/

        </script>
        <style>
            .jumbotron{
                background-color: #ff2d52;
                color: white;
            }
            .text-right h1,p{
                margin-right: 1.5cm;
            }
        </style>
    </head>
    <body>
        <div class="jumbotron text-right">
            <h1>Welcome to Virtual Classroom</h1>
            <p>Used Java servlets, MySQL and GlassFish 4.1.1 Server</p>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-lg-6">
                    <form id="login" method="post" action="Login" onsubmit="return Validate1();">
                        <fieldset>
                            <legend>Login</legend>

                            <label for="uname">User Name</label>
                            <input class="form-control" name="uname" id="uname" placeholder="User Name"><br>
                            <label for="pass">Password</label>
                            <input type="password" name="pass" id="pass" class="form-control"><br>

                            <label for="type">User: &nbsp;</label>
                            <input type="radio" id="type" name="type" value="student" checked> Student
                            <input type="radio" id="type" name="type" value="faculty"> Faculty
                            <br>
                            <br>
                            <button type="submit" class="btn btn-block btn-info">Login</button>
                        </fieldset>

                    </form>
                </div> 
                <div class="col-lg-6">
                    <form id="signup" method="post" action="Signup" onsubmit="return Validate2();">
                        <legend>Not a member? Signup</legend>
                        <div class="row">
                            <div class="col-lg-6">
                                <label for="fname">First Name</label>
                                <input type="text" class="form-control" name="fname" id="fname" required>
                            </div>
                            <div class="col-lg-6">
                                <label for="lname">Last Name</label>
                                <input type="text" class="form-control" name="lname" id="lname" required>
                            </div>
                        </div>
                        <br>
                        <label for="u_name">User Name</label>
                        <input id="u_name" name="u_name" class="form-control" required><br>
                        <div class="row">
                            <div class="col-lg-6">
                                <label for="pass1">Password</label>
                                <input type="password" class="form-control" name="pass1" id="pass2" required>
                            </div>
                            <div class="col-lg-6">
                                <label for="pass2">retype Password</label>
                                <input type="password" class="form-control" name="pass2" id="pass2" required>
                            </div>
                        </div>
                        <br>
                        <label for="type1">
                            <input type="radio" name="type1" id="type1" value="student" checked> Student
                            <input type="radio" name="type1" id="type1" value="faculty"> Faculty
                            <br>
                            <br>
                            <button type="submit" class="btn btn-block btn-success">Sign-up</button>    
                    </form>
                </div>
            </div>
        </div>
        <h1></h1>
    </body>
</html>
