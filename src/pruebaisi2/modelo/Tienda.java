package pruebaisi2.modelo;

/**
 *
 * @author Oscar
 */
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

    // Getter y Setter para superficie
    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie_) {
        superficie = superficie_;
    }
}
