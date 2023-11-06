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
         clientes = new ArrayList<Cliente>();
         parcelas = new ArrayList<Parcela>();
         reservas = new ArrayList<Reserva>();
         tiendas = new ArrayList<Tienda>();
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
    
    public void anyadirActividad(Actividad a){
        actividades.add(a);
    }
    
    public void anyadirReserva(Reserva e){
        reservas.add(e);
    }
    
    public int getLastId(){
        int size = actividades.size();
        if (size > 0) {
            return actividades.get(2).getId();
        } else {
            // Manejar el caso en el que la lista esté vacía
            return -1; // o algún valor predeterminado apropiado
        }
    }
}
