package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Gallery;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/sharing.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("        <title>404</title>\n");
      out.write("        <link href=\"css/error.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/header.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"javascript/js.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        ");

            ArrayList<Gallery> top3Galleries = (ArrayList<Gallery>) request.getAttribute("top3Galleries");
        
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("\n");
      out.write("            <div class=\"navitigator\">\n");
      out.write("                <div class=\"navi-bar\">\n");
      out.write("\n");
      out.write("                    <a id=\"home\"  class=\"navi-text\" href=\"home\">\n");
      out.write("                        <div class=\"navi-item\">My front page</div>\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                    ");
for (Gallery elem : top3Galleries) {
      out.write("\n");
      out.write("                    <a id=\"gallery");
      out.print(elem.getId());
      out.write("\" class=\"navi-text\" href=\"gallery?gid=");
      out.print(elem.getId());
      out.write("&pageIndex=1\">\n");
      out.write("                        <div class=\"navi-item\">");
      out.print(elem.getName());
      out.write("</div>\n");
      out.write("                    </a>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    <a id=\"contact\" class=\"navi-text\" href=\"contact\">\n");
      out.write("                        <div class=\"navi-item\">Contact</div>\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"title-header\">\n");
      out.write("                <div class=\"title-content\">\n");
      out.write("                    <div class=\"title-logo\">\n");
      out.write("                        <img src=\"image/logo.PNG\" class=\"logo\"/>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"title-web\">\n");
      out.write("                        <div class=\"name-web\">\n");
      out.write("                            <a class=\"name\" >PHOTOGRAPHER</a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"sub-title\">\n");
      out.write("                            Welcome to this website\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            setBold();\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"display-content\">\n");
      out.write("                <div class=\"main-content\">\n");
      out.write("                    \n");
      out.write("                    <h2> SORRY! This page isn't available :(</h2> \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                ");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"css/sharing.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"sharing\">\n");
      out.write("\n");
      out.write("            <div class=\"share-title\">\n");
      out.write("                Share this page\n");
      out.write("            </div>\n");
      out.write("            <div class=\"share\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <div class=\"share-row\">\n");
      out.write("                        <img src=\"image/fb.png\" class=\"share-image\">\n");
      out.write("                        <div class=\"share-text\">Share on Facebook</div>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <div class=\"share-row\">\n");
      out.write("                        <img src=\"image/twitter.png\" class=\"share-image\">\n");
      out.write("                        <div class=\"share-text\">Share on Twitter</div>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <div class=\"share-row\">\n");
      out.write("                        <img src=\"image/google.png\" class=\"share-image\">\n");
      out.write("                        <div class=\"share-text\">Share on Google+</div>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/footer.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"display-content\">\n");
      out.write("                <div  class=\"footer-infor\">\n");
      out.write("                    <a href=\"#\">Created With Quỳnh</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
