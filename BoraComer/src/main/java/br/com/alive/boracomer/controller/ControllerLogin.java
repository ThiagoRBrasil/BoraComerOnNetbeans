package br.com.alive.boracomer.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.event.ActionEvent;

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
            return "home?faces-redirect=true";
        }
        addMessage("erro");
        return null;
    }

    public String cadastrarUsuario() {
        return "cadastrarUsuario?faces-redirect=true";
    }

    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
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
