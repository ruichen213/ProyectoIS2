package pruebaisi2.modelo;

public class Parcela {
    private float superficie;   //Superficie de la parcela
    private float precio;       //Precio de la parcela
    private float precioPorMetro = 5;   //Precio que tiene el metro cuadrado
    private boolean luz;        //Si la parcela tiene o no luz
    private int id;             //Identificador de la parcela
    private boolean disponible; // Si la parcela esta disponible o no
    private Tienda t;           //Tienda que se encuentra en la parcela (solo una)
    private int id_tienda, id_reserva;
    
    public Parcela(int id, boolean luz, float superficie, boolean disp, int id_tienda,
            int id_reserva) {
        this.superficie = superficie;
        this.id_tienda = id_tienda;
        this.precio = superficie * precioPorMetro;
        this.luz = luz;
        this.id = id;
        this.disponible = disp;
        this.id_reserva = id_reserva;
    }
    
    
    public Parcela (){
        
    }

    /*
        Getters
    */
    public void setIdTienda(int i){
        id_tienda = i;
    }
    
    public void setIdReserva(int i){
        id_reserva = i;
    }
    
    public float getSuperficie() {
        return superficie;
    }
    
    public int getIdTienda(){
        return id_tienda;
    }

    public int getIdReserva(){
        return id_reserva;
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
    
    public String getNombreTienda(){
           return t.getNombre();
    }
}
