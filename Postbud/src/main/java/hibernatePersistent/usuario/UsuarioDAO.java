package hibernatePersistent.usuario;

import Hibernate.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;

public class UsuarioDAO { //Data Access Object

    private static SessionFactory factory;

    public Usuario login(String email, String senha) {
        Session session = HibernateUtil.abrirSessaoComBD();
        Usuario usuario= null;
        try {
            usuario = (Usuario) session
                    .createQuery("from Usuario where email= :email and senha= :senha")
                    .setString("email", email).setString("senha", senha).uniqueResult();
        } catch (HibernateException he) {
        }
        return usuario;
    }

    public boolean addUsuario(Usuario usuario) throws HibernateException {
        Session session = HibernateUtil.abrirSessaoComBD();
        Transaction tx = null;
        boolean funfou = false;
        String okay = null;
        try {
            tx = session.beginTransaction();

            okay = (String) session.save(usuario);
            System.out.println("OK? " + okay);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            throw e;
        } finally {
            session.close();
        }
        if (okay != null) {
            funfou = true;
        }
        return funfou;
    }

    public List<Usuario> listUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}