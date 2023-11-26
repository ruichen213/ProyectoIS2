package pruebaisi2.vista;

import java.awt.event.ActionListener;
import pruebaisi2.modelo.Camping;


public class Cliente_ReservarActividades extends javax.swing.JFrame {
    private Camping c;
    private String dia, hora, tipoActividad, estado;
    private int k;
    
    public Cliente_ReservarActividades(Camping c) {
        this.c = c;
        initComponents();
        this.setTitle("Reservar Actividades");
        jButton1.setActionCommand("ClienteReservarActividades_BotonBuscar");
        Cancelar.setActionCommand("ClienteReservarActividades_BotonCancelar");
        Reservar.setActionCommand("ClienteReservarActividades_BotonReservar");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Actividad = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        Reservar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Dia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ActividadesDisponibles = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Reservar actividades");

        Actividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Piscina", "Fronton", "Juegos Sociales" }));
        Actividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActividadActionPerformed(evt);
            }
        });

        jLabel2.setText("- Dia:");

        Reservar.setText("Reservar");
        Reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaActionPerformed(evt);
            }
        });

        jLabel6.setText("- Tipo de actividad:");

        jLabel7.setText("--------------------------------------------------------------------------------");

        jLabel8.setText("Actividadades disponibles: ");

        ActividadesDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActividadesDisponiblesActionPerformed(evt);
            }
        });

        jLabel9.setText("Por favor selecciona la actividad que mejor se ajuste a tus preferencias, gracias :)");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Cancelar)
                                .addGap(88, 88, 88)
                                .addComponent(Reservar))
                            .addComponent(ActividadesDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Dia, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Actividad, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 83, Short.MAX_VALUE)))))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(Actividad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(48, 48, 48)))
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(28, 28, 28)
                .addComponent(ActividadesDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar)
                    .addComponent(Reservar))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActividadActionPerformed

    }//GEN-LAST:event_ActividadActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed

    }//GEN-LAST:event_CancelarActionPerformed

    private void ReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservarActionPerformed

    }//GEN-LAST:event_ReservarActionPerformed

    private void DiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaActionPerformed

    }//GEN-LAST:event_DiaActionPerformed

    private void ActividadesDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActividadesDisponiblesActionPerformed
 
    }//GEN-LAST:event_ActividadesDisponiblesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Actividad;
    private javax.swing.JComboBox<String> ActividadesDisponibles;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField Dia;
    private javax.swing.JButton Reservar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    public void setActionListener (ActionListener ae){
	Actividad.addActionListener(ae);
	Dia.addActionListener(ae);
	ActividadesDisponibles.addActionListener(ae);

	jButton1.addActionListener(ae);
	Cancelar.addActionListener(ae);
	Reservar.addActionListener(ae);
    }
    
    public String DiaGetText(){
        return Dia.getText().trim();
    }
    
    public void setdia(String dia){
        this.dia = dia;
    }
    
    public String getdia(){
        return dia;
    }
    
    public String ActividadGetItem(){
        return (String) Actividad.getSelectedItem();
    }
    
    public void setTipoActividad(String tipoActividad){
        this.tipoActividad = tipoActividad;
    }
    
    public String getTipoActividad(){
        return tipoActividad;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void addActividadDisponible(String actividad){
        ActividadesDisponibles.addItem(actividad);
    }
    
    public void setK(int k){
        this.k = k;
    }
    
    public int getK(){
        return k;
    }
}
