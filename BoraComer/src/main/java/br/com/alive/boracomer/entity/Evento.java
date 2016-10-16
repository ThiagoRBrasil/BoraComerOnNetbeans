package br.com.alive.boracomer.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "evento")
public class Evento implements Serializable {
    
    private static final long serialVersionUID = 1L; 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEvento;
    
    @Column(name = "nome", nullable = false)
    private String nome;
    
    @Column(name = "local", nullable = false)
    private Restaurante local;
    
    @Column(name = "horario", nullable = true)
    private String hora;
    
    @Column(name = "descricao", nullable = true)
    private String descricao;
    
    //
    // ACRESCENTAR USUÁRIO_AUTOR\\
    //
    
    @Column(name = "comentarios", nullable = true)
    private ArrayList<String> comentarios = new ArrayList();
    
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

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.idEvento);
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
        final Evento other = (Evento) obj;
        if (!Objects.equals(this.idEvento, other.idEvento)) {
            return false;
        }
        return true;
    }

    

}
