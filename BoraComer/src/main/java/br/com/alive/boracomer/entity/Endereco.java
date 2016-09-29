package br.com.alive.boracomer.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "endereco-seq")
    private Long idEndereco;
    
    @Column(name = "rua", nullable = false)
    private String rua;
    
    @Column(name = "numero", nullable = false)
    private Short numero;
    
    @Column(name = "bairro", nullable = false)
    private String bairro;
    
    @Column(name = "contato", nullable = true)
    private String contato;
    
    @Column(name = "cidade", nullable = true)
    private String cidade;

    //
    //GETTERS AND SETTERS\\
    //

    public Long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Long idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Short getNumero() {
        return numero;
    }

    public void setNumero(Short numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

}
