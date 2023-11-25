package pruebaisi2.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReservaDAO {
    public static final String DRIVER = "oracle.jdbc.OracleDriver";
    public static final String DBURL = "jdbc:oracle:thin:@pokemon.uv.es:1521:ORCL";
    public static final String USERNAME = "GIISGBD208";
    public static final String PASSWORD = "778778";
    
        /*
     * Consultas Reservas
     *
     * ID_RESERVA    NUMBER
     * FECHA_INI     VARCHAR2(255)
     * FECHA_FIN     VARCHAR2(255)
     * RESERVA       NUMBER(1,0)
     * ID_CLIENTE    NUMBER
     */

    private static final String CREATE =
            "INSERT INTO ISI2_Reservas (id_reserva, fecha_ini, fecha_fin, reserva, id_cliente)" +
                    "VALUES (?,?,?,?,?)";

    private static final String READ =
            " SELECT ID_RESERVA, FECHA_INI, FECHA_FIN, RESERVA, ID_CLIENTE" +
                    " FROM ISI2_Reservas " +
                    " WHERE ID_RESERVA = ?";

    private static final String READALL =
            "SELECT id_reserva AS ID_RESERVA, fecha_ini AS FECHA_INI, fecha_fin AS FECHA_FIN, reserva AS RESERVA, id_cliente AS ID_CLIENTE" +
                    " FROM ISI2_Reservas " +
                    " ORDER BY id_reserva";

    private static final String UPDATE =
            "UPDATE ISI2_Reservas " +
                    "   SET id_reserva = ?, fecha_ini = ?, fecha_fin = ?, reserva = ?, id_cliente = ?" +
                    " WHERE id_reserva = ?";

    private static final String DELETE =
            "DELETE FROM ISI2_Reservas " +
                    " WHERE ID_RESERVA = ?";

    public ReservaDAO() {}
    
    public void crearReserva(Reserva reserva) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Class.forName(DRIVER).newInstance();
        try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {

            oracleConn.setAutoCommit(false);
            try (PreparedStatement insert = oracleConn.prepareStatement(CREATE)) {
                insert.setInt(1, reserva.getId());
                insert.setString(2, reserva.getFechaInicio());
                insert.setString(3, reserva.getFechaFin());
                insert.setInt(4, reserva.isReserva() ? 1 : 0);
                insert.setInt(5, reserva.getIdCliente());
                insert.executeUpdate();
            }

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
        }
    }

    public Reserva leerReserva(int idReserva) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Reserva reserva = new Reserva();

        Class.forName(DRIVER).newInstance();
        try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {

            try (PreparedStatement read = oracleConn.prepareStatement(READ)) {
                read.setInt(1, idReserva);
                try (ResultSet rs = read.executeQuery()) {
                    if (rs.next()) {
                        reserva.setId(rs.getInt("ID_RESERVA"));
                        reserva.setFechaInicio(rs.getString("FECHA_INI"));
                        reserva.setFechaFin(rs.getString("FECHA_FIN"));
                        reserva.setReserva(rs.getInt("RESERVA") == 1);
                        reserva.setIdCliente(rs.getInt("ID_CLIENTE"));
                    }
                }
            }
        }
        return reserva;
    }

    public void actualizarReserva(Reserva reserva, int idReserva) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Class.forName(DRIVER).newInstance();
        try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {

            oracleConn.setAutoCommit(false);
            try (PreparedStatement update = oracleConn.prepareStatement(UPDATE)) {
                update.setInt(1, reserva.getId());
                update.setString(2, reserva.getFechaInicio());
                update.setString(3, reserva.getFechaFin());
                update.setInt(4, reserva.isReserva() ? 1 : 0);
                update.setInt(5, reserva.getIdCliente());
                update.setInt(6, idReserva);
                update.executeUpdate();
            }

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
        }
    }

    public void borrarReserva(int idReserva) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Class.forName(DRIVER).newInstance();
        try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {

            oracleConn.setAutoCommit(false);

            try (PreparedStatement delete = oracleConn.prepareStatement(DELETE)) {
                delete.setInt(1, idReserva);
                delete.executeUpdate();
            }

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
        }
    }

    public ArrayList<Reserva> obtenerTodasReservas() {
        ArrayList<Reserva> listaReservas = new ArrayList<>();

        try {
            Class.forName(DRIVER).newInstance();
            try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {

                try (PreparedStatement statement = oracleConn.prepareStatement(READALL);
                     ResultSet rs = statement.executeQuery()) {

                    while (rs.next()) {
                        Reserva reserva = new Reserva();
                        reserva.setId(rs.getInt("ID_RESERVA"));
                        reserva.setFechaInicio(rs.getString("FECHA_INI"));
                        reserva.setFechaFin(rs.getString("FECHA_FIN"));
                        reserva.setReserva(rs.getInt("RESERVA") == 1);
                        reserva.setIdCliente(rs.getInt("ID_CLIENTE"));

                        listaReservas.add(reserva);
                    }
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            System.out.println("ReservaDAO::obtenerTodasReservas -- " + e.getMessage());
        }

        return listaReservas;
    }
}
