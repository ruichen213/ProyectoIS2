package pruebaisi2.vista;

import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pruebaisi2.modelo.Actividad;
import pruebaisi2.modelo.Camping;
import pruebaisi2.modelo.Cliente;
import pruebaisi2.modelo.Parcela;
import pruebaisi2.modelo.Reserva;

public class Encargado_HistorialCliente extends javax.swing.JFrame {
    private Camping c;
    public Encargado_HistorialCliente(Camping c) {
        this.c = c;
        initComponents();
        this.setTitle("Historial Cliente");
        //No se puede editar el descuento a 
        //menos que hayan pasado más de 15 dias entre la fecha de entrada y la de salida
        Fecha_Entrada.setEditable(false);
        Fecha_Salida.setEditable(false);
        PrecioSin.setEditable(false);
        ID_Parcela.setEditable(false);
    }
    /*
        Funcion para comprobar si el cliente ha estado mas de 15 dias y por tanto 
        se le puede aplicar un descuento
    */
    public boolean recibirDescuento (String fechaIni, String fechaFin){
        boolean descuento;
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate fecha1 = LocalDate.parse(fechaIni, formatter);
        LocalDate fecha2 = LocalDate.parse(fechaFin, formatter);
        
        // Calcula la diferencia en días entre las fechas
        long diferenciaEnDias = ChronoUnit.DAYS.between(fecha1, fecha2);

        // Verifica si la diferencia es mayor a 15 días
        if (Math.abs(diferenciaEnDias) > 15) {
            descuento = true;
        } else {
            descuento = false;
        }
        
        return descuento;
    }
    
    /*
        Funcion que calcula el precio con el descuento
    */
    public float aplicarDescuento (String precioSinDesc, String descuento){
        float precioConDesc;
        float aDescontar;
        float descuento_;
        float precioSinDesc_;
        
        descuento_ = Float.parseFloat(descuento);
        precioSinDesc_ = Float.parseFloat(precioSinDesc);
        
        aDescontar = precioSinDesc_ * (descuento_/100);
        precioConDesc = precioSinDesc_ - aDescontar;
        
        return precioConDesc;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Fecha_Entrada = new javax.swing.JTextField();
        ID_Parcela = new javax.swing.JTextField();
        Fecha_Salida = new javax.swing.JTextField();
        Salir = new javax.swing.JButton();
        Otro = new javax.swing.JButton();
        PrecioSin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Actividades = new javax.swing.JComboBox<>();
        Buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Parcela:");

        jLabel3.setText("Fecha entrada (XX/XX/XXXX):");

        jLabel4.setText("Fecha salida (XX/XX/XXXX):");

        jLabel5.setText("Precio a pagar (sin descuento):");

        Fecha_Entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fecha_EntradaActionPerformed(evt);
            }
        });

        ID_Parcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_ParcelaActionPerformed(evt);
            }
        });

        Fecha_Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fecha_SalidaActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Otro.setText("Otro cliente");
        Otro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtroActionPerformed(evt);
            }
        });

        PrecioSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioSinActionPerformed(evt);
            }
        });

        jLabel9.setText("Historial Cliente ultima reserva");

        jLabel10.setText("Actividades:");

        Actividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActividadesActionPerformed(evt);
            }
        });

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(Otro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Salir)
                        .addGap(110, 110, 110))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel1))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ID_Parcela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                    .addComponent(Fecha_Entrada)
                                    .addComponent(Fecha_Salida)
                                    .addComponent(PrecioSin)
                                    .addComponent(Nombre, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Buscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(Actividades, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(19, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(503, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel9)
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buscar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ID_Parcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Fecha_Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Fecha_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(PrecioSin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Actividades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salir)
                    .addComponent(Otro))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        Encargado_Menu v = new Encargado_Menu(c);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void OtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtroActionPerformed
        Fecha_Entrada.setText("");
        Fecha_Salida.setText("");
        PrecioSin.setText("");
        Nombre.setText("");
        ID_Parcela.setText("");
        
        Actividades.removeAllItems();
    }//GEN-LAST:event_OtroActionPerformed

    private void PrecioSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioSinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioSinActionPerformed

    private void Fecha_EntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fecha_EntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Fecha_EntradaActionPerformed

    private void Fecha_SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fecha_SalidaActionPerformed

    }//GEN-LAST:event_Fecha_SalidaActionPerformed

    private void ID_ParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_ParcelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_ParcelaActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        String nombre = Nombre.getText();
        Cliente c1 = c.averiguarClienteV2(nombre);
        ArrayList<Parcela> parcelas = new ArrayList<>();
        ArrayList<Actividad> actividades = new ArrayList<>();
        String parcelasReservadas = "";  //String en el que se almacean los id de las parcelas reservadas para luego mostrarlas
        
        parcelas = c1.getReservas();        //Todas las parcelas que tiene reservadas el cliente cl
        actividades = c1.getActividades();  //Todas las actividades que tiene reservadas el cliente cl
        
        for(int i = 0; i < parcelas.size(); i++){
            parcelasReservadas += parcelas.get(i).getId();
            
            if(i < parcelas.size()-1){
                parcelasReservadas += ", ";
            }
        }
        
        for(int i = 0; i < actividades.size(); i++){
            Actividades.addItem(actividades.get(i).getTipoActividad());
        }
        
        ID_Parcela.setText(parcelasReservadas);
        
        Fecha_Entrada.setText(c.getFechaEntrada(c.getIdCliente(nombre)));
        Fecha_Salida.setText(c.getFechaSalida(c.getIdCliente(nombre)));
               
        //Anyade el precio de las parcelas que el cliente tiene automaticamente
        PrecioSin.setText(String.valueOf(c.getPrecioCliente(c.getIdCliente(nombre))));
        

    }//GEN-LAST:event_BuscarActionPerformed

    private void ActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActividadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActividadesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Actividades;
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField Fecha_Entrada;
    private javax.swing.JTextField Fecha_Salida;
    private javax.swing.JTextField ID_Parcela;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton Otro;
    private javax.swing.JTextField PrecioSin;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    public void setActionListener (ActionListener ae){

    }
}
