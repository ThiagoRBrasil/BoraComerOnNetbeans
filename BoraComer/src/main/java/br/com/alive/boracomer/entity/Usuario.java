package br.com.alive.boracomer.entity;

import java.io.Serializable;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = -8793738068211537546L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "password", nullable = false)
    private String pass;

    @OneToOne(optional = true, cascade = CascadeType.ALL)
    private Evento evento;

    @OneToMany(mappedBy = "usuario")
    private List<Amigo> amigos;

    @Column(name = "idade", nullable = false)
    private int idade;

    @Column(name = "email", nullable = false)
    private String email;

    //
    //GETTERS AND SETTERS\\
    //

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public List<Amigo> getAmigos() {
        return amigos;
    }

    public void setAmigos(List<Amigo> amigos) {
        this.amigos = amigos;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.id_usuario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.id_usuario, other.id_usuario)) {
            return false;
        }
        return true;
    }
    
}
