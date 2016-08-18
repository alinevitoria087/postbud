package hibernatePersistence.usuario;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    private String email;
    private String nome;
    private String sobrenome;
    private String nickname;
    private String senha;

    public final String getEmail() //get pegar
    {
        return email;
    }

    public final void setEmail(String value) //set definir
    {
        email = value;
    }

    public final String getNome() //get pegar
    {
        return nome;
    }

    public final void setNome(String value) //set definir
    {
        nome = value;
    }

    public final String getSobrenome()
    {
        return sobrenome;
    }

    public final void setSobrenome(String value)
    {
        sobrenome = value;
    }

    public final String getNickname()
    {
        return nickname;
    }

    public final void setNickname(String value)
    {
        nickname = value;
    }

    public final String getSenha()
    {
        return senha;
    }

    public final void setSenha(String value)
    {
        senha = value;
    }
    
    public Usuario(String email)
    {
        super();
        this.email = email;
    }

    public Usuario(String email, String nome)
    {
        super();
        this.email = email;
        this.nome = nome;
    }

    public Usuario()
    {
    }

}
