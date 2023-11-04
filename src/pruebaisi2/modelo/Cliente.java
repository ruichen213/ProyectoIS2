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
public class Cliente {
    private int id;                                  //Identificador del cliente                         
    private ArrayList<String> actividadesReservadas; //Actividades que tiene reservadas el cliente
    private ArrayList<String> parcelasReservadas; //Parcelas que tiene reversadas o ha reservado alguna vez
    public Cliente (){
        
    }
    
    public void setId (){
    /*COMPLETAR*/
    }
    
    public void setReservadas (ArrayList<String> Reservadas){
        parcelasReservadas = Reservadas;
    }
    
    public void setActividad(String actividad){
        actividadesReservadas.add(actividad);
    }
    
    public int getId (){
        return id;
    }
    
    public ArrayList<String> getParcelas(){
        return parcelasReservadas;
    }
    
    public ArrayList<String> getActividades(){
        return actividadesReservadas;
    }
}

