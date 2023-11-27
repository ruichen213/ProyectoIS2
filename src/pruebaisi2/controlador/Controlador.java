package pruebaisi2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pruebaisi2.modelo.Actividad;
import pruebaisi2.modelo.Camping;
import pruebaisi2.modelo.Cliente;
import pruebaisi2.modelo.Parcela;
import pruebaisi2.modelo.Reserva;
import pruebaisi2.vista.Cliente_ComprobarReserva;
import pruebaisi2.vista.Cliente_ConsultarActividades;
import pruebaisi2.vista.Encargado_VerParcelasDisponibles;
import pruebaisi2.vista.Cliente_Menu;
import pruebaisi2.vista.Cliente_RegistrarReserva;
import pruebaisi2.vista.Cliente_ReservarActividades;
import pruebaisi2.vista.Encargado_AnotarGanadores;
import pruebaisi2.vista.Encargado_HacerParejas;
import pruebaisi2.vista.Encargado_CalcularParcela;
import pruebaisi2.vista.Encargado_CrearActividad;
import pruebaisi2.vista.Encargado_DatoTiendas;
import pruebaisi2.vista.Encargado_HistorialCliente;
import pruebaisi2.vista.Encargado_EditarJuego;
import pruebaisi2.vista.Encargado_Menu;
import pruebaisi2.vista.Encargado_MostrarReservas;
import pruebaisi2.vista.Encargado_Checkin;
import pruebaisi2.vista.Encargado_Checkout;
import pruebaisi2.vista.Encargado_RegistrarEntrada;
import pruebaisi2.vista.Encargado_RegistrarSalida;
import pruebaisi2.vista.Encargado_Sancion;
import pruebaisi2.vista.InfoParcela;
import pruebaisi2.vista.LoginPrincipal;
import pruebaisi2.vista.Propietario_HistorialReservas;
import pruebaisi2.vista.Propietario_Menu;
import pruebaisi2.vista.Propietario_TiendasParcelas;

/**
 *
 * @author cuent
 */
public class Controlador {
    private Camping c;
    private Cliente_ComprobarReserva ccr;
    private Cliente_ConsultarActividades cca;
    private Cliente_Menu cm;
    private Cliente_RegistrarReserva crr;
    private Cliente_ReservarActividades cra; 
    private Encargado_VerParcelasDisponibles evpd;
    private Encargado_AnotarGanadores eag;
    private Encargado_CalcularParcela ecp;
    private Encargado_Checkin eci;
    private Encargado_Checkout eco;
    private Encargado_CrearActividad eca;
    private Encargado_DatoTiendas edt;
    private Encargado_EditarJuego eej;
    private Encargado_HacerParejas ehp;
    private Encargado_HistorialCliente ehc;
    private Encargado_Menu em;
    private Encargado_MostrarReservas emr;
    private Encargado_RegistrarEntrada ere;
    private Encargado_RegistrarSalida ers;
    private Encargado_Sancion es;
    private InfoParcela ip;
    private LoginPrincipal lp;
    private Propietario_Menu pm;
    private Propietario_HistorialReservas phr;
    private Propietario_TiendasParcelas ptp;
    
    
    public Controlador(Camping c,Cliente_ComprobarReserva ccr, Cliente_ConsultarActividades cca, 
                        Cliente_Menu cm, Cliente_RegistrarReserva crr, 
                        Cliente_ReservarActividades cra, Encargado_AnotarGanadores eag, Encargado_CalcularParcela ecp, 
                        Encargado_Checkin eci, Encargado_Checkout eco, Encargado_CrearActividad eca, Encargado_DatoTiendas edt, 
                        Encargado_EditarJuego eej, Encargado_HacerParejas ehp, Encargado_HistorialCliente ehc, Encargado_Menu em, 
                        Encargado_MostrarReservas emr, Encargado_RegistrarEntrada ere, Encargado_RegistrarSalida ers, 
                        Encargado_Sancion es, Encargado_VerParcelasDisponibles evpd, InfoParcela ip, LoginPrincipal lp, 
                        Propietario_HistorialReservas phr, Propietario_Menu pm, Propietario_TiendasParcelas ptp){
        
        this.c = c;
        this.ccr = ccr;
        this.cca = cca;
        this.cm = cm;
        this.crr = crr;
        this.cra = cra; 
        this.evpd = evpd;
        this.eag = eag;
        this.ecp = ecp;
        this.eci = eci;
        this.eco = eco;
        this.eca = eca;
        this.edt = edt;
        this.eej = eej;
        this.ehp = ehp;
        this.ehc = ehc;
        this.em = em;
        this.emr = emr;
        this.ere = ere;
        this.ers = ers;
        this.es = es;
        this.ip = ip;
        this.lp = lp;
        this.pm = pm;
        this.phr = phr;
        this.ptp = ptp;
        
        ccr.setActionListener(new ControladorActionListener());
        ccr.addWindowListener(new ControladorWindowListener());
        
        cca.setActionListener(new ControladorActionListener());
        cca.addWindowListener(new ControladorWindowListener());

        cm.setActionListener(new ControladorActionListener());
        cm.addWindowListener(new ControladorWindowListener());
        
        crr.setActionListener(new ControladorActionListener());
        crr.addWindowListener(new ControladorWindowListener());
        
        cra.setActionListener(new ControladorActionListener());
        cra.addWindowListener(new ControladorWindowListener());
   
        eag.setActionListener(new ControladorActionListener());
        eag.addWindowListener(new ControladorWindowListener());
        
        ecp.setActionListener(new ControladorActionListener());
        ecp.addWindowListener(new ControladorWindowListener());
        
        eci.setActionListener(new ControladorActionListener());
        eci.addWindowListener(new ControladorWindowListener());
        
        eco.setActionListener(new ControladorActionListener());
        eco.addWindowListener(new ControladorWindowListener());
        
        eca.setActionListener(new ControladorActionListener());
        eca.addWindowListener(new ControladorWindowListener());
        
        edt.setActionListener(new ControladorActionListener());
        edt.addWindowListener(new ControladorWindowListener());
        
        eej.setActionListener(new ControladorActionListener());
        eej.addWindowListener(new ControladorWindowListener());
        
        ehp.setActionListener(new ControladorActionListener());
        ehp.addWindowListener(new ControladorWindowListener());
        
        ehc.setActionListener(new ControladorActionListener());
        ehc.addWindowListener(new ControladorWindowListener());
        
        em.setActionListener(new ControladorActionListener());
        em.addWindowListener(new ControladorWindowListener());
        
        emr.setActionListener(new ControladorActionListener());
        emr.addWindowListener(new ControladorWindowListener());

        ere.setActionListener(new ControladorActionListener());
        ere.addWindowListener(new ControladorWindowListener());

        ers.setActionListener(new ControladorActionListener());
        ers.addWindowListener(new ControladorWindowListener());
        
        es.setActionListener(new ControladorActionListener());
        es.addWindowListener(new ControladorWindowListener());
        
        evpd.setActionListener(new ControladorActionListener());
        evpd.addWindowListener(new ControladorWindowListener());

        ip.setActionListener(new ControladorActionListener());
        ip.addWindowListener(new ControladorWindowListener());

        lp.setActionListener(new ControladorActionListener());
        lp.addWindowListener(new ControladorWindowListener());
        
        phr.setActionListener(new ControladorActionListener());
        phr.addWindowListener(new ControladorWindowListener());
        
        pm.setActionListener(new ControladorActionListener());
        pm.addWindowListener(new ControladorWindowListener());
        
        ptp.setActionListener(new ControladorActionListener());
        ptp.addWindowListener(new ControladorWindowListener());
        
    }
    
    class ControladorWindowListener extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent we){
            System.out.println("Controlador: cerrando ventana.");
            System.exit(0);
        }
    }
    
    class ControladorActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            
            switch (command) {
                /* 
                    ENCARGADO_REGISTRARSALIDA
                */
                case "EncargadoRegistrarSalida_BotonCalcular":
                    // Código correspondiente a EncargadoRegistrarSalida_BotonCalcular
                    System.out.println("EncargadoRegistrarSalida_BotonCalcular");
                    
                    float precioFinal;                      //Precio final una vez aplicado el descuento
                    String fechaInicio, fechaFin, nombre;   //Informacioon del cliente que estamos tratando  
                    int idCliente1;                          //ID del cliente que estamos tratando
                    int nParcelas;                          //Cantidad de actividades que tiene el cliente
                    boolean descuento;                      //Si existe descuento para el cliente o no

                    fechaFin = ers.getFechaSalida();
                    nombre = ers.getNombre();

                    idCliente1 = c.getIdCliente(nombre);
                    System.out.println(idCliente1);
                    fechaInicio = c.getFechaEntrada(idCliente1);
                    descuento = ers.recibirDescuento(fechaInicio,fechaFin);

                    ers.setFechaEntrada(fechaInicio);

                    if(descuento){
                        ers.setCajaDescuentoEditable();
                        ers.setMensajeInformativo("El cliente ha estado mas de 15 dias, tiene derecho a descuento.");
                    }else{
                        ers.setMensajeInformativo("El cliente no ha estado mas de 15 dias, no tiene derecho a descuento.");
                    }

                    //Anyade el precio de las parcelas que el cliente tiene automaticamente
                    ers.setPrecioSinDescuento(String.valueOf(c.getPrecioCliente(idCliente1)));
                    
                    break;
                case "EncargadoRegistrarSalida_BotonCancelar":
                    // Código correspondiente a EncargadoRegistrarSalida_BotonCancelar
                    System.out.println("EncargadoRegistrarSalida_BotonCancelar");
                    
                    em.setVisible(true);
                    ers.setVisible(false);
                    
                    break;

                /* 
                    ENCARGADO_REGISTRARENTRADA
                */
                case "EncargadoRegistrarEntrada_BotonRegistrar":
                    // Código correspondiente a EncargadoRegistrarEntrada_BotonRegistrar
                    System.out.println("EncargadoRegistrarEntrada_BotonRegistrar");
                    
                            try { 
                                int contador = 0;   //Contador para saber las parcelas que se anyaden al jComboBox
                                int idClienteNuevo = c.getLastIdCliente() + 1;

                                if (!c.esFechaValida(ere.getFechaSalida()) || !c.esFechaValida(ere.getFechaEntrada()))
                                    JOptionPane.showMessageDialog(null, "La fecha ingresada no es valida. Por favor, ingrese una fecha en el formato dd/MM/yyyy.", "Fecha Invalida", JOptionPane.ERROR_MESSAGE);
                                else if (c.esFechaPosterior(ere.getFechaEntrada(), ere.getFechaSalida()))
                                    JOptionPane.showMessageDialog(null, "Las fechas ingresadas no son validas. Por favor, mirar que las fechas tengan sentido", "Fecha Invalida", JOptionPane.ERROR_MESSAGE);
                                else
                                {
                                    Reserva reserva = new Reserva(Integer.parseInt(ere.getParcelaSeleccionada()), idClienteNuevo, ere.getFechaEntrada(), ere.getFechaSalida(), true);
                                    Cliente cliente = new Cliente(idClienteNuevo, ere.getNombre(), "default", 0, false);

                                    System.out.println("Parcela seleccionada numero: " + Integer.valueOf(ere.getParcelaSeleccionada()));

                                    c.anyadirReserva(reserva);
                                    c.getParcela(Integer.parseInt(ere.getParcelaSeleccionada())-1).setDisponible(false);
                                    c.anyadirCliente(cliente);

                                    JOptionPane.showMessageDialog(null, "Reserva confirmada");

                                    ere.limpiarCasillas();
                                    ere.borrarListaParcelas();

                                    if (c.getNumParcelas() > 0){
                                        for(int i = 0;i < c.getNumParcelas();i++){
                                            if (c.getParcela(i).isDisponible() == true){
                                                ere.addParcela(String.valueOf(c.getParcela(i).getId_parcela()));
                                                contador ++;
                                            }
                                        }
                                    }

                                    if (contador == 0){
                                        JOptionPane.showMessageDialog(null, "Todas las parcelas estan ocupadas, disculpe las molestias");
                                    }
                                }
                            }
                            catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Por favor, ingrese bien los datos.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                    em.setVisible(true);
                    ere.setVisible(false);
                    break;
                case "EncargadoRegistrarEntrada_BotonCancelar":
                    // Código correspondiente a EncargadoRegistrarEntrada_BotonCancelar
                    System.out.println("EncargadoRegistrarEntrada_BotonCancelar");
                    
                    em.setVisible(true);
                    ere.setVisible(false);
                    
                    break;

                /*
                    ENCARGADO_MOSTRARRESERVA
                */
                case "EncargadoMostrarReserva_BotonAnyadirCliente":
                    // Código correspondiente a EncargadoMostrarReserva_BotonAnyadirCliente
                    System.out.println("EncargadoMostrarReserva_BotonAnyadirCliente");
                    break;
                case "EncargadoMostrarReserva_BotonAceptar":
                    // Código correspondiente a EncargadoMostrarReserva_BotonAceptar
                    System.out.println("EncargadoMostrarReserva_BotonAceptar");
                    break;
                case "EncargadoMostrarReserva_BotonCancelar":
                    // Código correspondiente a EncargadoMostrarReserva_BotonCancelar
                    System.out.println("EncargadoMostrarReserva_BotonCancelar");
                    break;
                case "EncargadoMostrarReserva_BotonBuscar":
                    // Código correspondiente a EncargadoMostrarReserva_BotonBuscar
                    System.out.println("EncargadoMostrarReserva_BotonBuscar");
                    break;

                /*
                    ENCARGADO_MENU
                */
                case "EncargadoMenu_BotonSalir":
                    // Código correspondiente a EncargadoMenu_BotonSalir
                    System.out.println("EncargadoMenu_BotonSalir");
                    
                    em.setVisible(false);
                    lp.setVisible(true);
                    
                    break;
                case "EncargadoMenu_BotonRegistrarEntrada":
                    // Código correspondiente a EncargadoMenu_BotonRegistrarEntrada
                    System.out.println("EncargadoMenu_BotonRegistrarEntrada");
                    
                    em.setVisible(false);
                    ere.setVisible(true);
                    
                    break;

                case "EncargadoMenu_BotonRegistrarSalida":
                    // Código correspondiente a EncargadoMenu_BotonRegistrarSalida
                    System.out.println("EncargadoMenu_BotonRegistrarSalida");
                    
                    em.setVisible(false);
                    ers.setVisible(true);
                    
                    break;

                case "EncargadoMenu_BotonCheckin":
                    // Código correspondiente a EncargadoMenu_BotonCheckin
                    System.out.println("EncargadoMenu_BotonCheckin");
                    
                    em.setVisible(false);
                    eci.setVisible(true);
                    
                    break;

                case "EncargadoMenu_BotonCheckout":
                    // Código correspondiente a EncargadoMenu_BotonRegistrarCheckout
                    System.out.println("EncargadoMenu_BotonRegistrarCheckout");
                    
                    em.setVisible(false);
                    eco.setVisible(true);
                    
                    break;

                case "EncargadoMenu_BotonHistorialCliente":
                    // Código correspondiente a EncargadoMenu_BotonHistorialCliente
                    System.out.println("EncargadoMenu_BotonHistorialCliente");
                    
                    em.setVisible(false);
                    ehc.setVisible(true);
                    
                    break;

                case "EncargadoMenu_BotonDatosTienda":
                    // Código correspondiente a EncargadoMenu_BotonDatosTienda
                    System.out.println("EncargadoMenu_BotonDatosTienda");
                    
                    em.setVisible(false);
                    edt.setVisible(true);
                    
                    break;

                case "EncargadoMenu_BotonCrearActividades":
                    // Código correspondiente a EncargadoMenu_BotonCrearActividades
                    System.out.println("EncargadoMenu_BotonCrearActividades");
                    
                    em.setVisible(false);
                    eca.setVisible(true);
                    
                    break;

                case "EncargadoMenu_BotonAnotarGanadores":
                    // Código correspondiente a EncargadoMenu_BotonAnotarGanadores
                    System.out.println("EncargadoMenu_BotonAnotarGanadores");
                    
                    em.setVisible(false);
                    eag.setVisible(true);
                    
                    break;

                case "EncargadoMenu_BotonComprobarDisponibilidad":
                    // Código correspondiente a EncargadoMenu_BotonComprobarDisponibilidad
                    System.out.println("EncargadoMenu_BotonComprobarDisponibilidad");
                    
                    em.setVisible(false);
                    evpd.setVisible(true);
                    
                    break;

                case "EncargadoMenu_BotonComprobarAsistencia":
                    // Código correspondiente a EncargadoMenu_BotonComprobarAsistencia
                    System.out.println("EncargadoMenu_BotonComprobarAsistencia");
                    
                    em.setVisible(false);
                    eca.setVisible(true);
                    
                    break;

                case "EncargadoMenu_BotonSancionar":
                    // Código correspondiente a EncargadoMenu_BotonSancionar
                    System.out.println("EncargadoMenu_BotonSancionar");
                    
                    em.setVisible(false);
                    es.setVisible(true);
                    
                    break;

                /*
                    ENCARGADO_HISTORIALCLIENTE
                */
                case "EncargadoHistorialCliente_BotonBuscar":
                    // Código correspondiente a EncargadoHistorialCliente_BotonBuscar
                    System.out.println("EncargadoHistorialCliente_BotonBuscar");
                    
                    Cliente c1 = c.averiguarClienteV2(ehc.getNombre());
                    ArrayList<Parcela> parcelas = new ArrayList<>();
                    ArrayList<Actividad> actividades = new ArrayList<>();
                    String parcelasReservadas = "";                                 //String en el que se almacean los id de las parcelas reservadas para luego mostrarlas

                    parcelas = c.getReservasCliente(c1.getId_cliente());         //Todas las parcelas que tiene reservadas el cliente cl
                    actividades = c1.getActividades();                              //Todas las actividades que tiene reservadas el cliente cl

                    for(int i = 0; i < parcelas.size(); i++){
                        parcelasReservadas += parcelas.get(i).getId_parcela();

                        if(i < parcelas.size()-1){
                            parcelasReservadas += ", ";
                        }
                    }

                    for(int i = 0; i < actividades.size(); i++){
                        ehc.addActividades(actividades.get(i).getTipoActividad());
                    }

                    ehc.setIdParcela(parcelasReservadas);

                    ehc.setFechaEntrada(c.getFechaEntrada(c.getIdCliente(ehc.getNombre())));
                    ehc.setFechaSalida(c.getFechaSalida(c.getIdCliente(ehc.getNombre())));

                    //Anyade el precio de las parcelas que el cliente tiene automaticamente
                    ehc.setPrecioSinDescuento(String.valueOf(c.getPrecioCliente(c.getIdCliente(ehc.getNombre()))));
                    
                    break;
                case "EncargadoHistorialCliente_BotonOtro":
                    // Código correspondiente a EncargadoHistorialCliente_BotonOtro
                    System.out.println("EncargadoHistorialCliente_BotonOtro");
                    
                    ehc.limpiarDatos();
                    
                    break;
                case "EncargadoHistorialCliente_BotonSalir":
                    // Código correspondiente a EncargadoHistorialCliente_BotonSalir
                    System.out.println("EncargadoHistorialCliente_BotonSalir");
                    
                    ehc.setVisible(false);
                    em.setVisible(true);
                    
                    break;

                /* 
                    ENCARGADO_HACERPAREJAS
                */
                case "EncargadoHacerParejas_BotonHacerParejas":
                    // Código correspondiente a EncargadoHacerParejas_BotonHacerParejas
                    System.out.println("EncargadoHacerParejas_BotonHacerParejas");
                    
                    String s = ehp.getPersona1();
                    String s2 = ehp.getPersona2();

                    for( int i = 0; i < c.sizeCl(); i++){
                        if(c.getCliente(i).getNombre()== s)
                        {
                            c.getCliente(i).setPareja(c.getLastParCliente()+1);
                        }
                        if( c.getCliente(i).getNombre() == s2)
                        {  
                            c.getCliente(i).setPareja(c.getLastParCliente()+1);
                        }
                    }
                    
                    break;
                case "EncargadoHacerParejas_BotonMostrarParejas":
                    // Código correspondiente a EncargadoHacerParejas_BotonMostrarParejas
                    System.out.println("EncargadoHacerParejas_BotonMostrarParejas");
                    
                    for(int i = 0; i < c.sizeCl(); i++)
                    {
                        if(c.getCliente(i).getPareja() > 0)
                        {
                            System.out.println( "Parejas :" + c.getCliente(i).getNombre() + " " + c.getCliente(i).getPareja());
                        }
                    }
                    
                    break;
                case "EncargadoHacerParejas_BotonCancelar":
                    // Código correspondiente a EncargadoHacerParejas_BotonCancelar
                    System.out.println("EncargadoHacerParejas_BotonCancelar");
                    
                    ehp.setVisible(false);
                    em.setVisible(true);
                    
                    break;

                /* 
                    ENCARGADO_EDITARJUEGO
                */
                case "EncargadoEditarJuego_BotonAnotarGanadores":
                    // Código correspondiente a EncargadoEditarJuego_BotonAnotarGanadores
                    System.out.println("EncargadoEditarJuego_BotonAnotarGanadores");
                    break;
                case "EncargadoEditarJuego_BotonCancelar":
                    // Código correspondiente a EncargadoEditarJuego_BotonCancelar
                    System.out.println("EncargadoEditarJuego_BotonCancelar");
                    break;
                    
                /*
                    ENCARGADO_VER_PARCELAS_DISPONIBLES
                */
                case "Encargado_VerParcelasDisponibles":
                    // Código correspondiente a EncargadoEditarJuego_BotonAnotarGanadores
                    em.setVisible(true);
                    evpd.setVisible(false);

                    System.out.println("Propietario_VerParcelasDisponibles");
                    break;

                /*
                    ENCARGADO_DATOSTIENDA
                */
                case "EncargadoDatosTienda_BotonAceptar":
                    // Código correspondiente a EncargadoDatosTienda_BotonAceptar
                    System.out.println("EncargadoDatosTienda_BotonAceptar");
                    
                    String nombreTienda = edt.getNombreTienda();
                    float superficieTienda;

                    superficieTienda = c.getSuperficieTienda(nombreTienda);
                    System.out.println(superficieTienda);

                    edt.setSuperficieTienda(String.valueOf(superficieTienda));
                    
                    break;
                case "EncargadoDatosTienda_BotonAtras":
                    // Código correspondiente a EncargadoDatosTienda_BotonAtras
                    System.out.println("EncargadoDatosTienda_BotonAtras");
                    
                    edt.setVisible(false);
                    em.setVisible(true);
                    
                    break;

                /* 
                    ENCARGADO_CREARACTIVIDAD
                */
                case "EncargadoCrearActividad_BotonCrear":
                    // Código correspondiente a EncargadoCrearActividad_BotonCrear
                    System.out.println("EncargadoCrearActividad_BotonCrear");
                    
                    try { 
                        String dia = eca.getDiaActividad();
                        String hora = eca.getHoraActividad();
                        String tipoActividad = eca.getActividadSeleccionada();
                        int idActividad = c.getIdActividad(), idCliente = c.getIdCliente();
                        if(!c.esFechaValida(dia)){
                            JOptionPane.showMessageDialog(null, "La fecha ingresada no es válida. Por favor, ingrese una fecha en el formato dd/MM/yyyy.", "Fecha Invalida", JOptionPane.ERROR_MESSAGE);
                        }
                        else if (!c.esHoraValida(hora))
                            JOptionPane.showMessageDialog(null, "La hora ingresada no es válida. Por favor, ingrese una hora en el formato HH:mm.", "Hora Invalida", JOptionPane.ERROR_MESSAGE);
                        else
                        {
                            Actividad a = new Actividad(idActividad, idCliente, tipoActividad, dia, hora, "libre");
                            c.anyadirActividad(a);
                            JOptionPane.showMessageDialog(null, "Actividad creada", "Exito", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese bien los datos.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    
                    break;
                case "EncargadoCrearActividad_BotonCancelar":
                    // Código correspondiente a EncargadoCrearActividad_BotonCancelar
                    System.out.println("EncargadoCrearActividad_BotonCancelar");
                    
                    eca.setVisible(false);
                    em.setVisible(true);
                    
                    break;

                /* 
                    ENCARGADO_CHECKOUT
                */
                case "EncargadoCheckout_BotonCalcular":
                    // Código correspondiente a EncargadoCheckout_BotonCalcular
                    System.out.println("EncargadoCheckout_BotonCalcular");
                    
                    float precioFinal2;
                    String fechaInicio2, fechaFin2, nombre2;
                    int idCliente2;
                    boolean descuento2;

                    fechaFin2 = eco.getFechaSalida();
                    nombre2 = eco.getNombre();

                    idCliente2 = c.getIdCliente(nombre2);
                    fechaInicio2 = c.getFechaEntrada(idCliente2);
                    descuento2 = eco.recibirDescuento(fechaInicio2,fechaFin2);

                    eco.setFechaEntrada(fechaInicio2);

                    if(descuento2){
                        eco.setCajaDescuentoEditable();
                        eco.setMensaje("El cliente ha estado mas de 15 dias, tiene derecho a descuento.");
                    }else{
                        eco.setMensaje("El cliente no ha estado mas de 15 dias, no tiene derecho a descuento.");
                    }
                    
                    eco.setPrecioSinDescuento(String.valueOf(c.getPrecioCliente(idCliente2)));
                    
                    break;
                case "EncargadoCheckout_BotonCancelar":
                    // Código correspondiente a EncargadoCheckout_BotonCancelar
                    System.out.println("EncargadoCheckout_BotonCancelar");
                    
                    eco.setVisible(false);
                    em.setVisible(true);
                    
                    break;

                /* 
                    ENCARGADO_CHECKIN
                */
                case "EncargadoChechin_BotonRegistrar":
                    // Código correspondiente a EncargadoChechin_BotonRegistrar
                    System.out.println("EncargadoChechin_BotonRegistrar");
                    
                    try { 
                        String nombre3 = eci.getNombre();
                        String fechaInicio3 = eci.getEntrada();
                        String fechaFin3 = eci.getSalida();
                        int contador = 0;   //Contador para saber las parcelas que se anyaden al jComboBox
                        int idClienteNuevo = c.getLastIdCliente() + 1;
                        
                        if (!c.esFechaValida(fechaFin3) || !c.esFechaValida(fechaInicio3))
                            JOptionPane.showMessageDialog(null, "La fecha ingresada no es valida. Por favor, ingrese una fecha en el formato dd/MM/yyyy.", "Fecha Invalida", JOptionPane.ERROR_MESSAGE);
                        else if (c.esFechaPosterior(fechaInicio3, fechaFin3))
                            JOptionPane.showMessageDialog(null, "Las fechas ingresadas no son validas. Por favor, mirar que las fechas tengan sentido", "Fecha Invalida", JOptionPane.ERROR_MESSAGE);
                        else
                        {
                            //Reserva reserva = new Reserva(c.getLastIdParcela()+1,fechaInicio3, fechaFin3, true);
                            Reserva reserva = new Reserva(Integer.parseInt(eci.getParcelaSeleccionada()), idClienteNuevo, fechaInicio3, fechaFin3, true);
                            Cliente cliente = new Cliente(idClienteNuevo, nombre3, "default", 0, false);
                            System.out.println("Parcela seleccionada numero: " + eci.getParcelaSeleccionada());
                            c.anyadirReserva(reserva);
                            c.getParcela(Integer.parseInt(eci.getParcelaSeleccionada())-1).setDisponible(false);
                            c.anyadirCliente(cliente);

                            JOptionPane.showMessageDialog(null, "Reserva confirmada");

                            eci.eliminarItems();
                            if (c.getNumParcelas() > 0){
                                for(int i = 0;i < c.getNumParcelas();i++){
                                    if (c.getParcela(i).isDisponible() == true){
                                        eci.addParcela(String.valueOf(c.getParcela(i).getId_parcela()));
                                        contador ++;
                                    }
                                }
                            }
                            if (contador == 0){
                                JOptionPane.showMessageDialog(null, "Todas las parcelas estan ocupadas, disculpe las molestias");
                            }
                        }
                    }
                    catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese bien los datos.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    
                    break;
                case "EncargadoChechin_BotonCancelar":
                    // Código correspondiente a EncargadoChechin_BotonCancelar
                    System.out.println("EncargadoChechin_BotonCancelar");
                    
                    eci.setVisible(false);
                    em.setVisible(true);
                    
                    break;

                /*
                    ENCARGADO_CALCULARPARCELA
                */
                case "EncargadoCalcularParcela_BotonAceptar":
                    // Código correspondiente a EncargadoCalcularParcela_BotonAceptar
                    System.out.println("EncargadoCalcularParcela_BotonAceptar");
                    
                    try {    
                        String fechainicio = ecp.getFechaEntrada();
                        String fechafin = ecp.getFechaSalida();

                        if(!c.esFechaValida(fechainicio) || !c.esFechaValida(fechafin))
                            JOptionPane.showMessageDialog(null, "La fecha ingresada no es válida. Por favor, ingrese una fecha en el formato dd/MM/yyyy.", "Fecha Inválida", JOptionPane.ERROR_MESSAGE);  
                        else if(c.esFechaPosterior(fechainicio, fechafin))
                            JOptionPane.showMessageDialog(null, "La fecha de entrada no puede ser posterior a la fecha de salida.", "Error de Fechas", JOptionPane.ERROR_MESSAGE);
                        else {
                            // Poner aqui todas las acciones
                        }  
                    }
                    catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese bien los datos.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    
                    break;
                case "EncargadoCalcularParcela_BotonCancelar":
                    // Código correspondiente a EncargadoCalcularParcela_BotonCancelar
                    System.out.println("EncargadoCalcularParcela_BotonCancelar");
                    
                    ecp.setVisible(false);
                    em.setVisible(true);
                    
                    break;

                /* 
                    ENCARGADO_ANOTARGANADORES
                */
                case "EncargadoAnotarGanadores_BotonAceptar":
                    // Código correspondiente a EncargadoAnotarGanadores_BotonAceptar
                    System.out.println("EncargadoAnotarGanadores_BotonAceptar");
                    
                    String nombreActividad;
                    String nombreGanador;
                    int idGanador;

                    if (!(eag.getNombreActividad() == null) || !(eag.getNombreGanador() == null)){
                        nombreActividad = eag.getNombreActividad();
                        nombreGanador = eag.getNombreGanador();
                        idGanador = c.getIdCliente(nombreGanador);
                        c.setGanadorActividad(nombreActividad, idGanador);
                        JOptionPane.showMessageDialog(null, "Confirmado, el cliente " + idGanador + " ha ganado la actividad " + nombreActividad);
                    }else{
                        JOptionPane.showMessageDialog(null, "Algun campo esta vacio");
                    }
                    
                    break;
                case "EncargadoAnotarGanadores_BotonCancelar":
                    // Código correspondiente a EncargadoAnotarGanadores_BotonCancelar
                    System.out.println("EncargadoAnotarGanadores_BotonCancelar");
                    
                    eag.setVisible(false);
                    em.setVisible(true);
                    
                    break;

                /* 
                    CLIENTE_RESERVARACTIVIDADES
                */
                case "ClienteReservarActividades_BotonBuscar":
                    // Código correspondiente a ClienteReservarActividades_BotonBuscar
                    cra.setdia(cra.DiaGetText());
                    cra.setTipoActividad(cra.ActividadGetItem());
                    cra.setEstado("libre");

                    for (int i = 0; i < c.cantidadActividades(); i++) {
                        if(!c.esFechaValida(cra.getdia())) 
                            JOptionPane.showMessageDialog(null, "La fecha ingresada no es válida. Por favor, ingrese una fecha en el formato dd/MM/yyyy.", "Fecha Invalida", JOptionPane.ERROR_MESSAGE);
                        else {
                            if (cra.getdia().equalsIgnoreCase(c.getDiaActividad(i))) {
                                if (cra.getTipoActividad().equalsIgnoreCase(c.getTipoActividad(i))) {
                                    if (cra.getEstado().equalsIgnoreCase(c.getEstadoActividad(i))){
                                        cra.addActividadDisponible(c.mostrarActividad(i));
                                        cra.setK(i);
                                    }
                                }
                            }                
                        }
                    }
                    
                    System.out.println("ClienteReservarActividades_BotonBuscar");
                    break;
                    
                case "ClienteReservarActividades_BotonCancelar":
                    // Código correspondiente a ClienteReservarActividades_BotonCancelar
                    cm.setVisible(true);
                    cra.setVisible(false);
                    System.out.println("ClienteReservarActividades_BotonCancelar");
                    break;
                    
                case "ClienteReservarActividades_BotonReservar":
                    // Código correspondiente a ClienteReservarActividades_BotonReservar
                    cra.setdia(cra.DiaGetText());
                    cra.setTipoActividad(cra.ActividadGetItem());
                    if(!c.esFechaValida(cra.getdia())) 
                        JOptionPane.showMessageDialog(null, "La fecha ingresada no es válida. Por favor, ingrese una fecha en el formato dd/MM/yyyy.", "Fecha Invalida", JOptionPane.ERROR_MESSAGE);
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Reserva realizada con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

                        c.setActividadOcupada(cra.getK());
                        c.addActividadToCliente(cra.getK());

                        cm.setVisible(true);
                        cra.setVisible(false);
                    }
                    
                    System.out.println("ClienteReservarActividades_BotonReservar");
                    break;

                /* 
                    CLIENTE_MENU
                */
                case "ClienteMenu_BotonRealizarReserva":
                    // Código correspondiente a ClienteMenu_BotonRealizarReserva
                    System.out.println("ClienteMenu_BotonRealizarReserva");
                    cm.setVisible(false);
                    crr.setVisible(true);
                    break;
                case "ClienteMenu_BotonComprobarReserva":
                    // Código correspondiente a ClienteMenu_BotonComprobarReserva
                    System.out.println("ClienteMenu_BotonComprobarReserva");
                    
                    for(int i = 0; i < c.getNumParcelasCliente(); i++){
                        ccr.setParcela(c.mostrarParcelaCliente(i));
                    }
                    
                    cm.setVisible(false);
                    ccr.setVisible(true);
                    break;
                case "ClienteMenu_BotonReservarActividad":
                    // Código correspondiente a ClienteMenu_BotonReservarActividad
                    System.out.println("ClienteMenu_BotonReservarActividad");
                    cm.setVisible(false);
                    cra.setVisible(true);
                    break;
                case "ClienteMenu_BotonConsultarActividades":
                    // Código correspondiente a ClienteMenu_BotonConsultarActividades
                    System.out.println("ClienteMenu_BotonConsultarActividades");
                    
//                    System.out.print("PRUEBA_getNumAct.. -> " + c.getNumActividadesCliente());
                    
                    for(int i = 0; i < c.getNumActividadesCliente(); i++){
                        cca.setJComboBoxData(c.mostrarActividad(i));
                    }                    
                    
                    cm.setVisible(false);
                    cca.setVisible(true);
                    break;
                    
                case "ClienteMenu_BotonSalir":
                    // Código correspondiente a ClienteMenu_BotonSalir
                    System.out.println("ClienteMenu_BotonSalir");
                    cm.setVisible(false);
                    lp.setVisible(true);
                    break;

                /* 
                    CLIENTE_REGISTRARRESERVA
                */
                    
                case "ClienteRegistrarReserva_BotonAceptar":
                    // Código correspondiente a ClienteRegistrarReserva_BotonAceptar

                        if(!c.esFechaValida(crr.getFechaEntrada()) || !c.esFechaValida(crr.getFechaSalida())) {
                            JOptionPane.showMessageDialog(null, "La fecha ingresada no es válida. Por favor, ingrese una fecha en el formato dd/MM/yyyy.", "Fecha Inválida", JOptionPane.ERROR_MESSAGE);
                        }
                        else if(c.esFechaPosterior(crr.getFechaEntrada(), crr.getFechaSalida()))
                            JOptionPane.showMessageDialog(null, "La fecha de entrada no puede ser posterior a la fecha de salida.", "Error de Fechas", JOptionPane.ERROR_MESSAGE);
                        else {
                            Reserva reserva = new Reserva(c.getLastIdParcela()+1,c.getLastIdCliente()+1,crr.getFechaEntrada(), crr.getFechaSalida(), true);
                            c.anyadirReserva(reserva); 
                            InfoParcela info = new InfoParcela(c);
                            info.setVisible(true);
                            crr.setVisible(false);
                        }
                    
                    System.out.println("ClienteRegistrarReserva_BotonAceptar");
                    break;
                    
                case "ClienteRegistrarReserva_BotonCancelar":
                    // Código correspondiente a ClienteRegistrarReserva_BotonCancelar
                    cm.setVisible(true);
                    crr.setVisible(false);
                    
                    System.out.println("ClienteRegistrarReserva_BotonCancelar");
                    break;

                /* 
                    CLIENTE_CONSULTARACTIVIDADES
                */
                case "ClienteConsultarActividades_JComboBox":
                    // Código correspondiente a ClienteMenu_BotonConsultarActividades
                    System.out.println("ClienteConsultarActividades_JComboBox");
                    cm.setVisible(false);
                    cca.setVisible(true);
                    break;
                    
                case "ClienteConsultarActividades_BotonGuardarSalir":
                    // Código correspondiente a ClienteConsultarActividades_BotonGuardarSalir
                    System.out.println("ClienteConsultarActividades_BotonGuardarSalir");
                    
                    if(cca.getAcumBotonCancelar() != 0){
                        try {
                            c.actualizarDatosActividades(cca.getActividad(), cca.getIdClienteActividad()+1);
                            c.cargarDatos();
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (InstantiationException ex) {
                            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IllegalAccessException ex) {
                            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (SQLException ex) {
                            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                    cca.borrarDatosJComboBox();
                    cca.setVisible(false);
                    cm.setVisible(true);
                    break;

                case "ClienteConsultarActividades_BotonCancelar":
                    // Código correspondiente a ClienteConsultarActividades_BotonCancelar
                    System.out.println("ClienteConsultarActividades_BotonCancelar");
                    
                    if(cca.getAcumBotonCancelar() != 0){
                        try {
                            c.cargarDatos();
                            
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                    cca.borrarDatosJComboBox();
                    cca.setVisible(false);
                    cm.setVisible(true);
                    break;
                    
                case "ClienteConsultarActividades_BotonCancelarActividad":
                    // Código correspondiente a ClienteConsultarActividades_BotonCancelarActividad
                    
                    String entrada = cca.getJComboBoxText();
                    String[] partes = entrada.split(", ");
                    int k = c.averiguarIdActividadCliente(partes);
                    c.cancelarActividadCliente(k);
                    cca.borrarItem();
                    cca.incrementarAcum();
                    
                    System.out.println("ClienteConsultarActividades_BotonCancelarActividad");
                    break;

                /*
                    CLIENTE_COMPROBARRESERVA
                */
                case "Cliente_BotonBuscar":
                    // Código correspondiente a Cliente_BotonBuscar
                    
                    // TODO add your handling code here:
                    Cliente cliente = c.getCliente(c.getIdCliente());
                    Parcela p = c.getParcela(Integer.parseInt(ccr.getSelected()));
                    String pre = "", sup = "";

                    pre += p.getPrecio();
                    sup += p.getSuperficie();

                    ccr.SupSetText(sup);
                    ccr.PreSetText(pre);
                    if (p.getLuz()){
                        ccr.LuzSetText("Si");
                    }
                    else{
                        ccr.LuzSetText("No");
                    }
                    
                    System.out.println("Cliente_BotonBuscar");
                    break;
                case "Cliente_BotonSalir":
                    // Código correspondiente a Cliente_BotonSalir
                    ccr.borrarItems();
                    cm.setVisible(true);
                    ccr.setVisible(false);
                    System.out.println("Cliente_BotonSalir");
                    break;
                    
                /* 
                    LOGIN PRINCIPAL
                */
                case "LoginPrincipal_BotonIngresar":
                                       
                    System.out.println("LoginPrincipal_BotonIngresar");
                    
                    int idCliente = c.averiguamosCliente(lp.getUsuario(), lp.getContrasenya()); //averiguamso cliente comparando en la base de datos, y devolvemos su pos en el vector.
                    c.setIdCliente(idCliente);
                    
                    int idEmpleado = c.averiguamosEncargado(lp.getUsuario(), lp.getContrasenya());
                    c.setIdEmpleado(idEmpleado);
                    
                    if(lp.getUsuario().isEmpty() || lp.getContrasenya().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Algun campo esta vacío");
                    } else if(lp.getUsuario().equals("empleado") && lp.getContrasenya().equals("easy")){
                        em.setVisible(true);
                        lp.setVisible(false);
                    } else if(lp.getUsuario().equals("Propietario") && lp.getContrasenya().equals("admin")){
                        pm.setVisible(true);
                        lp.setVisible(false);
                    } else if (idCliente >= 0){
                        cm.setVisible(true);
                        lp.setVisible(false);
                    } else { 
                        JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrectos");
                    }
                    break;
                case "LoginPrincipal_BotonSalir":
                    System.out.println("LoginPrincipal_BotonSalir");
                    System.exit(0);
                    break;
                    
                /*
                    PROPIETARIO MENU
                */    
                case"PropietarioMenu_BotonComprobarParcelas":
                    ptp.setVisible(true);
                    pm.setVisible(false);
                    break;
                case"PropietarioMenu_BotonHistorialReservas":
                    phr.setVisible(true);
                    pm.setVisible(false);
                    break;
                case"PropietarioMenu_BotonSalir":
                    lp.setVisible(true);
                    pm.setVisible(false);
                    break;
                /*
                    PROPIETARIO HISTORIAL RESERVAS
                */    
                case"PropietarioHistorialReservas_BotonSalir":
                    phr.setVisible(false);
                    pm.setVisible(true);
                    break;
                    
                /*
                    PROPIETARIO TIENDAS PARCELAS
                */    
                case"PropietarioTiendasParcelas_BotonSalir":
                    ptp.setVisible(false);
                    pm.setVisible(true);
                    break;    
                    
                default:
                    // Acción por defecto si no se encuentra ninguna coincidencia
                    System.out.println("Acción no reconocida");
                    break;
            }
        } 
    }
}
