/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alive.boracomer.controller;

import br.com.alive.boracomer.dao.UsuarioDAO;
import br.com.alive.boracomer.entity.Usuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@RequestScoped
public class ControllerCadastro implements Serializable {

    private Usuario usuario;
    private String nome;
    private String pass;
    private String idade;
    private String email;

    @PostConstruct
    public void reset() {
        this.usuario = new Usuario();
    }

    public String cadastrarUsuario() {
        try {
            usuario.setNome(nome);
            usuario.setPass(pass);
            usuario.setIdade(Integer.parseInt(idade));
            usuario.setEmail(email);
            UsuarioDAO.getInstance().atualizar(usuario);

            return "index?faces-redirect=true";
        } catch (Exception e) {
        }
        return null;
    }

    public String cancelarCadastro() {
        return "index?faces-redirect=true";
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
