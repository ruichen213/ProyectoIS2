/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pruebaisi2.modelo;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author cuent
 */
public class CampingTest {
    
    public CampingTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of cargarDatos method, of class Camping.
     */
    @Test
    public void testCargarDatos() throws Exception {
        System.out.println("cargarDatos");
        Camping instance = new Camping();
        instance.cargarDatos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarDatosActividades method, of class Camping.
     */
    @Test
    public void testActualizarDatosActividades() throws Exception {
        System.out.println("actualizarDatosActividades");
        Actividad a = null;
        int i = 0;
        Camping instance = new Camping();
        instance.actualizarDatosActividades(a, i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdActividad method, of class Camping.
     */
    @Test
    public void testGetIdActividad() throws ClassNotFoundException {
        System.out.println("getIdActividad");
        Camping instance = new Camping();
        int expResult = 0;
        int result = instance.getIdActividad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSancionCliente method, of class Camping.
     */
    @Test
    public void testSetSancionCliente() throws ClassNotFoundException {
        System.out.println("setSancionCliente");
        int pos = 0;
        Camping instance = new Camping();
        instance.setSancionCliente(pos);
    }

    /**
     * Test of getNumParcelasCliente method, of class Camping.
     */
    @Test
    public void testGetNumParcelasCliente() throws ClassNotFoundException {
        System.out.println("getNumParcelasCliente");
        Camping instance = new Camping();
        int expResult = 0;
        int result = instance.getNumParcelasCliente();
        assertEquals(expResult, result);
    }

    /**
     * Test of mostrarParcelaCliente method, of class Camping.
     */
    @Test
    public void testMostrarParcelaCliente() throws ClassNotFoundException {
        System.out.println("mostrarParcelaCliente");
        int idParcelaCliente = 0;
        Camping instance = new Camping();
        String expResult = "";
        String result = instance.mostrarParcelaCliente(idParcelaCliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParcelasCliente method, of class Camping.
     */
    @Test
    public void testGetParcelasCliente() throws ClassNotFoundException {
        System.out.println("getParcelasCliente");
        int id = 0;
        Camping instance = new Camping();
        ArrayList<Parcela> expResult = null;
        ArrayList<Parcela> result = instance.getParcelasCliente(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReservasCliente method, of class Camping.
     */
    @Test
    public void testGetReservasCliente() throws ClassNotFoundException {
        System.out.println("getReservasCliente");
        int id = 0;
        Camping instance = new Camping();
        ArrayList<Reserva> expResult = null;
        ArrayList<Reserva> result = instance.getReservasCliente(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGanadorActividad method, of class Camping.
     */
    @Test
    public void testSetGanadorActividad() throws ClassNotFoundException {
        System.out.println("setGanadorActividad");
        String nombreActividad = "";
        int idGanador = 0;
        Camping instance = new Camping();
        instance.setGanadorActividad(nombreActividad, idGanador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of averiguarIdActividadCliente method, of class Camping.
     */
    @Test
    public void testAveriguarIdActividadCliente() throws ClassNotFoundException {
        System.out.println("averiguarIdActividadCliente");
        String[] partes = null;
        Camping instance = new Camping();
        int expResult = 0;
        int result = instance.averiguarIdActividadCliente(partes);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelarActividadCliente method, of class Camping.
     */
    @Test
    public void testCancelarActividadCliente() throws ClassNotFoundException {
        System.out.println("cancelarActividadCliente");
        int idActividad = 0;
        Camping instance = new Camping();
        instance.cancelarActividadCliente(idActividad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumActividadesCliente method, of class Camping.
     */
    @Test
    public void testGetNumActividadesCliente() throws ClassNotFoundException {
        System.out.println("getNumActividadesCliente");
        Camping instance = new Camping();
        int expResult = 0;
        int result = instance.getNumActividadesCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addActividadToCliente method, of class Camping.
     */
    @Test
    public void testAddActividadToCliente() throws ClassNotFoundException {
        System.out.println("addActividadToCliente");
        int idActividad = 0;
        Camping instance = new Camping();
        instance.addActividadToCliente(idActividad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClienteUsuario method, of class Camping.
     */
    @Test
    public void testGetClienteUsuario() throws ClassNotFoundException {
        System.out.println("getClienteUsuario");
        int i = 0;
        Camping instance = new Camping();
        String expResult = "";
        String result = instance.getClienteUsuario(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClientes method, of class Camping.
     */
    @Test
    public void testGetClientes() throws ClassNotFoundException {
        System.out.println("getClientes");
        Camping instance = new Camping();
        ArrayList<Cliente> expResult = null;
        ArrayList<Cliente> result = instance.getClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClienteContrasenya method, of class Camping.
     */
    @Test
    public void testGetClienteContrasenya() throws ClassNotFoundException {
        System.out.println("getClienteContrasenya");
        int i = 0;
        Camping instance = new Camping();
        String expResult = "";
        String result = instance.getClienteContrasenya(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of averiguamosCliente method, of class Camping.
     */
    @Test
    public void testAveriguamosCliente() throws ClassNotFoundException {
        System.out.println("averiguamosCliente");
        String u = "";
        String p = "";
        Camping instance = new Camping();
        int expResult = 0;
        int result = instance.averiguamosCliente(u, p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of averiguarClienteV2 method, of class Camping.
     */
    @Test
    public void testAveriguarClienteV2() throws ClassNotFoundException {
        System.out.println("averiguarClienteV2");
        String nombre = "";
        Camping instance = new Camping();
        Cliente expResult = null;
        Cliente result = instance.averiguarClienteV2(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retirarParcela method, of class Camping.
     */
    @Test
    public void testRetirarParcela() throws ClassNotFoundException {
        System.out.println("retirarParcela");
        int id_ = 0;
        Camping instance = new Camping();
        instance.retirarParcela(id_);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cantidadActividades method, of class Camping.
     */
    @Test
    public void testCantidadActividades() throws ClassNotFoundException {
        System.out.println("cantidadActividades");
        Camping instance = new Camping();
        int expResult = 0;
        int result = instance.cantidadActividades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdCliente method, of class Camping.
     */
    @Test
    public void testSetIdCliente() throws ClassNotFoundException {
        System.out.println("setIdCliente");
        int i = 0;
        Camping instance = new Camping();
        instance.setIdCliente(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdCliente method, of class Camping.
     */
    @Test
    public void testGetIdCliente_0args() throws ClassNotFoundException {
        System.out.println("getIdCliente");
        Camping instance = new Camping();
        int expResult = 0;
        int result = instance.getIdCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anyadirActividad method, of class Camping.
     */
    @Test
    public void testAnyadirActividad() throws ClassNotFoundException {
        System.out.println("anyadirActividad");
        Actividad a = null;
        Camping instance = new Camping();
        instance.anyadirActividad(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarActividad method, of class Camping.
     */
    @Test
    public void testMostrarActividad() throws ClassNotFoundException {
        System.out.println("mostrarActividad");
        int num = 0;
        Camping instance = new Camping();
        String expResult = "";
        String result = instance.mostrarActividad(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarActividadPorFecha method, of class Camping.
     */
    @Test
    public void testMostrarActividadPorFecha() throws ClassNotFoundException {
        System.out.println("mostrarActividadPorFecha");
        String f = "";
        Camping instance = new Camping();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.mostrarActividadPorFecha(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaInicioReserva method, of class Camping.
     */
    @Test
    public void testSetFechaInicioReserva() throws ClassNotFoundException {
        System.out.println("setFechaInicioReserva");
        int id = 0;
        String fecha = "";
        Camping instance = new Camping();
        instance.setFechaInicioReserva(id, fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarActiv method, of class Camping.
     */
    @Test
    public void testMostrarActiv() throws ClassNotFoundException {
        System.out.println("mostrarActiv");
        int i = 0;
        Camping instance = new Camping();
        String expResult = "";
        String result = instance.mostrarActiv(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarCliente method, of class Camping.
     */
    @Test
    public void testMostrarCliente() throws ClassNotFoundException {
        System.out.println("mostrarCliente");
        int i = 0;
        Camping instance = new Camping();
        String expResult = "";
        String result = instance.mostrarCliente(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiaActividad method, of class Camping.
     */
    @Test
    public void testGetDiaActividad() throws ClassNotFoundException {
        System.out.println("getDiaActividad");
        int i = 0;
        Camping instance = new Camping();
        String expResult = "";
        String result = instance.getDiaActividad(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActividadOcupada method, of class Camping.
     */
    @Test
    public void testSetActividadOcupada() throws ClassNotFoundException {
        System.out.println("setActividadOcupada");
        int i = 0;
        Camping instance = new Camping();
        instance.setActividadOcupada(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaActividad method, of class Camping.
     */
    @Test
    public void testGetFechaActividad() throws ClassNotFoundException {
        System.out.println("getFechaActividad");
        int i = 0;
        Camping instance = new Camping();
        String expResult = "";
        String result = instance.getFechaActividad(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoActividad method, of class Camping.
     */
    @Test
    public void testGetTipoActividad() throws ClassNotFoundException {
        System.out.println("getTipoActividad");
        int i = 0;
        Camping instance = new Camping();
        String expResult = "";
        String result = instance.getTipoActividad(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstadoActividad method, of class Camping.
     */
    @Test
    public void testGetEstadoActividad() throws ClassNotFoundException {
        System.out.println("getEstadoActividad");
        int i = 0;
        Camping instance = new Camping();
        String expResult = "";
        String result = instance.getEstadoActividad(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anyadirReserva method, of class Camping.
     */
    @Test
    public void testAnyadirReserva() throws ClassNotFoundException {
        System.out.println("anyadirReserva");
        Reserva e = null;
        Camping instance = new Camping();
        instance.anyadirReserva(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anyadirParcela method, of class Camping.
     */
    @Test
    public void testAnyadirParcela() throws ClassNotFoundException {
        System.out.println("anyadirParcela");
        Parcela e = null;
        Camping instance = new Camping();
        instance.anyadirParcela(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anyadirCliente method, of class Camping.
     */
    @Test
    public void testAnyadirCliente() throws ClassNotFoundException {
        System.out.println("anyadirCliente");
        Cliente c = null;
        Camping instance = new Camping();
        instance.anyadirCliente(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReservas method, of class Camping.
     */
    @Test
    public void testGetReservas() throws ClassNotFoundException {
        System.out.println("getReservas");
        Camping instance = new Camping();
        ArrayList<Reserva> expResult = null;
        ArrayList<Reserva> result = instance.getReservas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParcelas method, of class Camping.
     */
    @Test
    public void testGetParcelas() throws ClassNotFoundException {
        System.out.println("getParcelas");
        Camping instance = new Camping();
        ArrayList<Parcela> expResult = null;
        ArrayList<Parcela> result = instance.getParcelas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParcela method, of class Camping.
     */
    @Test
    public void testGetParcela() throws ClassNotFoundException {
        System.out.println("getParcela");
        int index = 0;
        Camping instance = new Camping();
        Parcela expResult = null;
        Parcela result = instance.getParcela(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCliente method, of class Camping.
     */
    @Test
    public void testGetCliente() throws ClassNotFoundException {
        System.out.println("getCliente");
        int index = 0;
        Camping instance = new Camping();
        Cliente expResult = null;
        Cliente result = instance.getCliente(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActividad method, of class Camping.
     */
    @Test
    public void testGetActividad() throws ClassNotFoundException {
        System.out.println("getActividad");
        int index = 0;
        Camping instance = new Camping();
        Actividad expResult = null;
        Actividad result = instance.getActividad(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sizeCl method, of class Camping.
     */
    @Test
    public void testSizeCl() throws ClassNotFoundException {
        System.out.println("sizeCl");
        Camping instance = new Camping();
        int expResult = 0;
        int result = instance.sizeCl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTiendas method, of class Camping.
     */
    @Test
    public void testGetTiendas() throws ClassNotFoundException {
        System.out.println("getTiendas");
        Camping instance = new Camping();
        ArrayList<Tienda> expResult = null;
        ArrayList<Tienda> result = instance.getTiendas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTienda method, of class Camping.
     */
    @Test
    public void testGetTienda() throws ClassNotFoundException {
        System.out.println("getTienda");
        int indice = 0;
        Camping instance = new Camping();
        Tienda expResult = null;
        Tienda result = instance.getTienda(indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuperficieTienda method, of class Camping.
     */
    @Test
    public void testGetSuperficieTienda() throws ClassNotFoundException {
        System.out.println("getSuperficieTienda");
        String nombreTienda = "";
        Camping instance = new Camping();
        float expResult = 0.0F;
        float result = instance.getSuperficieTienda(nombreTienda);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sizePar method, of class Camping.
     */
    @Test
    public void testSizePar() throws ClassNotFoundException {
        System.out.println("sizePar");
        Camping instance = new Camping();
        int expResult = 0;
        int result = instance.sizePar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastPar method, of class Camping.
     */
    @Test
    public void testGetLastPar() throws ClassNotFoundException {
        System.out.println("getLastPar");
        Camping instance = new Camping();
        Parcela expResult = null;
        Parcela result = instance.getLastPar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastRes method, of class Camping.
     */
    @Test
    public void testGetLastRes() throws ClassNotFoundException {
        System.out.println("getLastRes");
        Camping instance = new Camping();
        Reserva expResult = null;
        Reserva result = instance.getLastRes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumTiendas method, of class Camping.
     */
    @Test
    public void testGetNumTiendas() throws ClassNotFoundException {
        System.out.println("getNumTiendas");
        Camping instance = new Camping();
        int expResult = 0;
        int result = instance.getNumTiendas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastIdParcela method, of class Camping.
     */
    @Test
    public void testGetLastIdParcela() throws ClassNotFoundException {
        System.out.println("getLastIdParcela");
        Camping instance = new Camping();
        int expResult = 0;
        int result = instance.getLastIdParcela();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastIdCliente method, of class Camping.
     */
    @Test
    public void testGetLastIdCliente() throws ClassNotFoundException {
        System.out.println("getLastIdCliente");
        Camping instance = new Camping();
        int expResult = 0;
        int result = instance.getLastIdCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarReserva method, of class Camping.
     */
    @Test
    public void testEliminarReserva() throws ClassNotFoundException {
        System.out.println("eliminarReserva");
        int idCliente = 0;
        Camping instance = new Camping();
        instance.eliminarReserva(idCliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastParCliente method, of class Camping.
     */
    @Test
    public void testGetLastParCliente() throws ClassNotFoundException {
        System.out.println("getLastParCliente");
        Camping instance = new Camping();
        int expResult = 0;
        int result = instance.getLastParCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumParcelas method, of class Camping.
     */
    @Test
    public void testGetNumParcelas() throws ClassNotFoundException {
        System.out.println("getNumParcelas");
        Camping instance = new Camping();
        int expResult = 0;
        int result = instance.getNumParcelas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdCliente method, of class Camping.
     */
    @Test
    public void testGetIdCliente_String() throws ClassNotFoundException {
        System.out.println("getIdCliente");
        String nombre = "";
        Camping instance = new Camping();
        int expResult = 0;
        int result = instance.getIdCliente(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaEntrada method, of class Camping.
     */
    @Test
    public void testGetFechaEntrada() throws ClassNotFoundException {
        System.out.println("getFechaEntrada");
        int idCliente = 0;
        Camping instance = new Camping();
        String expResult = "";
        String result = instance.getFechaEntrada(idCliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaSalida method, of class Camping.
     */
    @Test
    public void testGetFechaSalida() throws ClassNotFoundException {
        System.out.println("getFechaSalida");
        int idCliente = 0;
        Camping instance = new Camping();
        String expResult = "";
        String result = instance.getFechaSalida(idCliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastId method, of class Camping.
     */
    @Test
    public void testGetLastId() throws ClassNotFoundException {
        System.out.println("getLastId");
        Camping instance = new Camping();
        int expResult = 0;
        int result = instance.getLastId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esFechaValida method, of class Camping.
     */
    @Test
    public void testEsFechaValida() throws ClassNotFoundException {
        System.out.println("esFechaValida");
        String fechaTexto = "";
        Camping instance = new Camping();
        boolean expResult = false;
        boolean result = instance.esFechaValida(fechaTexto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esHoraValida method, of class Camping.
     */
    @Test
    public void testEsHoraValida() throws ClassNotFoundException {
        System.out.println("esHoraValida");
        String horaTexto = "";
        Camping instance = new Camping();
        boolean expResult = false;
        boolean result = instance.esHoraValida(horaTexto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esFechaPosterior method, of class Camping.
     */
    @Test
    public void testEsFechaPosterior() throws ClassNotFoundException {
        System.out.println("esFechaPosterior");
        String fechaEntradaTexto = "";
        String fechaSalidaTexto = "";
        Camping instance = new Camping();
        boolean expResult = false;
        boolean result = instance.esFechaPosterior(fechaEntradaTexto, fechaSalidaTexto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecioCliente method, of class Camping.
     */
    @Test
    public void testGetPrecioCliente() throws ClassNotFoundException {
        System.out.println("getPrecioCliente");
        int idCliente = 0;
        Camping instance = new Camping();
        int expResult = 0;
        int result = instance.getPrecioCliente(idCliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateDBParcelas method, of class Camping.
     */
    @Test
    public void testUpdateDBParcelas() throws Exception {
        System.out.println("updateDBParcelas");
        Parcela p3 = null;
        int id_parcela = 0;
        Camping instance = new Camping();
        instance.updateDBParcelas(p3, id_parcela);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
