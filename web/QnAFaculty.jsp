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
                border-radius: 0px;
            }
            .btn-danger{
                color:white;
            }
            .questions{    
                margin: 2cm 2cm 2cm 2cm;
                padding: 10px;
            }
            .questions h1{
                font-family: 'Titillium Web',sans-serif;
                font-size: 3em;
            }    
        </style>
    </head>
    <body>
        <% session = request.getSession(false);%>
        <div class="jumbotron text-center">
            <h1>Welcome <%= session.getAttribute("UNAME")%></h1>
            
        </div>
        <div class="row">
            <div class="col-lg-4">
                <button type="button" class="btn btn-block btn-default"><a href="EditProfileFaculty.jsp">Profile</a></button>
            </div>
            <div class="col-lg-4">
                <button type="button" class="btn btn-block btn-info"><a href="QnAFaculty.jsp">Q & A</a></button>
            </div>
            <div class="col-lg-4">
                <button type="button" class="btn btn-block btn-danger"><a href="LogoutServlet">Log-Out</a></button>
            </div>
        </div>
        <div class="container">
            <div class="questions">
                <h1>Questions to be Answered</h1>
                
                <hr><br>
                
                <%
                     session = request.getSession(false);
                     int i = 0;
                     Connection conn = null;
                     Statement smt = null;
                     ResultSet res = null;
                     try{
                         try{
                             Class.forName("com.mysql.jdbc.Driver");
                         }catch(ClassNotFoundException e){
                             System.out.println("CLASS NOT FOUND");
                         }
                         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/virtualclass","Shashwat","");
                         smt = conn.createStatement();
                         String sql = "SELECT * FROM `virtualclass`.`studentquestiontable` WHERE `WATCHED`='-1'";
                         res = smt.executeQuery(sql);
                         out.println("<form method=\"post\" action=\"QnAFacultyServlet\">");
                         while(res.next()){
                             out.println("<div class=\"question\">");
                             out.println("<h1>Question No. " + (i+1) + " " + res.getString("QUESTION") + "</h1>");
                             out.println("<p>posted by - " + res.getString("POSTED_BY") + "</p>");
                             out.println("<input type=\"text\" class=\"form-control\" name=\"param" + i + "\" placeholder=\"Answer this Question\"><br>");
                             out.println("<hr>");
                             out.println("</div>");
                             i++;
                         }
                         session.setAttribute("Num",i);         
                         out.println("<button type=\"submit\" class=\"btn btn-lg btn-success\">Submit</button>");
                         out.println("</form>");
                     }catch(SQLException e){
                         System.out.println("SQL Exception!!!");
                     }
                 %>   
            </div>
        </div>    
    </body>
</html>
