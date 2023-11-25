package pruebaisi2.modelo;

public class Parcela {
    private float superficie;   //Superficie de la parcela
    private float precio;       //Precio de la parcela
    private float precioPorMetro = 5;   //Precio que tiene el metro cuadrado
    private boolean luz;        //Si la parcela tiene o no luz
    private int id_parcela;             //Identificador de la parcela
    private boolean disponible; // Si la parcela esta disponible o no
    private int id_tienda, id_reserva;
    
    public Parcela(int id, boolean luz, float superficie, boolean disp, int id_tienda,
            int id_reserva) {
        this.superficie = superficie;
        this.id_tienda = id_tienda;
        this.precio = superficie * precioPorMetro;
        this.luz = luz;
        this.id_parcela = id;
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
    
    public int getId_parcela (){
        return id_parcela;
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
    
    public void setId_parcela(int id_){
        id_parcela = id_;
    }
    
    public void setDisponible(boolean disponible_){
        disponible = disponible_;
    }
    
    public void setTienda ( int id_tienda){
        this.id_tienda = id_tienda;
    }
    
    public int getNombreTienda(){
           return id_tienda;
    }
}
