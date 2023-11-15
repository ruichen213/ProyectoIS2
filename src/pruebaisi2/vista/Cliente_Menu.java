package pruebaisi2.vista;

import java.awt.event.ActionListener;
import pruebaisi2.modelo.Camping;

public class Cliente_Menu extends javax.swing.JFrame {
    private Camping c;

    public Cliente_Menu(Camping c) {
        this.c = c;
        initComponents(); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Realizar_Reserva = new javax.swing.JButton();
        Reservar_Actividad = new javax.swing.JButton();
        Comprobar_Reserva = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Consultar_Actividades = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MENU CLIENTE");

        Realizar_Reserva.setText("Realizar reserva");
        Realizar_Reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Realizar_ReservaActionPerformed(evt);
            }
        });

        Reservar_Actividad.setText("Reservar actividad");
        Reservar_Actividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reservar_ActividadActionPerformed(evt);
            }
        });

        Comprobar_Reserva.setText("Comprobar reserva");
        Comprobar_Reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Comprobar_ReservaActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Consultar_Actividades.setText("Consultar Actividades");
        Consultar_Actividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consultar_ActividadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Comprobar_Reserva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Consultar_Actividades, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(Reservar_Actividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Realizar_Reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(Salir)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Realizar_Reserva)
                .addGap(26, 26, 26)
                .addComponent(Comprobar_Reserva)
                .addGap(31, 31, 31)
                .addComponent(Reservar_Actividad)
                .addGap(36, 36, 36)
                .addComponent(Consultar_Actividades)
                .addGap(18, 18, 18)
                .addComponent(Salir)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Reservar_ActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reservar_ActividadActionPerformed
        Cliente_ReservarActividades v = new Cliente_ReservarActividades(c);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Reservar_ActividadActionPerformed

    private void Realizar_ReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Realizar_ReservaActionPerformed
        Cliente_RegistrarReserva v = new Cliente_RegistrarReserva(c);
        v.setVisible(true);
        this.dispose();      
    }//GEN-LAST:event_Realizar_ReservaActionPerformed

    private void Comprobar_ReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Comprobar_ReservaActionPerformed
        Cliente_BuscarReserva v = new Cliente_BuscarReserva(c);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Comprobar_ReservaActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        LoginPrincipal lp = new LoginPrincipal(c);
        lp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void Consultar_ActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consultar_ActividadesActionPerformed
        // TODO add your handling code here:
        Cliente_ConsultarActividades cca = new Cliente_ConsultarActividades(c);
        cca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Consultar_ActividadesActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comprobar_Reserva;
    private javax.swing.JButton Consultar_Actividades;
    private javax.swing.JButton Realizar_Reserva;
    private javax.swing.JButton Reservar_Actividad;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public void setActionListener (ActionListener ae){
        
    }
}

