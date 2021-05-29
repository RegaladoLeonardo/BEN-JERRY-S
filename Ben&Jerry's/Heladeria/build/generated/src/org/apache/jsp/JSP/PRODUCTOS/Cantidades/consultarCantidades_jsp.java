package org.apache.jsp.JSP.PRODUCTOS.Cantidades;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Control.AccionesCantidad;
import Modelo.Cantidad;
import java.util.List;

public final class consultarCantidades_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cantidades</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../../CSS/Estilos/Tabla.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("<section>\n");
      out.write("  <!--for demo wrap-->\n");
      out.write("  <h1>Tabla de Promociones</h1>\n");
      out.write("  <div class=\"tbl-header\">\n");
      out.write("    <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("      <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>ID_Cantidad</th>\n");
      out.write("            <th>Cantidad</th>\n");
      out.write("            <th>Unidad</th>\n");
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

                            List<Cantidad> lista=AccionesCantidad.getAllCantidades();
                            for(Cantidad e: lista){
                      
      out.write("\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(e.getId_cantidad());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(e.getValor_cantidad());
      out.write("</td>  \n");
      out.write("                    <td>");
      out.print(e.getUnidad_cantidad());
      out.write("</td> \n");
      out.write("                    <td> <a href=\"editarCantidad.jsp?id=");
      out.print(e.getId_cantidad());
      out.write("\" >Editar</a> </td>\n");
      out.write("                    <td> <a href=\"../../../borrarCantida?id=");
      out.print(e.getId_cantidad());
      out.write("\" >Borrar</a> </td>\n");
      out.write("\n");
      out.write("                </tr>         \n");
      out.write("            ");

                            }
                      
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("                        \n");
      out.write("      <ul class=\"menu\">\n");
      out.write("\n");
      out.write("          <li><a href=\"../../../Paginas/cantidad.html\">Regresar</a></li>\n");
      out.write("\n");
      out.write("          <li class=\"bg\"></li>\n");
      out.write("        </ul>              \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("        <script>\n");
      out.write("            $(window).on(\"load resize \", function() {\n");
      out.write("              var scrollWidth = $('.tbl-content').width() - $('.tbl-content table').width();\n");
      out.write("              $('.tbl-header').css({'padding-right':scrollWidth});\n");
      out.write("            }).resize();\n");
      out.write("        </script>           \n");
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
