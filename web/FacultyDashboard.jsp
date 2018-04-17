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
        </style>
    </head>
    <body>
        <% session = request.getSession(false); %>
        <div class="jumbotron text-center">
            <h1>Welcome <%= session.getAttribute("UNAME") %></h1>
            <p>Blah Blah Blah</p>
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
    </body>
</html>
