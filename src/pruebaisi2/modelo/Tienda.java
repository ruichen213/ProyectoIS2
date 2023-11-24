package pruebaisi2.modelo;

public class Tienda {
    private int id;
    private String nombre;      //Nombre de la tienda
    private float superficie;   //Superficie de la tienda
    
    public Tienda (String nombre_, float superficie_){
        nombre = nombre_;
        superficie = superficie_;
    }
    
    public Tienda(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public float getSuperficie(){
        return superficie;
    }
    
    public void setSuperficie(float superficie){
        this.superficie = superficie;
    }

    public void setNombre(String nombre_) {
        nombre = nombre_;
    }
}
