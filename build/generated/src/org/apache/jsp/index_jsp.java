package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script type=\"text/javascript\" src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            function Validate1() {\n");
      out.write("\n");
      out.write("                var form = document.getElementsById('login');\n");
      out.write("                var UserName = document.getElementById('uname');\n");
      out.write("                //var password = document.getElementById('pass');\n");
      out.write("\n");
      out.write("                if (UserName === null || UserName == \"\") {\n");
      out.write("                    window.alert(\"User Name Cannot be Empty!\");\n");
      out.write("                    return false;\n");
      out.write("                } else {\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            /*function Validate2() {\n");
      out.write("                //var fname = document.getElementById('fname');\n");
      out.write("                //var lname = document.getElementById('lname');\n");
      out.write("                var U_Name = document.getElementById('u_name');\n");
      out.write("                var Password1 = document.getElementById('pass1');\n");
      out.write("                var Password2 = document.getElementById('pass2');\n");
      out.write("\n");
      out.write("                if (Password1 !== Password2) {\n");
      out.write("                    window.alert(\"Passswords do not match!\");\n");
      out.write("                    return false;\n");
      out.write("                } else {\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("            }*/\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            .jumbotron{\n");
      out.write("                background-color: #ff2d52;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .text-right h1,p{\n");
      out.write("                margin-right: 1.5cm;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"jumbotron text-right\">\n");
      out.write("            <h1>Welcome to Virtual Classroom</h1>\n");
      out.write("            <p>Used Java servlets, MySQL and GlassFish 4.1.1 Server</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <form id=\"login\" method=\"post\" action=\"Login\" onsubmit=\"return Validate1();\">\n");
      out.write("                        <fieldset>\n");
      out.write("                            <legend>Login</legend>\n");
      out.write("\n");
      out.write("                            <label for=\"uname\">User Name</label>\n");
      out.write("                            <input class=\"form-control\" name=\"uname\" id=\"uname\" placeholder=\"User Name\"><br>\n");
      out.write("                            <label for=\"pass\">Password</label>\n");
      out.write("                            <input type=\"password\" name=\"pass\" id=\"pass\" class=\"form-control\"><br>\n");
      out.write("\n");
      out.write("                            <label for=\"type\">User: &nbsp;</label>\n");
      out.write("                            <input type=\"radio\" id=\"type\" name=\"type\" value=\"student\" checked> Student\n");
      out.write("                            <input type=\"radio\" id=\"type\" name=\"type\" value=\"faculty\"> Faculty\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-block btn-info\">Login</button>\n");
      out.write("                        </fieldset>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div> \n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <form id=\"signup\" method=\"post\" action=\"Signup\" onsubmit=\"return Validate2();\">\n");
      out.write("                        <legend>Not a member? Signup</legend>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-6\">\n");
      out.write("                                <label for=\"fname\">First Name</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"fname\" id=\"fname\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-6\">\n");
      out.write("                                <label for=\"lname\">Last Name</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"lname\" id=\"lname\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <label for=\"u_name\">User Name</label>\n");
      out.write("                        <input id=\"u_name\" name=\"u_name\" class=\"form-control\" required><br>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-6\">\n");
      out.write("                                <label for=\"pass1\">Password</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"pass1\" id=\"pass2\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-6\">\n");
      out.write("                                <label for=\"pass2\">retype Password</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"pass2\" id=\"pass2\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <label for=\"type1\">\n");
      out.write("                            <input type=\"radio\" name=\"type1\" id=\"type1\" value=\"student\" checked> Student\n");
      out.write("                            <input type=\"radio\" name=\"type1\" id=\"type1\" value=\"faculty\"> Faculty\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-block btn-success\">Sign-up</button>    \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <h1></h1>\n");
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
