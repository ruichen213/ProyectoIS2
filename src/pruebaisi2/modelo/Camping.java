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
        Actividad actividad1 = new Actividad("Piscina", "10/10/2023", 1, "12:30");
        Actividad actividad2 = new Actividad("Fronton", "9/11/2023", 2, "11:30");
        Actividad actividad3 = new Actividad("Club social","8/10/2023", 3, "10:30");
        actividades.add(actividad1);
        actividades.add(actividad2);
        actividades.add(actividad3);
        Reserva reserva1 = new Reserva(1, 3, "fechaFin1", "fechaFin1", true);
        Reserva reserva2 = new Reserva(2, 2, "fechaFin1", "fechaFin1", false);
        Reserva reserva3 = new Reserva(3, 1, "fechaFin1", "fechaFin1", true);

        reservas.add(reserva1);
        reservas.add(reserva2);
        reservas.add(reserva3);
    }
    
    public void anyadirActividad(Actividad a){
        actividades.add(a);
    }
    
    public void anyadirReserva(Reserva e){
        Reserva reserva1 = new Reserva(1, 3, "fechaFin1", "fechaFin1", true);
        Reserva reserva2 = new Reserva(2, 2, "fechaFin1", "fechaFin1", false);
        Reserva reserva3 = new Reserva(3, 1, "fechaFin1", "fechaFin1", true);

        reservas.add(reserva1);
        reservas.add(reserva2);
        reservas.add(reserva3);
        reservas.add(e);
    }
    public void anyadirParcela(Parcela e){
        parcelas.add(e);
    }
    
    public ArrayList<Reserva> getReserva(){
        return reservas;
    }
    
    public ArrayList<Parcela> getParcela(){
        return parcelas;
    }
     
    public Parcela getLastPar()
    {
        return parcelas.get(parcelas.size()-1);     
    }

    public Reserva getLastRes()
    {
        return reservas.get(reservas.size()-1);
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
