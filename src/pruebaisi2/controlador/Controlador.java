package pruebaisi2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import pruebaisi2.modelo.Camping;
import pruebaisi2.vista.Cliente_ComprobarReserva;
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
    private Cliente_DatosReserva cdr;
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
                        Cliente_DatosReserva cdr, Cliente_Menu cm, Cliente_RegistrarReserva crr, 
                        Cliente_ReservarActividades cra, Encargado_AnotarGanadores eag, Encargado_CalcularParcela ecp, 
                        Encargado_Checkin eci, Encargado_Checkout eco, Encargado_CrearActividad eca, Encargado_DatoTiendas edt, 
                        Encargado_EditarJuego eej, Encargado_HacerParejas ehp, Encargado_HistorialCliente ehc, Encargado_Menu em, 
                        Encargado_MostrarReservas emr, Encargado_RegistrarEntrada ere, Encargado_RegistrarSalida ers, 
                        Encargado_Sancion es, Encargado_VerParcelasDisponibles evpd, InfoParcela ip, LoginPrincipal lp, 
                        Propietario_HistorialReservas phr, Propietario_Menu pm, Propietario_TiendasParcelas ptp){
        
        this.c = c;
        this.ccr = ccr;
        this.cca = cca;
        this.cdr = cdr;
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
      
        cdr.setActionListener(new ControladorActionListener());
        cdr.addWindowListener(new ControladorWindowListener());
        
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
        public void actionPerformed(ActionEvent e) {
            String key = e.getActionCommand();
            switch (key) {
                case "menuExportar":
                    System.out.println("MenuActionListener: Accion '" + key + "' no implementada.");
                    break;
            }
        } 
       
    }
}
