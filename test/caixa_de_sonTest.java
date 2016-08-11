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
public class caixa_de_sonTest {
    
    public caixa_de_sonTest() {
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
     * Test of isLigado method, of class caixa_de_son.
     */
    @Test
    public void testIsLigado() {
        System.out.println("isLigado");
        caixa_de_son instance = new caixa_de_son();
        boolean expResult = false;
        boolean result = instance.isLigado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setLigado method, of class caixa_de_son.
     */
    @Test
    public void testSetLigado() {
        System.out.println("setLigado");
        boolean ligado = false;
        caixa_de_son instance = new caixa_de_son();
        instance.setLigado(ligado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVolume method, of class caixa_de_son.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        caixa_de_son instance = new caixa_de_son();
        int expResult = 0;
        int result = instance.getVolume();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVolume method, of class caixa_de_son.
     */
    @Test
    public void testSetVolume() {
        System.out.println("setVolume");
        int volume = 0;
        caixa_de_son instance = new caixa_de_son();
        instance.setVolume(volume);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMarca method, of class caixa_de_son.
     */
    @Test
    public void testGetMarca() {
        System.out.println("getMarca");
        caixa_de_son instance = new caixa_de_son();
        String expResult = null;
        String result = instance.getMarca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMarca method, of class caixa_de_son.
     */
    @Test
    public void testSetMarca() {
        System.out.println("setMarca");
        String marca = null;
        caixa_de_son instance = new caixa_de_son();
        instance.setMarca(marca);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
