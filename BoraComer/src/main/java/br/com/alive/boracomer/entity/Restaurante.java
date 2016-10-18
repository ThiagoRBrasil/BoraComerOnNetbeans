package br.com.alive.boracomer.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "restaurante")
public class Restaurante implements Serializable {
    
    private static final long serialVersionUID = -8793738068211537546L; 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRestaurante;
    
    @OneToMany(mappedBy = "restaurante")
    private List<Evento> eventos;
    
    @Column(name = "nome", nullable = false)
    private String nome;
    
    @OneToOne(optional = false,
            cascade = CascadeType.ALL)
    private Endereco endereco;
    
    @Column(name = "tipo", nullable = false)
    private String tipo;

    //
    //GETTERS AND SETTERS\\
    //

    public Long getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(Long idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.idRestaurante);
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
        final Restaurante other = (Restaurante) obj;
        if (!Objects.equals(this.idRestaurante, other.idRestaurante)) {
            return false;
        }
        return true;
    }

}
