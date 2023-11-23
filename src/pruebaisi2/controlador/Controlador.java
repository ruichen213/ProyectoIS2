package pruebaisi2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import pruebaisi2.modelo.modelo;
import pruebaisi2.vista.Cliente_ConsultarActividades;
import pruebaisi2.vista.Cliente_DatosReserva;
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
import pruebaisi2.vista.Encargado_MirarTiendas;
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
    private Cliente_ConsultarActividades cca;
    private Cliente_DatosReserva cdr;
    private Cliente_Menu cm;
    private Cliente_RegistrarReserva crr;
    private Cliente_ReservarActividades cra; 
    private Encargado_VerParcelasDisponibles cd;
    private Encargado_AnotarGanadores eag;
    private Encargado_CalcularParcela ecp;
    private Encargado_Checkin ere;
    private Encargado_Checkout ers;
    private Encargado_CrearActividad eca;
    private Encargado_DatoTiendas edt;
    private Encargado_EditarJuego eej;
    private Encargado_HacerParejas hp;
    private Encargado_HistorialCliente edc;
    private Encargado_Menu em;
    private Encargado_MirarTiendas emt;
    private Encargado_MostrarReservas emr;
    private Encargado_RegistrarEntrada ere1;
    private Encargado_RegistrarSalida ers1;
    private Encargado_Sancion es1;
    private InfoParcela ip;
    private LoginPrincipal lp;
    private Propietario_Menu pm;
    private Propietario_HistorialReservas phr;
    private Propietario_TiendasParcelas ptp;
    private modelo m;
    
    
    public Controlador(Encargado_Sancion es1,Encargado_RegistrarSalida ers1, Encargado_RegistrarEntrada ere1, Encargado_AnotarGanadores eag, 
            Propietario_TiendasParcelas ptp, Propietario_Menu pm, Propietario_HistorialReservas phr, Cliente_DatosReserva cdr, 
            Encargado_VerParcelasDisponibles cd, Cliente_Menu cm, Cliente_RegistrarReserva crr, Cliente_ReservarActividades cra, 
            Encargado_CalcularParcela ecp, Encargado_CrearActividad eca, Encargado_DatoTiendas edt, 
            Encargado_HistorialCliente edc, Encargado_EditarJuego eej, Encargado_Menu em, Encargado_MirarTiendas emt, 
            Encargado_MostrarReservas emr, Encargado_Checkin ere, Encargado_Checkout ers, InfoParcela ip, LoginPrincipal lp, 
            modelo m, Cliente_ConsultarActividades cca, Encargado_HacerParejas hp){
        
        this.es1 = es1;
        this.ers1 = ers1;
        this.ere1 = ere1;
        this.eag = eag;
        this.phr = phr;
        this.pm = pm;
        this.ptp = ptp;
        this.hp = hp;
        this.cdr = cdr;
        this.cd = cd;
        this.cm = cm;
        this.crr = crr;;
        this.cra = cra;
        this.ecp = ecp;
        this.eca = eca;
        this.edt = edt;
        this.edc = edc;
        this.eej = eej;
        this.em = em;
        this.emt = emt;
        this.emr = emr;
        this.ere = ere;
        this.ers = ers;
        this.ip = ip;
        this.lp = lp;
        this.m = m;
        this.cca = cca;
        
        cdr.setActionListener(new ControladorActionListener());
        cdr.addWindowListener(new ControladorWindowListener());
        
        cd.setActionListener(new ControladorActionListener());
        cd.addWindowListener(new ControladorWindowListener());
        
        cm.setActionListener(new ControladorActionListener());
        cm.addWindowListener(new ControladorWindowListener());
        
        cca.setActionListener(new ControladorActionListener());
        cca.addWindowListener(new ControladorWindowListener());

        crr.setActionListener(new ControladorActionListener());
        crr.addWindowListener(new ControladorWindowListener());
        
        cra.setActionListener(new ControladorActionListener());
        cra.addWindowListener(new ControladorWindowListener());
        
        ecp.setActionListener(new ControladorActionListener());
        ecp.addWindowListener(new ControladorWindowListener());
        
        eca.setActionListener(new ControladorActionListener());
        eca.addWindowListener(new ControladorWindowListener());
        
        edt.setActionListener(new ControladorActionListener());
        edt.addWindowListener(new ControladorWindowListener());
        
        edc.setActionListener(new ControladorActionListener());
        edc.addWindowListener(new ControladorWindowListener());
        
        eej.setActionListener(new ControladorActionListener());
        eej.addWindowListener(new ControladorWindowListener());
        
        em.setActionListener(new ControladorActionListener());
        em.addWindowListener(new ControladorWindowListener());
        
        emt.setActionListener(new ControladorActionListener());
        emt.addWindowListener(new ControladorWindowListener());

        emr.setActionListener(new ControladorActionListener());
        emr.addWindowListener(new ControladorWindowListener());

        ere.setActionListener(new ControladorActionListener());
        ere.addWindowListener(new ControladorWindowListener());

        ers.setActionListener(new ControladorActionListener());
        ers.addWindowListener(new ControladorWindowListener());

        ip.setActionListener(new ControladorActionListener());
        ip.addWindowListener(new ControladorWindowListener());

        lp.setActionListener(new ControladorActionListener());
        lp.addWindowListener(new ControladorWindowListener());
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
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
}
