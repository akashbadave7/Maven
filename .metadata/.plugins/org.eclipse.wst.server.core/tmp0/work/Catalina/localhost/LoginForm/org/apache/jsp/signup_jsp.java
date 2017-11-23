/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2017-10-28 10:03:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/form.css\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<title>Sign Up</title>\n");
      out.write("\n");
      out.write("<script src=\"js/Validation.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write(" \t\t\t<form name=\"document\" action=\"SignupPage\" method=\"post\" role=\"form\">\n");
      out.write(" \t\t\t<h3>Sign up</h3>\n");
      out.write("           \n");
      out.write("              <div class=\"form-group\"> \t \n");
      out.write("                <label for=\"name\"><span class=\"req\" style=\"color:red;\">* </span> Name </label>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"name\" id =\"name\" pattern = \"[A-Za-z ]{1}\" title=\"Name cant be number or null\" placeholder=\"Enter name\" /> \n");
      out.write("                        <div id=\"errName\"></div>    \n");
      out.write("            \t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("                <label for=\"email\"><span class=\"req\" style=\"color:red;\">* </span> Email </label> \n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"email\" id = \"email\"  onchange=\"email_validate(this.value)\" placeholder=\"Enter email\" />   \n");
      out.write("                        <div class=\"status\" id=\"status\"></div>\n");
      out.write("            \t</div>\n");
      out.write("\t\t\t\t <div class=\"form-group\">\n");
      out.write("                \t<label for=\"password\"><span class=\"req\" style=\"color:red;\">* </span> Password: </label>\n");
      out.write("                    <input  name=\"password\" type=\"password\" class=\"form-control inputpass\" minlength=\"8\"  id=\"pass\" name=\"pass\" onkeyup=\"checkPass(); return false;\" placeholder=\"Enter password\"/> </p>\n");
      out.write("                 </div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("            \t<label for=\"phonenumber\"><span class=\"req\" style=\"color:red;\">* </span> Phone Number: </label>\n");
      out.write("                    <input type=\"number\" name=\"mobile\" id=\"mobile\" class=\"form-control phone\" maxlength=\"13\" min=\"0\" onkeyup=\"validatephone(this);\" placeholder=\"Enter Phone Number\"/> \n");
      out.write("            \t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<br>\n");
      out.write("\t\t\t\t      <button type=\"submit\" class=\"btn btn-primary\"><b>Sign up</b></button>\n");
      out.write("\t\t\t\t      <a  class=\"btn btn-primary\" href=\"login\" role=\"button\"  style=\"margin-right: 20%; width:80px\"><b>Cancel</b></a>\n");
      out.write("\t\t\t\t<br>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t");
 String message= (String) session.getAttribute("error");
               if(message!=null)
               {          	   	
               		out.println("<center><font color='red'><h4>" + message);
               		session.removeAttribute("error");
               }
               
      out.write(" \n");
      out.write("\t\t\t</form>\n");
      out.write("        </div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
