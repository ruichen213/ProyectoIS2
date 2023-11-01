/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaisi2.modelo;

/**
 *
 * @author Oscar
 */
public class Parcela {
    private float superficie;   //Superficie de la parcela
    private float precio;       //Precio de la parcela
    private boolean luz;        //Si la parcela tiene o no luz
    private int id;
    
    public Parcela (){
        
    }
    
    public void setSuperficie(float superficie_){
        superficie = superficie_;
    }
    
    public void setPrecio(float precio_){
        precio = precio_;
    }
    
    public void setLuz (boolean luz_){
        luz = luz_;
    }
    
    public void setId (int id_){
        id = id_;
    }
    
    public float getSuperficie (){
        return superficie;
    }
    
    public float getPrecio (){
        return precio;
    }
    
    public boolean getLuz(){
        return luz;
    }
    
    public int getId (){
        return id;
    }
}
