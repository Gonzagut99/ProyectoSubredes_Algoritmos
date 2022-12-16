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
public class Evidencia04TesteoTest {
    
    public Evidencia04TesteoTest() {
    }

    /**
     * Test of NumSubredes method, of class Evidencia04Testeo.
     */
    @Test
    public void testNumSubredes() {
        System.out.println("NumSubredes");
        double Redesrq = 3;
        Evidencia04Testeo instance = new Evidencia04Testeo();
        double expResult = 4;
        double result = instance.NumSubredes(Redesrq);
        assertTrue(expResult==result);
    }

  
    @Test
       public void testNumN() {
        System.out.println("numN");
        double numSubredes = 2;
        Evidencia04Testeo instance = new Evidencia04Testeo();
        double expResult = 1;
        double result = instance.numN(numSubredes);
        assertTrue(expResult==result);
    }

    
    @Test
      public void testCumpleCondicion() {
        System.out.println("cumpleCondicion");
        double NumSubredes = 16;
        double redesrecom = 14;
        Evidencia04Testeo instance = new Evidencia04Testeo();
        String expResult = "Si cumple";
        String result = instance.cumpleCondicion(NumSubredes, redesrecom);
        assertTrue(expResult==result);
    }

    /**
     * Test of tipoIpS method, of class Evidencia04Testeo.
     */
    @Test
    public void testTipoIpS() {
        System.out.println("tipoIpS");
        int[] Ip = {20,100,50,25};
        Evidencia04Testeo instance = new Evidencia04Testeo();
        String expResult = "tipo A";
        String result = instance.tipoIpS(Ip);
        assertTrue(expResult==result);
        
    }

    @Test
     public void testCambioByteMs() {
        System.out.println("cambioByteMs");
        int nuevoNumN = 2;
        Evidencia04Testeo instance = new Evidencia04Testeo();
        int expResult = 192;
        int result = instance.cambioByteMs(nuevoNumN);
        assertTrue(expResult==result);
        
    }

    @Test
     public void testUltByteMs() {
        System.out.println("ultByteMs");
        int[] Ip = {20,100,50,25};
        String tipoIpS = "tipo A";
        Evidencia04Testeo instance = new Evidencia04Testeo();
        int expResult = 64;
        int result = instance.ultByteMs(Ip, tipoIpS);
        assertTrue(expResult==result);
    }
    
}
