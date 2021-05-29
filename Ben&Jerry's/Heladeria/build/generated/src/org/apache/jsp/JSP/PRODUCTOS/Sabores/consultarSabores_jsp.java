package org.apache.jsp.JSP.PRODUCTOS.Sabores;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Modelo.Sabor;
import Control.AccionesSabor;

public final class consultarSabores_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"../../../CSS/Estilos/EstiloGeneralCruds.css\">-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../../CSS/Estilos/Tabla.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <!--\n");
      out.write("        <ul class=\"menu\">\n");
      out.write("          <li><a href=\"#\">CASA</a></li>\n");
      out.write("          <li class=\"bg\"></li>\n");
      out.write("        </ul>-->\n");
      out.write("         \n");
      out.write("        <!--\n");
      out.write("        <div class=\"titulo\">\n");
      out.write("            <H1>SABORES BEN&JERRY'S</H1>\n");
      out.write("        </div>-->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("      \n");
      out.write("  \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("<section>\n");
      out.write("  <!--for demo wrap-->\n");
      out.write("  <h1>Tabla de Sabores</h1>\n");
      out.write("  <div class=\"tbl-header\">\n");
      out.write("    <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("      <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>ID_Sabor</th>\n");
      out.write("            <th>Sabor del helado</th>\n");
      out.write("            <th></th>\n");
      out.write("            <th></th>\n");
      out.write("        </tr>\n");
      out.write("      </thead>\n");
      out.write("    </table>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"tbl-content\">\n");
      out.write("    <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("        <tbody>\n");
      out.write("            ");

                            List<Sabor> lista=AccionesSabor.getAllSabores();
                            for(Sabor e: lista){
                      
      out.write("\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                                    <td>");
      out.print(e.getId_sabor());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(e.getSabor());
      out.write("</td>        \n");
      out.write("                                    <td> <a href=\"editarSabor.jsp?id=");
      out.print(e.getId_sabor());
      out.write("\" >Editar</a> </td>\n");
      out.write("                                    <td> <a href=\"../../../borrarSabor?id=");
      out.print(e.getId_sabor());
      out.write("\" >Borrar</a> </td>\n");
      out.write("                </tr>         \n");
      out.write("            ");

                            }
                      
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("  </div>\n");
      out.write("</section>                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         \n");
      out.write("        <script>\n");
      out.write("                $(window).on(\"load resize \", function() {\n");
      out.write("                var scrollWidth = $('.tbl-content').width() - $('.tbl-content table').width();\n");
      out.write("                $('.tbl-header').css({'padding-right':scrollWidth});\n");
      out.write("                }).resize();    \n");
      out.write("        </script>    \n");
      out.write("    \n");
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
