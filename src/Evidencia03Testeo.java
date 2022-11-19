
public class Evidencia03Testeo {
        double redesrecom;
    
    double numSubredes;
    
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
}
