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
public class EnderecoTest {
    
    private Endereco instance = null;
    
    public EnderecoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Endereco();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of getIdEndereco method, of class Endereco.
     */
    @Test
    public void testGetIdEndereco() {
        System.out.println("getIdEndereco <<<<<");
        Endereco instance = new Endereco();
        Long expResult = null;
        Long result = instance.getIdEndereco();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdEndereco method, of class Endereco.
     */
    @Test
    public void testSetIdEndereco() {
        System.out.println("setIdEndereco");
        Long idEndereco = null;
        instance.setIdEndereco(idEndereco);
        assertEquals(idEndereco,instance.getIdEndereco() );
    }

    /**
     * Test of getRua method, of class Endereco.
     */
    @Test
    public void testGetRua() {
        System.out.println("getRua");
        String expResult = null;
        String result = instance.getRua();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRua method, of class Endereco.
     */
    @Test
    public void testSetRua() {
        System.out.println("setRua");
        String rua = "";
        instance.setRua(rua);
    }

    /**
     * Test of getNumero method, of class Endereco.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Short expResult = null;
        Short result = instance.getNumero();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumero method, of class Endereco.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        Short numero = null;
        instance.setNumero(numero);
        assertEquals(null, instance.getNumero());
    }

    /**
     * Test of getBairro method, of class Endereco.
     */
    @Test
    public void testGetBairro() {
        System.out.println("getBairro");
        String expResult = null;
        assertEquals(expResult, instance.getBairro());
    }

    /**
     * Test of setBairro method, of class Endereco.
     */
    @Test
    public void testSetBairro() {
        System.out.println("setBairro");
        String bairro = "";
        instance.setBairro(bairro);
        assertEquals(bairro, instance.getBairro());
    }

    /**
     * Test of getContato method, of class Endereco.
     */
    @Test
    public void testGetContato() {
        System.out.println("getContato");
        String expResult = null;
        String result = instance.getContato();
        assertEquals(expResult, result);
    }

    /**
     * Test of setContato method, of class Endereco.
     */
    @Test
    public void testSetContato() {
        System.out.println("setContato");
        String contato = "";
        instance.setContato(contato);
        assertEquals(contato, instance.getContato());
    }

    /**
     * Test of getCidade method, of class Endereco.
     */
    @Test
    public void testGetCidade() {
        System.out.println("getCidade");
        String expResult = null;
        String result = instance.getCidade();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCidade method, of class Endereco.
     */
    @Test
    public void testSetCidade() {
        System.out.println("setCidade");
        String cidade = null;
        instance.setCidade(cidade);
        assertEquals(cidade, instance.getCidade());
    }
    
}
