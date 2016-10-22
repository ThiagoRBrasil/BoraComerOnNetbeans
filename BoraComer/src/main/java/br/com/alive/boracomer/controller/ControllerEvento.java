package br.com.alive.boracomer.controller;

import br.com.alive.boracomer.dao.UsuarioDAO;
import br.com.alive.boracomer.entity.Evento;
import br.com.alive.boracomer.entity.Restaurante;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ControllerEvento extends Controller implements Serializable {

    private Evento evento;
    private String nome;
    private Restaurante local;
    private String descricao;
    private String date;
    private String hora;
    
    public String cadastrar() {
        try {
        evento.setNome(nome);
//        evento.setRestaurante(local);
        evento.setDescricao(descricao);
        evento.setDate(date);
        evento.setHora(hora);

        super.usuario.addEvento(evento);

<<<<<<< HEAD
        UsuarioDAO.getInstance().atualizar(usuario);

        return "home?faces-redirect=true";
=======
            EventoDAO.getInstance().salvar(evento);
            UsuarioDAO.getInstance().atualizar(usuario);
            
            return "home?faces-redirect=true";
>>>>>>> 5fba1e6f31b0ea7cdbd01a68a34b6e0e53e64f25
        } catch (Exception e) {
    }
        return null;
    }
    
    public String cancelarNovoEvento(){
        return "home?faces-redirect=true";
    }
    
    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Restaurante getLocal() {
        return local;
    }

    public void setLocal(Restaurante local) {
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void marcarAmigos() {

    }

    

}
