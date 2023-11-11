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
        actividades.add(actividad1);
        actividades.add(actividad2);
        
        Reserva reserva1 = new Reserva(1, 1, "12/12/2020", "20/12/2020", true);
        Reserva reserva2 = new Reserva(2, 2, "07/06/2012", "07/07/2012", true);
        reservas.add(reserva1);
        reservas.add(reserva2);
        
        Parcela parcela1 = new Parcela (1,100,true,20,true);
        Parcela parcela2 = new Parcela (2,50,true,15,true);
        Parcela parcela3 = new Parcela (3,20,true,10,true);
        
        Cliente cliente1 = new Cliente(1,actividad1,parcela1);
        Cliente cliente2 = new Cliente(2,actividad2,parcela2);
        Cliente cliente3 = new Cliente(3,parcela3);
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        
        
    }
    
    public void anyadirActividad(Actividad a){
        actividades.add(a);
    }
    
    public void anyadirReserva(Reserva e){
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
