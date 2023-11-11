package pruebaisi2.modelo;

public class Actividad {
    private String fecha;
    private String tipoActividad;
    private String usuario;
    private String hora;        
    private int id;                          
    
    public Actividad (String tipoActividad, String fecha, String hora){
        this.tipoActividad = tipoActividad;
    }
    
    /*
        Setters
    */
    public void setFecha (String fecha_){
        fecha = fecha_;
    }
    
    public void setTipoActividad(String tipoActividad_){
        tipoActividad = tipoActividad_;
    }
    
    public void setUsuario (String nombre_){
        usuario = nombre_;
    }
    
    public void setHora (String hora_){
        hora = hora_;
    }
    
    public void setId (int id_){
        id = id_;
    }
       
    /*
        Getters
    */
    public String getFecha (){
        return fecha;
    }
    
    public String getTipoActividad (){
        return tipoActividad;
    }
    
    public String getUsuario (){
        return usuario;
    }
    
    public String getHora (){
        return hora;
    }
    
    public int getId(){
        return id;
    }
}
