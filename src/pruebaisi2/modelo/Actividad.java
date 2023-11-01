/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaisi2.modelo;

import java.util.ArrayList;

/**
 *
 * @author Oscar
 */
public class Actividad {
    private String nombre;                      //Nombre de la actividad
    private ArrayList<Integer> participantes;   //Vector con los id de los clientes que participan
    private String fecha;                       //Fecha de la actividad
    private int hora;                           //Hora de la actividad
    
    public Actividad (){
        
    }
    
    public void setNombre (String nombre_){
        nombre = nombre_;
    }
    
    public void setFecha (String fecha_){
        fecha = fecha_;
    }
    
    public void setParticipantes(int participante_){
        participantes.add(participante_);
    }
    
    public void setHora (int hora_){
        hora = hora_;
    }
    
    public String getNombre (){
        return nombre;
    }
    
    public ArrayList<Integer> getParticipantes(){
        return participantes;
    }
    
    public String getFecha (){
        return fecha;
    }
    
    public int getHora (){
        return hora;
    }
}
