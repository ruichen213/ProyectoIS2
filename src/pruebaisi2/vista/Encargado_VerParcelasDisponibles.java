package pruebaisi2.vista;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pruebaisi2.modelo.Camping;
import pruebaisi2.modelo.Parcela;

public class Encargado_VerParcelasDisponibles extends javax.swing.JFrame {

    private Camping c;
    private JTable tablaParcelas; // Agrega el JTable como miembro de la clase
    public Encargado_VerParcelasDisponibles(Camping c) {
        this.c = c;
        initComponents();
        this.setTitle("Parcelas disponibles");
        mostrarParcelasDisponibles(c.getParcelas());
    }

    private void mostrarParcelasDisponibles(ArrayList<Parcela> parcelas) {
        // Define las columnas del JTable
        String[] columnas = {"ID Parcela", "Superficie", "Luz", "Precio"};
        
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
        for (Parcela parcela : parcelas) {
            if (parcela.isDisponible()) {
                if(parcela.isDisponible()){
                    modelo.addRow(new Object[]{
                        parcela.getId_parcela(),
                        parcela.getSuperficie(),
                        parcela.getLuz() ? "Sí" : "No",
                        parcela.getPrecio()
                    });
                }
            }
        }
        this.add(jScrollPane1); // Agrega el JScrollPane al JFrame
        
        // Para asegurar que los cambios se muestren, valida y repinta el JFrame
        this.validate();
        this.repaint();
        
        Cancelar.setActionCommand("Encargado_VerParcelasDisponibles");
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
            .addGap(0, 845, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(Cancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Cancelar)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed

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
