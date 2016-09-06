package Hibernate;

import hibernatePersistent.usuario.Usuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Esta classe serve para centralizar a criação da SessionFactory.
 * Ao utilizá-la, a fábrica de sessões com o banco ficará centralizada
 * propiciando acesso a todos os objetos do sistema.
 * @author luizc
 */
public class HibernateUtil {

    private static SessionFactory factory;

    static {
        try {
            factory = new AnnotationConfiguration().configure()
                    .addAnnotatedClass(Usuario.class)
                    .buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Falha ao criar sessionFactory. " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session abrirSessaoComBD() {
        return factory.openSession();
    }
}