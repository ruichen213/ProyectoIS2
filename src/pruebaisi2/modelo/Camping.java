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
