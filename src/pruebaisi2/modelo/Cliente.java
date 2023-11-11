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
    private int id;                                     //Identificador del cliente                         
    private ArrayList<Actividad> actividadesReservadas; //Actividades que tiene reservadas el cliente
    private ArrayList<Parcela> parcelasReservadas;      //Parcelas que tiene reversadas o ha reservado alguna vez
    
    public Cliente (int id_){
        id = id_;
    }
    
    public Cliente (int id_, Actividad a){
        id = id_;
        actividadesReservadas.add(a);
    }
    
    public Cliente (int id_, Parcela p){
        id = id_;
        parcelasReservadas.add(p);
    }
    
    public Cliente (int id_, Actividad a, Parcela p){
        id = id_;
        actividadesReservadas.add(a);
        parcelasReservadas.add(p);
    }
    
    public void setId (){
    /*COMPLETAR*/
    }
    
    /*
    public void setReservadas (ArrayList<String> Reservadas){
        parcelasReservadas = Reservadas;
    }
*/
/*
    public void setActividad(String actividad){
        actividadesReservadas.add(actividad);
    }
*/
    
    public int getId (){
        return id;
    }
    
    /*
        Devuelve una lista con las parcelas que tiene el cliente
    */
    public ArrayList<Parcela> getParcelas(){
        return parcelasReservadas;
    }

    /*
        Devuelve una lista con las actividades que tiene el cliente
    */
    public ArrayList<Actividad> getActividades(){
        return actividadesReservadas;
    }
}

