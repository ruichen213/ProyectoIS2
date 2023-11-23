package pruebaisi2.vista;

import java.awt.event.ActionListener;
import pruebaisi2.modelo.Camping;

public class Cliente_Menu extends javax.swing.JFrame {
    private Camping c;

    public Cliente_Menu(Camping c) {
        this.c = c;
        initComponents(); 
        this.setTitle("Menu Cliente");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Consultar_Actividades = new javax.swing.JButton();
        Reservar_Actividad = new javax.swing.JButton();
        Comprobar_Reserva = new javax.swing.JButton();
        Realizar_Reserva = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 51));

        Consultar_Actividades.setText("Consultar Actividades");
        Consultar_Actividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consultar_ActividadesActionPerformed(evt);
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

        Realizar_Reserva.setText("Realizar reserva");
        Realizar_Reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Realizar_ReservaActionPerformed(evt);
            }
        });

        jLabel1.setText("MENU CLIENTE");

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Consultar_Actividades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Reservar_Actividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Comprobar_Reserva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Realizar_Reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Salir)
                .addGap(87, 87, 87))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(Realizar_Reserva)
                .addGap(18, 18, 18)
                .addComponent(Comprobar_Reserva)
                .addGap(18, 18, 18)
                .addComponent(Reservar_Actividad)
                .addGap(18, 18, 18)
                .addComponent(Consultar_Actividades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(Salir)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        Cliente_ComprobarReserva cr = new Cliente_ComprobarReserva(c);
        cr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Comprobar_ReservaActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        LoginPrincipal lp = new LoginPrincipal(c);
        lp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void Consultar_ActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consultar_ActividadesActionPerformed
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void setActionListener (ActionListener ae){
    }
}

