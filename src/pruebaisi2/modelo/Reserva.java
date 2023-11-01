/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaisi2.modelo;

/**
 *
 * @author Oscar
 */
public class Reserva {
    private int id;
    private String fechaInicio;
    private String fechaFin;
    
    public Reserva (){
        
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
    
    
}
