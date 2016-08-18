package hibernatePersistence.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    private static SessionFactory sessionFactory = buildSessionFactory();
    private static ServiceRegistry serviceRegistry;

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();
            //cfg.configure("hibernate.cfg.xml");
            serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            return sessionFactory;
        } catch (Throwable e) {
            System.out.println("Erro:" + e);
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
////   
/*private static final SessionFactory sessionFactory;
    
 static {
 try {
 // Create the SessionFactory from standard (hibernate.cfg.xml) 
 // config file.
 sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
 } catch (Throwable ex) {
 // Log the exception. 
 System.err.println("Initial SessionFactory creation failed." + ex);
 throw new ExceptionInInitializerError(ex);
 }
 }
    
 public static SessionFactory getSessionFactory() {
 return sessionFactory;
 }
 }*/
