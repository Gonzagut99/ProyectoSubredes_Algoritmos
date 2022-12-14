/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Evidencia2;

/**
 *
 * @author jaime
 */
public class FormSubredes extends javax.swing.JFrame {

    /**
     * Creates new form FormSubredes
     */
    
    public FormSubredes() {
        initComponents();
    }
    //Función para indicar el nro de subredes que se requerirá
    public static double nroSubredes (double redesR){
        double nroS = 0;
        for (int n=1; n<=23; n++){
            double nroNr=Math.pow(2,n);
            if(nroNr>=redesR){
               nroS = nroNr;
               break;
            }
        }
        return nroS;
    };
    //Función para indicar cuál es el nro N (nro de bits prestados)
    public static double nroN (double nSubredes){
        double nroN = 0;
        for (double i = 1; i<=23; i++){
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
    
    //Calculo del byte cambiado de la nueva Máscara de subred, nro de saltos
    public static int cambioByteMs (int nuevoNumN){
        int restaN = 8-nuevoNumN;
        int ultByteMs = 0;
        
        for (int i=7; i>=restaN;i--){
            ultByteMs += Math.pow(2, i);
        }
        return ultByteMs;
    }
        
    
    //Funcion para hallar señalar las caracteristicas de nuestras subredes
    /*public void subredesLoop (int Ip[], int nuevaMs[], int numSaltos, int nuevoNumSubredes){
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
    public void subredesLoopA (int Ip[], int nuevaMs[], int numSaltos, int nuevoNumSubredes){
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
    public void subredesLoopB (int Ip[], int nuevaMs[], int numSaltos, int nuevoNumSubredes){
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
    public void subredesLoopC (int Ip[], int nuevaMs[], int numSaltos, int nuevoNumSubredes){
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
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nSubredesInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        n2IP = new javax.swing.JTextField();
        n3IP = new javax.swing.JTextField();
        n1IP = new javax.swing.JTextField();
        n4IP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaRpta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel1.setText("Calculadora de subredes");

        jLabel2.setText("Ingrese el número de subredes que requiera:");

        jLabel3.setText("Ingrese un numero de IP:");

        jLabel4.setText(".");

        jLabel5.setText(".");

        jLabel6.setText(".");

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        areaRpta.setColumns(20);
        areaRpta.setRows(5);
        jScrollPane1.setViewportView(areaRpta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(nSubredesInput, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(n1IP, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n2IP, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n3IP, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n4IP, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jButton1)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nSubredesInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(n2IP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n3IP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n4IP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n1IP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int redesRequeridas = Integer.parseInt(nSubredesInput.getText());
        double redesR= (double)redesRequeridas;
        //Calculo de nro. de subredes
        double numSubredes = nroSubredes(redesR);
        int nuevoNumSubredes = (int)numSubredes;
        double numN = nroN(numSubredes);
        int nuevoNumN = (int)numN;
        String cumpleC=cumpleCondicion(redesRequeridas,numSubredes);
        
        //Calculo de la nueva máscara de subred
        int[] Ip = {Integer.parseInt(n1IP.getText()),
                    Integer.parseInt(n2IP.getText()),
                    Integer.parseInt(n3IP.getText()),
                    Integer.parseInt(n4IP.getText())
        };
        
        //Detectar el tipo de ip
        int[] tipoIp = {126,191,223};
        String[] tipoIpSArray = {"tipo A","tipo B","tipo C"};
        String tipoIpS = "";
        for(int i=0; i<tipoIp.length;i++){
            if(Ip[0]<=tipoIp[i]){
                tipoIpS=tipoIpSArray[i];
                break;
            }
        }        
        
        //Array de la Máscara de subred
        int[] nuevaMs = new int[4];        
        int[] nuevaMsA = {255,0,0,0};
        int[] nuevaMsB = {255,255,0,0};
        int[] nuevaMsC = {255,255,255,0};
        
        int numSaltos = 0;
        //Asignar nueva Mascara de subred segun el tipo de ip
        //Calculo del ultimo byte de la nueva Máscara de subred, nro de saltos
        switch(tipoIpS){
            case "tipo A":
                nuevaMs = nuevaMsA;
                nuevaMs[1]=cambioByteMs(nuevoNumN);
                numSaltos = 256 - nuevaMs[1];
            break;
            case "tipo B":
                nuevaMs = nuevaMsB;
                nuevaMs[2]=cambioByteMs(nuevoNumN);
                numSaltos = 256 - nuevaMs[2];
            break;
            case "tipo C":
                nuevaMs = nuevaMsC;
                nuevaMs[3]=cambioByteMs(nuevoNumN);
                numSaltos = 256 - nuevaMs[3];
            break;
        }      
        

        //Imprimir primera solución
        areaRpta.append("Usted requiere " + redesRequeridas + " redes.\n");
        areaRpta.append("El número de subredes que le recomendamos es de: " + numSubredes + ", \n");
        areaRpta.append("porque " + cumpleC + " la condición de que el número de subredes sea mayor o igual al nro de redes requeridas. \n");
        areaRpta.append("El nro bits prestados (N) es de: " + nuevoNumN+"\n\n");
        //Imprimir la Ip y nueva MS
        areaRpta.append("La Ip que escogió es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+Ip[3]+"\n");
        areaRpta.append("El tipo de Ip es: " + tipoIpS + "\n");
        areaRpta.append("La nueva Máscara de Subred es: "+nuevaMs[0]+"."+nuevaMs[1]+"."+nuevaMs[2]+"."+nuevaMs[3]+"\n");
        areaRpta.append("El nro de saltos es de: "+numSaltos+"\n");
        
        switch(tipoIpS){
            case "tipo A":
                subredesLoopA (Ip, nuevaMs, numSaltos, nuevoNumSubredes);
            break;
            case "tipo B":
                subredesLoopB (Ip, nuevaMs, numSaltos, nuevoNumSubredes);
            break;
            case "tipo C":
                subredesLoopC (Ip, nuevaMs, numSaltos, nuevoNumSubredes);
            break;
        }
        
        //subredesLoop (Ip, nuevaMs, numSaltos, nuevoNumSubredes);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormSubredes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSubredes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSubredes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSubredes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSubredes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaRpta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField n1IP;
    private javax.swing.JTextField n2IP;
    private javax.swing.JTextField n3IP;
    private javax.swing.JTextField n4IP;
    private javax.swing.JTextField nSubredesInput;
    // End of variables declaration//GEN-END:variables
}
