package pruebaisi2.modelo;

import java.util.ArrayList;

public class Parcela {
    private float superficie;   //Superficie de la parcela
    private float precio;       //Precio de la parcela
    private boolean luz;        //Si la parcela tiene o no luz
    private int id;             //Identificador de la parcela
    private boolean disponible; // Si la parcela esta disponible o no
    
    public Parcela(int id, float precio, boolean luz, float superficie, boolean disp) {
        this.superficie = superficie;
        this.precio = precio;
        this.luz = luz;
        this.id = id;
        this.disponible = disp;
    }

    /*
        Getters
    */
    public float getSuperficie() {
        return superficie;
    }

    public float getPrecio() {
        return precio;
    }

    public boolean getLuz() {
        return luz;
    }
    
    public int getId (){
        return id;
    }

    public boolean isDisponible() {
        return disponible;
    }
    
    /*
        Crear setters
    */
    
    public void reservar(){
        if (disponible)
            this.disponible = false;
    }
    
    public void liberar(){
        this.disponible = true;
    }
}
