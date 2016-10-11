package br.com.alive.boracomer.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ControllerHome {
    
    public String logout(){
        return "index?faces-redirect=true";
    }
    
    public String novoEvento(){
        return "novoEvento?faces-redirect=true";
    }
    
}
