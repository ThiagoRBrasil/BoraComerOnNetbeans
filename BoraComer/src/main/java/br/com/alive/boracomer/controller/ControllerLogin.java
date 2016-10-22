package br.com.alive.boracomer.controller;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class ControllerLogin implements Serializable {

    private String user;
    private String pass;

    @PostConstruct
    public void reset() {
        this.user = null;
        this.pass = null;
    }

    public String loginUsuario() {
        if (this.user.equals("admin") && this.pass.equals(pass)) {
            return "home?faces-redirect=true";
        }
        addMessage("Usuario/Senha incorreto(s)");
        return null;
    }

    public String cadastrarUsuario() {
        return "cadastrarUsuario?faces-redirect=true";
    }

    public String cadastrarRestaurante() {
        return "cadastrarRestaurante?faces-redirect=true";
    }

    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, summary, null);
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
