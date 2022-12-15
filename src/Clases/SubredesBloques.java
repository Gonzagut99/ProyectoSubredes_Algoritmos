/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

public class SubredesBloques extends InfoSubredes{
    private String operationSuccess;
    private String primerBloque;
    private ArrayList <String> restoBloque;

    public SubredesBloques(int[] Ip, int[] nuevaMs, int numSaltos, int nuevoNumSubredes, String tipoIpS) {
        super(Ip, nuevaMs, numSaltos, nuevoNumSubredes, tipoIpS);
        //Inicializamos el arraylist
        this.restoBloque=new ArrayList<String>();
        //Invocamos a la funcion 'searchOperation()'
        this.operationSuccess = searchOperation();
    }
    //Detectar que operación se va a realizar
    private String searchOperation(){
        String operationSuccess = "\nOperación exitosa!";
        switch(tipoIpS){
            case "tipo A":
                subredesLoopA ();
            break;
            case "tipo B":
                subredesLoopB ();
            break;
            case "tipo C":
                subredesLoopC ();
            break;
            }
        return operationSuccess;
    }
    
    private void subredesLoopA (){
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
        
        this.primerBloque = "\nEl número de subredes es: "+nuevoNumSubredes+"\n"
                + "\nSubred 1: \n"
                + "La id de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+firstSIp+"."+idIp+"\n"
                + "La primera IP de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+firstSIp+"."+firstIp+"\n"
                + "La ultima IP de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+lastSIp+"."+lastIp+"\n"
                + "El broadcast de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+lastSIp+"."+ipBroadcast+"\n";
                
        
        for(int i=2; i<=(nuevoNumSubredes); i++){
            String restoBloqueStr = "\nSubred " + i + ": \n"
                    + "La id de la Subred " + i + " es: "+Ip[0]+"."+(arraySubred[0]+=numSaltos)+"."+arraySubred[2]+"."+arraySubred[2]+"\n"
                    + "La primera IP de la Subred " + i + " es: "+Ip[0]+"."+(arraySubred[0])+"."+arraySubred[2]+"."+arraySubred[3]+"\n"
                    + "La ultima IP de la Subred " + i+ " es: "+Ip[0]+"."+(arraySubred[1]+=numSaltos)+"."+arraySubred[4]+"."+arraySubred[4]+"\n"
                    + "El broadcast de la Subred " + i + " es: "+Ip[0]+"."+(arraySubred[1])+"."+arraySubred[5]+"."+arraySubred[5]+"\n";
            
            //Se añaden o pushean todos los bloques al arraylist
            restoBloque.add(restoBloqueStr);
        }
        
    }
    private void subredesLoopB (){
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
        
        this.primerBloque = "\nEl número de subredes es: "+nuevoNumSubredes+"\n"
                + "\nSubred 1: \n"
                + "La id de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+firstSIp+"."+idIp+"\n"
                + "La primera IP de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+firstSIp+"."+firstIp+"\n"
                + "La ultima IP de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+lastSIp+"."+lastIp+"\n"
                + "El broadcast de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+lastSIp+"."+ipBroadcast+"\n";

        
        for(int i=2; i<=(nuevoNumSubredes); i++){
            String restoBloqueStr = "\nSubred " + i + ": \n"
                    + "La id de la Subred " + i + " es: "+Ip[0]+"."+Ip[1]+"."+(arraySubred[0]+=numSaltos)+"."+arraySubred[2]+"\n"
                    + "La primera IP de la Subred " + i + " es: "+Ip[0]+"."+Ip[1]+"."+(arraySubred[0])+"."+arraySubred[3]+"\n"
                    + "La ultima IP de la Subred " + i+ " es: "+Ip[0]+"."+Ip[1]+"."+(arraySubred[1]+=numSaltos)+"."+arraySubred[4]+"\n"
                    + "El broadcast de la Subred " + i + " es: "+Ip[0]+"."+Ip[1]+"."+(arraySubred[1])+"."+arraySubred[5]+"\n";
            
            restoBloque.add(restoBloqueStr);

        }
        
    }
    private void subredesLoopC (){
        int idIp = 0;
        int firstIp = 1;
        int lastIp = numSaltos-2;
        int ipBroadcast = numSaltos-1;
        
        int arraySubred[] = new int[4];
        arraySubred[0]= idIp;
        arraySubred[1]= firstIp;
        arraySubred[2]= lastIp;
        arraySubred[3]= ipBroadcast;
        
        this.primerBloque = "\nEl número de subredes es: "+nuevoNumSubredes+"\n"
                + "\nSubred 1: \n"
                + "La id de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+idIp+"\n"
                + "La primera IP de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+firstIp+"\n"
                + "La ultima IP de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+lastIp+"\n"
                + "El broadcast de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+ipBroadcast+"\n";

        
        for(int i=2; i<=(nuevoNumSubredes); i++){
            String restoBloqueStr = "\nSubred " + i + ": \n"
                    + "La id de la Subred " + i + " es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+(arraySubred[0]+=numSaltos)+"\n"
                    + "La primera IP de la Subred " + i + " es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+(arraySubred[1]+=numSaltos)+"\n"
                    + "La ultima IP de la Subred " + i+ " es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+(arraySubred[2]+=numSaltos)+"\n"
                    + "El broadcast de la Subred " + i + " es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+(arraySubred[3]+=numSaltos)+"\n";
            
            restoBloque.add(restoBloqueStr);

        }
        
    }

    public String getOperationSuccess() {
        return operationSuccess;
    }

    public String getPrimerBloque() {
        return primerBloque;
    }

    public ArrayList<String> getRestoBloque() {
        return restoBloque;
    }

}
