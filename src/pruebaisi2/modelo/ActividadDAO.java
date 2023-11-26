package pruebaisi2.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ActividadDAO {
    public static final String DRIVER = "oracle.jdbc.OracleDriver";
    public static final String DBURL = "jdbc:oracle:thin:@pokemon.uv.es:1521:ORCL";
    public static final String USERNAME = "GIISGBD208";
    public static final String PASSWORD = "778778";
    /*
     * Consultas Actividades
     *
     * ID_ACTIVIDAD     NUMBER
     * TIPO_ACTIVIDAD   VARCHAR2(255)
     * FECHA            VARCHAR2(255)
     * HORA             VARCHAR2(255)
     * ESTADO           VARCHAR2(255)
     * ID_CLIENTE       NUMBER
     */

    private static final String CREATE =
            "INSERT INTO ISI2_Actividades (id_actividad, tipo_actividad, fecha, hora, estado, id_cliente)" +
                    "VALUES (?,?,?,?,?,?)";

    private static final String READ =
            " SELECT ID_ACTIVIDAD, TIPO_ACTIVIDAD, FECHA, HORA, ESTADO, ID_CLIENTE" +
                    " FROM ISI2_Actividades " +
                    " WHERE ID_ACTIVIDAD = ?";

    private static final String READALL =
            "SELECT id_actividad AS ID_ACTIVIDAD, tipo_actividad AS TIPO_ACTIVIDAD, " +
                    " fecha AS FECHA, hora AS HORA, estado AS ESTADO, id_cliente AS ID_CLIENTE" +
                    " FROM ISI2_Actividades " +
                    " ORDER BY id_actividad";

    private static final String UPDATE =
            "UPDATE ISI2_Actividades " +
                    "   SET id_actividad = ?, tipo_actividad = ?, fecha = ?, " +
                    "       hora = ?, estado = ?, id_cliente = ? " +
                    " WHERE id_actividad = ?";

    private static final String DELETE =
            "DELETE FROM ISI2_Actividades " +
                    " WHERE ID_ACTIVIDAD = ?";

    public ActividadDAO() {}

    public void crearActividad(Actividad actividad) throws
            ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        Class.forName(DRIVER).newInstance();
        try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {

            oracleConn.setAutoCommit(false);
            try (PreparedStatement insert = oracleConn.prepareStatement(CREATE)) {
//                insert.setInt(1, actividad.getId());
                insert.setString(2, actividad.getTipoActividad());
                insert.setString(3, actividad.getFecha());
                insert.setString(4, actividad.getHora());
                insert.setString(5, actividad.getEstado());
                insert.setInt(6, actividad.getGanador());
                insert.executeUpdate();
            }

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
        }
    }

//    public Actividad leerActividad(int idActividad) throws ClassNotFoundException,
//            InstantiationException, IllegalAccessException, SQLException {
//
////        Actividad actividad = new Actividad();
//
//        Class.forName(DRIVER).newInstance();
//        try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {
//
//            try (PreparedStatement read = oracleConn.prepareStatement(READ)) {
//                read.setInt(1, idActividad);
//                try (ResultSet rs = read.executeQuery()) {
//                    if (rs.next()) {
////                        actividad.setId(rs.getInt("ID_ACTIVIDAD"));
////                        actividad.setTipoActividad(rs.getString("TIPO_ACTIVIDAD"));
////                        actividad.setFecha(rs.getString("FECHA"));
////                        actividad.setHora(rs.getString("HORA"));
////                        actividad.setEstado(rs.getString("ESTADO"));
////                        actividad.setGanador(rs.getInt("ID_CLIENTE"));
//                    }
//                }
//            }
//        }
////        return actividad;
//    }

    public void actualizarActividad(Actividad actividad, int idActividad) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, SQLException {

        Class.forName(DRIVER).newInstance();
        try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {

            oracleConn.setAutoCommit(false);
            try (PreparedStatement update = oracleConn.prepareStatement(UPDATE)) {
                update.setInt(1, actividad.getIdActividad());
                update.setString(2, actividad.getTipoActividad());
                update.setString(3, actividad.getFecha());
                update.setString(4, actividad.getHora());
                update.setString(5, actividad.getEstado());
                update.setInt(6, actividad.getGanador());
                update.setInt(7, idActividad);
                update.executeUpdate();
            }

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
        }
    }

    public void borrarActividad(int idActividad) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, SQLException {

        Class.forName(DRIVER).newInstance();
        try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {

            oracleConn.setAutoCommit(false);

            try (PreparedStatement delete = oracleConn.prepareStatement(DELETE)) {
                delete.setInt(1, idActividad);
                delete.executeUpdate();
            }

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
        }
    }

public ArrayList<Actividad> obtenerTodasActividades() {
    ArrayList<Actividad> actividades = new ArrayList<>();
    String tipoActividad = "", fecha = "", hora = "", estado = "";
    int idActividad = 0, idCliente = 0;

    try {
        Class.forName(DRIVER).newInstance();
        try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {

            try (PreparedStatement statement = oracleConn.prepareStatement(READALL);
                 ResultSet rs = statement.executeQuery()) {

                while (rs.next()) {
                    
                    idActividad = rs.getInt("ID_ACTIVIDAD");
                    tipoActividad = rs.getString("TIPO_ACTIVIDAD");
                    fecha = rs.getString("FECHA");
                    hora = rs.getString("HORA");
                    estado = rs.getString("ESTADO");
                    idCliente = rs.getInt("ID_CLIENTE");
                    
                    Actividad actividad = new Actividad(idActividad, idCliente,
                    tipoActividad, fecha, hora, estado);
                    actividades.add(actividad);
                }
            }
        }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
        System.out.println("ActividadesDAO::obtenerTodasActividades -- " + e.getMessage());
    }

    return actividades;
}
    
    // Resto del código...
}
