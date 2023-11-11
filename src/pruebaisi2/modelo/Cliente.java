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
    private String nombre;      //Nombre del cliente (para poder buscarlo a la hora de hacer el checkout)              
    private int id;                                     //Identificador del cliente                         
    private ArrayList<Actividad> actividadesReservadas = new ArrayList<>(); //Actividades que tiene reservadas el cliente
    private ArrayList<Parcela> parcelasReservadas = new ArrayList<>();      //Parcelas que tiene reversadas o ha reservado alguna vez
    
    /*
        Constructores con distintos parametros
    */
    public Cliente (String nombre_){
        nombre = nombre_;
    }
    
    public Cliente (String nombre_, Actividad a){
        nombre = nombre_;
        actividadesReservadas.add(a);
    }
    
    public Cliente (String nombre_, Parcela p){
        nombre = nombre_;
        parcelasReservadas.add(p);
    }
    
    public Cliente (String nombre_, Actividad a, Parcela p){
        nombre = nombre_;
        actividadesReservadas.add(a);
        parcelasReservadas.add(p);
    }
    
    /*
        Setters
    */
    public void setId (int id_){
        id = id_;
    }
    
    public void addActividad(Actividad a){
        actividadesReservadas.add(a);
    }
    
    public void addParcela(Parcela p){
        parcelasReservadas.add(p);
    }
    
    /*
        Getters
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
    
    //Quita una actividad de la lista de actividades
    public void quitarActividad(Actividad a){
        actividadesReservadas.remove(a);
    }
    
    //Quita una parcela de la lista de parcelas
    public void quitarParcela(Parcela p){
        parcelasReservadas.remove(p);
    }
}

