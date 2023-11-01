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
    private int nParcelas;                           //Cantidad de parcelas que tiene reservadas
    private ArrayList<String> actividadesReservadas; //Actividades que tiene reservadas el cliente
    
    public Cliente (){
        
    }
    
    public void setId (){
    /*COMPLETAR*/
    }
    
    public void setCantidadParcelas (int Parcelas){
        nParcelas = Parcelas;
    }
    
    public void setActividad(String actividad){
        actividadesReservadas.add(actividad);
    }
    
    public int getId (){
        return id;
    }
    
    public int getParcelas(){
        return nParcelas;
    }
    
    public ArrayList<String> getActividades(){
        return actividadesReservadas;
    }
}

