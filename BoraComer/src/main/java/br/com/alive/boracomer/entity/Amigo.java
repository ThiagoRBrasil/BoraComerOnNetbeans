package br.com.alive.boracomer.entity;

import java.io.Serializable;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "amigo")
public class Amigo implements Serializable {

    private static final long serialVersionUID = -8793738068211537546L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_amigo;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    private boolean convite;

    public Long getId_amigo() {
        return id_amigo;
    }

    public void setId_amigo(Long id_amigo) {
        this.id_amigo = id_amigo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean isConvite() {
        return convite;
    }

    public void setConvite(boolean convite) {
        this.convite = convite;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.id_amigo);
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
        final Amigo other = (Amigo) obj;
        if (!Objects.equals(this.id_amigo, other.id_amigo)) {
            return false;
        }
        return true;
    }

}
