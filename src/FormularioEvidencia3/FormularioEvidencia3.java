/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FormularioEvidencia3;

import Clases.Ip_Ms;
import Clases.Subredes;

/**
 *
 * @author jaime
 */

public class FormularioEvidencia3 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    

    public FormularioEvidencia3() {
        initComponents();
    }
    
    public void subredesLoopA (int[] Ip, int []nuevaMs, int numSaltos, int nuevoNumSubredes){
        int firstSIp = 0;
        int lastSIp = numSaltos-1;
        int idIp = 0;
        int firstIp = 1;
        int lastIp = 254;
        int ipBroadcast = 255;
        int numHost =(numSaltos-2)*nuevoNumSubredes;

        
        int []arraySubred = new int[6];
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
        areaRpta.append("El numero de host permitidos son:"+ numHost);
        
        for(int i=2; i<=(nuevoNumSubredes); i++){
            areaRpta.append("\nSubred " + i + ": \n");
            areaRpta.append("La id de la Subred " + i + " es: "+Ip[0]+"."+(arraySubred[0]+=numSaltos)+"."+arraySubred[2]+"."+arraySubred[2]+"\n");
            areaRpta.append("La primera IP de la Subred " + i + " es: "+Ip[0]+"."+(arraySubred[0])+"."+arraySubred[2]+"."+arraySubred[3]+"\n");
            areaRpta.append("La ultima IP de la Subred " + i+ " es: "+Ip[0]+"."+(arraySubred[1]+=numSaltos)+"."+arraySubred[4]+"."+arraySubred[4]+"\n");
            areaRpta.append("El broadcast de la Subred " + i + " es: "+Ip[0]+"."+(arraySubred[1])+"."+arraySubred[5]+"."+arraySubred[5]+"\n");
        }
        
    }
    public void subredesLoopB (int []Ip, int []nuevaMs, int numSaltos, int nuevoNumSubredes){
        int firstSIp = 0;
        int lastSIp = numSaltos-1;
        int idIp = 0;
        int firstIp = 1;
        int lastIp = 254;
        int ipBroadcast = 255;
        int numHost =(numSaltos-2)*nuevoNumSubredes;

        
        int []arraySubred = new int[6];
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
        areaRpta.append("El numero de host permitidos son:"+ numHost);
        
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
        int numHost =(numSaltos-2)*nuevoNumSubredes;

        
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
        areaRpta.append("El numero de host permitidos son:"+ numHost);
        
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaRpta = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nSubredesInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        n1IP = new javax.swing.JTextField();
        n4IP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        n2IP = new javax.swing.JTextField();
        n3IP = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));

        areaRpta.setColumns(21);
        areaRpta.setRows(5);
        jScrollPane1.setViewportView(areaRpta);

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setText("Calculadora de Subredes");

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese el nro de subredes que requiera:");

        nSubredesInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nSubredesInputActionPerformed(evt);
            }
        });
        nSubredesInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nSubredesInputKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel3.setText("Ingrese un nro de Ip: ");

        n1IP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                n1IPKeyTyped(evt);
            }
        });

        n4IP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                n4IPKeyTyped(evt);
            }
        });

        jLabel4.setText(".");

        jLabel5.setText(".");

        jLabel6.setText(".");

        n2IP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                n2IPKeyTyped(evt);
            }
        });

        n3IP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                n3IPKeyTyped(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nSubredesInput, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                .addComponent(n4IP, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jButton2)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nSubredesInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(n2IP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(n3IP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(n4IP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(n1IP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void nSubredesInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nSubredesInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nSubredesInputActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Variables
        
        int redesRequeridas = Integer.parseInt(nSubredesInput.getText());
        double redesR= (double)redesRequeridas;
        //nro ip
        int[] Ip = {Integer.parseInt(n1IP.getText()),
                    Integer.parseInt(n2IP.getText()),
                    Integer.parseInt(n3IP.getText()),
                    Integer.parseInt(n4IP.getText())
        };
        //validaciones de max num de subredes y maximo nro de 1° byte de la ip
        if(redesRequeridas>256||Ip[0]>223){
            if(redesRequeridas>256){
                areaRpta.setText("Hola! \n");
                areaRpta.append("No puede haber más de 256 subredes. Inténtelo de nuevo.");
            }else if(Ip[0]>223){
                areaRpta.setText("Hola! \n");
                areaRpta.append("El número maximo que se acepta para la primera cifra de la ip es 223");
            }else if(redesRequeridas>256||Ip[0]>223)
                areaRpta.setText("Hola! \n");
                areaRpta.append("No puede haber más de 256 subredes. Inténtelo de nuevo, y");
                areaRpta.append("El número maximo que se acepta para la primera cifra de la ip es 223");
        } else{
            Subredes subredes = new Subredes(redesR);
            Ip_Ms ip_ms= new Ip_Ms(Ip, subredes.getNuevoNumN());

            double numSubredes = subredes.getNumSubredes();
            int nuevoNumSubredes = subredes.getNuevoNumSubredes();
            double numN=subredes.getNumN();
            int nuevoNumN=subredes.getNuevoNumN();
            String cumpleC=subredes.cumpleCondicion();
            String tipoIpS=ip_ms.getTipoIpS();
            int[] nuevaMs=ip_ms.getNuevaMs();
            int numSaltos=ip_ms.getNumSaltos();
            int numHost=ip_ms.getNumHost();


            //Calculo de la nueva máscara de subred

            //Imprimir primera solución
            areaRpta.setText("Hola! \n");
            areaRpta.append("Usted requiere " + redesRequeridas + " redes.\n");
            areaRpta.append("El número de subredes que le recomendamos es de: " + numSubredes + ", \n");
            areaRpta.append("porque " + cumpleC + " la condición de que el número de subredes sea mayor o igual al nro de redes requeridas. \n");
            areaRpta.append("El nro bits prestados (N) es de: " + nuevoNumN+"\n\n");
            //Imprimir la Ip y nueva MS
            areaRpta.append("La Ip que escogió es: "+Ip[0]+"."+Ip[1]+"."+Ip[2]+"."+Ip[3]+"\n");
            //Cambio ip priva/publica
            areaRpta.append("El tipo de Ip es: " + tipoIpS + " " +ip_ms.getIpPrivada()+"\n");
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
        }
        
        /*public JTextField getareaRpta() { return areaRpta }
        public void setareaRpta(JTextField areaRpta) {
            this.areaRpta = areaRpta;
         }*/
    }//GEN-LAST:event_jButton2ActionPerformed

    private void n1IPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n1IPKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        //validar caracteres numéricos
        if (!numeros){
            evt.consume();
        }

        //validar numero de caracteres permitidos
        if(n1IP.getText().length() >= 3){
            evt.consume();
        }
        
    }//GEN-LAST:event_n1IPKeyTyped

    private void n2IPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n2IPKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        //validar caracteres numéricos
        if (!numeros){
            evt.consume();
        }
        if(n2IP.getText().length() >= 3){
            evt.consume();
        }
        /*if(Integer.parseInt(n2IP.getText())>255){
            evt.consume();
        }*/
    }//GEN-LAST:event_n2IPKeyTyped

    private void n3IPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n3IPKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        //validar caracteres numéricos
        if (!numeros){
            evt.consume();
        }
        if(n3IP.getText().length() >= 3){
            evt.consume();
        }
    }//GEN-LAST:event_n3IPKeyTyped

    private void n4IPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n4IPKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        //validar caracteres numéricos
        if (!numeros){
            evt.consume();
        }
        if(n4IP.getText().length() >= 3){
            evt.consume();
        }
    }//GEN-LAST:event_n4IPKeyTyped

    private void nSubredesInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nSubredesInputKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        //validar caracteres numéricos
        if (!numeros){
            evt.consume();
        }
        if(nSubredesInput.getText().length() >= 3){
            evt.consume();
        }
    }//GEN-LAST:event_nSubredesInputKeyTyped

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
            java.util.logging.Logger.getLogger(FormularioEvidencia3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioEvidencia3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioEvidencia3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioEvidencia3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormularioEvidencia3().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaRpta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
