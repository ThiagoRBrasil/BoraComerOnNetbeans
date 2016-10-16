/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alive.boracomer.controller;

import java.io.Serializable;
import br.com.alive.boracomer.entity.Usuario;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ControllerCadastro {

    private Usuario usuario;

    @PostConstruct
    public void reset() {
        this.usuario = new Usuario();
    }

    public String cadastrarUsuario() {
        return "faces/index?faces-redirect=true";
    }

    public String cancelarCadastro() {
        return "faces/index?faces-redirect=true";
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
