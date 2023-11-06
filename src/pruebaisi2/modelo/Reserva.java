package pruebaisi2.modelo;

import java.util.ArrayList;

public class Reserva {
    private int id;
    private int idCliente;
    private String fechaInicio;
    private String fechaFin;
    private boolean reserva;
    public Object getIdCliente;
    
    public Reserva (int id, int iC, String fechaInicio, String fechaFin, boolean reserva){
        this.id = id;
        this.idCliente = iC;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.reserva = reserva;
    }
    static {
        
    }
           
    public int getId() {
        return id;
    }

    public void setId(int id_) {
        id = id_;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio_) {
        fechaInicio = fechaInicio_;
    }

    // Getter y Setter para fechaFin
    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin_) {
        fechaFin = fechaFin_;
    }

    public boolean isReserva() {
        return reserva;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }
    
    
}
