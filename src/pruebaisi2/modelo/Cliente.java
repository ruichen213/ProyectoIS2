package pruebaisi2.modelo;

import java.util.ArrayList;

public class Cliente {
    private String nombre, contrasenya;      //Nombre del cliente (para poder buscarlo a la hora de hacer el checkout)              
    private int id_cliente, pareja;                                  //Identificador del cliente                         
    private ArrayList<Actividad> actividades; //Actividades que tiene reservadas el cliente
    private boolean asistido = false;               //lo voy a borrar en el siguiente sprint NO SIRVE PARA NADA
    private boolean sancionado = false;

    
    
    public Cliente (int id, String nombre_, String contrasenya, int pareja, boolean sancionado){
        this.pareja = pareja;
        this.nombre = nombre_;
        this.contrasenya = contrasenya;
        this.id_cliente = id;
        this.sancionado = sancionado;
        this.actividades = new ArrayList<Actividad>();
    }
    
    public Cliente (){
        this.actividades = new ArrayList<Actividad>();
    }
    
    public boolean isSancionado() {
        return sancionado;
    }

    public void setSancionado(boolean sancionado) {
        this.sancionado = sancionado;
    }
    
    public int getIdActividad(String[] partes){
        int k = 0;
        
        for (int i = 0; i < actividades.size(); i++){
            Actividad a1 = actividades.get(i);
            String dia = a1.getDia();
            String hora = a1.getHora();
            String tipoActividad = a1.getTipoActividad();
            
            if (dia.equalsIgnoreCase(partes[1])) {
//                System.out.println("Hora: |" + hora + "|");
//                System.out.println("Hora de la actividad: |" + c.getFechaActividad(i) + "|");
                if (hora.equalsIgnoreCase(partes[2])) {
//                    System.out.println("Tipo de actividad: |" + tipoActividad + "|");
//                    System.out.println("Tipo de actividad de la actividad: |" + c.getTipoActividad(i) + "|");
                    if (tipoActividad.equalsIgnoreCase(partes[0])) {
                            k = i;
                    }
                }
            }
        }
        
        return k;
    }
    
    public ArrayList<Actividad> getActividades(){
        return actividades;
    }
    
    public void setPareja(int i)
    {
        pareja = i;
    }
    
    public int getPareja()
    {
        return pareja;
    }
    public int getNumActividades(){
        return actividades.size();
    }
    
    public void setId_cliente (int id_){
        id_cliente = id_;
    }
    
    public String getUsuario(){
        return nombre;
    }
    
    public String getContrasenya(){
        return contrasenya;
    }
    
    public void setContrasenya(String contrasenya){
        this.contrasenya = contrasenya;
    }
    
    public void addActividad(Actividad a){
        actividades.add(a);
    }
    
    public boolean getActividadBool()
    {
        return asistido;
    }
    public void setActividadBool(boolean b)
    {
        asistido = b;
    }
    /*
        Getters
    */
    public int getId_cliente (){
        return id_cliente;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public boolean isAsistido() {
        return asistido;
    }

    public void setAsistido(boolean asistido) {
        this.asistido = asistido;
    }

    /*
        Devuelve una lista con las actividades que tiene el cliente
    */
    public Actividad getActividades(int i){
        return actividades.get(i);
    }
    
    public int ActividadSize()
    {
        return actividades.size();
    }
    
    //Quita una actividad de la lista de actividades
    public void quitarActividad(Actividad a){
        actividades.remove(a);
    }
}

