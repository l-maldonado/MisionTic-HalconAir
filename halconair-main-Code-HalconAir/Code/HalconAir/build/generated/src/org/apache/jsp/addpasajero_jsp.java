package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addpasajero_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Pasajero</title>\n");
      out.write("        <!--        <link rel=\"stylesheet\" href=\"css/style.css\">  -->\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container mt-4\"> \n");
      out.write("            <div class=\"card\"> \n");
      out.write("                <div class=\"card-header  \">\n");
      out.write("                    <h3>Agregar nuevo Pasajero</h3>\n");
      out.write("                </div>\n");
      out.write("                <br/> \n");
      out.write("\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form action=\"PasajeroControlador?accion=insertar\" method=\"POST\" autocomplete=\"off\">\n");
      out.write("                        <label>Documento:</label>\n");
      out.write("                        <input class=\"form-control\" id=\"docu_clie\" name=\"docu_clie\" type=\"text\" />\n");
      out.write("                        <label>Tipo Documento:</label>\n");
      out.write("                        <input class=\"form-control\" id=\"tipodocu_clie\" name=\"tipodocu_clie\" type=\"text\" />\n");
      out.write("                        <label>Nombre:</label>\n");
      out.write("                        <input class=\"form-control\" id=\"nombre_clie\" name=\"nombre_clie\" type=\"text\" />\n");
      out.write("                        <label>Apellido:</label>\n");
      out.write("                        <input class=\"form-control\" id=\"apellido_clie\" name=\"apellido_clie\" type=\"text\" />\n");
      out.write("                        <label>Fecha Nacimiento:</label>\n");
      out.write("                        <input class=\"form-control\" id=\"fechanac_clie\" name=\"fechanac_clie\" type=\"text\" />\n");
      out.write("                        <label>Direccion:</label>\n");
      out.write("                        <input class=\"form-control\" id=\"direccion_clie\" name=\"direccion_clie\" type=\"text\" />\n");
      out.write("                        <label>Telefono:</label>\n");
      out.write("                        <input class=\"form-control\" id=\"telefono_clie\" name=\"telefono_clie\" type=\"text\" />\n");
      out.write("                        <br/> \n");
      out.write("                        \n");
      out.write("                        <button id=\"guardar\" name=\"guardar\" type=\"submit\">Guardar</button>\n");
      out.write("                        <a href=\"PasajeroControlador?accion=pasajerotbl\">Regresar</a>\n");
      out.write("                        \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>   \n");
      out.write("\n");
      out.write("        </div>   \n");
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
