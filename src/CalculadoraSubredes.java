
import java.util.Scanner;

public class CalculadoraSubredes {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declarando variables
        Scanner entradaT = new Scanner (System.in);
        System.out.println("Solo trabajamos con IPs clase C");
        System.out.println("Ingrese el número de subredes que requiera que sea menor o igual a 4:");
        double redesRequeridas = entradaT.nextDouble();
        //Calculo de nro. de subredes
        double numSubredes = nroSubredes(redesRequeridas);
        int nuevoNumSubredes = (int)numSubredes;
        double numN = nroN(numSubredes);
        int nuevoNumN = (int)numN;
        String cumpleC=cumpleCondicion(redesRequeridas,numSubredes);
        
        //Calculo de la nueva máscara de subred
        int[] Ip = new int[4];
        //Array de la Máscara de subred
        int[] nuevaMs = new int[4];
        nuevaMs[0] = 255;
        nuevaMs[1] = 255;
        nuevaMs[2] = 255;
        nuevaMs[3] = 0;
        //Array del orden del numero de Ip
        String[] nOrdenIp = new String [4];
        nOrdenIp[0]= "1er";
        nOrdenIp[1]= "2do";
        nOrdenIp[2]= "3ero";
        nOrdenIp[3]= "4to";
        //Pidiendo la IP
        for (int i=0; i<nOrdenIp.length; i++){
            System.out.println("Ingrese el "+nOrdenIp[i] +" byte de su IP clase C: ");
            Ip[i] = entradaT.nextInt();
        }
        //Calculo del ultimo byte de la nueva Máscara de subred, nro de saltos
        int restaN = 8-nuevoNumN;
        int ultByteMs = 0;
        int numSaltos = 0;
        for (int i=7; i>=restaN;i--){
            ultByteMs += Math.pow(2, i);
        }
        nuevaMs[3]=ultByteMs;
        numSaltos = 256 - nuevaMs[3];
        
        
        
        //Imprimir primera solución
        System.out.println("Usted requiere " + redesRequeridas + " redes");
        System.out.println("El número de subredes que le recomendamos es de: " + numSubredes + ", ");
        System.out.println("porque " + cumpleC + " la condición de que el número de subredes sea mayor o igual al nro de redes requeridas");
        System.out.println("El nro N es de: " + nuevoNumN);
        //Imprimir la Ip y nueva MS
        System.out.println("La Ip que escogió es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+Ip[3]);
        System.out.println("La nueva Máscara de Subred es: "+nuevaMs[0]+"."+nuevaMs[1]+"."+nuevaMs[2]+"."+nuevaMs[3]);
        System.out.println("El nro de saltos es de: "+numSaltos);
        
        System.out.println("¿Desea ver las características de sus nuevas subredes? (Si/No)");
        String valorPregunta = entradaT.next();
        if ("Si".equals(valorPregunta)||"si".equals(valorPregunta)||"SI".equals(valorPregunta)){
            subredesLoop (Ip, nuevaMs, numSaltos, nuevoNumSubredes);
        }else{
            System.out.println("El programa terminó");
            }
    }
    //Función para indicar el nro de subredes que se requerirá
    public static double nroSubredes (double redesR){
        double nroS = 0;
        for (int n=1; n<=20; n++){
            double nroNr=Math.pow(2,n);
            if(nroNr>=redesR){
               nroS = nroNr;
               break;
            }
        }
        return nroS;
    };
    //Función para indicar cuál es el nro N
    public static double nroN (double nSubredes){
        double nroN = 0;
        for (double i = 1; i<=20; i++){
            double raizN = 1/i;
            if (Math.pow(nSubredes, raizN)==2){
                nroN=i;
                break;
            }
        }
        return nroN;
    };
    //Función para comprobar si se cumple la condición del nro N
    public static String cumpleCondicion (double redesR, double numSubredes){
        String cumple;
        if(numSubredes>=redesR){
            cumple = "Si cumple";
        }else{
            cumple = "No cumple";
        }
        return cumple;
    };
    //Funcion para hallar señalar las caracteristicas de nuestras subredes
    public static void subredesLoop (int Ip[], int nuevaMs[], int numSaltos, int nuevoNumSubredes){
        int idIp = 0;
        int firstIp = 1;
        int lastIp = numSaltos-2;
        int ipBroadcast = numSaltos-1;
        
        int arraySubred[] = new int[4];
        arraySubred[0]= idIp;
        arraySubred[1]= firstIp;
        arraySubred[2]= lastIp;
        arraySubred[3]= ipBroadcast;
        
        System.out.println("Su número de subredes es: "+nuevoNumSubredes);
        System.out.println("Subred 1: ");
        System.out.println("La id de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+idIp);
        System.out.println("La primera IP de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+firstIp);
        System.out.println("La ultima IP de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+lastIp);
        System.out.println("El broadcast de la subred 1 es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+ipBroadcast);
        
        for(int i=2; i<=(nuevoNumSubredes); i++){
            System.out.println("Subred " + i + ": ");
            System.out.println("La id de la Subred " + i + " es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+(arraySubred[0]+=numSaltos));
            System.out.println("La primera IP de la Subred " + i + " es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+(arraySubred[1]+=numSaltos));
            System.out.println("La ultima IP de la Subred " + i+ " es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+(arraySubred[2]+=numSaltos));
            System.out.println("El broadcast de la Subred " + i + " es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+(arraySubred[3]+=numSaltos));
        }
        
    }
}
