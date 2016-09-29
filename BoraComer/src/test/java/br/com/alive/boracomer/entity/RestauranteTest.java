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
public class RestauranteTest {
    
    public RestauranteTest() {
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
     * Test of getIdRestaurante method, of class Restaurante.
     */
    @Test
    public void testGetIdRestaurante() {
        System.out.println("getIdRestaurante");
        Restaurante instance = new Restaurante();
        Long expResult = null;
        Long result = instance.getIdRestaurante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdRestaurante method, of class Restaurante.
     */
    @Test
    public void testSetIdRestaurante() {
        System.out.println("setIdRestaurante");
        Long idRestaurante = null;
        Restaurante instance = new Restaurante();
        instance.setIdRestaurante(idRestaurante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Restaurante.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Restaurante instance = new Restaurante();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Restaurante.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Restaurante instance = new Restaurante();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndereco method, of class Restaurante.
     */
    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        Restaurante instance = new Restaurante();
        Endereco expResult = null;
        Endereco result = instance.getEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndereco method, of class Restaurante.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        Endereco endereco = null;
        Restaurante instance = new Restaurante();
        instance.setEndereco(endereco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Restaurante.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Restaurante instance = new Restaurante();
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Restaurante.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        Restaurante instance = new Restaurante();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
