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
    
    private ControllerCadastro instance = null;
    
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
        instance = new ControllerCadastro();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of reset method, of class ControllerCadastro.
     */
    @Test
    public void testReset() {
        ControllerCadastro instance = new ControllerCadastro();
        instance.reset();
    }

    /**
     * Test of cadastrarUsuario method, of class ControllerCadastro.
     */
    @Test
    public void testCadastrarUsuario() {
//        String expResult = "index?faces-redirect=true";
//        String result = instance.cadastrarUsuario();
//        assertEquals(expResult, result);
    }

    /**
     * Test of cancelarCadastro method, of class ControllerCadastro.
     */
    @Test
    public void testCancelarCadastro() {
        String expResult = "index?faces-redirect=true";
        String result = instance.cancelarCadastro();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUsuario method, of class ControllerCadastro.
     */
    @Test
    public void testGetUsuario() {
        Usuario expResult = null;
        Usuario result = instance.getUsuario();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUsuario method, of class ControllerCadastro.
     */
    @Test
    public void testSetUsuario() {
        Usuario usuario = null;
        instance.setUsuario(usuario);
        assertEquals(instance.getUsuario(), usuario);
    }
    
}
