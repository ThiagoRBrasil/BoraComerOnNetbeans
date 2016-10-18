/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alive.boracomer;

import br.com.alive.boracomer.dao.EnderecoDAO;
import br.com.alive.boracomer.dao.EventoDAO;
import br.com.alive.boracomer.entity.Endereco;
import br.com.alive.boracomer.entity.Evento;
import br.com.alive.boracomer.entity.Restaurante;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Persistence;

/**
 *
 * @author ThiagoBrasil
 */
public class Main {

    public static void main(String[] args) {

        Persistence.createEntityManagerFactory("BoraComerPU");
//        Endereco endereco = new Endereco();
//        endereco.setBairro("bairro");
//        endereco.setCidade("cidade");
//        endereco.setContato("contato");
//        endereco.setNumero("numero");
//        endereco.setRua("rua");
//        
//        EnderecoDAO.getInstance().salvar(endereco);

//        Restaurante restaurante = new Restaurante();
//        restaurante.setEndereco(endereco);
//        restaurante.setNome("nome");
//        restaurante.setNome("nome");
//        restaurante.setTipo("tipo");
//
//        Evento evento = new Evento();  
//        evento.setNome("nome");
//        evento.setDescricao("descri");
//        evento.setHora("horario");
//        evento.setLocal(restaurante);
//        System.out.println(">.....>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        try {
//            EventoDAO.getInstance().salvar(evento);
//        } catch (Exception ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
       
    }

}
