/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alive.boracomer.entity;

import java.util.ArrayList;
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
public class UsuarioTest {
    
    private Usuario instance = null;
    
    public UsuarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Usuario();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of getIdUsuario method, of class Usuario.
     */
    @Test
    public void testGetIdUsuario() {
        System.out.println("getIdUsuario");
        Long expResult = null;
        Long result = instance.getIdUsuario();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdUsuario method, of class Usuario.
     */
    @Test
    public void testSetIdUsuario() {
        System.out.println("setIdUsuario");
        Long dUsuario = null;
        instance.setIdUsuario(dUsuario);
        assertEquals(dUsuario, instance.getIdUsuario());
    }

    /**
     * Test of getNome method, of class Usuario.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        String expResult = null;
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNome method, of class Usuario.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        instance.setNome(nome);
        assertEquals(nome, instance.getNome());
    }

    /**
     * Test of getPass method, of class Usuario.
     */
    @Test
    public void testGetPass() {
        System.out.println("getPass");
        String pass = "";
        instance.setPass(pass);
        assertEquals(pass, instance.getPass());
    }

    /**
     * Test of setPass method, of class Usuario.
     */
    @Test
    public void testSetPass() {
        System.out.println("setPass");
        String pass = "";
        instance.setPass(pass);
        assertEquals(pass, instance.getPass());
    }

    /**
     * Test of getIdade method, of class Usuario.
     */
    @Test
    public void testGetIdade() {
        System.out.println("getIdade");
        int idade = 0;
        instance.setIdade(idade);
        assertEquals(idade, instance.getIdade());
    }

    /**
     * Test of setIdade method, of class Usuario.
     */
    @Test
    public void testSetIdade() {
        System.out.println("setIdade");
        int idade = 0;
        instance.setIdade(idade);
        assertEquals(idade, instance.getIdade());
    }

    /**
     * Test of getEmail method, of class Usuario.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        String email = "";
        instance.setEmail(email);
        assertEquals(email, instance.getEmail());
    }

    /**
     * Test of setEmail method, of class Usuario.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        instance.setEmail(email);
        assertEquals(email, instance.getEmail());
    }
    
}
