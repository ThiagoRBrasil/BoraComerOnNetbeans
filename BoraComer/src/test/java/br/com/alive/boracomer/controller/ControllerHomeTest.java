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
 * @author Isaac Teixeira
 */
public class ControllerHomeTest {
    
    private ControllerHome instance = null;
    
    public ControllerHomeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new ControllerHome();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of logout method, of class ControllerHome.
     */
    @Test
    public void testLogout() {
        String expResult = "index?faces-redirect=true";
        String result = instance.logout();
        assertEquals(expResult, result);
    }

    /**
     * Test of novoEvento method, of class ControllerHome.
     */
    @Test
    public void testNovoEvento() {
        String expResult = "novoEvento?faces-redirect=true";
        String result = instance.novoEvento();
        assertEquals(expResult, result);
    }
    
}
