package br.com.alive.boracomer.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ControllerLogin {

    private String user;
    private String pass;

    @PostConstruct
    public void reset() {
        this.user = null;
        this.pass = null;
    }

    public String loginUsuario() {
        if (this.user.equals("admin") && this.pass.equals("admin")) {
            return "welcomePrimefaces?faces-redirect=true";
        }
        return "index?faces-redirect=true";
    }

    public String cadastrarUsuario() {
        return "cadastrarUsuario?faces-redirect=true";
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
