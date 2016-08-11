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
public class computadorTest {
    
    public computadorTest() {
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
     * Test of getSerial method, of class computador.
     */
    @Test
    public void testGetSerial() {
        System.out.println("getSerial");
        computador instance = new computador();
        String expResult = null;
        String result = instance.getSerial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSerial method, of class computador.
     */
    @Test
    public void testSetSerial() {
        System.out.println("setSerial");
        String serial = "";
        computador instance = new computador();
        instance.setSerial(serial);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSistema_operacional method, of class computador.
     */
    @Test
    public void testGetSistema_operacional() {
        System.out.println("getSistema_operacional");
        computador instance = new computador();
        String expResult = null;
        String result = instance.getSistema_operacional();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSistema_operacional method, of class computador.
     */
    @Test
    public void testSetSistema_operacional() {
        System.out.println("setSistema_operacional");
        String Sistema_operacional = "";
        computador instance = new computador();
        instance.setSistema_operacional(Sistema_operacional);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProgramas_intalados method, of class computador.
     */
    @Test
    public void testGetProgramas_intalados() {
        System.out.println("getProgramas_intalados");
        computador instance = new computador();
        String expResult = null;
        String result = instance.getProgramas_intalados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProgramas_intalados method, of class computador.
     */
    @Test
    public void testSetProgramas_intalados() {
        System.out.println("setProgramas_intalados");
        String programas_intalados = "";
        computador instance = new computador();
        instance.setProgramas_intalados(programas_intalados);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGeração_do_processador method, of class computador.
     */
    @Test
    public void testGetGeração_do_processador() {
        System.out.println("getGera\u00e7\u00e3o_do_processador");
        computador instance = new computador();
        int expResult = 0;
        int result = instance.getGeração_do_processador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setGeração_do_processador method, of class computador.
     */
    @Test
    public void testSetGeração_do_processador() {
        System.out.println("setGera\u00e7\u00e3o_do_processador");
        int geração_do_processador = 0;
        computador instance = new computador();
        instance.setGeração_do_processador(geração_do_processador);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isLigado method, of class computador.
     */
    @Test
    public void testIsLigado() {
        System.out.println("isLigado");
        computador instance = new computador();
        boolean expResult = false;
        boolean result = instance.isLigado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLigado method, of class computador.
     */
    @Test
    public void testSetLigado() {
        System.out.println("setLigado");
        boolean ligado = false;
        computador instance = new computador();
        instance.setLigado(ligado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
