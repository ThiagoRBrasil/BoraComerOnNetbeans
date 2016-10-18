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
public class ControllerEventoTest {
    
    private ControllerEvento instance = null;
    
    public ControllerEventoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new ControllerEvento();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of getDate method, of class ControllerEvento.
     */
    @Test
    public void testGetDate() {
        String expResult = null;
        String result = instance.getDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDate method, of class ControllerEvento.
     */
    @Test
    public void testSetDate() {
        String date = "";
        ControllerEvento instance = new ControllerEvento();
        instance.setDate(date);
        assertEquals(date, date);
    }
    
}
