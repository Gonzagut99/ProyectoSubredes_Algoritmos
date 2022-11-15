/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Evidencia2;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author jaime
 */
public class FormSubredesTest {
    
    public FormSubredes formSubredes;
    
    @Before 
    public void setup(){
        formSubredes = new FormSubredes();
    }
    
    public FormSubredesTest() {
    }

    /**
     * Test of nroSubredes method, of class FormSubredes.
     */
    @Test
    public void testNroSubredes() {
        System.out.println("nroSubredes");
        double numSubredes = FormSubredes.nroSubredes(40);
        assertNotNull(numSubredes);
        assertEquals(64, numSubredes,0.0001);
    }

    /**
     * Test of nroN method, of class FormSubredes.
     */
    @Test
    public void testNroN() {
        System.out.println("nroN");
        double numN=FormSubredes.nroN(64);
        assertEquals(6,numN,0.0001);
    }

    /**
     * Test of cumpleCondicion method, of class FormSubredes.
     */
    @Test
    public void testCumpleCondicion() {
        System.out.println("cumpleCondicion");
        String cumple ="Si cumple";
        String cumpleC = FormSubredes.cumpleCondicion(40, 64);
        assertEquals(cumple,cumpleC);       
    }

    /**
     * Test of cambioByteMs method, of class FormSubredes.
     */
    @Test
    public void testCambioByteMs() {
        System.out.println("cambioByteMs");
        int nuevaMs = FormSubredes.cambioByteMs(6);
        assertEquals(252,nuevaMs,0.0001);        
    }

    
}
