package br.com.alive.boracomer.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@SequenceGenerator(name = "usuario-seq", sequenceName = "usuario-seq", 
        allocationSize = 1, initialValue = 1)
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario-seq")
    private Long idUsuario;
    
    @ManyToMany(cascade = CascadeType.DETACH)
    @JoinTable(name = "friendZone", joinColumns = {@JoinColumn(name = "idUsuario")},
            inverseJoinColumns = {@JoinColumn(name = "idUsuario")})
    private final List<Usuario> amigos = new ArrayList<>();
    
    @Column(name = "idade", nullable = false)
    private int idade;
    
    @Column(name = "email", nullable = false)
    private String email;

    //
    //GETTERS AND SETTERS\\
    //
    
    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public List<Usuario> getAmigos() {
        return amigos;
    }

    public void addAmigo(Usuario amigo) {
        this.amigos.add(amigo);
    }
    
    public void removeAmigo(Usuario amigo) {
        this.amigos.remove(amigo);
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
    
}
