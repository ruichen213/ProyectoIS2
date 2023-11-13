/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaisi2.modelo;


/**
 *
 * @author msanc
 */
public class Encargado {

    private String nombre, contrasenya; 
    
    public Encargado(String nombre, String contrasenya)
    {
        this.nombre = nombre;
        this.contrasenya = contrasenya;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public String getContrasenya()
    {
        return contrasenya;
    }
    
}
