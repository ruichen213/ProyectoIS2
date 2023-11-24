package pruebaisi2.vista;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import pruebaisi2.modelo.Actividad;
import pruebaisi2.modelo.Camping;
import pruebaisi2.modelo.Cliente;
import pruebaisi2.modelo.Reserva;

public class Encargado_Checkin extends javax.swing.JFrame {
    private Camping c;
    public Encargado_Checkin(Camping c) {
        this.c = c;
        initComponents();
        this.setTitle("Check-in");
        Registrar.setActionCommand("EncargadoChechin_BotonRegistrar");
        Cancelar.setActionCommand("EncargadoChechin_BotonCancelar");
        Parcelas.removeAllItems();
        
        //REVISAR HACE ERROR AL INICIAR
//        if (c.getNumParcelas() > 0 ){
//            for(int i = 0;i < c.getNumParcelas();i++){
//                if (c.getParcela(i).isDisponible() == true)
//                    Parcelas.addItem(String.valueOf(c.getParcela(i).getId()));
//                    //jComboBox1.addItem(Integer.toString((c.getParcela(i).getId())));     
//                }
//        }
//        else
//            JOptionPane.showMessageDialog(null, "Todas las parcelas estan ocupadas, disculpe las molestias");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Registrar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Parcelas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Salida = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Nombre_Cliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Entrada = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        jLabel3.setText("Parcelas disponibles:");

        Parcelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Parcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParcelasActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha salida:");

        Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidaActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre:");

        Nombre_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nombre_ClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha entrada:");

        Entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Registrar)
                        .addGap(83, 83, 83)
                        .addComponent(Cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Parcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nombre_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Nombre_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Parcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Registrar)
                    .addComponent(Cancelar))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        try { 
            Registrar.setActionCommand("Fecha de entrada confirmada");
            String nombre = Nombre_Cliente.getText();
            String fechaInicio = Entrada.getText();
            String fechaFin = Salida.getText();
            int contador = 0;   //Contador para saber las parcelas que se anyaden al jComboBox
            int idClienteNuevo = c.getLastIdCliente() + 1;
            if (!c.esFechaValida(fechaFin) || !c.esFechaValida(fechaInicio))
                JOptionPane.showMessageDialog(this, "La fecha ingresada no es valida. Por favor, ingrese una fecha en el formato dd/MM/yyyy.", "Fecha Invalida", JOptionPane.ERROR_MESSAGE);
            else if (c.esFechaPosterior(fechaInicio, fechaFin))
                JOptionPane.showMessageDialog(this, "Las fechas ingresadas no son validas. Por favor, mirar que las fechas tengan sentido", "Fecha Invalida", JOptionPane.ERROR_MESSAGE);
            else
            {
                //Reserva reserva = new Reserva(c.getLastIdParcela()+1,fechaInicio, fechaFin, true);
                Reserva reserva = new Reserva(Integer.parseInt(String.valueOf(Parcelas.getSelectedItem())), idClienteNuevo, fechaInicio, fechaFin, true);
                Cliente cliente = new Cliente(idClienteNuevo, nombre, "default", 0, false);
                System.out.println("Parcela seleccionada numero: " + Integer.valueOf(String.valueOf(Parcelas.getSelectedItem())));
                c.anyadirReserva(reserva);
                c.getParcela(Integer.parseInt(String.valueOf(Parcelas.getSelectedItem()))-1).setDisponible(false);
                c.anyadirCliente(cliente);

                JOptionPane.showMessageDialog(null, "Reserva confirmada");

                Parcelas.removeAllItems();
                if (c.getNumParcelas() > 0){
                    for(int i = 0;i < c.getNumParcelas();i++){
                        if (c.getParcela(i).isDisponible() == true){
                            Parcelas.addItem(String.valueOf(c.getParcela(i).getId()));
                            contador ++;
                        }
                    }
                }
                if (contador == 0){
                    JOptionPane.showMessageDialog(null, "Todas las parcelas estan ocupadas, disculpe las molestias");
                }
            }
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese bien los datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_RegistrarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        Cancelar.setActionCommand("Cancelando registro...");
        Encargado_Menu v = new Encargado_Menu(c);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void EntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaActionPerformed
        
    }//GEN-LAST:event_EntradaActionPerformed

    private void ParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParcelasActionPerformed
        //jComboBox1.remove();
        /*
        for(int i = 0;i < c.getNumTiendas();i++){
            jComboBox1.addItem(c.getTienda(i).getNombre());
        }
        */
    }//GEN-LAST:event_ParcelasActionPerformed

    private void SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalidaActionPerformed

    private void Nombre_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nombre_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nombre_ClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField Entrada;
    private javax.swing.JTextField Nombre_Cliente;
    private javax.swing.JComboBox<String> Parcelas;
    private javax.swing.JButton Registrar;
    private javax.swing.JTextField Salida;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void setActionListener (ActionListener ae){
	Nombre_Cliente.addActionListener(ae);
	Entrada.addActionListener(ae);
	Salida.addActionListener(ae);
	Parcelas.addActionListener(ae);

	Registrar.addActionListener(ae);
	Cancelar.addActionListener(ae);
}
}
