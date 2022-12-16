
public class Evidencia04Testeo {
 double redesrecom;
 double numSubredes;
   //Variables
    public int Ip[];
    public final int[] tipoIp = {126,191,223};
    public final String[] tipoIpSArray = {"tipo A","tipo B","tipo C"};
    //cambio ip privada/publica
    public final int[] ipPrivadaArray = {10,172,192};
    
    //Arrays de la Máscara de subred
    public int nuevoNumN;
    public int[] nuevaMs = new int[4];        
    public final int[] nuevaMsA = {255,0,0,0};
    public final int[] nuevaMsB = {255,255,0,0};
    private final int[] nuevaMsC = {255,255,255,0};
    
    public String tipoIpS;
    public int numSaltos;
    //cambio ip privada/publica
    public String ipPrivada;
    
public double NumSubredes(double Redesrq){
        double redesrecom = 0;
        for(int i=1;i<=23;i++){
            double Redesrec = Math.pow(2,i);
            if (Redesrec>=Redesrq){
                redesrecom=Redesrec;
                break;
            }
        } return redesrecom;
        };



public double numN (double numSubredes){
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

public String cumpleCondicion (double NumSubredes, double redesrecom){
        String cumple;
        if(NumSubredes>=redesrecom){
            cumple = "Si cumple";
        }else{
            cumple = "No cumple";
        }
        return cumple;
    };


    public String tipoIpS(int []Ip){
        String tipoIpStr = "";
        for(int i=0; i<tipoIp.length;i++){
            if(Ip[0]<=tipoIp[i]){
                tipoIpStr=tipoIpSArray[i];
                //cambio ip privada/publica
                if(Ip[0]==ipPrivadaArray[0]||Ip[0]==ipPrivadaArray[1]||Ip[0]==ipPrivadaArray[2]){
                        this.ipPrivada="Privada";
                    }else{
                        this.ipPrivada="Pública";
                    }
                break;
            } 
        }
        return tipoIpStr;
    }; 
    
        public int cambioByteMs (int nuevoNumN){
        int restaN = 8-nuevoNumN;
        int ultByteMs = 0;
        
        for (int i=7; i>=restaN;i--){
            ultByteMs += Math.pow(2, i);
        }
        return ultByteMs;
    };
  
        public int ultByteMs(int []Ip, String tipoIpS ){
        int nSaltos = 0;
        switch(tipoIpS){
        case "tipo A":
            this.nuevaMs = nuevaMsA;
            nuevaMs[1]=192;
            nSaltos = 256 - nuevaMs[1];
        break;
        case "tipo B":
            this.nuevaMs = nuevaMsB;
            nuevaMs[2]=192;
            nSaltos = 256 - nuevaMs[2];
        break;
        case "tipo C":
            this.nuevaMs = nuevaMsC;
            nuevaMs[3]=192;
            nSaltos = 256 - nuevaMs[3];
        break;
        }
        return nSaltos;
    };
}
