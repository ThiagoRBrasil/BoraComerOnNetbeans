/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alive.boracomer;

import br.com.alive.boracomer.dao.EventoDAO;
import br.com.alive.boracomer.entity.Endereco;
import br.com.alive.boracomer.entity.Evento;
import br.com.alive.boracomer.entity.Restaurante;
import javax.persistence.Persistence;

/**
 *
 * @author ThiagoBrasil
 */
public class Main {

    public static void main(String[] args) {

//        Persistence.createEntityManagerFactory("BoraComerPU");
        Endereco endereco = new Endereco();
        endereco.setBairro("bairro");
        endereco.setCidade("cidade");
        endereco.setContato("contato");
        endereco.setNumero("numero");
        endereco.setRua("rua");

        Restaurante restaurante = new Restaurante();
        restaurante.setEndereco(endereco);
        restaurante.setNome("nome");
        restaurante.setNome("nome");
        restaurante.setTipo("tipo");

        Evento evento = new Evento();       
        evento.setDescricao("descri");
        evento.setHora("horario");
        evento.setLocal(restaurante);
        
        EventoDAO.getInstance().atualizar(evento);
       
    }

}
