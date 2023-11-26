package pruebaisi2.modelo;

import java.util.ArrayList;

public class Reserva {
    private int id;                 //Identificador de la reserva
    private int idCliente;          //Identificador del cliente al que pertenece la reserva
    private String fechaInicio;     //Fecha de inicio de la reserva
    private String fechaFin;        //Fecha de fin de la reserva
    private boolean reserva;        //Si la reserva sigue activa o no
    private ArrayList<Parcela> parcelas;
    
    public Reserva (int id_,int idCliente_, String fechaInicio, String fechaFin, boolean reserva){
        idCliente = idCliente_;
        id = id_;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.reserva = reserva;
        parcelas = new ArrayList<Parcela>();
    }
    
    public Reserva(){ // hay q buscar otra forma para esto
    }
    
//    public ArrayList<Parcela> getReservaCliente(int id){
//        
//         return parcelas;
//    }
           
    /*
        Getters
    */
    public int getId() {
        return id;
    }
    
    public int getIdCliente() {
        return idCliente;
    }
    
    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
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

    public void setId(int id_) {
        id = id_;
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
