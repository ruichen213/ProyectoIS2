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
    public static final String USERNAME = "GIISGBD208";
    public static final String PASSWORD = "778778";
    /*
     * Consultas Clientes
     *
     * ID_CLIENTE     NUMBER
     * NOMBRE         VARCHAR2(255)
     * CONTRASENYA    VARCHAR2(255)
     * SANCIONADO     NUMBER(1,0)
     * PAREJA         NUMBER
     */

    private static final String CREATE =
            "INSERT INTO ISI2_Clientes (id_cliente, nombre, contrasenya, sancionado, pareja)" +
                    "VALUES (?,?,?,?,?)";

    private static final String READ =
            " SELECT ID_CLIENTE, NOMBRE, CONTRASENYA, SANCIONADO, PAREJA" +
                    " FROM ISI2_Clientes " +
                    " WHERE ID_CLIENTE = ?";

    private static final String READALL =
            "SELECT id_cliente AS ID_CLIENTE, nombre AS NOMBRE, " +
                    " contrasenya AS CONTRASENYA, sancionado AS SANCIONADO, pareja AS PAREJA" +
                    " FROM ISI2_Clientes " +
                    " ORDER BY id_cliente";

    private static final String UPDATE =
            "UPDATE ISI2_Clientes " +
                    "   SET id_cliente = ?, nombre = ?, contrasenya = ?, " +
                    "       sancionado = ?, pareja = ? " +
                    " WHERE id_cliente = ?";

    private static final String DELETE =
            "DELETE FROM ISI2_Clientes " +
                    " WHERE ID_CLIENTE = ?";

    public ClienteDAO() {}

    public void crearCliente(Cliente cliente) throws
            ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        Class.forName(DRIVER).newInstance();
        try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {

            oracleConn.setAutoCommit(false);
            try (PreparedStatement insert = oracleConn.prepareStatement(CREATE)) {
                insert.setInt(1, cliente.getId_cliente());
                insert.setString(2, cliente.getNombre());
                insert.setString(3, cliente.getContrasenya());
                insert.setInt(4, cliente.isSancionado() ? 1 : 0);
                insert.setInt(5, cliente.getPareja());
                insert.executeUpdate();
            }

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
        }
    }

    public Cliente leerCliente(int idCliente) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, SQLException {

        Cliente cliente = new Cliente();

        Class.forName(DRIVER).newInstance();
        try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {

            try (PreparedStatement read = oracleConn.prepareStatement(READ)) {
                read.setInt(1, idCliente);
                try (ResultSet rs = read.executeQuery()) {
                    if (rs.next()) {
                        cliente.setId_cliente(rs.getInt("ID_CLIENTE"));
                        cliente.setNombre(rs.getString("NOMBRE"));
                        cliente.setContrasenya(rs.getString("CONTRASENYA"));
                        cliente.setSancionado(rs.getInt("SANCIONADO") == 1);
                        cliente.setPareja(rs.getInt("PAREJA"));
                    }
                }
            }
        }
        return cliente;
    }

    public void actualizarCliente(Cliente cliente, int idCliente) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, SQLException {

        Class.forName(DRIVER).newInstance();
        try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {

            oracleConn.setAutoCommit(false);
            try (PreparedStatement update = oracleConn.prepareStatement(UPDATE)) {
                update.setInt(1, cliente.getId_cliente());
                update.setString(2, cliente.getNombre());
                update.setString(3, cliente.getContrasenya());
                update.setInt(4, cliente.isSancionado() ? 1 : 0);
                update.setInt(5, cliente.getPareja());
                update.setInt(6, idCliente);
                update.executeUpdate();
            }

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
        }
    }

    public void borrarCliente(int idCliente) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, SQLException {

        Class.forName(DRIVER).newInstance();
        try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {

            oracleConn.setAutoCommit(false);

            try (PreparedStatement delete = oracleConn.prepareStatement(DELETE)) {
                delete.setInt(1, idCliente);
                delete.executeUpdate();
            }

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
        }
    }
    
    public ArrayList<Cliente> leerClientes() throws ClassNotFoundException {
        ArrayList<Cliente> clientes = new ArrayList<>();
        String nombre = "", contrasenya = "";
        int id_cliente = 0, pareja = 0;
        boolean sancionado = false;
        try {
            Class.forName(DRIVER).newInstance();
            try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
                 PreparedStatement statement = oracleConn.prepareStatement(READALL);
                 ResultSet rs = statement.executeQuery()) {

                while (rs.next()) {
                    System.out.println("Leyendo cliente...");
                    id_cliente = rs.getInt("ID_CLIENTE");
                    nombre = rs.getString("NOMBRE");
                    contrasenya = rs.getString("Contrasenya");
                   // sancionado = rs.getInt("SANCIONADO") == 1;
                    pareja = rs.getInt("PAREJA");
                    Cliente c = new Cliente(id_cliente, nombre, contrasenya, pareja, sancionado);
                    clientes.add(c);
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            System.out.println("ClienteDAO::obtenerTodasClientes -- " + e.getMessage());
        }
        return clientes;
    }


}


