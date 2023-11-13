package pruebaisi2.vista;

import java.awt.event.ActionListener;
import pruebaisi2.modelo.Camping;

public class Propietario_Menu extends javax.swing.JFrame {
    private Camping c;

    public Propietario_Menu(Camping c) {
        this.c = c;
        initComponents(); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Realizar_Reserva = new javax.swing.JButton();
        Comprobar_Reserva = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Menú principal");

        Realizar_Reserva.setText("Comprobar Parcelas");
        Realizar_Reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Realizar_ReservaActionPerformed(evt);
            }
        });

        Comprobar_Reserva.setText("Historial Reservas");
        Comprobar_Reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Comprobar_ReservaActionPerformed(evt);
            }
        });

        jButton6.setText("Salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Comprobar_Reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Realizar_Reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(119, 119, 119))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(Realizar_Reserva)
                .addGap(27, 27, 27)
                .addComponent(Comprobar_Reserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Realizar_ReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Realizar_ReservaActionPerformed
        Cliente_Reserva v = new Cliente_Reserva(c);
        v.setVisible(true);
        this.dispose();      
    }//GEN-LAST:event_Realizar_ReservaActionPerformed

    private void Comprobar_ReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Comprobar_ReservaActionPerformed
        Propietario_HistorialReservas p = new Propietario_HistorialReservas(c);
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Comprobar_ReservaActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        LoginPrincipal lp = new LoginPrincipal(c);
        lp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comprobar_Reserva;
    private javax.swing.JButton Realizar_Reserva;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public void setActionListener (ActionListener ae){
        
    }
}

