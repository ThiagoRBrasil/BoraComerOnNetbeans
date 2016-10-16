/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alive.boracomer.controller;

import br.com.alive.boracomer.entity.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Isaac Teixeira
 */
public class ControllerCadastroTest {
    
    public ControllerCadastroTest() {
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
     * Test of reset method, of class ControllerCadastro.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        ControllerCadastro instance = new ControllerCadastro();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadastrarUsuario method, of class ControllerCadastro.
     */
    @Test
    public void testCadastrarUsuario() {
        System.out.println("cadastrarUsuario");
        ControllerCadastro instance = new ControllerCadastro();
        String expResult = "";
        String result = instance.cadastrarUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelarCadastro method, of class ControllerCadastro.
     */
    @Test
    public void testCancelarCadastro() {
        System.out.println("cancelarCadastro");
        ControllerCadastro instance = new ControllerCadastro();
        String expResult = "";
        String result = instance.cancelarCadastro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class ControllerCadastro.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        ControllerCadastro instance = new ControllerCadastro();
        Usuario expResult = null;
        Usuario result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class ControllerCadastro.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Usuario usuario = null;
        ControllerCadastro instance = new ControllerCadastro();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
