package pruebaisi2.modelo;

import java.util.ArrayList;

public class Reserva {
    private int idReserva;                 //Identificador de la reserva
    private int idCliente;          //Identificador del cliente al que pertenece la reserva
    private String fechaInicio;     //Fecha de inicio de la reserva
    private String fechaFin;        //Fecha de fin de la reserva
    private boolean reserva;        //Si la reserva sigue activa o no
    private ArrayList<Parcela> parcelas;
    
    public Reserva (int idReserva,int idCliente, String fechaInicio, String fechaFin, boolean reserva){
        this.idCliente = idCliente;
        this.idReserva = idReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.reserva = reserva;
        this.parcelas = new ArrayList<Parcela>();
    }
    
    public Reserva(){ // hay q buscar otra forma para esto
          this.parcelas = new ArrayList<Parcela>();
    }
    
    public void addParcelas(Parcela p){
        this.parcelas.add(p);
    }
           
    /*
        Getters
    */
    public int getIdReserva() {
        return idReserva;
    }
    
    public int getIdCliente() {
        return idCliente;
    }
    
    public void setIdCliente(int id){
        idCliente = id;
    }
    
    public String getFechaInicio() {
        return fechaInicio;
    }
    
    public String getFechaFin() {
        return fechaFin;
    }
    
    public boolean isReserva() {
        return reserva;
    }
    
    /*
        Setters
    */

    public void setIdReserva(int id) {
        idReserva = id;
    }
    /*
    public void setIdCliente (int idCliente_){
        idCliente = idCliente_;
    }
*/

    public void setFechaInicio(String fechaInicio_) {
        fechaInicio = fechaInicio_;
    }

    public void setFechaFin(String fechaFin_) {
        fechaFin = fechaFin_;
    }

    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }
    
    
}
