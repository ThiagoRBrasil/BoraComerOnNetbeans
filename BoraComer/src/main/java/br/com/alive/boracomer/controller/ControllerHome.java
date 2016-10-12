package br.com.alive.boracomer.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ControllerHome {
    
    public String logout(){
<<<<<<< HEAD
        return "index?redirect=true";
    }
    
    public String novoEvento(){
        return "index?faces-redirect=true";
=======
        return "index?faces-redirect=true";
    }
    
    public String novoEvento(){
        return "novoEvento?faces-redirect=true";
>>>>>>> 90d67a0c585e7cbe5677e2f9f829c23557d23556
    }
    
}
