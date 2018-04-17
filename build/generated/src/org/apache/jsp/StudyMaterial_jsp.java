package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class StudyMaterial_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                border-radius: 0px;\n");
      out.write("            }\n");
      out.write("            .btn-danger{\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("            .list{\n");
      out.write("                margin: 2cm 2cm 2cm 2cm;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .list-group{\n");
      out.write("                padding : 8px 14px;\n");
      out.write("                font-size: 2em;\n");
      out.write("                font-family: 'Titillium Web', sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <!--<script>\n");
      out.write("            function displayList() {\n");
      out.write("                var COList = document.getElementById('CO');\n");
      out.write("                var CPLList = document.getElementsById('CPL');\n");
      out.write("                var AWPList = document.getElementsById('AWP');\n");
      out.write("                var SLList = document.getElementsById('SL');\n");
      out.write("                var nothing = document.getElementById('nothing');\n");
      out.write("\n");
      out.write("                var selected = document.getElementById('subject').value;\n");
      out.write("                switch (selected) {\n");
      out.write("                    case \"CO\":\n");
      out.write("                        COList.style.defineProperty(\"display\", \"block\");\n");
      out.write("                        break;\n");
      out.write("                    case \"CPL\":\n");
      out.write("                        CPLList.style.defineProperty(\"display\", \"block\");\n");
      out.write("                        break;\n");
      out.write("                    case \"AWP\":\n");
      out.write("                        AWPList.style.defineProperty(\"display\", \"block\");\n");
      out.write("                        break;\n");
      out.write("                    case \"SL\":\n");
      out.write("                        SLList.style.defineProperty(\"display\", \"block\");\n");
      out.write("                        break;\n");
      out.write("                    default:\n");
      out.write("                        nothing.style.defineProperty(\"display\", \"block\");\n");
      out.write("                        break;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>-->    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 session = request.getSession();
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
      out.write("                <button type=\"button\" class=\"btn btn-block btn-info\"><a href=\"StudyMaterial.jsp\">Study Material</a></button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-block btn-default\"><a href=\"QnA.jsp\">Q & A</a></button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-block btn-danger\"><a href=\"LogoutServlet\">Log-Out</a></button>\n");
      out.write("            </div>\n");
      out.write("        </div> \n");
      out.write("\n");
      out.write("        <!--<div class=\"container\">\n");
      out.write("            <select id=\"subject\" class=\"form-control\">\n");
      out.write("                <option value=\"null\">-SELECT-</option>\n");
      out.write("                <option value=\"CO\">Computer Organization</option>\n");
      out.write("                <option value=\"CPL\">Concepts of Programming Languages</option>\n");
      out.write("                <option value=\"AWP\">Advanced Web Programming</option>\n");
      out.write("                <option value=\"SL\">Software Lab</option>\n");
      out.write("            </select>\n");
      out.write("            <button type='button' onclick='displayList();'>Click Me</button>\n");
      out.write("        </div>-->\n");
      out.write("        <div class=\"CO\" id='CO'>\n");
      out.write("            <div class=\"list\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <legend>Computer Organization</legend>\n");
      out.write("                    <ul class=\"list-group\">\n");
      out.write("                        <li class=\"list-group-item\"><a href=\"#\">Computer Organization by Karl Hamacher (5th Edition)</a></li>\n");
      out.write("                        <li class=\"list-group-item\"><a href=\"#\">Computer Organization and Architecture By Heuring and Jordan</a></li>\n");
      out.write("                        <li class=\"list-group-item\"><a href=\"#\">Computer Organization and Design by David Patterson and John Henessey</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </fieldset>    \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"CPL\" id='CPL'>\n");
      out.write("            <div class=\"list\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <legend>Concepts of Programming Languages</legend>\n");
      out.write("                    <ul class=\"list-group\">\n");
      out.write("                        <li class=\"list-group-item\"><a href=\"#\">Concepts of Programming languages by Morris and Pratt</a></li>\n");
      out.write("                        <li class=\"list-group-item\"><a href=\"#\"><b>Programming Language Pragmatics by Michael Scott</b></a></li>\n");
      out.write("                        <li class=\"list-group-item\"><a href=\"#\">Programming Languages - concepts and constructs - Ravi Sethi</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </fieldset>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"AWP\" id='AWP'>\n");
      out.write("            <div class=\"list\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <legend>Advanced Web-programming</legend>\n");
      out.write("                    <ul class=\"list-group\">\n");
      out.write("                        <li class=\"list-group-item\"><a href=\"http://www.javatpoint.com\">Java T Point</a></li>\n");
      out.write("                        <li class=\"list-group-item\"><a href=\"http://www.geeksforgeeks.org\">GeeksForGeeks.org</a></li>\n");
      out.write("                        <li class=\"list-group-item\"><a href=\"#\"><strong>Java - The Complete Reference by Herbert Schildt</strong></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </fieldset>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"SL\" id='SL'>\n");
      out.write("            <div class=\"list\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <legend>Software Lab</legend>\n");
      out.write("                    <ul class=\"list-group\">\n");
      out.write("                        <li class=\"list-group-item\"><a href=\"#\">Computer Organization by Karl Hamacher (5th Edition)</a></li>\n");
      out.write("                        <li class=\"list-group-item\"><a href=\"#\">Computer Organization and Architecture By Heuring and Jordan</a></li>\n");
      out.write("                        <li class=\"list-group-item\"><a href=\"#\">Computer Organization and Design by David Patterson and John Henessey</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </fieldset>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <!--<div class=\"nothing\" id='nothing'>\n");
      out.write("            <div class=\"list\">\n");
      out.write("                <h1 style=\"font-size:3em; font-family:'Titillium Web',sans-serif;\">Please Select A Subject!</h1>\n");
      out.write("            </div>\n");
      out.write("        </div>-->\n");
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
