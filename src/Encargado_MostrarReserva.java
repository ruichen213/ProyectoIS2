
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import pruebaisi2.modelo.Camping;
import pruebaisi2.modelo.Reserva;
import pruebaisi2.vista.Encargado_Menu;

public class Encargado_MostrarReserva extends JFrame {
    private JTable table;
    private ArrayList<Reserva> listaReservas; // Asumiendo que tienes una lista de objetos Reserva
    private Camping c;
    public Encargado_MostrarReserva(ArrayList<Reserva> listaReservas) 
    {
        initializeComponent();
        this.listaReservas = listaReservas;
        
        setTitle("Mostrar Reservas");
        setSize(800, 400); // Tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar proceso al cerrar ventana
        
        //JButton atras = new JButton("Retroceder");
        /*
        atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí defines lo que sucede cuando se presiona el botón
                // Si solo quieres cerrar la ventana actual
                Encargado_MostrarReserva.this.dispose();

                // Si quieres volver a la ventana anterior, necesitas hacerla visible
                // ventanaAnterior.setVisible(true); // Asegúrate de tener una referencia a la ventana anterior
            }
        });
        */
    }
    private void initializeComponent() {
        // Crear el modelo de la tabla con los nombres de las columnas
        String[] columnNames = {"ID", "Cliente", "Fecha Inicio", "Fecha Fin" , "Estado"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        // Llenar el modelo con los datos de las reservas
        for (Reserva reserva : listaReservas) {
            model.addRow(new Object[]{
                reserva.getId(),
                reserva.getIdCliente, // Asumiendo que hay un método getNombre en Cliente
                reserva.getFechaInicio(),
                reserva.getFechaFin(),
            });
        }
        // Crear la tabla y asignarle el modelo
        table = new JTable(model);

        // Añadir la tabla a un JScrollPane para tener barras de desplazamiento
        JScrollPane scrollPane = new JScrollPane(table);
        this.add(scrollPane); // Añadir el JScrollPane al JFrame
    }

    public static void main(String[] args) {
        Camping c = new Camping();
        ArrayList<Reserva> reservas = c.getReserva();
        Encargado_MostrarReserva ventana = new Encargado_MostrarReserva(reservas);
        ventana.setVisible(true);
    }
}
