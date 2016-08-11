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
public class servidorWebTest {
    
    public servidorWebTest() {
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
     * Test of getIp method, of class servidorWeb.
     */
    @Test
    public void testGetIp() {
        System.out.println("getIp");
        servidorWeb instance = new servidorWeb();
        int expResult = 0;
        int result = instance.getIp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setIp method, of class servidorWeb.
     */
    @Test
    public void testSetIp() {
        System.out.println("setIp");
        int ip = 0;
        servidorWeb instance = new servidorWeb();
        instance.setIp(ip);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPorta method, of class servidorWeb.
     */
    @Test
    public void testGetPorta() {
        System.out.println("getPorta");
        servidorWeb instance = new servidorWeb();
        String expResult = null;
        String result = instance.getPorta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPorta method, of class servidorWeb.
     */
    @Test
    public void testSetPorta() {
        System.out.println("setPorta");
        String porta = "";
        servidorWeb instance = new servidorWeb();
        instance.setPorta(porta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isAtivadar method, of class servidorWeb.
     */
    @Test
    public void testIsAtivadar() {
        System.out.println("isAtivadar");
        servidorWeb instance = new servidorWeb();
        boolean expResult = false;
        boolean result = instance.isAtivadar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAtivadar method, of class servidorWeb.
     */
    @Test
    public void testSetAtivadar() {
        System.out.println("setAtivadar");
        boolean ativadar = false;
        servidorWeb instance = new servidorWeb();
        instance.setAtivadar(ativadar);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
