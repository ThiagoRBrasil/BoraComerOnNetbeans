/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alive.boracomer.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ControllerHome {
    
    public String logout(){
        return "faces/index?faces-redirect=true";
    }
    
    public String novoEvento(){
        return "/novoEvento?faces-redirect=true";
    }
    
}
