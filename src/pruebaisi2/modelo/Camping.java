package pruebaisi2.modelo;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import static java.util.Arrays.equals;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Camping {
    private ArrayList<Actividad> actividades;
    private ArrayList<Cliente> clientes;
    private ArrayList<Parcela> parcelas;
    private ArrayList<Reserva> reservas;
    private ArrayList<Tienda> tiendas;
    private int idCliente;
    private ClienteDAO cDao;
    private ParcelaDAO pDAO;
    private ActividadDAO aDAO;
    private TiendaDAO tDAO;
    private ReservaDAO rDAO;
    
    public Camping() throws ClassNotFoundException{
        actividades = new ArrayList<Actividad>();
        clientes = new ArrayList<Cliente>();
        parcelas = new ArrayList<Parcela>();
        reservas = new ArrayList<Reserva>();
        tiendas = new ArrayList<Tienda>();
        
        cDao = new ClienteDAO();
        pDAO = new ParcelaDAO();
        aDAO = new ActividadDAO();
        tDAO = new TiendaDAO();
        rDAO = new ReservaDAO();
    }
    
    /*
        Esta funcion anyade al camping algunos valores (actividades, 
        clientes, parcelas, reservas, tiendas)
    */
    public void cargarDatos() throws ClassNotFoundException{
        clientes = new ArrayList<>();
        parcelas = new ArrayList<>();
        actividades = new ArrayList<>();
        tiendas = new ArrayList<>();
        reservas = new ArrayList<>();
        
        clientes = cDao.leerClientes();
        System.out.print("\n\nCLIENTES: " + clientes.size() + "\n\n");
        
        parcelas = pDAO.obtenerTodasParcelas();
        System.out.print("\n\nPARCELAS: " + parcelas.size() + "\n\n");

        actividades = aDAO.obtenerTodasActividades();
        System.out.print("\n\nACTIVIDADES: " + actividades.size()+ "\n\n");
        
        tiendas = tDAO.obtenerTodasTiendas();
        System.out.print("\n\nTIENDAS: " + tiendas.size() + "\n\n");
        
        reservas = rDAO.obtenerTodasReservas();
        System.out.print("\n\nRESERVAS: " + reservas.size() + "\n\n");   
        
        /*
            Bucle para asignar las correspondientes actividades a sus clientes
        */
        for (int j = 0; j < clientes.size(); j++){
            Cliente c = clientes.get(j);
            for (int i = 0; i < actividades.size(); i++){
                Actividad a = actividades.get(i);
                if(c.getId_cliente() == a.getIdCliente()){
                    if(a.getEstado().equals("Ocupada"))
                        clientes.get(j).addActividad(a);  
                }
            }
        }
        
        /*
            Bucle para asignar las correspondientes parcelas a sus reservas
        */
        for (int j = 0; j < reservas.size(); j++){ 
            Reserva r = reservas.get(j);
            for (int i = 0; i < parcelas.size(); i++){
                Parcela p = parcelas.get(i);
                if(r.getIdReserva() == p.getIdReserva()){
                    reservas.get(j).addParcelas(p);
                }
            }
        }
        
//        System.out.print("\nc.getDiaActividad(i)?\n ->" + getDiaActividad(3));
    }
    
//    public void ActualizarDatos()throws ClassNotFoundException{
//        
//        for(Cliente cliente:clientes){
//            try {
//                int id = cliente.getId_cliente();
//                cDao.actualizarCliente(cliente, id);
//            } catch (InstantiationException ex) {
//                Logger.getLogger(Camping.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IllegalAccessException ex) {
//                Logger.getLogger(Camping.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (SQLException ex) {
//                Logger.getLogger(Camping.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        
//        for(Reserva reserva:reservas){
//            try {
//                int id = reserva.getIdReserva();
//                rDAO.actualizarReserva(reserva, id);
//            } catch (InstantiationException ex) {
//                Logger.getLogger(Camping.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IllegalAccessException ex) {
//                Logger.getLogger(Camping.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (SQLException ex) {
//                Logger.getLogger(Camping.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        
//        for(Actividad actividad: actividades){
//            try {
//                int id = actividad.getIdActividad();
//                aDAO.actualizarActividad(actividad, id);
//            } catch (InstantiationException ex) {
//                Logger.getLogger(Camping.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IllegalAccessException ex) {
//                Logger.getLogger(Camping.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (SQLException ex) {
//                Logger.getLogger(Camping.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        
//        for(Parcela parcela: parcelas){
//            try {
//                int id = parcela.getId_parcela();
//                pDAO.actualizarParcela(parcela, id);
//            } catch (InstantiationException ex) {
//                Logger.getLogger(Camping.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IllegalAccessException ex) {
//                Logger.getLogger(Camping.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (SQLException ex) {
//                Logger.getLogger(Camping.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        
//        for(Tienda tienda: tiendas){
//            try {
//                int id = tienda.getId();
//                tDAO.actualizarTienda(tienda, id);
//            } catch (InstantiationException ex) {
//                Logger.getLogger(Camping.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IllegalAccessException ex) {
//                Logger.getLogger(Camping.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (SQLException ex) {
//                Logger.getLogger(Camping.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
    
    /*
        Para qusitar
    */
    
    /*
        Esta funcion actualiza los datos de la base de la tabla Parcelas...
    */
    public void actualizarDatosActividades(Actividad a, int i) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        aDAO.actualizarActividad(a, i);
    }
    
    public int getIdActividad(){
        Actividad a = actividades.get(idCliente);
        return a.getIdActividad();
    }
            
    
    public void setSancionCliente(int pos){
        Cliente c1 = clientes.get(pos);
        c1.setSancionado(true);
    }
    
    public int getNumParcelasCliente(){
        int num = 0;
        for (Reserva reserva : reservas) {
            //System.out.print("\n"+reserva.getIdCliente()+":"+idCliente+"\n");
            if (reserva.getIdCliente() == (idCliente+1)) {
                int idReserva = reserva.getIdReserva();// Asumiendo que hay un método getIdParcela en Reserva
                
                for (Parcela parcela : parcelas) {
                    if (parcela.getIdReserva() == idReserva) {
                        num++;
                        //System.out.print("NUM-----> " + num);
                    }
                }
            }
        }
        return num;
    }
    
    public String mostrarParcelaCliente(int idParcelaCliente){
        String cadena = "";
        for (Parcela parcela : parcelas) {
            if (parcela.getId_parcela() == idParcelaCliente) {
                cadena =  String.valueOf(parcela.getId_parcela());
                //cadena = parcela.getPrecio()+"$, "+parcela.getSuperficie();
                break; // Terminamos la búsqueda porque encontramos la parcela asociada a la reserva
            }
        }
        return cadena;
    }
    
    public ArrayList<Parcela> getParcelasCliente(int id){
        ArrayList<Parcela> reservasclientes = new ArrayList<Parcela>(); 
        for (Reserva reserva : reservas) {
            if (reserva.getIdCliente() == id) {
                int idReserva = reserva.getIdReserva();
                for (Parcela parcela : parcelas) {
                    if (parcela.getIdReserva() == idReserva) {
                        reservasclientes.add(parcela);
                    }
                }
                
            }
        }
        return reservasclientes;
    }
    
    public ArrayList<Reserva> getReservasCliente(int id){
        ArrayList<Reserva> reservasclientes = new ArrayList<Reserva>(); 
        for (Reserva reserva : reservas) {
            if (reserva.getIdCliente() == id) {
                        reservasclientes.add(reserva); 
            }
        }
        return reservasclientes;
    }
    
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
    
    public ArrayList<Cliente> getClientes(){
        return clientes;
    }
    
    public String getClienteContrasenya(int i){
        Cliente c1 = clientes.get(i);
        return c1.getContrasenya(); 
    }
    
    public int averiguamosCliente(String u, String p){
        int pos = -9999;
        
        for (int i = 0; i < clientes.size(); i++){
            if (u.equals(getClienteUsuario(i)) && p.equals(getClienteContrasenya(i))){
                pos = i;
            }
        }
        
        return pos;
    }
    
    public Cliente averiguarClienteV2(String nombre){
        int pos = 0;
        for (int i = 0; i < clientes.size(); i++){
            if (nombre.equals(getClienteUsuario(i))){
               pos = i;
            }
        }
        return clientes.get(pos);
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
    
    public int getIdCliente(){
        return idCliente;
    }
    /*
        Para anyadir
    */
    public void anyadirActividad(Actividad a){
        actividades.add(a);
    }
    
    public String mostrarActividad(int num){
        ArrayList<String> cad = new ArrayList<>();
        Cliente c = clientes.get(idCliente);
            
            for (int i = 0; i < actividades.size(); i++){
                Actividad a = actividades.get(i);
                if(c.getId_cliente() == a.getIdCliente()){
                    if(a.getEstado().equals("Ocupada")){
                        cad.add(a.getTipoActividad() + ", " + a.getDia() + ", " + a.getHora());
                    }
                }
            }
        
        return cad.get(num);
    }
    
    public ArrayList<String> mostrarActividadPorFecha(String f){
        ArrayList<String> cad = new ArrayList<>();
        Cliente c = clientes.get(idCliente);
            
            for (int i = 0; i < actividades.size(); i++){
                Actividad a = actividades.get(i);
                if(c.getId_cliente() == a.getIdCliente()){
                    if(a.getEstado().equals("Ocupada")){
                        if (a.getFecha().equals(f)) {
                            cad.add(a.getTipoActividad() + ", " + a.getDia() + ", " + a.getHora());
                        }
                    }
                }
            }
        
        return cad;
    }
    
    public void setFechaInicioReserva(int id, String fecha){
        reservas.get(id).setFechaInicio(fecha);
    }
    
    public String mostrarActiv(int i){
        String cadena = "";
        Actividad a1 = actividades.get(i);
        
        cadena = a1.getTipoActividad();
        
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
        return parcelas;
    }
    
    public Parcela getParcela(int index){
        return parcelas.get(index);
    }
    
     public Cliente getCliente(int index){
        return clientes.get(index);
    }
     
     public Actividad getActividad(int index){
        return actividades.get(index);
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
    
    public float getSuperficieTienda(String nombreTienda){
        float superficie = 0;

        for (int i = 0; i < tiendas.size(); i++) {
            if (tiendas.get(i).getNombre().equals(nombreTienda)) {
                superficie = tiendas.get(i).getSuperficie();
                break;  // Termina el bucle una vez que se encuentra la tienda
            }else{
                JOptionPane.showMessageDialog(null, "Error: Hubo un problema al buscar la tienda.", "Nombre Invalido", JOptionPane.ERROR_MESSAGE);

            }
        }

        return superficie;
    }

    public int sizePar(){
        return parcelas.size();
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
        return parcelas.get(parcelas.size()-1).getId_parcela();
    }
    
    public int getLastIdCliente(){
        int id;
        if(clientes.isEmpty())
                id = 1;
        else
            id = clientes.size()+1;
        
        return id;
    }
    
    public void eliminarReserva(int idCliente){
        for(int i = 0; i < reservas.size();i++){
            if(reservas.get(i).getIdCliente() == idCliente)
                reservas.remove(i);
        }
    }
    
     public int getLastParCliente(){
        return clientes.get(clientes.size()-1).getPareja();
    }
    
    public int getNumParcelas(){
        return parcelas.size();
    }
    
    public int getIdCliente(String nombre){
        int id = 0;
        
        System.out.print(clientes.size() + "SIZE CLIENTES");
        
        for (int i = 0; i < clientes.size(); i++){
            if(clientes.get(i).getNombre().equalsIgnoreCase(nombre)){
                id = clientes.get(i).getId_cliente();
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
    
    public String getFechaSalida (int idCliente){
        String fechaSalida = "";
        
        for (int i = 0; i < reservas.size(); i++){
            if (reservas.get(i).getIdCliente() == idCliente){
                fechaSalida = reservas.get(i).getFechaFin();
            }
        }
        
        return fechaSalida;
    } 
    
    public int getLastId(){
        int size = actividades.size();
        if (size > 0) {
            return actividades.get(2).getIdActividad();
        } else {
            // Manejar el caso en el que la lista esté vacía
            return -1; // o algún valor predeterminado apropiado
        }
    }
    public boolean esFechaValida(String fechaTexto) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
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
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
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
            return false;
        }
    }
    
    /*
        Funcion que calcula el precio de los clientes
    */
    public int getPrecioCliente(int idCliente){
        int precioAPagar = 0;
        
        for (Reserva reserva : reservas) {
            if (reserva.getIdCliente() == idCliente) {
                int idReserva = reserva.getIdReserva(); // Asumiendo que hay un método getIdParcela en Reserva
                for (Parcela parcela : parcelas) {
                    if (parcela.getIdReserva() == idReserva) {
                        precioAPagar += parcela.getPrecio();
                    }
                }
            }
        }
        return precioAPagar;
    }

    public void updateDBParcelas(Parcela p3, int id_parcela) throws ClassNotFoundException {
        try {
            pDAO.actualizarParcela(p3, id_parcela);
        } catch (InstantiationException ex) {
            Logger.getLogger(Camping.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Camping.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Camping.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
