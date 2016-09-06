package hibernatePersistent.usuario;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table (name = "usuario")

public class Usuario {
   
   @Id
   @Column(name = "email")
   private String email;
   
   @Column(name = "nome")
   private String nome;
   
   @Column(name = "sobrenome")
   private String sobrenome;
   
   @Column(name = "senha")
   private String senha;
   
   @Column(name = "municipio")
   private String municipio;
   
   @Column(name = "data_nascimento")
   @Temporal(javax.persistence.TemporalType.DATE)
   private Date data_nascimento;
   
   @Column(name = "ddd")
   private Integer ddd;
   
   @Column(name = "numero")
   private Integer numero;
   
   @Column(name = "sexo")
   private char sexo = 'F';
   
   @Column(name = "pais")
   private String pais;
   
   @Column(name = "bairro")
   private String bairro;
   
   @Column(name = "complemento")
   private String complemento;
   
   @Column(name = "tipo_logradouro")
   private String tipo_logradouro;
   
   @Column(name = "logradouro")
   private String logradouro;
   
   @Column(name = "num_logradouro")
   private Integer num_logradouro;
   
   @Column(name = "uf")
   private String uf;

 
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

  
    public String getMunicipio() {
        return municipio;
    }
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

   
    public Date getData_nascimento() {
        return data_nascimento;
    }
    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    
    public Integer getDdd() {
        return ddd;
    }
    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

   
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
   
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

   
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

   
    public String getTipo_logradouro() {
        return tipo_logradouro;
    }
    public void setTipo_logradouro(String tipo_logradouro) {
        this.tipo_logradouro = tipo_logradouro;
    }

   
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

   
    public Integer getNum_logradouro() {
        return num_logradouro;
    }
    public void setNum_logradouro(Integer num_logradouro) {
        this.num_logradouro = num_logradouro;
    }

    
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }  
}