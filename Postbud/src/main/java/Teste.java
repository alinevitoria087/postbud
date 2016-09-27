import hibernatePersistent.usuario.UsuarioDAO;
import hibernatePersistent.usuario.Usuario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;

public class Teste {

    public static void main(String args[]) {
        
        // System.out.println("Ok,teste");
        //Session sessao = HibernateUtil.abrirSessaoComBD();
        // List usuarios = sessao.createCriteria(Usuario.class).list();
        UsuarioDAO listar = new UsuarioDAO();

        List<Usuario> usuarios = listar.listUsuario();

        for (Usuario usuario : usuarios) {
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Sobrenome: " + usuario.getSobrenome());
          
        }
        Usuario usuario = new Usuario();

        usuario.setNome("Joãozinho");
        usuario.setSobrenome("Golden");
        usuario.setEmail("joazinho@gmail.com");
      
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        try {
            data = format.parse("11/03/1999");
        } catch (ParseException ex) {
            System.err.println("Data errada.");
        }
        usuario.setData_nascimento(data);
      
        
      

        UsuarioDAO fash = new UsuarioDAO();
        boolean funciona = false;
        try {
            funciona = fash.addUsuario(usuario);
        } catch (HibernateException ex) {
            funciona = false;
        }
        
        if (funciona) {
            System.out.println("SIIIIIIIIIIIIIIIIIM!!!!");
        } else {
            System.out.println("NOOOOOO!");
        }
    }
}

