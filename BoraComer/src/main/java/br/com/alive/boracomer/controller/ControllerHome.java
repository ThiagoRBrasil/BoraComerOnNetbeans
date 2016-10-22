package br.com.alive.boracomer.controller;

import br.com.alive.boracomer.entity.Amigo;
import br.com.alive.boracomer.entity.Evento;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ControllerHome implements Serializable{
    
    private List<Evento> eventos;
    private List<Amigo> amigos;
    //POVOAR ESSSAS DUAS LISTAS COM OBJETOS VINDOS DO BANCO
    
    
    public String logout(){
        return "index?faces-redirect=true";
    }
    
    public String novoEvento(){
        return "novoEvento?faces-redirect=true";
    }
    
    public List<Evento> getEventos() {
        return eventos;
    }
    
    public void setEventos(Evento evento) {
        this.eventos.add(evento);
    }
    
    public List<Amigo> getAmigos() {
        return amigos;
    }
    
    public void setAmigos(Amigo amigo) {
        this.amigos.add(amigo);
    }
    
    public void convidarAmigo(){
        
    }
}
