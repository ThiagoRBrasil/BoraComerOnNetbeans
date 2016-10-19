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
    
    private Restaurante instance = null;
    
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
        instance = new Restaurante();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of getIdRestaurante method, of class Restaurante.
     */
    @Test
    public void testGetIdRestaurante() {
        System.out.println("getIdRestaurante");
        Long expResult = null;
        Long result = instance.getId_restaurante();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdRestaurante method, of class Restaurante.
     */
    @Test
    public void testSetIdRestaurante() {
        System.out.println("setIdRestaurante");
        Long id_restaurante = null;
        instance.setId_restaurante(id_restaurante);
        assertEquals(id_restaurante, instance.getId_restaurante());
    }

    /**
     * Test of getNome method, of class Restaurante.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        String expResult = null;
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNome method, of class Restaurante.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        instance.setNome(nome);
        assertEquals(nome, instance.getNome());
    }

    /**
     * Test of getEndereco method, of class Restaurante.
     */
    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        Endereco expResult = null;
        Endereco result = instance.getEndereco();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEndereco method, of class Restaurante.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        Endereco endereco = null;
        instance.setEndereco(endereco);
        assertEquals(endereco, instance.getEndereco());
    }

    /**
     * Test of getTipo method, of class Restaurante.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        String expResult = null;
        String result = instance.getTipo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTipo method, of class Restaurante.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        instance.setTipo(tipo);
        assertEquals(tipo, instance.getTipo());
    }
    
}
