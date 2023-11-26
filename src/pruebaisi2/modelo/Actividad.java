package pruebaisi2.modelo;

public class Actividad {
    private String fecha;
    private String tipoActividad;
    private String usuario;
    private String hora;
    private String estado;
    private int idActividad, idCliente;  
    private int ganador;    //Id del cliente ganador de la actividad
    
    public Actividad (int idActividad, int idCliente, String tipoActividad, String fecha, String hora, 
            String estado){
        this.idActividad = idActividad;
        this.idCliente = idCliente;
        this.tipoActividad = tipoActividad;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }
    
    /*
        Setters
    */
    public int getIdActividad(){
        return idActividad;
    }
    
    public int getIdCliente(){
        return idCliente;
    }
    
    public void setFecha (String fecha_){
        fecha = fecha_;
    }
    
    public void setOcupada(){
        estado = "ocupada";
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public String getTipoActividad(){
        return tipoActividad;
    } 
    
    public String getDia(){
        return fecha;
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
    
//    public void setId (int id_){
//        id = id_;
//    }
    
    public void setGanador (int idGanador){
        ganador = idGanador;
    }
       
    /*
        Getters
    */
    public String getFecha (){
        return hora;
    }
    
    public String getUsuario (){
        return usuario;
    }
    
    public String getHora (){
        return hora;
    }
    
//    public int getId(){
//        return id;
//    }
    
    public int getGanador(){
        return ganador;
    }
}
