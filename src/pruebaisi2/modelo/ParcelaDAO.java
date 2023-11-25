package pruebaisi2.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ParcelaDAO {
    public static final String DRIVER = "oracle.jdbc.OracleDriver";
    public static final String DBURL = "jdbc:oracle:thin:@pokemon.uv.es:1521:ORCL";
    public static final String USERNAME = "GIISGBD208";
    public static final String PASSWORD = "778778";

    private static final String CREATE =
        "INSERT INTO ISI2_Parcela (id_parcela, luz, superficie, disponibilidad, id_tienda, id_reserva)" +
        "VALUES (?,?,?,?,?,?)";

    private static final String READ =
        " SELECT ID_PARCELA, LUZ, SUPERFICIE, DISPONIBILIDAD, ID_TIENDA, ID_RESERVA" +
        " FROM ISI2_Parcela " +
        " WHERE ID_PARCELA = ?";

    private static final String READALL =
        "SELECT id_parcela AS ID_PARCELA, luz AS LUZ, superficie AS SUPERFICIE, " +
        " disponibilidad AS DISPONIBILIDAD, id_tienda AS ID_TIENDA, id_reserva AS ID_RESERVA" +
        " FROM ISI2_Parcela " +
        " ORDER BY id_parcela";

    private static final String UPDATE =
        "UPDATE ISI2_Parcela " +
        "   SET id_parcela = ?, luz = ?, superficie = ?, " +
        "       disponibilidad = ?, id_tienda = ?, id_reserva = ? " +
        " WHERE id_parcela = ?";

    private static final String DELETE =
        "DELETE FROM ISI2_Parcela " +
        " WHERE ID_PARCELA = ?";

    public ParcelaDAO() {}

    public void crearParcela(Parcela parcela) throws 
        ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        Class.forName(DRIVER).newInstance();
        try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {

            oracleConn.setAutoCommit(false);
            try (PreparedStatement insert = oracleConn.prepareStatement(CREATE)) {
                insert.setInt(1, parcela.getId());
                insert.setInt(2, parcela.getLuz() ? 1 : 0);
                insert.setDouble(3, parcela.getSuperficie());
                insert.setInt(4, parcela.isDisponible() ? 1 : 0);
                insert.setInt(5, parcela.getIdTienda());
                insert.setInt(6, parcela.getIdReserva());
                insert.executeUpdate();
            }

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
        }
    }

    public Parcela leerParcela(int idParcela) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        Parcela parcela = new Parcela();

        Class.forName(DRIVER).newInstance();
        try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {

            try (PreparedStatement read = oracleConn.prepareStatement(READ)) {
                read.setInt(1, idParcela);
                try (ResultSet rs = read.executeQuery()) {
                    if (rs.next()) {
                        parcela.setId(rs.getInt("ID_PARCELA"));
                        parcela.setLuz(rs.getInt("LUZ") == 1);
                        parcela.setSuperficie((float) rs.getDouble("SUPERFICIE"));
                        parcela.setDisponible(rs.getInt("DISPONIBILIDAD") == 1);
                        parcela.setIdTienda(rs.getInt("ID_TIENDA"));
                        parcela.setIdReserva(rs.getInt("ID_RESERVA"));
                    }
                }
            }
        }
        return parcela;
    }

    public void actualizarParcela(Parcela parcela, int idParcela) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        Class.forName(DRIVER).newInstance();
        try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {

            oracleConn.setAutoCommit(false);
            try (PreparedStatement update = oracleConn.prepareStatement(UPDATE)) {
                update.setInt(1, parcela.getId());
                update.setInt(2, parcela.getLuz() ? 1 : 0);
                update.setDouble(3, parcela.getSuperficie());
                update.setInt(4, parcela.isDisponible() ? 1 : 0);
                update.setInt(5, parcela.getIdTienda());
                update.setInt(6, parcela.getIdReserva());
                update.setInt(7, idParcela);
                update.executeUpdate();
            }

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
        }
    }

    public void borrarParcela(int idParcela) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        Class.forName(DRIVER).newInstance();
        try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {

            oracleConn.setAutoCommit(false);

            try (PreparedStatement delete = oracleConn.prepareStatement(DELETE)) {
                delete.setInt(1, idParcela);
                delete.executeUpdate();
            }

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
        }
    }

    public ArrayList<Parcela> obtenerTodasParcelas() {
        ArrayList<Parcela> listaParcelas = new ArrayList<>();
        int id_parcela, id_tienda, id_reserva;
        float superficie;
        boolean luz, disponible;

        try {
            Class.forName(DRIVER).newInstance();
            try (Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
                 PreparedStatement statement = oracleConn.prepareStatement(READALL);
                 ResultSet rs = statement.executeQuery()) {

                while (rs.next()) {
                    System.out.println("Leyendo parcelas...");
                    id_parcela = rs.getInt("ID_PARCELA");
                    luz = rs.getInt("LUZ") == 1;
                    superficie = rs.getFloat("SUPERFICIE");
                    disponible = rs.getInt("DISPONIBILIDAD") == 1;
                    id_tienda = rs.getInt("ID_TIENDA");
                    id_reserva = rs.getInt("ID_RESERVA");

                    Parcela parcela = new Parcela(id_parcela, luz, superficie, disponible, id_tienda, id_reserva);
                    listaParcelas.add(parcela);
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            System.out.println("ParcelaDAO::obtenerTodasParcelas -- " + e.getMessage());
        }

        return listaParcelas;
    }
}
