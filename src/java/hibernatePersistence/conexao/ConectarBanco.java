package hibernatePersistence.conexao;

import hibernatePersistence.util.HibernateUtil;
import org.hibernate.Session;

public class ConectarBanco
{
    public static Session porFavor()
    {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Conectou!");
        return sessao;
    }
}
