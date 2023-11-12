package pruebaisi2.vista;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import pruebaisi2.modelo.Camping;

public class Cliente_SinReserva extends javax.swing.JFrame {
    private Camping c;
    public Cliente_SinReserva(Camping c) {
        this.c = c;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Fecha_Entrada = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Num_Parcelas = new javax.swing.JComboBox<>();
        Ver_Disponibilidad = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Fecha entrada");

        Fecha_Entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fecha_EntradaActionPerformed(evt);
            }
        });

        jLabel2.setText("Numero de parcelas:");

        Num_Parcelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Num_Parcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num_ParcelasActionPerformed(evt);
            }
        });

        Ver_Disponibilidad.setText("Ver disponibilidad");
        Ver_Disponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ver_DisponibilidadActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(Num_Parcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(Fecha_Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(Ver_Disponibilidad))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(Cancelar)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Fecha_Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Num_Parcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(Ver_Disponibilidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(Cancelar)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        Cliente_Menu v = new Cliente_Menu(c);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void Ver_DisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ver_DisponibilidadActionPerformed
        String fechaTexto = Fecha_Entrada.getText();
        int num = Integer.parseInt((String)Num_Parcelas.getSelectedItem());
        if(!c.esFechaValida(fechaTexto)){
            JOptionPane.showMessageDialog(this, "La fecha ingresada no es válida. Por favor, ingrese una fecha en el formato dd/MM/yyyy.", "Fecha Inválida", JOptionPane.ERROR_MESSAGE);
            if (c.getNumParcelas()< num)
                JOptionPane.showMessageDialog(this, "No tenemos tantas parcelas disponibles", "No se que poner XD", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Cliente_VerParcelasDisponibles v = new Cliente_VerParcelasDisponibles(c);
            v.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_Ver_DisponibilidadActionPerformed

    private void Fecha_EntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fecha_EntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Fecha_EntradaActionPerformed

    private void Num_ParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num_ParcelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Num_ParcelasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField Fecha_Entrada;
    private javax.swing.JComboBox<String> Num_Parcelas;
    private javax.swing.JButton Ver_Disponibilidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    public void setActionListener (ActionListener ae){

    }
}
