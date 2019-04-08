<%-- 
    Document   : StudentDashboard
    Created on : Apr 16, 2018, 3:22:23 AM
    Author     : Joshua Reynold
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
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
                border-radius: 0px
            }
            .btn-danger{
                color:white;
            }
            .content{
                margin-left: 3cm;
                margin-right: 3cm;
            }
            .form-control,.form-inline{
                width: 80%;
                padding: 8px 14px;
                font-family: 'Titillium Web', sans-serif;
                font-size: 1.2em;
            }
            .question h1{
                font-family: 'Titillium Web',sans-serif;
                font-size: 1.5em;
                font-weight: bold;
            }
            .answer pre{
                font-style: italic;
                font-size: 16px;
            }

        </style>
    </head>
    <body>
        <% session = request.getSession(false);%>
        <div class="jumbotron text-center">
            <h1>Question and Answer Forum</h1>
            
        </div>
        <div class="row">
            <div class="col-lg-3">
                <button type="button" class="btn btn-block btn-default"><a href="EditProfile.jsp">Profile</a></button>
            </div>
            <div class="col-lg-3">
                <button type="button" class="btn btn-block btn-default"><a href="StudyMaterial.jsp">Study Material</a></button>
            </div>
            <div class="col-lg-3">
                <button type="button" class="btn btn-block btn-info"><a href="QnA.jsp">Q & A</a></button>
            </div>
            <div class="col-lg-3">
                <button type="button" class="btn btn-block btn-danger"><a href="LogoutServlet">Log-Out</a></button>
            </div>
        </div>
            <hr>
        <div class="container">
            <div class="content">
                <form method='post' action="QnA">
                    <div class="form-group">
                        <label class="sr-only" for="text">Post Question:</label>
                        <input type="text" class="form-control" id="text" placeholder="Post Question"  name="question">
                    </div>
                    <br>
                    <center><button type="submit" class="btn btn-info">Submit</button></center>
                </form>
            </div>
            <br>
            <h1 style="font-size:2em;font-family:'Titillium Web',sans-serif;">Answered Questions</h1>
            <br>
            <div class='forum'>
                <%
                    Connection conn = null;
                    Statement smt = null;
                    int i = 1;
                    ResultSet res = null;
                    try {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                        } catch (ClassNotFoundException e) {
                            System.out.println("Exception");
                        }
                        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/virtualclass", "Shashwat", "");
                        smt = conn.createStatement();
                        String sql = "SELECT * FROM   `virtualclass`.`studentquestiontable` WHERE `WATCHED`= 1";
                        res = smt.executeQuery(sql);
                        //res.next();
                        while (res.next()) {
                            out.println("<div class=\"question\">");
                            out.println("<h1>Question " + i + ": " + res.getString("QUESTION") + "</h1>");
                            out.println("</div>");
                            out.println("<p class=\"text-right\"> posted by - <b>" + res.getString("POSTED_BY") + "</b></p>");
                            out.println("<div class=\"answer\">");
                            out.println("<pre>" + res.getString("ANSWER") + "</pre>");
                            out.println("</div>");
                            out.println("<p class=\"text-right\">Answered By - <strong>" + res.getString("ANSWERED_BY") + "</strong></p><hr>");
                            i++;
                        }
                    } catch (SQLException e) {
                        System.out.println("SQL Exception");
                    }
                %>   
            </div>
            
            <div class='forum'>
                <%
                    out.println("<h1 style=\"font-size:2em;font-family:'Titillium Web',sans-serif;\">Unanswered Questions</h1>");
                    try {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                        } catch (ClassNotFoundException e) {
                            System.out.println("Exception");
                        }
                        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/virtualclass", "Shashwat", "");
                        smt = conn.createStatement();
                        String sql = "SELECT * FROM   `virtualclass`.`studentquestiontable` WHERE `WATCHED`= '-1'";
                        res = smt.executeQuery(sql);
                        //res.next();
                        while (res.next()) {
                            out.println("<div class=\"question\">");
                            out.println("<h1>Question " + i + ": " + res.getString("QUESTION") + "</h1>");
                            out.println("</div>");
                            out.println("<p class=\"text-right\"> posted by - <b>" + res.getString("POSTED_BY") + "</b></p>");
                            i++;
                        }
                    } catch (SQLException e) {
                        System.out.println("SQL Exception");
                    } finally {
                        conn.close();
                    }
                %>   
            </div>
        </div>    
    </body>
</html>
