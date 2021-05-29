<%-- 
    Document   : agregarProducto
    Created on : 27-may-2021, 6:36:29
    Author     : bailarina77
--%>

<%@page import="Control.Conexion2"%>
<%@page import="java.sql.Connection"%>
<%@page import="Control.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Producto</title>
        <link rel="stylesheet" href="../../CSS/Estilos/agregarProducto.css">
    </head>
    <body>
        
        
        
        <form  method="POST" action="../../guardarProducto">
            <h1>Agregar Producto</h1>
            
            <div class="select">
                <select id="sabor" name="sabor">
                    <option selected disabled>Escoge un sabor</option>
                            <%
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
                                    %>
                </select>
            </div>
                
            <div class="select">
                <select  id="promocion" name="promocion">
                    <option selected disabled>Escoge una promocion</option>
                            <%
                                try{
                                cn.Conectar();
                                String sql="select * from Cpromocion;";
                                cn.st=cn.conec.createStatement();
                                cn.rt=cn.st.executeQuery(sql);
                                while (cn.rt.next()){
                                    out.println("<option>"+cn.rt.getString(1)+"</option>");
                                }
                                }catch(Exception e){
                                    out.print(e.toString());
                                }
                                    %>
                </select>
            </div>    
                
            <div class="select">
                <select id="cantidad" name="cantidad">
                    <option selected disabled>Escoge la cantidad</option>
                            <%
                                try{
                                cn.Conectar();
                                String sql="select * from Ccantidad;";
                                cn.st=cn.conec.createStatement();
                                cn.rt=cn.st.executeQuery(sql);
                                while (cn.rt.next()){
                                    out.println("<option>"+cn.rt.getString(1)+"</option>");
                                }
                                }catch(Exception e){
                                    out.print(e.toString());
                                }
                                    %>
                </select>
            </div>
                
                
            <div class="select">
                <select id="tamano" name="tamano">
                    <option selected disabled>Escoge el tamaño</option>
                            <%
                                try{
                                cn.Conectar();
                                String sql="select * from Ctamano;";
                                cn.st=cn.conec.createStatement();
                                cn.rt=cn.st.executeQuery(sql);
                                while (cn.rt.next()){
                                    out.println("<option>"+cn.rt.getString(1)+"</option>");
                                }
                                }catch(Exception e){
                                    out.print(e.toString());
                                }
                                    %>
                </select>
            </div>
                
                
            <div class="select">
                <select id="presentacion" name="presentacion">
                    <option selected disabled>Escoge la presentacion</option>
                            <%
                                try{
                                cn.Conectar();
                                String sql="select * from Cpresentacion;";
                                cn.st=cn.conec.createStatement();
                                cn.rt=cn.st.executeQuery(sql);
                                while (cn.rt.next()){
                                    out.println("<option>"+cn.rt.getString(1)+"</option>");
                                }
                                }catch(Exception e){
                                    out.print(e.toString());
                                }
                                    %>
                </select>
            </div>                  
                
            <div class="input">
                    <input type="text" name="cantidad" required class="search-box"  id="cantidad" placeholder="Ingresa el precio"/>
            </div>                  
                
            <button type="submit" id="registrar">Registrar</button>             
                    
        </form> 
                    
                    
    </body>
</html>
