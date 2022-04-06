package g4s21mml3;

import Operaciones.Avanzado;
import Operaciones.Basicas;

public class FrmPrincipal extends javax.swing.JFrame {

   
    public FrmPrincipal() {
        initComponents();
    }   
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnum1 = new javax.swing.JTextField();
        txtnum2 = new javax.swing.JTextField();
        btnsuma = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        btnpotencia = new javax.swing.JButton();
        btnmultiplicacion = new javax.swing.JButton();
        btndivision = new javax.swing.JButton();
        btnresta = new javax.swing.JButton();
        btnraizcuadrada = new javax.swing.JButton();
        btnraizcubica = new javax.swing.JButton();
        btnfactorial = new javax.swing.JButton();
        btnlogaritmo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("operaciones basicas");

        jLabel2.setText("Primer numero");

        jLabel3.setText("Segundo numero");

        btnsuma.setText("Sumar");
        btnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumaActionPerformed(evt);
            }
        });

        lblResultado.setText("Resultado");

        btnpotencia.setText("Potencia");
        btnpotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpotenciaActionPerformed(evt);
            }
        });

        btnmultiplicacion.setText("Multiplicacion");
        btnmultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplicacionActionPerformed(evt);
            }
        });

        btndivision.setText("Division");
        btndivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivisionActionPerformed(evt);
            }
        });

        btnresta.setText("Resta");
        btnresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestaActionPerformed(evt);
            }
        });

        btnraizcuadrada.setText("Raiz cuadrada");
        btnraizcuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnraizcuadradaActionPerformed(evt);
            }
        });

        btnraizcubica.setText("Raiz cubica");
        btnraizcubica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnraizcubicaActionPerformed(evt);
            }
        });

        btnfactorial.setText("Factorial");
        btnfactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfactorialActionPerformed(evt);
            }
        });

        btnlogaritmo.setText("Logaritmo");
        btnlogaritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogaritmoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnum1)
                            .addComponent(txtnum2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnsuma, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnpotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnresta, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnmultiplicacion)
                                .addGap(20, 20, 20)
                                .addComponent(btndivision, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnraizcuadrada)
                                .addGap(18, 18, 18)
                                .addComponent(btnraizcubica, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(btnfactorial, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnlogaritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsuma)
                    .addComponent(btnmultiplicacion)
                    .addComponent(btndivision)
                    .addComponent(btnresta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnraizcuadrada)
                    .addComponent(btnraizcubica)
                    .addComponent(btnfactorial)
                    .addComponent(btnpotencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlogaritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lblResultado)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumaActionPerformed
        // TODO add your handling code here:
        int num1 = Integer.valueOf(txtnum1.getText());
        Basicas objbasicas = new Basicas();
        lblResultado.setText("El resultado de la suma es: "+ String.valueOf(objbasicas.Sumar(num1, Integer.valueOf(txtnum2.getText()))));
                
        
    }//GEN-LAST:event_btnsumaActionPerformed

    private void btnpotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpotenciaActionPerformed
        // TODO add your handling code here:
       Avanzado objavanzado = new Avanzado();
       lblResultado.setText("El resultado de la potencia es: "+String.valueOf(objavanzado.potencia(Integer.valueOf(txtnum1.getText()), Integer.valueOf(txtnum2.getText()))));
               
        
    }//GEN-LAST:event_btnpotenciaActionPerformed

    private void btnrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestaActionPerformed
        // TODO add your handling code here:
        int num1 = Integer.valueOf(txtnum1.getText());
        Basicas objbasicas = new Basicas();
        lblResultado.setText("El resultado de la resta es " + String.valueOf(objbasicas.Resta(num1, Integer.valueOf(txtnum2.getText())))); 
    }//GEN-LAST:event_btnrestaActionPerformed

    private void btnmultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplicacionActionPerformed
        // TODO add your handling code here:
        int num1 = Integer.valueOf(txtnum1.getText());
        Basicas objbasicas = new Basicas();
        lblResultado.setText("El resultado de la multiplicacion es " + String.valueOf(objbasicas.Multiplicacion(num1, Integer.valueOf(txtnum2.getText()))));
    }//GEN-LAST:event_btnmultiplicacionActionPerformed

    private void btndivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivisionActionPerformed
        // TODO add your handling code here:
        int num1 = Integer.valueOf(txtnum1.getText());
        Basicas objbasicas = new Basicas();
        lblResultado.setText("El resultado de la division es " + String.valueOf(objbasicas.Division(num1, Integer.valueOf(txtnum2.getText()))));
    }//GEN-LAST:event_btndivisionActionPerformed

    private void btnraizcuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnraizcuadradaActionPerformed
        // TODO add your handling code here:
        Avanzado objavanzado = new Avanzado();
        lblResultado.setText("El resultado de la raiz cuadrada es " + String.valueOf(objavanzado.raizcuadrada(Integer.valueOf(txtnum1.getText()))));
    }//GEN-LAST:event_btnraizcuadradaActionPerformed

    private void btnraizcubicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnraizcubicaActionPerformed
        // TODO add your handling code here:
        Avanzado objavanzado = new Avanzado();
        lblResultado.setText("El resultado de la raiz cubica es " + String.valueOf(objavanzado.raizcubica(Integer.valueOf(txtnum1.getText()))));
    }//GEN-LAST:event_btnraizcubicaActionPerformed

    private void btnfactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfactorialActionPerformed
        // TODO add your handling code here:
        Avanzado objavanzado = new Avanzado();
        lblResultado.setText("El resultado del factorial es " + String.valueOf(objavanzado.factorial(Integer.valueOf(txtnum1.getText()))));
    }//GEN-LAST:event_btnfactorialActionPerformed

    private void btnlogaritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogaritmoActionPerformed
        // TODO add your handling code here:
        Avanzado objavanzado = new Avanzado();
        lblResultado.setText("El resultado del logaritmo de es " + String.valueOf(objavanzado.logaritmo(Integer.valueOf(txtnum1.getText()))));
    }//GEN-LAST:event_btnlogaritmoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndivision;
    private javax.swing.JButton btnfactorial;
    private javax.swing.JButton btnlogaritmo;
    private javax.swing.JButton btnmultiplicacion;
    private javax.swing.JButton btnpotencia;
    private javax.swing.JButton btnraizcuadrada;
    private javax.swing.JButton btnraizcubica;
    private javax.swing.JButton btnresta;
    private javax.swing.JButton btnsuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtnum1;
    private javax.swing.JTextField txtnum2;
    // End of variables declaration//GEN-END:variables
}
