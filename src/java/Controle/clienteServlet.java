package Controle;

import Modelo.portfolio;
import dao.Banco;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Diego Bizerra
 */
public class clienteServlet extends HttpServlet {

    protected void dopost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        portfolio p = new portfolio();
        String escolha = request.getParameter("botao");
        if (escolha.equals("Enviar")) {
            try {
                p.setNome(request.getParameter("tNome"));
                p.setEndereco(request.getParameter("tEndereco"));
                p.setCidade(request.getParameter("tCid"));
                p.setEmail(request.getParameter("tMail"));
                p.setEmpresa(request.getParameter("tEmpresa"));
                p.setMensagem(request.getParameter("tMsg"));
                Banco b = new Banco();
                b.CadastrarCliente(p);
                out.println("Cadastrado");
                out.println("<H3><A HREF='http://index.html'> Retornar </A>");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }
}
