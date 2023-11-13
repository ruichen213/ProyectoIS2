package pruebaisi2.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Camping {
    private ArrayList<Actividad> actividades;
    private ArrayList<Cliente> clientes;
    private ArrayList<Parcela> parcelas;
    private ArrayList<Reserva> reservas;
    private ArrayList<Tienda> tiendas;
    private ArrayList<Encargado> encargados;
    private int idCliente, idEmpleado;
    
    public Camping(){
        actividades = new ArrayList<Actividad>();
        clientes = new ArrayList<Cliente>();
        parcelas = new ArrayList<Parcela>();
        reservas = new ArrayList<Reserva>();
        tiendas = new ArrayList<Tienda>();
        encargados = new ArrayList<Encargado>();
    }
    
    /*
        Esta funcion anyade al camping algunos valores (actividades, 
        clientes, parcelas, reservas, tiendas)
    */
    public void cargarDatos(){
        Actividad actividad1 = new Actividad("Piscina", "10/10/2023", "12:30", "libre");
        Actividad actividad2 = new Actividad("Fronton", "09/11/2023", "11:30", "ocupada");
        Actividad actividad3 = new Actividad("Juegos Sociales", "08/08/2023", "10:30", "libre");
        Actividad actividad4 = new Actividad("Piscina", "12/12/2023", "12:30", "libre");
        Actividad actividad5 = new Actividad("Fronton", "09/12/2023", "11:30", "ocupada");
        Actividad actividad6 = new Actividad("Juegos Sociales", "10/08/2023", "10:30", "libre");
        actividades.add(actividad1);
        actividades.add(actividad2);
        actividades.add(actividad3);
         actividades.add(actividad4);
        actividades.add(actividad5);
        actividades.add(actividad6);
        
        //Dan valor al indice de las actividades en funcion de su posicion+1 en el ArrayList
        actividad1.setId(actividades.indexOf(actividad1)+1);
        actividad2.setId(actividades.indexOf(actividad2)+1);
        
        Reserva reserva1 = new Reserva(1,1, "12/12/2020", "20/12/2020", true);
        Reserva reserva2 = new Reserva(2,2, "07/06/2012", "07/07/2012", true);
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
        Parcela parcela4 = new Parcela (4,20,true,10,true);
        Parcela parcela5 = new Parcela (5,20,true,10,true);
        parcelas.add(parcela1);
        parcelas.add(parcela2);
        parcelas.add(parcela3);
        parcelas.add(parcela4);
        parcelas.add(parcela5);
        
        Cliente cliente1 = new Cliente("Jose", "1111", true, 0);
        cliente1.addActividad(actividad1);
        cliente1.addParcela(parcela1);
        
        Cliente cliente2 = new Cliente("Pepe", "2222", true, 0);
        cliente2.addActividad(actividad1);
        cliente2.addParcela(parcela2);
        
        Cliente cliente3 = new Cliente("Marcos", "3333", false, 0);
        cliente3.addActividad(actividad3);
        cliente3.addParcela(parcela3);
        
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        
        Encargado enc = new Encargado("Mario", "69");
        encargados.add(enc);
        
        //Dan valor al indice de los clientes en funcion de su posicion+1 en el ArrayList
//        cliente1.setId(clientes.indexOf(cliente1)+1);
//        cliente2.setId(clientes.indexOf(cliente2)+1);
//        cliente3.setId(clientes.indexOf(cliente3)+1);
    }
    
    
    
    /*
        Para qusitar
    */
    
    public void setGanadorActividad(String nombreActividad, int idGanador){
        for(int i = 0; i < actividades.size();i++){
            if(actividades.get(i).getTipoActividad().equalsIgnoreCase(nombreActividad)){
                actividades.get(i).setGanador(idGanador);
            }
        }
    }
    
    public int averiguarIdActividadCliente(String[] partes){
        int k = 0;
        Cliente c1 = clientes.get(idCliente);
        k = c1.getIdActividad(partes);
        return k;
    }
    
    public void cancelarActividadCliente(int idActividad){
        Cliente c1 = clientes.get(idCliente);
        Actividad a1 = actividades.get(idActividad);
        c1.quitarActividad(a1);
    }
    
    public int getNumActividadesCliente(){
        Cliente c1 = clientes.get(idCliente);
        return c1.getNumActividades();
    }
    
    public void addActividadToCliente(int idActividad){
        Cliente c1 = clientes.get(idCliente);
        Actividad a1 = actividades.get(idActividad);
        c1.addActividad(a1);
    }
    
    public String getClienteUsuario(int i){
        Cliente c1 = clientes.get(i);
        return c1.getUsuario();
    }
    public String getEmpleadoUsuario(int i){
        Encargado c1 = encargados.get(i);
        return c1.getNombre();
    }
    
    
    public String getClienteContrasenya(int i){
        Cliente c1 = clientes.get(i);
        return c1.getContrasenya(); }
    
    public String getEmpleadoContrasenya(int i){
        Encargado c1 = encargados.get(i);
        return c1.getContrasenya(); }
    
    public int averiguamosCliente(String u, String p){
        int pos = 0;
        
        for (int i = 0; i < clientes.size(); i++){
            if (u.equals(getClienteUsuario(i)) && p.equals(getClienteContrasenya(i))){
                pos = i;
            }
        }
        
        return pos;
    }
    
     public int averiguamosEncargado(String u, String p){
        int pos = 0;
        
        for (int i = 0; i < encargados.size(); i++){
            if (u.equals(getEmpleadoUsuario(i)) && p.equals(getEmpleadoContrasenya(i))){
                pos = i;
            }
        }
        
        return pos;
    }
    
    public void retirarParcela(int id_){
        // ?
    }
    
    public int cantidadActividades(){
        return actividades.size();
    }
    
    public void setIdCliente(int i){
        this.idCliente = i;
    }
    
    public void setIdEmpleado(int i)
    {
        this.idEmpleado = i;
    }
    
    public int getIdCliente(){
        return idCliente;
    }
    /*
        Para anyadir
    */
    public void anyadirActividad(Actividad a){
        actividades.add(a);
    }
    
    public String mostrarActividad(int i){
        String cadena = "";
        Actividad a1 = actividades.get(i);
        
        cadena = a1.getTipoActividad() + ", " + a1.getDia()
                + ", " + a1.getHora();
        
        return cadena;
    }
    
    public String mostrarCliente(int i){
        String cadena;
        Cliente a1 = clientes.get(i);
        
        cadena = a1.getNombre();
        
        return cadena;
    }
    
    public String getDiaActividad(int i){
        String dia = "";
        Actividad a1 = actividades.get(i);
        
        dia = a1.getDia();
        
        return dia;
    }
    
    public void setActividadOcupada(int i){
        Actividad a1 = actividades.get(i);
        a1.setOcupada();
    }
    
    public String getFechaActividad(int i){
        String fecha = "";
        Actividad a1 = actividades.get(i);
        
        fecha = a1.getFecha();
        
        return fecha;
    }
    
     public String getTipoActividad(int i){
        String tipoActividad = "";
        Actividad a1 = actividades.get(i);
        
        tipoActividad = a1.getTipoActividad();
        
        return tipoActividad;
    }
     
    public String getEstadoActividad(int i){
        String estado = "";
        Actividad a1 = actividades.get(i);
        
        estado = a1.getEstado();
        
        return estado;
    }
    
    public void anyadirReserva(Reserva e){
        reservas.add(e);
    }

    public void anyadirParcela(Parcela e){
        parcelas.add(e);
    }
    public void anyadirCliente(Cliente c){
        clientes.add(c);
    }
    
    /*
        Getters
    */
    public ArrayList<Reserva> getReservas(){
        return reservas;
    }
    
    public ArrayList<Parcela> getParcelas(){
        Parcela parcela1 = new Parcela (1,100,true,20,true);
        Parcela parcela2 = new Parcela (2,50,true,15,false);
        Parcela parcela3 = new Parcela (3,20,true,10,true);
        Parcela parcela4 = new Parcela (4,20,true,10,true);
        Parcela parcela5 = new Parcela (5,20,true,10,true);
        parcelas.add(parcela1);
        parcelas.add(parcela2);
        parcelas.add(parcela3);
        parcelas.add(parcela4);
        parcelas.add(parcela5);
        return parcelas;
    }
    
    public Parcela getParcela(int index){
        return parcelas.get(index);
    }
    
     public Cliente getCliente(int index){
        return clientes.get(index);
    }
     
     public int sizeCl(){
        return clientes.size();
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
    
    public int getLastIdCliente(){
        return clientes.get(clientes.size()-1).getId();
    }
    
     public int getLastParCliente(){
        return clientes.get(clientes.size()-1).getPareja();
    }
    
    public int getNumParcelas(){
        return parcelas.size();
    }
    
    public int getIdCliente(String nombre){
        int id = 9999999;
        
        for (int i = 0; i < clientes.size(); i++){
            if(clientes.get(i).getNombre().equalsIgnoreCase(nombre)){
                id = clientes.get(i).getId();
            }
        }
        
        return id;
    }
    public String getFechaEntrada (int idCliente){
        String fechaEntrada = "";
        
        for (int i = 0; i < reservas.size(); i++){
            if (reservas.get(i).getIdCliente() == idCliente){
                fechaEntrada = reservas.get(i).getFechaInicio();
            }
        }
        
        return fechaEntrada;
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
    public boolean esFechaValida(String fechaTexto) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        formatoFecha.setLenient(false); // Esto hace que el parseo sea estricto

        try {
            formatoFecha.parse(fechaTexto); // Intenta parsear la fecha
            return true; // La fecha es válida
        } catch (ParseException e) {
            return false; // La fecha no es válida
        }
    }
    public boolean esHoraValida(String horaTexto) {
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
        formatoHora.setLenient(false); // Esto hace que el parseo sea estricto

        try {
            formatoHora.parse(horaTexto); // Intenta parsear la hora
            return true; // La hora es válida
        } catch (ParseException e) {
            return false; // La hora no es válida
        }
    }
    public boolean esFechaPosterior(String fechaEntradaTexto, String fechaSalidaTexto) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        formatoFecha.setLenient(false);

        try {
            Date fechaEntrada = formatoFecha.parse(fechaEntradaTexto);
            Date fechaSalida = formatoFecha.parse(fechaSalidaTexto);

            // Comprueba si fechaEntrada es posterior a fechaSalida
            if (fechaEntrada.after(fechaSalida)) {
                return true; // La fecha de entrada es posterior a la fecha de salida
            } else {
                return false; // La fecha de entrada es anterior o igual a la fecha de salida
            }
        } 
        catch (ParseException e) {
            // Manejo de error si alguna de las fechas no es válida
            e.printStackTrace();
            return false;
        }
    }
}
