package pruebaisi2.modelo;

import java.util.ArrayList;

public class Parcela {
    private float superficie;   //Superficie de la parcela
    private float precio;       //Precio de la parcela
    private boolean luz;        //Si la parcela tiene o no luz
    private int id;             //Identificador de la parcela
    private boolean disponible; // Si la parcela esta disponible o no
    private Tienda t;           //Tienda que se encuentra en la parcela (solo una)
    
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
        setters
    */    
    public void setSuperficie (float superficie_){
        superficie = superficie_;
    }
    
    public void setPrecio (float precio_){
        precio = precio_;
    }
    
    public void setLuz (boolean luz_){
        luz = luz_;
    }
    
    public void setId(int id_){
        id = id_;
    }
    
    public void setDisponible(boolean disponible_){
        disponible = disponible_;
    }
    
    public void setTienda (Tienda t_){
        t = t_;
    }
    
    //PUEDE SER UTIL PERO NO SE COMO USARLO
    public void reservar(){
        if (disponible)
            this.disponible = false;
    }
    
    //PUEDE SER UTIL PERO NO SE COMO USARLO
    public void liberar(){
        this.disponible = true;
    }
}
