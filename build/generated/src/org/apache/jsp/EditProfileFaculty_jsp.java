package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EditProfileFaculty_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("            <h1>Edit Your Profile</h1>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-4\">\n");
      out.write("            <button type=\"button\" class=\"btn btn-block btn-default\"><a href=\"EditProfileFaculty.jsp\">Profile</a></button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-4\">\n");
      out.write("            <button type=\"button\" class=\"btn btn-block btn-default\"><a href=\"QnAFaculty.jsp\">Q & A</a></button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-4\">\n");
      out.write("            <button type=\"button\" class=\"btn btn-block btn-danger\"><a href=\"LogoutServlet\">Log-Out</a></button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <br>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <form method=\"post\" action=\"UpdateProfileFaculty\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("\n");
      out.write("                    <fieldset>\n");
      out.write("                        <legend>Personal Information</legend>\n");
      out.write("                        <label for=\"name\">First Name:</label>\n");
      out.write("                        <input id=\"name\" name=\"fname\" type=\"text\" class=\"form-control\" placeholder=\"");
      out.print( session.getAttribute("Name").toString().subSequence(0, session.getAttribute("Name").toString().indexOf("+")).toString());
      out.write("\"><br>\n");
      out.write("                        <label for=\"lname\">Last Name:</label>\n");
      out.write("                        <input id=\"lname\" name=\"lname\" type=\"text\" class=\"form-control\" placeholder=\"");
      out.print( session.getAttribute("Name").toString().subSequence(session.getAttribute("Name").toString().indexOf("+") + 1, session.getAttribute("Name").toString().length()).toString());
      out.write("\"><br>\n");
      out.write("\n");
      out.write("                        <label for=\"uname\">User Name: </label>\n");
      out.write("                        <input id=\"uname\" name=\"uname\" class=\"form-control\" placeholder=\"");
      out.print( session.getAttribute("UNAME"));
      out.write("\"><br>\n");
      out.write("\n");
      out.write("                    </fieldset> \n");
      out.write("                    <fieldset>\n");
      out.write("                        <legend>Contact Information</legend>\n");
      out.write("                        <label for=\"email\">E-Mail</label>\n");
      out.write("                        <input type=\"email\" name=\"email\" class=\"form-control\" id=\"email\" placeholder=\"E-Mail\"><br>\n");
      out.write("                        <label for=\"phone\">Phone Number</label>\n");
      out.write("                        <input id=\"phone\" name=\"phone\" class=\"form-control\" placeholder=\"Phone Number\"><br> \n");
      out.write("                        <label for=\"address\">Address</label>\n");
      out.write("                        <input id=\"address\" name=\"address\" type=\"text\" class=\"form-control\" placeholder=\"Address\"><br>\n");
      out.write("                    </fieldset>        \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <fieldset>\n");
      out.write("                        <legend>College</legend>\n");
      out.write("                        <label for=\"college\">College Name:</label>\n");
      out.write("                        <input type=\"text\" id=\"college\" name=\"college\" class=\"form-control\" placeholder=\"College\"><br>\n");
      out.write("                        <label for=\"bio\">Subjects</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"bio\" id=\"bio\" placeholder=\"use ',' to seperate subjects\">\n");
      out.write("                    </fieldset>\n");
      out.write("                </div>            \n");
      out.write("            </div>\n");
      out.write("            <input type=\"submit\" class=\"btn btn-lg btn-success\" value=\"Update!\" /> \n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
