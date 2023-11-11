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
    
    /*
        Esta funcion anyade al camping algunos valores (actividades, 
        clientes, parcelas, reservas, tiendas)
    */
    public void cargarDatos(){
        Actividad actividad1 = new Actividad("Piscina", "10/10/2023", "12:30");
        Actividad actividad2 = new Actividad("Fronton", "9/11/2023", "11:30");
        actividades.add(actividad1);
        actividades.add(actividad2);
        
        //Dan valor al indice de las actividades en funcion de su posicion+1 en el ArrayList
        actividad1.setId(actividades.indexOf(actividad1)+1);
        actividad2.setId(actividades.indexOf(actividad2)+1);
        
        Reserva reserva1 = new Reserva(1, "12/12/2020", "20/12/2020", true);
        Reserva reserva2 = new Reserva(2, "07/06/2012", "07/07/2012", true);
        reservas.add(reserva1);
        reservas.add(reserva2);
        
        //Dan valor al indice de las reservas en funcion de su posicion+1 en el ArrayList
        reserva1.setId(reservas.indexOf(reserva1)+1);
        reserva2.setId(reservas.indexOf(reserva2)+1);
        
        Tienda t1 = new Tienda ("Suprema",20);
        Tienda t2 = new Tienda ("Deluxe",50);
        tiendas.add(t1);
        tiendas.add(t2);
        
        Parcela parcela1 = new Parcela (1,100,true,20,true);
        Parcela parcela2 = new Parcela (2,50,true,15,false);
        Parcela parcela3 = new Parcela (3,20,true,10,true);
        parcelas.add(parcela1);
        parcelas.add(parcela2);
        parcelas.add(parcela3);
        
        Cliente cliente1 = new Cliente("Jose",actividad1,parcela1);
        Cliente cliente2 = new Cliente("Pepe",actividad2,parcela2);
        Cliente cliente3 = new Cliente("Marcos",parcela3);
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        
        //Dan valor al indice de los clientes en funcion de su posicion+1 en el ArrayList
        cliente1.setId(clientes.indexOf(cliente1)+1);
        cliente2.setId(clientes.indexOf(cliente2)+1);
        cliente3.setId(clientes.indexOf(cliente3)+1);
        
        
    }
    /*
        Para quitar
    */
    public void retirarParcela(int id_){
        
    }
    
    /*
        Para anyadir
    */
    public void anyadirActividad(Actividad a){
        actividades.add(a);
    }
    
    public void anyadirReserva(Reserva e){
        reservas.add(e);
    }

    public void anyadirParcela(Parcela e){
        parcelas.add(e);
    }
    
    /*
        Getters
    */
    public ArrayList<Reserva> getReservas(){
        return reservas;
    }
    
    public ArrayList<Parcela> getParcelas(){
        return parcelas;
    }
    
    public Parcela getParcela(int index){
        return parcelas.get(index);
    }
    
    public ArrayList<Tienda> getTiendas(){
        return tiendas;
    }
    
    public Tienda getTienda(int indice){
        return tiendas.get(indice);
    }
     
    public Parcela getLastPar()
    {
        return parcelas.get(parcelas.size()-1);     
    }

    public Reserva getLastRes()
    {
        return reservas.get(reservas.size()-1);
    }
    
    public int getNumTiendas(){
        return tiendas.size();
    }
    
    public int getLastIdParcela(){
        return parcelas.get(parcelas.size()-1).getId();
    }
    
    public int getNumParcelas(){
        return parcelas.size();
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
