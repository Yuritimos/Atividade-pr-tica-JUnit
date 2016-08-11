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
public class calculadoraTest {
    
    public calculadoraTest() {
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
     * Test of getDividir method, of class calculadora.
     */
    @Test
    public void testGetDividir() {
        System.out.println("getDividir");
        calculadora instance = new calculadora();
        double expResult = 1;
        double result = instance.getDividir();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getA method, of class calculadora.
     */
    @Test
    public void testGetA() {
        System.out.println("getA");
        calculadora instance = new calculadora();
        int expResult = 1;
        int result = instance.getA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setA method, of class calculadora.
     */
    @Test
    public void testSetA() {
        System.out.println("setA");
        int a = 1;
        calculadora instance = new calculadora();
        instance.setA(a);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getB method, of class calculadora.
     */
    @Test
    public void testGetB() {
        System.out.println("getB");
        calculadora instance = new calculadora();
        int expResult = 1;
        int result = instance.getB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setB method, of class calculadora.
     */
    @Test
    public void testSetB() {
        System.out.println("setB");
        int b = 1;
        calculadora instance = new calculadora();
        instance.setB(b);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
