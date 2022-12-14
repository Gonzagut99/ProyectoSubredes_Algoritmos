/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class Evidencia03TesteoTest {
    
    public Evidencia03TesteoTest() {
    }

/**
     * Test of NumSubredes method, of class Evidencia3Testeo.
     */
    @Test
    public void testNumSubredes() {
        System.out.println("NumSubredes");
        double Redesrq = 3;
        Evidencia03Testeo instance = new Evidencia03Testeo();
        double expResult = 4;
        double result = instance.NumSubredes(Redesrq);
        assertTrue(expResult==result);
    }

    /**
     * Test of numN method, of class Evidencia3Testeo.
     */
    @Test
    public void testNumN() {
        System.out.println("numN");
        double numSubredes = 2;
        Evidencia03Testeo instance = new Evidencia03Testeo();
        double expResult = 1;
        double result = instance.numN(numSubredes);
        assertTrue(expResult==result);
    }

    /**
     * Test of cumpleCondicion method, of class Evidencia3Testeo.
     */
    @Test
    public void testCumpleCondicion() {
        System.out.println("cumpleCondicion");
        double NumSubredes = 16;
        double redesrecom = 14;
        Evidencia03Testeo instance = new Evidencia03Testeo();
        String expResult = "Si cumple";
        String result = instance.cumpleCondicion(NumSubredes, redesrecom);
        assertTrue(expResult==result);
    }
    
    
}
