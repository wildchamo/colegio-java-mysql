/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author usuario
 */
public class OpcionesIngresar extends javax.swing.JFrame {

    /**
     * Creates new form OpcionesIngresar
     */
    public OpcionesIngresar() {
        initComponents();
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
        Cursobtn = new javax.swing.JButton();
        Generobtn = new javax.swing.JButton();
        Ciudadbtn = new javax.swing.JButton();
        Asignaturabtn = new javax.swing.JButton();
        Profesorbtn = new javax.swing.JButton();
        Estudiantebtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("¿Qué información desea añadir?");

        Cursobtn.setText("Curso");
        Cursobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CursobtnActionPerformed(evt);
            }
        });

        Generobtn.setText("Género");
        Generobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerobtnActionPerformed(evt);
            }
        });

        Ciudadbtn.setText("Ciudad");
        Ciudadbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CiudadbtnActionPerformed(evt);
            }
        });

        Asignaturabtn.setText("Asignatura");
        Asignaturabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignaturabtnActionPerformed(evt);
            }
        });

        Profesorbtn.setText("Profesor");
        Profesorbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfesorbtnActionPerformed(evt);
            }
        });

        Estudiantebtn.setText("Estudiante");
        Estudiantebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstudiantebtnActionPerformed(evt);
            }
        });

        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Ciudadbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Estudiantebtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(Cursobtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Profesorbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Generobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Asignaturabtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62))))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(Asignaturabtn)
                .addGap(13, 13, 13)
                .addComponent(Cursobtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Profesorbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Estudiantebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ciudadbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Generobtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CursobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CursobtnActionPerformed
        AsignarCurso objCurso = new AsignarCurso (); 
       objCurso.setVisible(true);
       this.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_CursobtnActionPerformed

    private void GenerobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerobtnActionPerformed
InterfazGender objGenero = new InterfazGender (); 
       objGenero.setVisible(true);
       this.setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_GenerobtnActionPerformed

    private void CiudadbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CiudadbtnActionPerformed
interfazCity objCiudad = new interfazCity (); 
       objCiudad.setVisible(true);
       this.setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_CiudadbtnActionPerformed

    private void AsignaturabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignaturabtnActionPerformed
InterfazSubject objAsignatura = new InterfazSubject (); 
       objAsignatura.setVisible(true);
       this.setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_AsignaturabtnActionPerformed

    private void ProfesorbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfesorbtnActionPerformed
InterfazTeacher objAlfa = new InterfazTeacher (); 
       objAlfa.setVisible(true);
       this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_ProfesorbtnActionPerformed

    private void EstudiantebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstudiantebtnActionPerformed
InterfazStudent objAlfa = new InterfazStudent (); 
       objAlfa.setVisible(true);
       this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_EstudiantebtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
Opciones objAlfa = new Opciones (); 
       objAlfa.setVisible(true);
       this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(OpcionesIngresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcionesIngresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcionesIngresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcionesIngresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpcionesIngresar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Asignaturabtn;
    private javax.swing.JButton Ciudadbtn;
    private javax.swing.JButton Cursobtn;
    private javax.swing.JButton Estudiantebtn;
    private javax.swing.JButton Generobtn;
    private javax.swing.JButton Profesorbtn;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
