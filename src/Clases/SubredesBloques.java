/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jaime
 */
public class SubredesBloques {
    /*int Ip[],nuevaMs[];
    int numSaltos, nuevoNumSubredes;

    public SubredesBloques(int[] _Ip, int[] _nuevaMs, int _numSaltos, int _nuevoNumSubredes) {
        this.Ip = _Ip;
        this.nuevaMs = _nuevaMs;
        this.numSaltos = _numSaltos;
        this.nuevoNumSubredes = _nuevoNumSubredes;
    }
    
    
    public void subredesLoopA (){
        int firstSIp = 0;
        int lastSIp = numSaltos-1;
        int idIp = 0;
        int firstIp = 1;
        int lastIp = 254;
        int ipBroadcast = 255;

        
        int arraySubred[] = new int[6];
        arraySubred[0]= firstSIp;
        arraySubred[1]= lastSIp;
        arraySubred[2]= idIp;
        arraySubred[3]= firstIp;
        arraySubred[4]= lastIp;
        arraySubred[5]= ipBroadcast;
        
        Ip[1]=0;
        
        
        areaRpta.append("\nEl número de subredes es: "+nuevoNumSubredes+"\n");
        areaRpta.append("\nSubred 1: \n");
        areaRpta.append("La id de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+firstSIp+"."+idIp+"\n");
        areaRpta.append("La primera IP de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+firstSIp+"."+firstIp+"\n");
        areaRpta.append("La ultima IP de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+lastSIp+"."+lastIp+"\n");
        areaRpta.append("El broadcast de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+lastSIp+"."+ipBroadcast+"\n");
        
        for(int i=2; i<=(nuevoNumSubredes); i++){
            areaRpta.append("\nSubred " + i + ": \n");
            areaRpta.append("La id de la Subred " + i + " es: "+Ip[0]+"."+(arraySubred[0]+=numSaltos)+"."+arraySubred[2]+"."+arraySubred[2]+"\n");
            areaRpta.append("La primera IP de la Subred " + i + " es: "+Ip[0]+"."+(arraySubred[0])+"."+arraySubred[2]+"."+arraySubred[3]+"\n");
            areaRpta.append("La ultima IP de la Subred " + i+ " es: "+Ip[0]+"."+(arraySubred[1]+=numSaltos)+"."+arraySubred[4]+"."+arraySubred[4]+"\n");
            areaRpta.append("El broadcast de la Subred " + i + " es: "+Ip[0]+"."+(arraySubred[1])+"."+arraySubred[5]+"."+arraySubred[5]+"\n");
        }
        
    }
    public void subredesLoopB (){
        int firstSIp = 0;
        int lastSIp = numSaltos-1;
        int idIp = 0;
        int firstIp = 1;
        int lastIp = 254;
        int ipBroadcast = 255;

        
        int arraySubred[] = new int[6];
        arraySubred[0]= firstSIp;
        arraySubred[1]= lastSIp;
        arraySubred[2]= idIp;
        arraySubred[3]= firstIp;
        arraySubred[4]= lastIp;
        arraySubred[5]= ipBroadcast;
        
        
        areaRpta.append("\nEl número de subredes es: "+nuevoNumSubredes+"\n");
        areaRpta.append("\nSubred 1: \n");
        areaRpta.append("La id de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+firstSIp+"."+idIp+"\n");
        areaRpta.append("La primera IP de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+firstSIp+"."+firstIp+"\n");
        areaRpta.append("La ultima IP de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+lastSIp+"."+lastIp+"\n");
        areaRpta.append("El broadcast de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+lastSIp+"."+ipBroadcast+"\n");
        
        for(int i=2; i<=(nuevoNumSubredes); i++){
            areaRpta.append("\nSubred " + i + ": \n");
            areaRpta.append("La id de la Subred " + i + " es: "+Ip[0]+"."+Ip[1]+"."+(arraySubred[0]+=numSaltos)+"."+arraySubred[2]+"\n");
            areaRpta.append("La primera IP de la Subred " + i + " es: "+Ip[0]+"."+Ip[1]+"."+(arraySubred[0])+"."+arraySubred[3]+"\n");
            areaRpta.append("La ultima IP de la Subred " + i+ " es: "+Ip[0]+"."+Ip[1]+"."+(arraySubred[1]+=numSaltos)+"."+arraySubred[4]+"\n");
            areaRpta.append("El broadcast de la Subred " + i + " es: "+Ip[0]+"."+Ip[1]+"."+(arraySubred[1])+"."+arraySubred[5]+"\n");
        }
        
    }
    public void subredesLoopC (){
        int idIp = 0;
        int firstIp = 1;
        int lastIp = numSaltos-2;
        int ipBroadcast = numSaltos-1;
        
        int arraySubred[] = new int[4];
        arraySubred[0]= idIp;
        arraySubred[1]= firstIp;
        arraySubred[2]= lastIp;
        arraySubred[3]= ipBroadcast;
        
        areaRpta.append("\nEl número de subredes es: "+nuevoNumSubredes+"\n");
        areaRpta.append("\nSubred 1: \n");
        areaRpta.append("La id de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+idIp+"\n");
        areaRpta.append("La primera IP de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+firstIp+"\n");
        areaRpta.append("La ultima IP de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+lastIp+"\n");
        areaRpta.append("El broadcast de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+ipBroadcast+"\n");
        
        for(int i=2; i<=(nuevoNumSubredes); i++){
            areaRpta.append("\nSubred " + i + ": \n");
            areaRpta.append("La id de la Subred " + i + " es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+(arraySubred[0]+=numSaltos)+"\n");
            areaRpta.append("La primera IP de la Subred " + i + " es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+(arraySubred[1]+=numSaltos)+"\n");
            areaRpta.append("La ultima IP de la Subred " + i+ " es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+(arraySubred[2]+=numSaltos)+"\n");
            areaRpta.append("El broadcast de la Subred " + i + " es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+(arraySubred[3]+=numSaltos)+"\n");
        }
        
    }*/

}
