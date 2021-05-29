package org.apache.jsp.JSP.PRODUCTOS;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Control.Conexion2;
import java.sql.Connection;
import Control.Conexion;

public final class agregarProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Producto</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../CSS/Estilos/agregarProducto.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <form  method=\"POST\" action=\"../../guardarProducto\">\n");
      out.write("            <h1>Agregar Producto</h1>\n");
      out.write("            \n");
      out.write("            <div class=\"select\">\n");
      out.write("                <select id=\"sabor\" name=\"sabor\">\n");
      out.write("                    <option selected disabled>Escoge un sabor</option>\n");
      out.write("                            ");

                                Conexion cn=new Conexion();
                                try{
                                cn.Conectar();
                                String sql="select * from Csaborhelado;";
                                cn.st=cn.conec.createStatement();
                                cn.rt=cn.st.executeQuery(sql);
                                while (cn.rt.next()){
                                    out.println("<option>"+cn.rt.getString(1)+"</option>");
                                }
                                }catch(Exception e){
                                    out.print(e.toString());
                                }
                                    
      out.write("\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("            <div class=\"select\">\n");
      out.write("                <select  id=\"promocion\" name=\"promocion\">\n");
      out.write("                    <option selected disabled>Escoge una promocion</option>\n");
      out.write("                            ");

                                try{
                                cn.Conectar();
                                String sql="select * from Cpromocion;";
                                cn.st=cn.conec.createStatement();
                                cn.rt=cn.st.executeQuery(sql);
                                while (cn.rt.next()){
                                    out.println("<option>"+cn.rt.getString(2)+"</option>");
                                }
                                }catch(Exception e){
                                    out.print(e.toString());
                                }
                                    
      out.write("\n");
      out.write("                </select>\n");
      out.write("            </div>    \n");
      out.write("                \n");
      out.write("            <div class=\"select\">\n");
      out.write("                <select id=\"cantidad\" name=\"cantidad\">\n");
      out.write("                    <option selected disabled>Escoge la cantidad</option>\n");
      out.write("                            ");

                                try{
                                cn.Conectar();
                                String sql="select * from Ccantidad;";
                                cn.st=cn.conec.createStatement();
                                cn.rt=cn.st.executeQuery(sql);
                                while (cn.rt.next()){
                                    out.println("<option>"+cn.rt.getString(2)+"</option>");
                                }
                                }catch(Exception e){
                                    out.print(e.toString());
                                }
                                    
      out.write("\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            <div class=\"select\">\n");
      out.write("                <select id=\"tamano\" name=\"tamano\">\n");
      out.write("                    <option selected disabled>Escoge el tamaño</option>\n");
      out.write("                            ");

                                try{
                                cn.Conectar();
                                String sql="select * from Ctamano;";
                                cn.st=cn.conec.createStatement();
                                cn.rt=cn.st.executeQuery(sql);
                                while (cn.rt.next()){
                                    out.println("<option>"+cn.rt.getString(2)+"</option>");
                                }
                                }catch(Exception e){
                                    out.print(e.toString());
                                }
                                    
      out.write("\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            <div class=\"select\">\n");
      out.write("                <select id=\"presentacion\" name=\"presentacion\">\n");
      out.write("                    <option selected disabled>Escoge la presentacion</option>\n");
      out.write("                            ");

                                try{
                                cn.Conectar();
                                String sql="select * from Cpresentacion;";
                                cn.st=cn.conec.createStatement();
                                cn.rt=cn.st.executeQuery(sql);
                                while (cn.rt.next()){
                                    out.println("<option>"+cn.rt.getString(2)+"</option>");
                                }
                                }catch(Exception e){
                                    out.print(e.toString());
                                }
                                    
      out.write("\n");
      out.write("                </select>\n");
      out.write("            </div>                  \n");
      out.write("                \n");
      out.write("            <div class=\"input\">\n");
      out.write("                    <input type=\"text\" name=\"cantidad\" required class=\"search-box\"  id=\"cantidad\" placeholder=\"Ingresa el precio\"/>\n");
      out.write("            </div>                  \n");
      out.write("                \n");
      out.write("            <button type=\"submit\" id=\"registrar\">Registrar</button>             \n");
      out.write("                    \n");
      out.write("        </form> \n");
      out.write("                    \n");
      out.write("                    \n");
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
