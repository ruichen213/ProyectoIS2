package pruebaisi2.modelo;

import pruebaisi2.controlador.Controlador;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import pruebaisi2.vista.Cliente_ComprobarReserva;
import pruebaisi2.vista.Cliente_ConsultarActividades;
import pruebaisi2.vista.Cliente_Menu;
import pruebaisi2.vista.Cliente_RegistrarReserva;
import pruebaisi2.vista.Cliente_ReservarActividades;
import pruebaisi2.vista.Encargado_AnotarGanadores;
import pruebaisi2.vista.Encargado_CalcularParcela;
import pruebaisi2.vista.Encargado_Checkin;
import pruebaisi2.vista.Encargado_Checkout;
import pruebaisi2.vista.Encargado_CrearActividad;
import pruebaisi2.vista.Encargado_DatoTiendas;
import pruebaisi2.vista.Encargado_EditarJuego;
import pruebaisi2.vista.Encargado_HacerParejas;
import pruebaisi2.vista.Encargado_HistorialCliente;
import pruebaisi2.vista.Encargado_Menu;
import pruebaisi2.vista.Encargado_MostrarReservas;
import pruebaisi2.vista.Encargado_RegistrarEntrada;
import pruebaisi2.vista.Encargado_RegistrarSalida;
import pruebaisi2.vista.Encargado_Sancion;
import pruebaisi2.vista.Encargado_VerParcelasDisponibles;
import pruebaisi2.vista.InfoParcela;
import pruebaisi2.vista.LoginPrincipal;
import pruebaisi2.vista.Propietario_HistorialReservas;
import pruebaisi2.vista.Propietario_Menu;
import pruebaisi2.vista.Propietario_TiendasParcelas;

public class GestorCamping {    
    public static void main(String args[]) throws ClassNotFoundException{
        Camping c = new Camping();  //Es nuestro modelo
        
        Cliente_ComprobarReserva ccr = new Cliente_ComprobarReserva(c);
        Cliente_ConsultarActividades cca = new Cliente_ConsultarActividades(c);
        Cliente_Menu cm = new Cliente_Menu(c);
        Cliente_RegistrarReserva crr = new Cliente_RegistrarReserva(c);
        Cliente_ReservarActividades cra = new Cliente_ReservarActividades(c);
        
        Encargado_AnotarGanadores eag = new Encargado_AnotarGanadores(c);
        Encargado_CalcularParcela ecp = new Encargado_CalcularParcela(c);
        Encargado_Checkin eci = new Encargado_Checkin(c);
        Encargado_Checkout eco = new Encargado_Checkout(c);
        Encargado_CrearActividad eca = new Encargado_CrearActividad(c);
        Encargado_DatoTiendas edt = new Encargado_DatoTiendas(c);
        Encargado_EditarJuego eej = new Encargado_EditarJuego(c);
        Encargado_HacerParejas ehp = new Encargado_HacerParejas(c);
        Encargado_HistorialCliente ehc = new Encargado_HistorialCliente(c);
        Encargado_Menu em = new Encargado_Menu(c);
        Encargado_MostrarReservas emr = new Encargado_MostrarReservas(c);
        Encargado_RegistrarEntrada ere = new Encargado_RegistrarEntrada(c);
        Encargado_RegistrarSalida ers = new Encargado_RegistrarSalida(c);
        Encargado_Sancion es = new Encargado_Sancion(c);
        Encargado_VerParcelasDisponibles evpd = new Encargado_VerParcelasDisponibles(c);
        
        InfoParcela ip = new InfoParcela(c);
        LoginPrincipal lp = new LoginPrincipal(c);
        
        Propietario_HistorialReservas phr = new Propietario_HistorialReservas(c);
        Propietario_Menu pm = new Propietario_Menu(c);
        Propietario_TiendasParcelas ptp = new Propietario_TiendasParcelas(c);
        
        c.cargarDatos();
        
        //lp.setVisible(true);
        
        Controlador controlador = new Controlador(c,ccr,cca,cm,crr,cra,eag,ecp,
                                        eci,eco,eca,edt,eej,ehp,ehc,em,emr,ere,
                                        ers,es,evpd,ip,lp,phr,pm,ptp);
        
        lp.setVisible(true);
        
    }
}