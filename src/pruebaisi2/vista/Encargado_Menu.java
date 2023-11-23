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
        this.setTitle("Menu Encargado");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Crear_Actividades = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Datos_Tienda = new javax.swing.JButton();
        HistorialCliente = new javax.swing.JButton();
        ComprobarDisponibilidad = new javax.swing.JButton();
        Checkout = new javax.swing.JButton();
        Checkin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ComprobarAsistencia = new javax.swing.JButton();
        Anotar_Ganadores = new javax.swing.JButton();
        Sancionar = new javax.swing.JButton();
        RegistrarEntrada = new javax.swing.JButton();
        RegistrarSalida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Crear_Actividades.setText("Crear actividades");
        Crear_Actividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_ActividadesActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Datos_Tienda.setText("Datos tiendas");
        Datos_Tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Datos_TiendaActionPerformed(evt);
            }
        });

        HistorialCliente.setText("Historial cliente");
        HistorialCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialClienteActionPerformed(evt);
            }
        });

        ComprobarDisponibilidad.setText("Comprobar disponibilidad");
        ComprobarDisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprobarDisponibilidadActionPerformed(evt);
            }
        });

        Checkout.setText("Check-out");
        Checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckoutActionPerformed(evt);
            }
        });

        Checkin.setText("Check-in");
        Checkin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckinActionPerformed(evt);
            }
        });

        jLabel1.setText("Menú principal");

        ComprobarAsistencia.setText("Comprobar Asistencia");
        ComprobarAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprobarAsistenciaActionPerformed(evt);
            }
        });

        Anotar_Ganadores.setText("Anotar ganadores");
        Anotar_Ganadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anotar_GanadoresActionPerformed(evt);
            }
        });

        Sancionar.setText("Sancionar");
        Sancionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SancionarActionPerformed(evt);
            }
        });

        RegistrarEntrada.setText("Registrar Entrada");
        RegistrarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarEntradaActionPerformed(evt);
            }
        });

        RegistrarSalida.setText("Registrar Salida");
        RegistrarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Salir)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegistrarSalida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RegistrarEntrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Anotar_Ganadores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComprobarAsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Crear_Actividades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Sancionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Checkin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Checkout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HistorialCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComprobarDisponibilidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Datos_Tienda, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(149, 149, 149))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(RegistrarEntrada)
                .addGap(18, 18, 18)
                .addComponent(RegistrarSalida)
                .addGap(18, 18, 18)
                .addComponent(Checkin)
                .addGap(18, 18, 18)
                .addComponent(Checkout)
                .addGap(18, 18, 18)
                .addComponent(HistorialCliente)
                .addGap(18, 18, 18)
                .addComponent(Datos_Tienda)
                .addGap(18, 18, 18)
                .addComponent(Crear_Actividades)
                .addGap(18, 18, 18)
                .addComponent(Anotar_Ganadores)
                .addGap(18, 18, 18)
                .addComponent(ComprobarDisponibilidad)
                .addGap(18, 18, 18)
                .addComponent(ComprobarAsistencia)
                .addGap(18, 18, 18)
                .addComponent(Sancionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(Salir)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HistorialClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialClienteActionPerformed
        Encargado_HistorialCliente v = new Encargado_HistorialCliente(c);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HistorialClienteActionPerformed

    private void CheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckoutActionPerformed
        Encargado_Checkout v = new Encargado_Checkout(c);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CheckoutActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        LoginPrincipal lp = new LoginPrincipal(c);
        lp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void ComprobarDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprobarDisponibilidadActionPerformed
        Encargado_VerParcelasDisponibles v = new Encargado_VerParcelasDisponibles(c);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ComprobarDisponibilidadActionPerformed

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

    private void ComprobarAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprobarAsistenciaActionPerformed
        Encargado_MostrarReservas v = new Encargado_MostrarReservas(c);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ComprobarAsistenciaActionPerformed

    private void Anotar_GanadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anotar_GanadoresActionPerformed
        Encargado_AnotarGanadores v = new Encargado_AnotarGanadores(c);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Anotar_GanadoresActionPerformed

    private void SancionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SancionarActionPerformed
        // TODO add your handling code here:
        Encargado_Sancion v = new Encargado_Sancion(c);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SancionarActionPerformed

    private void CheckinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckinActionPerformed
        // TODO add your handling code here:
        Encargado_Checkin v = new Encargado_Checkin(c);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CheckinActionPerformed

    private void RegistrarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarEntradaActionPerformed
        // TODO add your handling code here:
        Encargado_RegistrarEntrada v = new Encargado_RegistrarEntrada(c);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegistrarEntradaActionPerformed

    private void RegistrarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarSalidaActionPerformed
        // TODO add your handling code here:
        Encargado_RegistrarSalida v = new Encargado_RegistrarSalida(c);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegistrarSalidaActionPerformed

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
    private javax.swing.JButton Checkin;
    private javax.swing.JButton Checkout;
    private javax.swing.JButton ComprobarAsistencia;
    private javax.swing.JButton ComprobarDisponibilidad;
    private javax.swing.JButton Crear_Actividades;
    private javax.swing.JButton Datos_Tienda;
    private javax.swing.JButton HistorialCliente;
    private javax.swing.JButton RegistrarEntrada;
    private javax.swing.JButton RegistrarSalida;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Sancionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void setActionListener (ActionListener ae){

    }
}
