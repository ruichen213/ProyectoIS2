/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaisi2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import pruebaisi2.modelo.modelo;
import pruebaisi2.vista.Cliente_BuscarReserva;
import pruebaisi2.vista.Cliente_ConsultarActividades;
import pruebaisi2.vista.Cliente_DatosReserva;
import pruebaisi2.vista.Cliente_VerParcelasDisponibles;
import pruebaisi2.vista.Cliente_Menu;
import pruebaisi2.vista.Cliente_RegistrarReserva;
import pruebaisi2.vista.Cliente_Reserva;
import pruebaisi2.vista.Cliente_ReservarActividades;
import pruebaisi2.vista.Cliente_SinReserva;
import pruebaisi2.vista.Empleado_HacerParejas;
import pruebaisi2.vista.Encargado_BuscarCliente;
import pruebaisi2.vista.Encargado_CalcularParcela;
import pruebaisi2.vista.Encargado_CrearActividad;
import pruebaisi2.vista.Encargado_DatoTiendas;
import pruebaisi2.vista.Encargado_DatosCliente;
import pruebaisi2.vista.Encargado_EditarJuego;
import pruebaisi2.vista.Encargado_Menu;
import pruebaisi2.vista.Encargado_MirarTiendas;
import pruebaisi2.vista.Encargado_MostrarReservas;
import pruebaisi2.vista.Encargado_RegistrarEntrada;
import pruebaisi2.vista.Encargado_RegistrarSalida;
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
    private Cliente_BuscarReserva cbr;
    private Cliente_DatosReserva cdr;
    private Cliente_VerParcelasDisponibles cd;
    private Cliente_Menu cm;
    private Cliente_RegistrarReserva crr;
    private Cliente_Reserva cr;
    private Cliente_ReservarActividades cra;
    private Cliente_SinReserva csr;
    private Encargado_BuscarCliente ebc;
    private Encargado_CalcularParcela ecp;
    private Encargado_CrearActividad eca;
    private Encargado_DatoTiendas edt;
    private Encargado_DatosCliente edc;
    private Encargado_EditarJuego eej;
    private Encargado_Menu em;
    private Encargado_MirarTiendas emt;
    private Encargado_MostrarReservas emr;
    private Encargado_RegistrarEntrada ere;
    private Encargado_RegistrarSalida ers;
    private InfoParcela ip;
    private LoginPrincipal lp;
    private modelo m;
    private Cliente_ConsultarActividades cca;
    private Empleado_HacerParejas hp;
    private Propietario_Menu pm;
    private Propietario_HistorialReservas phr;
    private Propietario_TiendasParcelas ptp;
    
    
    public Controlador(Propietario_TiendasParcelas ptp, Propietario_Menu pm, Propietario_HistorialReservas phr, Cliente_BuscarReserva cbr, Cliente_DatosReserva cdr, Cliente_VerParcelasDisponibles cd, Cliente_Menu cm, 
            Cliente_RegistrarReserva crr, Cliente_Reserva cr, Cliente_ReservarActividades cra, Cliente_SinReserva csr, Encargado_BuscarCliente ebc, 
            Encargado_CalcularParcela ecp, Encargado_CrearActividad eca, Encargado_DatoTiendas edt, Encargado_DatosCliente edc, 
            Encargado_EditarJuego eej, Encargado_Menu em, Encargado_MirarTiendas emt, Encargado_MostrarReservas emr, Encargado_RegistrarEntrada ere, Encargado_RegistrarSalida ers,
            InfoParcela ip, LoginPrincipal lp, modelo m, Cliente_ConsultarActividades cca, Empleado_HacerParejas hp){
        this.cbr = cbr;
        this.phr = phr;
        this.pm = pm;
        this.ptp = ptp;
        this.hp = hp;
        this.cdr = cdr;
        this.cd = cd;
        this.cm = cm;
        this.crr = crr;
        this.cr = cr;
        this.cra = cra;
        this.csr = csr;
        this.ebc = ebc;
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
        
        cbr.setActionListener(new ControladorActionListener());
        cbr.addWindowListener(new ControladorWindowListener());
        
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

        cr.setActionListener(new ControladorActionListener());
        cr.addWindowListener(new ControladorWindowListener());
        
        cra.setActionListener(new ControladorActionListener());
        cra.addWindowListener(new ControladorWindowListener());
        
        csr.setActionListener(new ControladorActionListener());
        csr.addWindowListener(new ControladorWindowListener());
        
        ebc.setActionListener(new ControladorActionListener());
        ebc.addWindowListener(new ControladorWindowListener());
        
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
