package pruebaisi2.vista;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pruebaisi2.modelo.Camping;
import pruebaisi2.modelo.Cliente;
import pruebaisi2.modelo.Parcela;

public class Propietario_TiendasParcelas extends javax.swing.JFrame {

    private Camping c;
    private JTable tablaParcelas; // Agrega el JTable como miembro de la clase
    public Propietario_TiendasParcelas(Camping c) {
        this.c = c;
        initComponents();
        mostrarParcelasDisponibles(c.getClientes());
    }

    private void mostrarParcelasDisponibles(ArrayList<Cliente> clientes) {
        // Define las columnas del JTable
        String[] columnas = {"ID Parcela", "Usuario", "Superficie", "Luz", "Precio", "Tienda"};
        
        // Crea un modelo de tabla que no permita la edición de celdas
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Esto hace que ninguna celda sea editable
            }
        };
        tablaParcelas = new JTable();
        tablaParcelas.setModel(modelo);
        jScrollPane1.setViewportView(tablaParcelas);
        // Agrega las parcelas disponibles al modelo
        for (Cliente cliente : clientes) {
            ArrayList<Parcela> Parcelas = c.getParcelasCliente(cliente.getId_cliente());
            for (Parcela Pracela : Parcelas) {
                
                modelo.addRow(new Object[]{
                    Pracela.getId_parcela(),
                    cliente.getUsuario(),
                    Pracela.getSuperficie(),
                    Pracela.getLuz() ? "Sí" : "No",
                    Pracela.getPrecio(),
                    Pracela.getNombreTienda()
                });
            }
        }
        this.add(jScrollPane1); // Agrega el JScrollPane al JFrame     
        // Para asegurar que los cambios se muestren, valida y repinta el JFrame
        this.validate();
        this.repaint();
        
        Cancelar.setActionCommand("PropietarioTiendasParcelas_BotonSalir");

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

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
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(Cancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(Cancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
//        Propietario_Menu lp = new Propietario_Menu(c);
//        lp.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    public void setActionListener (ActionListener ae){
        Cancelar.addActionListener(ae);
    }
}
