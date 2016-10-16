/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alive.boracomer.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ThiagoBrasil
 */
public class ControllerLoginTest {

    private ControllerLogin instance = null;

    public ControllerLoginTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new ControllerLogin();
    }

    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of reset method, of class ControllerLogin.
     */
    @Test
    public void testReset() {
        ControllerLogin instance = new ControllerLogin();
        instance.reset();
    }

    /**
     * Test of loginUsuario method, of class ControllerLogin.
     */
    @Test
    public void testLoginUsuario() {
        String user = "admin";
        String pass = "admin";
        String exp_result = "home?faces-redirect=true";
        instance.setUser(user);
        instance.setPass(pass);
        String result = instance.loginUsuario();

        assertEquals(exp_result, result);
    }

    /**
     * Test of cadastrarUsuario method, of class ControllerLogin.
     */
    @Test
    public void testCadastrarUsuario() {
        String expResult = "cadastrarUsuario?faces-redirect=true";
        String result = instance.cadastrarUsuario();
        assertEquals(expResult, result);
    }

    /**
     * Test of addMessage method, of class ControllerLogin.
     */
    @Test
    public void testAddMessage() {
    }

    /**
     * Test of getUser method, of class ControllerLogin.
     */
    @Test
    public void testGetUser() {
        String expResult = null;
        String result = instance.getUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUser method, of class ControllerLogin.
     */
    @Test
    public void testSetUser() {
        String user = null;
        ControllerLogin instance = new ControllerLogin();
        instance.setUser(user);
    }

    /**
     * Test of getPass method, of class ControllerLogin.
     */
    @Test
    public void testGetPass() {
        String expResult = null;
        String result = instance.getPass();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPass method, of class ControllerLogin.
     */
    @Test
    public void testSetPass() {
        String pass = null;
        ControllerLogin instance = new ControllerLogin();
        instance.setPass(pass);
    }

}
