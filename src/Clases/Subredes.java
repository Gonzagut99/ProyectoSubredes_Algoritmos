/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jaime
 */
public class Subredes {

    //Variables
    //int redesRequeridas = Integer.parseInt(nSubredesInput.getText());
    double redesR;
    //Calculo de nro. de subredes
    double numSubredes;
    int nuevoNumSubredes;
    double numN;
    int nuevoNumN;
    
    //constructor
    public Subredes(double _redesR) {
        this.redesR = _redesR;
        this.numSubredes=numSubredes();
        this.nuevoNumSubredes = (int)numSubredes;
        this.numN = numN();
        this.nuevoNumN = (int)numN;
    }

    
    //Metodos
    //Función para indicar el nro de subredes que se requerirá, 23 es el nro maximo de exponentes
    private double numSubredes (){
        double nSubredes=0;
        for (int n=1; n<=23; n++){
            double nroNr=Math.pow(2,n);
            if(nroNr>=redesR){
               nSubredes = nroNr;
               break;
            }
        }
        return nSubredes;
    };
    //Función para indicar cuál es el nro N (nro de bits prestados)
    private double numN (){
        double nroN = 0;
        for (double i = 1; i<=23; i++){
            double raizN = 1/i;
            if (Math.pow(numSubredes, raizN)==2){
                nroN=i;
                break;
            }
        }
        return nroN;
    };
    //Función para comprobar si se cumple la condición del nro N
    public String cumpleCondicion (){
        String cumple;
        if(numSubredes>=redesR){
            cumple = "Si cumple";
        }else{
            cumple = "No cumple";
        }
        return cumple;
    };

    public double getNumSubredes() {
        return numSubredes;
    }

    public int getNuevoNumSubredes() {
        return nuevoNumSubredes;
    }

    public double getNumN() {
        return numN;
    }

    public int getNuevoNumN() {
        return nuevoNumN;
    }
    

}
