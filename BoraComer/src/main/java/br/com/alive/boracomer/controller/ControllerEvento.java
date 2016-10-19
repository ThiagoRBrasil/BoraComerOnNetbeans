package br.com.alive.boracomer.controller;

import br.com.alive.boracomer.dao.EventoDAO;
import br.com.alive.boracomer.dao.RestauranteDAO;
import br.com.alive.boracomer.dao.UsuarioDAO;
import br.com.alive.boracomer.entity.Evento;
import br.com.alive.boracomer.entity.Restaurante;
import br.com.alive.boracomer.entity.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ControllerEvento extends Controller implements Serializable {

    private Evento evento;
    private String nome;
    private String local;
    private String descricao;
    private String date;
    private String hora;

    public String cadastrar() {
        try {
            evento.setNome(nome);
            Restaurante restaurante = getRestaurante(local);
            evento.setRestaurante(restaurante);
            evento.setDescricao(descricao);
            evento.setDate(date);
            evento.setHora(hora);

            super.usuario.setEvento(evento);

            EventoDAO.getInstance().salvar(evento);
            UsuarioDAO.getInstance().atualizar(usuario);
            return "home?faces-redirect=true";
        } catch (Exception e) {
            //teste para ver se cai aqui
            return "novoEvento?faces-redirect=true";
        }

    }

    private Restaurante getRestaurante(String local) {
        Restaurante restaurante = new Restaurante();
        List<Restaurante> restaurantes = RestauranteDAO.getInstance().findAll();

        for (int i = 0; i < restaurantes.size(); i++) {
            if (restaurantes.get(i).getNome().equals(local)) {
                restaurante = restaurantes.get(i);
                break;
            }
        }

        return restaurante;
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

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
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
