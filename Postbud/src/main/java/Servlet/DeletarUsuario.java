package Servlet;

import hibernatePersistent.usuario.Usuario;
import hibernatePersistent.usuario.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aluno
 */
public class DeletarUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DemiteEmpregado</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DemiteEmpregado at " + request.getContextPath() + "</h1>");
            out.println("ué... o Luiiiiiiiiiizzz não fez o servlet para Deletar a Entidade?");
            out.println("<br/>Gente, quer moleza? Senta no pudim. Leiam os comentários no servlet para algumas instruções adicionais.");
            out.println("</body>");
            out.println("</html>");

            // seguinte, aqui vcs precisam pegar a propriedade que veio do displaytag.
            String email = request.getParameter("email");
            // eu coloquei o nome do código de "cod" lá na coluna do delete, no arquivo listaTotal.jsp
            //         request.getParameter("cod");
            /* daí vcs vão utilizar esse codigo
            (no caso, A CHAVE PRIMÁRIA das vossas respectivas tabelas)
            para chamar o objeto e deletá-lo.
            O método no EmpregadoDAO parece funcionar blzinha...            */
            UsuarioDAO usuariodao = new UsuarioDAO();

            usuariodao.deleteUsuario(email);

            List<Usuario> usuarios = usuariodao.listUsuario();
            request.getSession(true).setAttribute("usuarios", usuarios);
            // e volta para a página da listagem
            // TODO: Se nessa volta tiver uma mensagem falando que deu certo, ganha uma moral extra
            response.sendRedirect("listaTotal.jsp");

        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

