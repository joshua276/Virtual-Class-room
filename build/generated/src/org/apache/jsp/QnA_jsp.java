package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class QnA_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0\">\n");
      out.write("        <title>VIRTUAL CLASS</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Titillium+Web\" rel=\"stylesheet\">\n");
      out.write("        <script type=\"text/javascript\" src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            a {\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            .btn{\n");
      out.write("                border-radius: 0px\n");
      out.write("            }\n");
      out.write("            .btn-danger{\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("            .content{\n");
      out.write("                margin-left: 3cm;\n");
      out.write("                margin-right: 3cm;\n");
      out.write("            }\n");
      out.write("            .form-control{\n");
      out.write("                width: 800px;\n");
      out.write("                padding: 8px 14px;\n");
      out.write("                font-family: 'Titillium Web', sans-serif;\n");
      out.write("                font-size: 1.2em;\n");
      out.write("            }\n");
      out.write("            .question h1{\n");
      out.write("                font-family: 'Titillium Web',sans-serif;\n");
      out.write("                font-size: 1.5em;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            .answer pre{\n");
      out.write("                font-style: italic;\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 session = request.getSession(false);
      out.write("\n");
      out.write("        <div class=\"jumbotron text-center\">\n");
      out.write("            <h1>Welcome ");
      out.print( session.getAttribute("UNAME"));
      out.write("</h1>\n");
      out.write("            <p>Blah Blah Blah</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-3\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-block btn-default\"><a href=\"EditProfile.jsp\">Profile</a></button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-block btn-default\"><a href=\"StudyMaterial.jsp\">Study Material</a></button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-block btn-info\"><a href=\"QnA.jsp\">Q & A</a></button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-block btn-danger\"><a href=\"LogoutServlet\">Log-Out</a></button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            <br>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <form class=\"form-inline\" action=\"QnA\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"sr-only\" for=\"text\">Post Question:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"text\" placeholder=\"Post Question\"  name=\"question\">\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <button type=\"submit\" class=\"btn btn-info\">Submit</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class='forum'>\n");
      out.write("                ");

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
                        res.next();
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
                    } finally {
                        conn.close();
                    }
                
      out.write("   \n");
      out.write("            </div>\n");
      out.write("        </div>    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
