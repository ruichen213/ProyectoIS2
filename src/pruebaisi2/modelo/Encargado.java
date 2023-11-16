package pruebaisi2.modelo;

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
