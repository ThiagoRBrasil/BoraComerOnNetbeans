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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of reset method, of class ControllerLogin.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        ControllerLogin instance = new ControllerLogin();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUsuario method, of class ControllerLogin.
     */
    @Test
    public void testLoginUsuario() {
        System.out.println("loginUsuario");
        ControllerLogin instance = new ControllerLogin();
        String expResult = "";
        String result = instance.loginUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of cadastrarUsuario method, of class ControllerLogin.
     */
    @Test
    public void testCadastrarUsuario() {
        System.out.println("cadastrarUsuario");
        ControllerLogin instance = new ControllerLogin();
        String expResult = "";
        String result = instance.cadastrarUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of addMessage method, of class ControllerLogin.
     */
    @Test
    public void testAddMessage() {
        System.out.println("addMessage");
        String summary = "";
        ControllerLogin instance = new ControllerLogin();
        instance.addMessage(summary);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class ControllerLogin.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        ControllerLogin instance = new ControllerLogin();
        String expResult = "";
        String result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class ControllerLogin.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        String user = "";
        ControllerLogin instance = new ControllerLogin();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getPass method, of class ControllerLogin.
     */
    @Test
    public void testGetPass() {
        System.out.println("getPass");
        ControllerLogin instance = new ControllerLogin();
        String expResult = "";
        String result = instance.getPass();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    /**
     * Test of setPass method, of class ControllerLogin.
     */
    @Test
    public void testSetPass() {
        System.out.println("setPass");
        String pass = "";
        ControllerLogin instance = new ControllerLogin();
        instance.setPass(pass);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
