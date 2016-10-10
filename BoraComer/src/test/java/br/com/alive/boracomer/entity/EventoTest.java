/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alive.boracomer.entity;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thiago Brasil
 */
public class EventoTest {
    
    private Evento instance = null;
    
    public EventoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Evento();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of getIdEvento method, of class Evento.
     */
    @org.junit.Test
    public void testGetIdEvento() {
        System.out.println("getIdEvento");
        Long expResult = null;
        Long result = instance.getIdEvento();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdEvento method, of class Evento.
     */
    @org.junit.Test
    public void testSetIdEvento() {
        System.out.println("setIdEvento");
        Long idEvento = null;
        instance.setIdEvento(idEvento);
        assertEquals(idEvento, instance.getIdEvento());
    }

    /**
     * Test of getNome method, of class Evento.
     */
    @org.junit.Test
    public void testGetNome() {
        System.out.println("getNome");
        String expResult = null;
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNome method, of class Evento.
     */
    @org.junit.Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        instance.setNome(nome);
        assertEquals(nome, instance.getNome());
    }

    /**
     * Test of getLocal method, of class Evento.
     */
    @org.junit.Test
    public void testGetLocal() {
        System.out.println("getLocal");
        Restaurante expResult = null;
        Restaurante result = instance.getLocal();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLocal method, of class Evento.
     */
    @org.junit.Test
    public void testSetLocal() {
        System.out.println("setLocal");
        Restaurante local = null;
        instance.setLocal(local);
        assertEquals(local, local);
    }

    /**
     * Test of getHora method, of class Evento.
     */
    @org.junit.Test
    public void testGetHora() {
        System.out.println("getHora");
        String expResult = null;
        String result = instance.getHora();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHora method, of class Evento.
     */
    @org.junit.Test
    public void testSetHora() {
        System.out.println("setHora");
        String hora = "";
        instance.setHora(hora);
        assertEquals(hora, hora);
    }

    /**
     * Test of getDescricao method, of class Evento.
     */
    @org.junit.Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        String expResult = null;
        String result = instance.getDescricao();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDescricao method, of class Evento.
     */
    @org.junit.Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String descricao = "";
        instance.setDescricao(descricao);
        assertEquals(descricao, instance.getDescricao());
    }
    
}
