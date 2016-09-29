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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIdEvento method, of class Evento.
     */
    @org.junit.Test
    public void testGetIdEvento() {
        System.out.println("getIdEvento");
        Evento instance = new Evento();
        Long expResult = null;
        Long result = instance.getIdEvento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdEvento method, of class Evento.
     */
    @org.junit.Test
    public void testSetIdEvento() {
        System.out.println("setIdEvento");
        Long idEvento = null;
        Evento instance = new Evento();
        instance.setIdEvento(idEvento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Evento.
     */
    @org.junit.Test
    public void testGetNome() {
        System.out.println("getNome");
        Evento instance = new Evento();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Evento.
     */
    @org.junit.Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Evento instance = new Evento();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocal method, of class Evento.
     */
    @org.junit.Test
    public void testGetLocal() {
        System.out.println("getLocal");
        Evento instance = new Evento();
        Restaurante expResult = null;
        Restaurante result = instance.getLocal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocal method, of class Evento.
     */
    @org.junit.Test
    public void testSetLocal() {
        System.out.println("setLocal");
        Restaurante local = null;
        Evento instance = new Evento();
        instance.setLocal(local);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHora method, of class Evento.
     */
    @org.junit.Test
    public void testGetHora() {
        System.out.println("getHora");
        Evento instance = new Evento();
        String expResult = "";
        String result = instance.getHora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHora method, of class Evento.
     */
    @org.junit.Test
    public void testSetHora() {
        System.out.println("setHora");
        String hora = "";
        Evento instance = new Evento();
        instance.setHora(hora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescricao method, of class Evento.
     */
    @org.junit.Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        Evento instance = new Evento();
        String expResult = "";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescricao method, of class Evento.
     */
    @org.junit.Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String descricao = "";
        Evento instance = new Evento();
        instance.setDescricao(descricao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
