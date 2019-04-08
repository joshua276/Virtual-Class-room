<%-- 
    Document   : EditProfile
    Created on : Apr 16, 2018, 3:39:59 AM
    Author     : Joshua Reynold
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
        <style>
            .jumbotron{
                background-color: #ff2d52;
                color: white;
            }
        </style>
    </head>
    <body>
        <div class="jumbotron text-center">
            <h1>Edit Your Profile</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-4">
            <button type="button" class="btn btn-block btn-default"><a href="EditProfileFaculty.jsp">Profile</a></button>
        </div>
        <div class="col-lg-4">
            <button type="button" class="btn btn-block btn-default"><a href="QnAFaculty.jsp">Q & A</a></button>
        </div>
        <div class="col-lg-4">
            <button type="button" class="btn btn-block btn-danger"><a href="LogoutServlet">Log-Out</a></button>
        </div>
    </div>
    <br>
    <div class="container">
        <form method="post" action="UpdateProfileFaculty">
            <div class="row">
                <div class="col-lg-6">

                    <fieldset>
                        <legend>Personal Information</legend>
                        <label for="name">First Name:</label>
                        <input id="name" name="fname" type="text" class="form-control" placeholder="<%= session.getAttribute("Name").toString().subSequence(0, session.getAttribute("Name").toString().indexOf("+")).toString()%>"><br>
                        <label for="lname">Last Name:</label>
                        <input id="lname" name="lname" type="text" class="form-control" placeholder="<%= session.getAttribute("Name").toString().subSequence(session.getAttribute("Name").toString().indexOf("+") + 1, session.getAttribute("Name").toString().length()).toString()%>"><br>

                        <label for="uname">User Name: </label>
                        <input id="uname" name="uname" class="form-control" placeholder="<%= session.getAttribute("UNAME")%>"><br>

                    </fieldset> 
                    <fieldset>
                        <legend>Contact Information</legend>
                        <label for="email">E-Mail</label>
                        <input type="email" name="email" class="form-control" id="email" placeholder="E-Mail"><br>
                        <label for="phone">Phone Number</label>
                        <input id="phone" name="phone" class="form-control" placeholder="Phone Number"><br> 
                        <label for="address">Address</label>
                        <input id="address" name="address" type="text" class="form-control" placeholder="Address"><br>
                    </fieldset>        

                </div>
                <div class="col-lg-6">
                    <fieldset>
                        <legend>College</legend>
                        <label for="college">College Name:</label>
                        <input type="text" id="college" name="college" class="form-control" placeholder="College"><br>
                        <label for="sub">Subjects</label>
                        <input type="text" class="form-control" name="sub" id="sub" placeholder="use ',' to seperate subjects">
                    </fieldset>
                </div>            
            </div>
            <input type="submit" class="btn btn-lg btn-success" value="Update!" /> 
        </form>


    </div>
</body>
</html>
