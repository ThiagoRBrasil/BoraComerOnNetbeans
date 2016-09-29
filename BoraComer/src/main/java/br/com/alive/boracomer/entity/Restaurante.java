package br.com.alive.boracomer.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@SequenceGenerator(name = "restaurante-seq", sequenceName = "restaurante-seq", 
        allocationSize = 1, initialValue = 1)
public class Restaurante implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "restaurante-seq")
    private Long idRestaurante;
    
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

}
