package pruebaisi2.vista;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import pruebaisi2.modelo.Actividad;
import pruebaisi2.modelo.Camping;
import pruebaisi2.modelo.Reserva;

public class Cliente_ReservarActividades extends javax.swing.JFrame {
    private Camping c;
    private String dia, hora, tipoActividad, estado;
    private int k;
    
    public Cliente_ReservarActividades(Camping c) {
        initComponents();
        this.c = c;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Actividad = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Reservar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Hora = new javax.swing.JTextField();
        Dia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Reservar actividades");

        Actividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Piscina", "Fronton", "Juegos Sociales" }));
        Actividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActividadActionPerformed(evt);
            }
        });

        jLabel2.setText("- Dia:");

        jLabel3.setText("- Hora:");

        Reservar.setText("Reservar");
        Reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraActionPerformed(evt);
            }
        });

        Dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaActionPerformed(evt);
            }
        });

        jLabel6.setText("- Tipo de actividad:");

        jLabel7.setText("--------------------------------------------------------------------------------");

        jLabel8.setText("Actividadades disponibles: ");

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Por favor selecciona la actividad que mejor se ajuste a tus preferencias, gracias :)");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Cancelar)
                                .addGap(88, 88, 88)
                                .addComponent(Reservar))
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Dia)
                            .addComponent(Actividad, 0, 1, Short.MAX_VALUE)
                            .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(jButton1)))
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Actividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(10, 10, 10)
                        .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(28, 28, 28)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar)
                    .addComponent(Reservar))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActividadActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ActividadActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        Cliente_Menu v = new Cliente_Menu(c);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void ReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservarActionPerformed
        String dia = Dia.getText();
        String hora = Hora.getText();
        String actividad = (String)Actividad.getSelectedItem();
        if(!c.esFechaValida(dia)) {
            JOptionPane.showMessageDialog(this, "La fecha ingresada no es válida. Por favor, ingrese una fecha en el formato dd/MM/yyyy.", "Fecha Invalida", JOptionPane.ERROR_MESSAGE);
            if (!c.esHoraValida(hora))
                JOptionPane.showMessageDialog(this, "La hora ingresada no es válida. Por favor, ingrese una fecha en el formato HH:mm.", "Hora Inválida", JOptionPane.ERROR_MESSAGE);
        }
        /*
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Reserva realizada con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        
        c.setActividadOcupada(k);
        c.addActividadToCliente(k);
        
        Cliente_Menu cm = new Cliente_Menu(c);
        cm.setVisible(true);
        this.dispose();
        
        //c.setActividadOcupada(i);
        */
    }//GEN-LAST:event_ReservarActionPerformed

    private void DiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaActionPerformed

    }//GEN-LAST:event_DiaActionPerformed

    private void HoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraActionPerformed

    }//GEN-LAST:event_HoraActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here: donde se muestran..
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dia = Dia.getText().trim();
        hora = Hora.getText().trim();
        tipoActividad = (String) Actividad.getSelectedItem();
        estado = "libre";
        
        for (int i = 0; i < c.cantidadActividades(); i++) {
//            System.out.println("Dia: |" + dia + "|");
//            System.out.println("Dia de la actividad: |" + c.getDiaActividad(i) + "|");
            if (dia.equalsIgnoreCase(c.getDiaActividad(i))) {
//                System.out.println("Hora: |" + hora + "|");
//                System.out.println("Hora de la actividad: |" + c.getFechaActividad(i) + "|");
                if (hora.equalsIgnoreCase(c.getFechaActividad(i))) {
//                    System.out.println("Tipo de actividad: |" + tipoActividad + "|");
//                    System.out.println("Tipo de actividad de la actividad: |" + c.getTipoActividad(i) + "|");
                    if (tipoActividad.equalsIgnoreCase(c.getTipoActividad(i))) {
                        if (estado.equalsIgnoreCase(c.getEstadoActividad(i))){
                            jComboBox2.addItem(c.mostrarActividad(i));
                            k = i;
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Cliente_ReservarActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Cliente_ReservarActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Cliente_ReservarActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Cliente_ReservarActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Cliente_ReservarActividades().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Actividad;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField Dia;
    private javax.swing.JTextField Hora;
    private javax.swing.JButton Reservar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    public void setActionListener (ActionListener ae){

    }
}
