package hibernatePersistence.usuario;

import hibernatePersistence.conexao.ConectarBanco;
import hibernatePersistence.util.HibernateUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.hibernate.*;

public class UsuarioDAO
{
    private Session session;
    private Transaction transaction;

    public void salvar(Usuario usuario)
    {
        try
        {
            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            this.session.save(usuario);
            this.transaction.commit();
            System.out.println("entrou aqui");
        }
        catch (HibernateException e)
        {
            System.out.println("Não foi possível inserir. Erro:" + e.getMessage());
        }
        finally
        {
            try
            {
                if (this.session.isOpen())
                {
                    this.session.close();
                }
            }
            catch (Throwable e)
            {
                System.out.println("Erro ao fechar a operação. Mensagem:" + e.getMessage());
            }
        }
    }
    
    public boolean existe(Usuario usuario)
    {
        boolean achou = false;
        try
        {
            Session sessao = ConectarBanco.porFavor();
            Usuario user = null;
            //PreparedStatement pstm = conexao.prepareStatement("Select * from professor where siape = ?");
            // pstm.setString(3, professor.getSiape());
            //ResultSet rs = pstm.executeQuery();
            user = (Usuario) sessao.createQuery("from Usuario where email = ?").setParameter(0, usuario.getEmail()).uniqueResult();
    
            if (user != null)
            {
                achou = true;
            }
            sessao.close();
           // conexao.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return achou;
    }

    public Usuario getUsuario(String email, String senha)
    {
        Usuario user = null;
        Session sessao = ConectarBanco.porFavor();
        try
        {
            user = (Usuario) sessao.createQuery("from Usuario where email = ? and senha = ?").setParameter(0, email).setParameter(1, senha).uniqueResult();
            System.out.println("entrei no tryyyy");
            if (user == null)
            {
                System.out.println("VOLTOU NADA DA BASE, MANO! LOKO!!!  SEI LA O QUE E ISSO");
            }
            else
            {
                System.out.println("USUARIO: " + user.getNome());
            }
        }
        catch (HibernateException e)
        {
            e.printStackTrace();
        }
        finally
        {
            sessao.close();
        }
        return user;
    }
}