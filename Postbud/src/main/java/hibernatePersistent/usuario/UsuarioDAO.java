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

    /* Method to CREATE an fashionista in the database */
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

    /* Method to  READ all the fashionistas */
    public List listUsuario() {
        Session session = HibernateUtil.abrirSessaoComBD();
        Transaction tx = null;
        List<Usuario> usuarios = null;
        try {

            usuarios = session.createCriteria(Usuario.class).list();

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return usuarios;
    }

    /* Method to UPDATE salary for an fashionista */
    public void updateUsuario(String emailID, String nome, String sobrenome, String email,String senha ) {
        Session session = HibernateUtil.abrirSessaoComBD();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Usuario usuario
                    = (Usuario) session.get(Usuario.class, emailID);
            session.update(usuario);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
    }

    /* Method to DELETE an fashionista from the records */
    public void deleteUsuario(String emailID) {
        Session session = HibernateUtil.abrirSessaoComBD();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Usuario usuario
                    = (Usuario) session.get(Usuario.class, emailID);
            session.delete(usuario);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
    }
    
    public Usuario recuperaUsuario(String email) {
        Session session = HibernateUtil.abrirSessaoComBD();
        Usuario usuario= null;
        try {
             usuario= (Usuario) session
                     .createQuery("from Usuario where email = :email")
                     .setString("email", email)
                     .uniqueResult();
            
        } catch (HibernateException e) {
        } finally {
            session.close();
        }
        return usuario;
    }
}

