package pruebaisi2.vista;

import java.awt.event.ActionListener;
import pruebaisi2.modelo.Camping;

public class Encargado_Menu extends javax.swing.JFrame {
    private Camping c;
   
    public Encargado_Menu(Camping c) {
        this.c = c;
        initComponents();
        this.setTitle("Menu Encargado");
        
        RegistrarEntrada.setActionCommand("EncargadoMenu_BotonRegistrarEntrada");
	RegistrarSalida.setActionCommand("EncargadoMenu_BotonRegistrarSalida");
	Checkin.setActionCommand("EncargadoMenu_BotonCheckin");
	Checkout.setActionCommand("EncargadoMenu_BotonCheckout");
	HistorialCliente.setActionCommand("EncargadoMenu_BotonHistorialCliente");
	Datos_Tienda.setActionCommand("EncargadoMenu_BotonDatosTienda");
	Crear_Actividades.setActionCommand("EncargadoMenu_BotonRegistrarEntrada");
	Anotar_Ganadores.setActionCommand("EncargadoMenu_BotonAnotarGanadores");
	ComprobarDisponibilidad.setActionCommand("EncargadoMenu_BotonComprobarDisponibilidad");
	ComprobarAsistencia.setActionCommand("EncargadoMenu_BotonComprobarAsistencia");
	Sancionar.setActionCommand("EncargadoMenu_BotonSancionar");
        
        Salir.setActionCommand("EncargadoMenu_BotonSalir");
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
   
    }//GEN-LAST:event_HistorialClienteActionPerformed

    private void CheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckoutActionPerformed
        
    }//GEN-LAST:event_CheckoutActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        
    }//GEN-LAST:event_SalirActionPerformed

    private void ComprobarDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprobarDisponibilidadActionPerformed
       
    }//GEN-LAST:event_ComprobarDisponibilidadActionPerformed

    private void Datos_TiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Datos_TiendaActionPerformed
       
    }//GEN-LAST:event_Datos_TiendaActionPerformed

    private void Crear_ActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_ActividadesActionPerformed
       
    }//GEN-LAST:event_Crear_ActividadesActionPerformed

    private void ComprobarAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprobarAsistenciaActionPerformed
        
    }//GEN-LAST:event_ComprobarAsistenciaActionPerformed

    private void Anotar_GanadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anotar_GanadoresActionPerformed
        
    }//GEN-LAST:event_Anotar_GanadoresActionPerformed

    private void SancionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SancionarActionPerformed
       
    }//GEN-LAST:event_SancionarActionPerformed

    private void CheckinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckinActionPerformed
        
    }//GEN-LAST:event_CheckinActionPerformed

    private void RegistrarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarEntradaActionPerformed

    }//GEN-LAST:event_RegistrarEntradaActionPerformed

    private void RegistrarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarSalidaActionPerformed
        
    }//GEN-LAST:event_RegistrarSalidaActionPerformed

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
	RegistrarEntrada.addActionListener(ae);
	RegistrarSalida.addActionListener(ae);
	Checkin.addActionListener(ae);
	Checkout.addActionListener(ae);
	HistorialCliente.addActionListener(ae);
	Datos_Tienda.addActionListener(ae);
	Crear_Actividades.addActionListener(ae);
	Anotar_Ganadores.addActionListener(ae);
	ComprobarDisponibilidad.addActionListener(ae);
	ComprobarAsistencia.addActionListener(ae);
	Sancionar.addActionListener(ae);

	Salir.addActionListener(ae);
}
}
