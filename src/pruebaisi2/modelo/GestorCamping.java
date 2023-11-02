package pruebaisi2.modelo;

import pruebaisi2.controlador.Controlador;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import pruebaisi2.vista.Cliente_ReservarActividades;
import pruebaisi2.vista.LoginPrincipal;

/**
 *
 * @author Alejandro Jorges
 */
public class GestorCamping {
    private Camping c;
    
    public GestorCamping(){
       this.c = new Camping();
       c.cargarDatos();
    }
    
    
    public static void main(String args[]){
        GestorCamping gestor = new GestorCamping();
        LoginPrincipal lp = new LoginPrincipal();
        lp.setVisible(true);
        System.out.println("Aplicación de inicio de sesión en ejecución...");
    }
}
