/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alive.boracomer.entity;

import java.util.ArrayList;
import java.util.List;
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
        System.out.println("testGetIdUsuario");
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
        Long idUsuario = null;
        instance.setIdUsuario(idUsuario);
        assertEquals(idUsuario, instance.getIdUsuario());
    }

    /**
     * Test of getAmigos method, of class Usuario.
     */
    @Test
    public void testGetAmigos() {
        System.out.println("getAmigos");
        List<Usuario> expResult = new ArrayList();
        List<Usuario> result = instance.getAmigos();
        assertEquals(expResult, result);
    }

    /**
     * Test of addAmigo method, of class Usuario.
     */
    @Test
    public void testAddAmigo() {
        System.out.println("addAmigo");
        Usuario usuario = new Usuario();
        instance.addAmigo(usuario);
        assertNotNull(instance.getAmigos());
    }

    /**
     * Test of removeAmigo method, of class Usuario.
     */
    @Test
    public void testRemoveAmigo() {
        System.out.println("removeAmigo");
        Usuario amigo = new Usuario();
        instance.addAmigo(amigo);
        instance.removeAmigo(amigo);
        assertFalse("test verify null object",instance.getAmigos().contains(amigo));
    }

    /**
     * Test of getIdade method, of class Usuario.
     */
    @Test
    public void testGetIdade() {
        System.out.println("getIdade");
        int expResult = 0;
        int result = instance.getIdade();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdade method, of class Usuario.
     */
    @Test
    public void testSetIdade() {
        System.out.println("setIdade");
        int idade = 1;
        instance.setIdade(idade);
        assertEquals(idade, instance.getIdade());
    }

    /**
     * Test of getEmail method, of class Usuario.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        String expResult = null;
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class Usuario.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = null;
        instance.setEmail(email);
    }
    
}
