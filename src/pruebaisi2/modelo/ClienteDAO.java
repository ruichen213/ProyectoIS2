package pruebaisi2.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {
    public static final String DRIVER = "oracle.jdbc.OracleDriver";
    public static final String DBURL = "jdbc:oracle:thin:@pokemon.uv.es:1521:ORCL";
    public static final String USERNAME = "";
    public static final String PASSWORD = "";

    public ClienteDAO() {}

    public ArrayList<Cliente> leerClientes() throws ClassNotFoundException {
        ArrayList<Cliente> clientes = new ArrayList<>();
        String nombre = "", contrasenya = "";
        int id_cliente = 0, pareja = 0;
        Boolean sancionado = false;

        try {
            Class.forName(DRIVER).newInstance();
            try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
                 PreparedStatement statement = oracleConn.prepareStatement(READALL);
                 ResultSet rs = statement.executeQuery()) {

                while (rs.next()) {
                    System.out.println("Leyendo cliente...");
                    id_cliente = rs.getInt("Id");
                    nombre = rs.getString("Nombre");
                    contrasenya = rs.getString("Contrasenya");
                    sancionado = rs.getInt("Sancionado") == 1;
                    pareja = rs.getInt("Pareja");

                    Cliente c = new Cliente(id_cliente, nombre, contrasenya, pareja, sancionado);
                    clientes.add(c);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.out.println("Error al cargar el driver: " + e.getMessage());
            e.printStackTrace();
        }
        return clientes;
    }

    private static final String READALL =
        "SELECT c.id_cliente AS Id, c.nombre AS Nombre, c.contrasenya AS Contrasenya, " +
        "c.sancionado AS Sancionado, c.pareja AS Pareja " +
        "FROM ISI2_Clientes c " +
        "ORDER BY c.id_cliente";

}
