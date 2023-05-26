/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.enprueba1buena;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author skril
 */
public class ENPrueba1BUENATest {
    
    public ENPrueba1BUENATest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calcularResultado method, of class ENPrueba1BUENA.
     */

    @Test
    public void testCalcularResultadoififMAS() {
        System.out.println("testCalcularResultadoififMAS");
        int a = 5;
        int b = 5;
        String operador = "+";
        ENPrueba1BUENA instance = new ENPrueba1BUENA();
        int expResult = 10;
        int result = instance.calcularResultado(a, b, operador);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testCalcularResultadoifelseifMAS() {
        System.out.println("testCalcularResultadoififMAS");
        int a = -5;
        int b = -5;
        String operador = "+";
        ENPrueba1BUENA instance = new ENPrueba1BUENA();
        int expResult = 0;
        int result = instance.calcularResultado(a, b, operador);
        assertEquals(expResult, result);
       
    }
 
     @Test
     public void testCalcularResultadoelseifIFMENOS() {
        System.out.println("testCalcularResultadoelseifIFMENOS");
        int a = 5;
        int b = 2;
        String operador = "-";
        ENPrueba1BUENA instance = new ENPrueba1BUENA();
        int expResult = 3;
        int result = instance.calcularResultado(a, b, operador);
        assertEquals(expResult, result);
       
    }
     @Test
     public void testCalcularResultadoelseifELSEIFMENOS() {
        System.out.println("testCalcularResultadoelseifELSEIFMENOS");
        int a = 2;
        int b = 5;
        String operador = "-";
        ENPrueba1BUENA instance = new ENPrueba1BUENA();
        int expResult = 3;
        int result = instance.calcularResultado(a, b, operador);
        assertEquals(expResult, result);
       
    }
      @Test
     public void testCalcularResultadoelseifELSEMENOS() {
        System.out.println("testCalcularResultadoelseifELSEMENOS");
        int a = 2;
        int b = 2;
        String operador = "-";
        ENPrueba1BUENA instance = new ENPrueba1BUENA();
        int expResult = 0;
        int result = instance.calcularResultado(a, b, operador);
        assertEquals(expResult, result);
       
    }
         @Test
     public void testCalcularResultadoelseifIFMULTIPLICACION() {
        System.out.println("testCalcularResultadoelseifIFMULTIPLICACION");
        int a = 0;
        int b = 2;
        String operador = "*";
        ENPrueba1BUENA instance = new ENPrueba1BUENA();
        int expResult = 0;
        int result = instance.calcularResultado(a, b, operador);
        assertEquals(expResult, result);
       
    }
        @Test
     public void testCalcularResultadoelseifELSEMULTIPLICACION() {
        System.out.println("testCalcularResultadoelseifELSEMULTIPLICACION");
        int a = 2;
        int b = 2;
        String operador = "*";
        ENPrueba1BUENA instance = new ENPrueba1BUENA();
        int expResult = 4;
        int result = instance.calcularResultado(a, b, operador);
        assertEquals(expResult, result);
       
    }
     @Test
     public void testCalcularResultadoelseifIFDIVISION() {
        System.out.println("testCalcularResultadoelseifIFDIVISION");
        int a = 2;
        int b = 1;
        String operador = "/";
        ENPrueba1BUENA instance = new ENPrueba1BUENA();
        int expResult = 2;
        int result = instance.calcularResultado(a, b, operador);
        assertEquals(expResult, result);
       
    }
     @Test
     public void testCalcularResultadoelseifELSEDIVISION() {
        System.out.println("testCalcularResultadoelseifELSEDIVISION");
        int a = 2;
        int b = 0;
        String operador = "/";
        ENPrueba1BUENA instance = new ENPrueba1BUENA();
        int expResult = 0;
        int result = instance.calcularResultado(a, b, operador);
        assertEquals(expResult, result);
       
    }
     @Test
     public void testCalcularResultadoFUERA() {
        System.out.println("testCalcularResultadoFUERA");
        int a = 2;
        int b = 1;
        String operador = "A";
        ENPrueba1BUENA instance = new ENPrueba1BUENA();
        int expResult = 0;
        int result = instance.calcularResultado(a, b, operador);
        assertEquals(expResult, result);
       
    }
}
