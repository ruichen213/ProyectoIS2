/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaisi2.modelo;

import java.util.ArrayList;

/**
 *
 * @author Oscar
 */
public class Cliente {
    private String nombre, contrasenya;      //Nombre del cliente (para poder buscarlo a la hora de hacer el checkout)              
    private int id, pareja;                                  //Identificador del cliente                         
    private ArrayList<Actividad> actividadesReservadas = new ArrayList<>(); //Actividades que tiene reservadas el cliente
    private ArrayList<Parcela> parcelasReservadas = new ArrayList<>();      //Parcelas que tiene reversadas o ha reservado alguna vez
    private boolean asistido = false;               //lo voy a borrar en el siguiente sprint NO SIRVE PARA NADA
    private boolean sancionado = false;
    
    public Cliente (int id, String nombre_, String contrasenya, boolean asistido, 
            int pareja, boolean sancionado){
        this.sancionado = sancionado;
        this.pareja = pareja;
        this.nombre = nombre_;
        this.contrasenya = contrasenya;
        this.asistido = asistido;
        this.id = id;
    }
    
    /*
        Setters
    */
    public int getIdActividad(String[] partes){
        int k = 0;
        
        for (int i = 0; i < actividadesReservadas.size(); i++){
            Actividad a1 = actividadesReservadas.get(i);
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
    
    public void setSancionado(boolean s){
        sancionado = s;
    }
    
    public boolean getSancionado(){
        return sancionado;
    }
    
    public ArrayList<Parcela> getReservas(){
        return parcelasReservadas;
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
        return actividadesReservadas.size();
    }
    
    public void setId (int id_){
        id = id_;
    }
    
    public String getUsuario(){
        return nombre;
    }
    
    public String getContrasenya(){
        return contrasenya;
    }
    
    public void addActividad(Actividad a){
        actividadesReservadas.add(a);
    }
    
    public void addParcela(Parcela p){
        parcelasReservadas.add(p);
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
    public int getId (){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }

    public boolean isAsistido() {
        return asistido;
    }

    public void setAsistido(boolean asistido) {
        this.asistido = asistido;
    }
    
    /*
        Devuelve una lista con las parcelas que tiene el cliente
    */
    public Parcela getParcelas(int i){
        return parcelasReservadas.get(i);
    }

    /*
        Devuelve una lista con las actividades que tiene el cliente
    */
    public Actividad getActividades(int i){
        return actividadesReservadas.get(i);
    }
    
    public int ActividadSize()
    {
        return actividadesReservadas.size();
    }
    
    //Quita una actividad de la lista de actividades
    public void quitarActividad(Actividad a){
        actividadesReservadas.remove(a);
    }
    
    //Quita una parcela de la lista de parcelas
    public void quitarParcela(Parcela p){
        parcelasReservadas.remove(p);
    }
}

