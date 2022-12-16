/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public abstract class InfoSubredes {
    protected int Ip[],nuevaMs[];
    protected int numSaltos, nuevoNumSubredes;
    protected String tipoIpS;

    public InfoSubredes(int[] Ip, int[] nuevaMs, int numSaltos, int nuevoNumSubredes, String tipoIpS) {
        this.Ip = Ip;
        this.nuevaMs = nuevaMs;
        this.numSaltos = numSaltos;
        this.nuevoNumSubredes = nuevoNumSubredes;
        this.tipoIpS = tipoIpS;
    }

    public int[] getIp() {
        return Ip;
    }

    public int[] getNuevaMs() {
        return nuevaMs;
    }

    public int getNumSaltos() {
        return numSaltos;
    }

    public int getNuevoNumSubredes() {
        return nuevoNumSubredes;
    }

    public String getTipoIpS() {
        return tipoIpS;
    }
    
}
