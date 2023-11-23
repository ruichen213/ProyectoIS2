package pruebaisi2.modelo;

public class Tienda {
    private String nombre;      //Nombre de la tienda
    private float superficie;   //Superficie de la tienda

    public Tienda (String nombre_, float superficie_){
        nombre = nombre_;
        superficie = superficie_;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre_) {
        nombre = nombre_;
    }
}
