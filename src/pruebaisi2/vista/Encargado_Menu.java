package pruebaisi2.vista;

import java.awt.event.ActionListener;
import pruebaisi2.modelo.Camping;
import pruebaisi2.modelo.Reserva;

public class Encargado_Menu extends javax.swing.JFrame {
    private Camping c;
    private Reserva r;
   
    public Encargado_Menu(Camping c) {
        this.c = c;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Crear_Actividades = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Datos_Tienda = new javax.swing.JButton();
        Historial = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Registrar_Salida = new javax.swing.JButton();
        Registrar_Entrada = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        Anotar_Ganadores = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Crear_Actividades.setText("Crear actividades");
        Crear_Actividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_ActividadesActionPerformed(evt);
            }
        });

        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        Datos_Tienda.setText("Datos tiendas");
        Datos_Tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Datos_TiendaActionPerformed(evt);
            }
        });

        Historial.setText("Historial cliente");
        Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialActionPerformed(evt);
            }
        });

        jButton6.setText("Comprobar disponibilidad");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        Registrar_Salida.setText("Check-out");
        Registrar_Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registrar_SalidaActionPerformed(evt);
            }
        });

        Registrar_Entrada.setText("Registrar entrada");
        Registrar_Entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registrar_EntradaActionPerformed(evt);
            }
        });

        jLabel1.setText("Menú principal");

        jButton8.setText("Comprobar Asistencia");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        Anotar_Ganadores.setText("Anotar ganadores");
        Anotar_Ganadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anotar_GanadoresActionPerformed(evt);
            }
        });

        jButton10.setText("Sancionar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(171, 171, 171))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Datos_Tienda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Anotar_Ganadores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Crear_Actividades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Registrar_Entrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Registrar_Salida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Historial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)))
                .addGap(132, 132, 132))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(73, 73, 73)
                .addComponent(Registrar_Entrada)
                .addGap(27, 27, 27)
                .addComponent(Registrar_Salida)
                .addGap(18, 18, 18)
                .addComponent(Historial)
                .addGap(18, 18, 18)
                .addComponent(Datos_Tienda)
                .addGap(18, 18, 18)
                .addComponent(Crear_Actividades)
                .addGap(18, 18, 18)
                .addComponent(Anotar_Ganadores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialActionPerformed
        Encargado_DatosCliente v = new Encargado_DatosCliente(c);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HistorialActionPerformed

    private void Registrar_EntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registrar_EntradaActionPerformed
        // TODO add your handling code here:
        Encargado_RegistrarEntrada v = new Encargado_RegistrarEntrada(c);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Registrar_EntradaActionPerformed

    private void Registrar_SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registrar_SalidaActionPerformed
        Encargado_RegistrarSalida v = new Encargado_RegistrarSalida(c);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Registrar_SalidaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        LoginPrincipal lp = new LoginPrincipal(c);
        lp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Cliente_VerParcelasDisponibles v = new Cliente_VerParcelasDisponibles(c, r.getFechaInicio(), c.getNumParcelas());
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void Datos_TiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Datos_TiendaActionPerformed
        Encargado_DatoTiendas v = new Encargado_DatoTiendas(c);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Datos_TiendaActionPerformed

    private void Crear_ActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_ActividadesActionPerformed
        Encargado_CrearActividad v = new Encargado_CrearActividad(c);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Crear_ActividadesActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Encargado_MostrarReservas v = new Encargado_MostrarReservas(c);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void Anotar_GanadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anotar_GanadoresActionPerformed
        Encargado_AnotarGanadores v = new Encargado_AnotarGanadores(c);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Anotar_GanadoresActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        Encargado_Sancion v = new Encargado_Sancion(c);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

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
//            java.util.logging.Logger.getLogger(Encargado_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Encargado_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Encargado_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Encargado_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Encargado_Menu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anotar_Ganadores;
    private javax.swing.JButton Crear_Actividades;
    private javax.swing.JButton Datos_Tienda;
    private javax.swing.JButton Historial;
    private javax.swing.JButton Registrar_Entrada;
    private javax.swing.JButton Registrar_Salida;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void setActionListener (ActionListener ae){

    }
}
