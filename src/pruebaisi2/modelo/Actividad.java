package pruebaisi2.modelo;

public class Actividad {
    private String fecha, tipoActividad, usuario, hora;        
    private int id;                          
    
    public Actividad (String tipoActividad, String fecha, String usuario,
            int id, String hora){
        this.tipoActividad = tipoActividad;
    }
    
    public void setUsuario (String nombre_){
        usuario = nombre_;
    }
    
    public void setFecha (String fecha_){
        fecha = fecha_;
    }
    
    public void setHora (String hora_){
        hora = hora_;
    }
    
    public int getId(){
        return id;
    }
    
    public String getUsuario (){
        return usuario;
    }
       
    public String getFecha (){
        return fecha;
    }
    
    public String getHora (){
        return hora;
    }
}
