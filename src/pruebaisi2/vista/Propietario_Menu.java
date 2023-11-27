package pruebaisi2.vista;

import java.awt.event.ActionListener;
import pruebaisi2.modelo.Camping;

public class Propietario_Menu extends javax.swing.JFrame {
    private Camping c;

    public Propietario_Menu(Camping c) {
        this.c = c;
        this.setTitle("Menu Propietario");
        initComponents(); 
        
        Comprobar_Parcelas.setActionCommand("PropietarioMenu_BotonComprobarParcelas");
        Historial_Reservas.setActionCommand("PropietarioMenu_BotonHistorialReservas");
        
        Salir.setActionCommand("PropietarioMenu_BotonSalir");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Historial_Reservas = new javax.swing.JButton();
        Comprobar_Parcelas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Historial_Reservas.setText("Historial Reservas");
        Historial_Reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Historial_ReservasActionPerformed(evt);
            }
        });

        Comprobar_Parcelas.setText("Comprobar Parcelas");
        Comprobar_Parcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Comprobar_ParcelasActionPerformed(evt);
            }
        });

        jLabel1.setText("Menú principal");

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
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Comprobar_Parcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Historial_Reservas, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Salir)
                        .addGap(108, 108, 108))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(Comprobar_Parcelas)
                .addGap(18, 18, 18)
                .addComponent(Historial_Reservas)
                .addGap(29, 29, 29)
                .addComponent(Salir)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Comprobar_ParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Comprobar_ParcelasActionPerformed
//        Propietario_TiendasParcelas p = new Propietario_TiendasParcelas(c);
//        p.setVisible(true);
//        this.dispose();   
    }//GEN-LAST:event_Comprobar_ParcelasActionPerformed

    private void Historial_ReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Historial_ReservasActionPerformed
//        Propietario_HistorialReservas p = new Propietario_HistorialReservas(c);
//        p.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_Historial_ReservasActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
//        LoginPrincipal lp = new LoginPrincipal(c);
//        lp.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comprobar_Parcelas;
    private javax.swing.JButton Historial_Reservas;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void setActionListener (ActionListener ae){
        Comprobar_Parcelas.addActionListener(ae);
        Historial_Reservas.addActionListener(ae);
        
        Salir.addActionListener(ae);
    }
}

