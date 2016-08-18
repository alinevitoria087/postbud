package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE HTML>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Retrospect by TEMPLATED</title>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <!--[if lte IE 8]><script src=\"assets/js/ie/html5shiv.js\"></script><![endif]-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/cadastro.css\" />\n");
      out.write("        <!--[if lte IE 8]><link rel=\"stylesheet\" href=\"assets/css/ie8.css\" /><![endif]-->\n");
      out.write("        <!--[if lte IE 9]><link rel=\"stylesheet\" href=\"assets/css/ie9.css\" /><![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <form action=\"cadastro\" method=\"post\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- DADOS DE CADASTRO -->\n");
      out.write("\n");
      out.write("            <table cellspacing=\"10\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <label for=\"email\">E-mail </label>\n");
      out.write("                    </td>\n");
      out.write("                    <td align=\"left\">\n");
      out.write("                        <input type=\"text\" name=\"email\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <label for=\"nome\">Nome </label>\n");
      out.write("                    </td>\n");
      out.write("                    <td align=\"left\">\n");
      out.write("                        <input type=\"text\" name=\"nome\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <label for=\"sobrenome\">Sobrenome</label>\n");
      out.write("                    </td>\n");
      out.write("                    <td align=\"left\">\n");
      out.write("                        <input type=\"text\" name=\"sobrenome\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <label for=\"nickname\">Nickname</label>\n");
      out.write("                    </td>\n");
      out.write("                    <td align=\"left\">\n");
      out.write("                        <input type=\"text\" name=\"nickname\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <label for=\"pass\">Senha </label>\n");
      out.write("                    </td>\n");
      out.write("                    <td align=\"left\">\n");
      out.write("                        <input type=\"password\" name=\"senha\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <label for=\"passconfirm\">Confirme senha </label>  <!-- Criar código .js-->\n");
      out.write("                    </td>\n");
      out.write("                    <td align=\"left\">\n");
      out.write("                        <input type=\"password\" name=\"passconfirm\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>   \n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            <br/>\n");
      out.write("\n");
      out.write("            <input type=\"submit\" Value=\"Enviar\">\n");
      out.write("            <br><br>\n");
      out.write("            <input type=\"reset\" value=\"Limpar\">\n");
      out.write("            <br><br>\n");
      out.write("            <input type=\"reset\" value=\"Voltar\">\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
