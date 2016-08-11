/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yuri
 */
public class clienteTest {
    
    public clienteTest() {
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
     * Test of getIp method, of class cliente.
     */
    @Test
    public void testGetIp() {
        System.out.println("getIp");
        cliente instance = new cliente();
        int expResult = 0;
        int result = instance.getIp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setIp method, of class cliente.
     */
    @Test
    public void testSetIp() {
        System.out.println("setIp");
        int ip = 0;
        cliente instance = new cliente();
        instance.setIp(ip);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getPorta method, of class cliente.
     */
    @Test
    public void testGetPorta() {
        System.out.println("getPorta");
        cliente instance = new cliente();
        int expResult = 0;
        int result = instance.getPorta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setPorta method, of class cliente.
     */
    @Test
    public void testSetPorta() {
        System.out.println("setPorta");
        int porta = 0;
        cliente instance = new cliente();
        instance.setPorta(porta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isConectado method, of class cliente.
     */
    @Test
    public void testIsConectado() {
        System.out.println("isConectado");
        cliente instance = new cliente();
        boolean expResult = false;
        boolean result = instance.isConectado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setConectado method, of class cliente.
     */
    @Test
    public void testSetConectado() {
        System.out.println("setConectado");
        boolean conectado = false;
        cliente instance = new cliente();
        instance.setConectado(conectado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
