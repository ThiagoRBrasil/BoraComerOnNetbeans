package br.com.alive.boracomer.entity;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.Queue;
import javax.persistence.*;

@Entity
@SequenceGenerator(name = "evento-seq", sequenceName = "evento-seq", 
        allocationSize = 1, initialValue = 1)
public class Evento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "evento-seq")
    private Long idEvento;
    
    @Column(name = "nome", nullable = false)
    private String nome;
    
    @OneToOne(optional = false, 
            cascade = CascadeType.DETACH)
    private Restaurante local;
    
    @Column(name = "horario", nullable = true)
    private String hora;
    
    @Column(name = "descricao", nullable = true)
    private String descricao;
    
    @Column(name = "comentarios", nullable = false)
    private final Queue<String> comentarios = new LinkedList<>();
    
    //
    //GETTERS AND SETTERS\\
    //

    public Long getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Long idEvento) {
        this.idEvento = idEvento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Restaurante getLocal() {
        return local;
    }

    public void setLocal(Restaurante local) {
        this.local = local;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
