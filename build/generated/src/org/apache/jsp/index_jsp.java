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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("  <head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" >\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/styles.css\" >\n");
      out.write("    <title>Hello, world!</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("      \n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Navbar</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("              <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("              <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                  <a class=\"nav-link\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("              </ul>\n");
      out.write("                \n");
      out.write("                <div class=\"my-2 my-lg-0 mr-3\">  \n");
      out.write("                  <a href=\"#\">\n");
      out.write("                      <i class=\"fas fa-shopping-cart\"></i>\n");
      out.write("                  </a>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"my-2 my-lg-0\">  \n");
      out.write("                  <a href=\"#\">\n");
      out.write("                    <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">login</button>\n");
      out.write("                  </a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </nav>\n");
      out.write("      \n");
      out.write("\n");
      out.write("          \n");
      out.write("        <section class=\"container my-carousel\">\n");
      out.write("            <div id=\"carouselExampleControls\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                  <div class=\"carousel-item active\">\n");
      out.write("                      <img class=\"d-block w-100\" src=\"http://www.lorempixel.com/1400/500\" alt=\"First slide\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"carousel-item\">\n");
      out.write("                    <img class=\"d-block w-100\" src=\"http://www.lorempixel.com/1400/500\" alt=\"Second slide\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"carousel-item\">\n");
      out.write("                    <img class=\"d-block w-100\" src=\"http://www.lorempixel.com/1400/500\" alt=\"Third slide\">\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#carouselExampleControls\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                  <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                  <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"carousel-control-next\" href=\"#carouselExampleControls\" role=\"button\" data-slide=\"next\">\n");
      out.write("                  <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                  <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("          \n");
      out.write("      <section class=\"container mt-2 products\">\n");
      out.write("          \n");
      out.write("          <div class=\"row\">\n");
      out.write("              \n");
      out.write("              <div class=\"col-sm-4 mt-2\">\n");
      out.write("                  <article class=\"card\">\n");
      out.write("                    <img class=\"card-img-top\" src=\"http://www.lorempixel.com/300/300\" alt=\"producto 1\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                      <h5 class=\"card-title\">Card title</h5>\n");
      out.write("                      <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("                      <a href=\"#\" class=\"btn btn-primary\">Añadir al carrito <i class=\"fas fa-cart-plus\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                  </article>\n");
      out.write("              </div>\n");
      out.write("            \n");
      out.write("              \n");
      out.write("              <div class=\"col-sm-4 mt-2\">\n");
      out.write("                  <article class=\"card\">\n");
      out.write("                    <img class=\"card-img-top\" src=\"http://www.lorempixel.com/300/300\" alt=\"producto 1\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                      <h5 class=\"card-title\">Card title</h5>\n");
      out.write("                      <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("                      <a href=\"#\" class=\"btn btn-primary\">5€ <i class=\"fas fa-cart-plus\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                  </article>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("              <div class=\"col-sm-4 mt-2\">\n");
      out.write("                  <article class=\"card\">\n");
      out.write("                    <img class=\"card-img-top\" src=\"http://www.lorempixel.com/300/300\" alt=\"producto 1\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                      <h5 class=\"card-title\">Card title</h5>\n");
      out.write("                      <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("                      <a href=\"#\" class=\"btn btn-primary\">0? <i class=\"fas fa-cart-plus\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                  </article>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("              <div class=\"col-sm-4 mt-2\">\n");
      out.write("                  <article class=\"card\">\n");
      out.write("                    <img class=\"card-img-top\" src=\"http://www.lorempixel.com/300/300\" alt=\"producto 1\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                      <h5 class=\"card-title\">Card title</h5>\n");
      out.write("                      <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("                      <a href=\"#\" class=\"btn btn-primary\">10? <i class=\"fas fa-cart-plus\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                  </article>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("      </section>\n");
      out.write("    \n");
      out.write("      <footer class=\"bg-secondary mt-4\">\n");
      out.write("          <div class=\"container text-center text-white p-4\">\n");
      out.write("              Dilma\n");
      out.write("          </div>\n");
      out.write("      </footer>\n");
      out.write("\n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"js/bootstrap.js\"></script> \n");
      out.write("    <script defer src=\"https://use.fontawesome.com/releases/v5.0.8/js/all.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>");
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
