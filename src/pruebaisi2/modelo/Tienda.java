/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaisi2.modelo;

/**
 *
 * @author Oscar
 */
public class Tienda {
    private String nombre;      //Nombre de la tienda
    private float superficie;   //Superficie de la tienda
    private int parcela;        //id de la parcela en la que está
    
    public Tienda (){
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre_) {
        nombre = nombre_;
    }

    // Getter y Setter para superficie
    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie_) {
        superficie = superficie_;
    }

    // Getter y Setter para parcela
    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela_) {
        parcela = parcela_;
    }
}
