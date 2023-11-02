package pruebaisi2.modelo;

import java.util.*;

/**
 *
 * @author cuent
 */
public class Camping {
    private ArrayList<Actividad> actividades;
    private ArrayList<Cliente> clientes;
    private ArrayList<Parcela> parcelas;
    private ArrayList<Reserva> reservas;
    private ArrayList<Tienda> tiendas;
    
    
    public Camping(){
         actividades = new ArrayList<Actividad>();
    }
    
    public void cargarDatos(){
        Actividad actividad1 = new Actividad("Piscina", "10/10/2023", "Ramon",
        1, "12:30");
        Actividad actividad2 = new Actividad("Fronton", "9/11/2023", "Juan",
        2, "11:30");
        Actividad actividad3 = new Actividad("Club social","8/10/2023", "Marta",
        3, "10:30");
        actividades.add(actividad1);
        actividades.add(actividad2);
        actividades.add(actividad3);
    }
}
