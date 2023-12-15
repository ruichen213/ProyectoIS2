package pruebaisi2.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TiendaDAO {
    public static final String DRIVER = "oracle.jdbc.OracleDriver";
    public static final String DBURL = "jdbc:oracle:thin:@pokemon.uv.es:1521:ORCL";
    public static final String USERNAME = "GIISGBD20x";
    public static final String PASSWORD = "";
    
    /*
     * Consultas Tiendas
     *
     * ID_TIENDA     NUMBER
     * NOMBRE        VARCHAR2(255)
     * SUPERFICIE    FLOAT
     */

    private static final String CREATE =
            "INSERT INTO ISI2_Tienda (id_tienda, nombre, superficie)" +
                    "VALUES (?,?,?)";

    private static final String READ =
            " SELECT ID_TIENDA, NOMBRE, SUPERFICIE" +
                    " FROM ISI2_Tienda " +
                    " WHERE ID_TIENDA = ?";

    private static final String READALL =
            "SELECT id_tienda AS ID_TIENDA, nombre AS NOMBRE, superficie AS SUPERFICIE" +
                    " FROM ISI2_Tienda " +
                    " ORDER BY id_tienda";

    private static final String UPDATE =
            "UPDATE ISI2_Tienda " +
                    "   SET id_tienda = ?, nombre = ?, superficie = ?" +
                    " WHERE id_tienda = ?";

    private static final String DELETE =
            "DELETE FROM ISI2_Tienda " +
                    " WHERE ID_TIENDA = ?";

    public TiendaDAO() {}
    
    public void crearTienda(Tienda tienda) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Class.forName(DRIVER).newInstance();
        try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {

            oracleConn.setAutoCommit(false);
            try (PreparedStatement insert = oracleConn.prepareStatement(CREATE)) {
                insert.setInt(1, tienda.getId());
                insert.setString(2, tienda.getNombre());
                insert.setFloat(3, tienda.getSuperficie());
                insert.executeUpdate();
            }

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
        }
    }

    public Tienda leerTienda(int idTienda) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Tienda tienda = new Tienda();

        Class.forName(DRIVER).newInstance();
        try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {

            try (PreparedStatement read = oracleConn.prepareStatement(READ)) {
                read.setInt(1, idTienda);
                try (ResultSet rs = read.executeQuery()) {
                    if (rs.next()) {
                        tienda.setId(rs.getInt("ID_TIENDA"));
                        tienda.setNombre(rs.getString("NOMBRE"));
                        tienda.setSuperficie(rs.getFloat("SUPERFICIE"));
                    }
                }
            }
        }
        return tienda;
    }

    public void actualizarTienda(Tienda tienda, int idTienda) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Class.forName(DRIVER).newInstance();
        try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {

            oracleConn.setAutoCommit(false);
            try (PreparedStatement update = oracleConn.prepareStatement(UPDATE)) {
                //update.setInt(1, tienda.getIdTienda());
                update.setString(2, tienda.getNombre());
                update.setFloat(3, tienda.getSuperficie());
                update.setInt(4, idTienda);
                update.executeUpdate();
            }

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
        }
    }

    public void borrarTienda(int idTienda) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Class.forName(DRIVER).newInstance();
        try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {

            oracleConn.setAutoCommit(false);

            try (PreparedStatement delete = oracleConn.prepareStatement(DELETE)) {
                delete.setInt(1, idTienda);
                delete.executeUpdate();
            }

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
        }
    }

    public ArrayList<Tienda> obtenerTodasTiendas() {
        ArrayList<Tienda> listaTiendas = new ArrayList<>();

        try {
            Class.forName(DRIVER).newInstance();
            try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {

                try (PreparedStatement statement = oracleConn.prepareStatement(READALL);
                     ResultSet rs = statement.executeQuery()) {

                    while (rs.next()) {
                        Tienda tienda = new Tienda();
                        tienda.setId(rs.getInt("ID_TIENDA"));
                        tienda.setNombre(rs.getString("NOMBRE"));
                        tienda.setSuperficie(rs.getFloat("SUPERFICIE"));

                        listaTiendas.add(tienda);
                    }
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            System.out.println("TiendaDAO::obtenerTodasTiendas -- " + e.getMessage());
        }

        return listaTiendas;
    }
}
