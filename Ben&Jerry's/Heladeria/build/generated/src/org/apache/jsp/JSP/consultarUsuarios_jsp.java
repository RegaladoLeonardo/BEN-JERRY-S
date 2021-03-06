package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Usuario;
import java.util.List;
import Control.AccionesUsuario;

public final class consultarUsuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">-->\n");
      out.write("        <!--class=\"table table-striped table-bordered table-hover table-dark\"-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../CSS/Estilos/Tabla.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>Tabla de Usuarios</h1>\n");
      out.write("            <br>\n");
      out.write("            <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" border=\"2\">\n");
      out.write("\n");
      out.write("                <!--CABECERA DE LA TABLA-->\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>ID</th>\n");
      out.write("                        <th>Usuario</th>\n");
      out.write("                        <th>Nombre</th>\n");
      out.write("                        <th>Apellidos</th>\n");
      out.write("                        <!--<th>Contrase??a</th>-->\n");
      out.write("                        <th>Domicilio</th>\n");
      out.write("                        <th>Edad</th>\n");
      out.write("                        <th>Telefono</th>\n");
      out.write("                        <th></th>\n");
      out.write("                        <th></th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <!--FINAL CABECERA DE LA TABLA-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!--CUERPO DE LA TABLA-->\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                                    List<Usuario> lista=AccionesUsuario.getAllUsuarios();
                                    for(Usuario e: lista){
                              
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                            <td>");
      out.print(e.getId());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(e.getUsuario());
      out.write("</td>        \n");
      out.write("                            <td>");
      out.print(e.getNombre());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(e.getAppe());
      out.write("</td>\n");
      out.write("                            \n");
      out.write("                            <td>");
      out.print(e.getDireccion());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(e.getEdad());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(e.getTelefono());
      out.write("</td>\n");
      out.write("                            <td> <a href=\"editarUsuario.jsp?id=");
      out.print(e.getId());
      out.write("\" >Editar</a> </td>\n");
      out.write("                            <td> <a href=\"../borrarUsuario?id=");
      out.print(e.getId());
      out.write("\" >Borrar</a> </td>\n");
      out.write("\n");
      out.write("                        </tr>         \n");
      out.write("                    ");

                                    }
                              
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("                <!--CUERPO DE LA TABLA-->\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    <!--\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>-->\n");
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
