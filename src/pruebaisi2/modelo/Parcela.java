package pruebaisi2.modelo;

import java.util.ArrayList;

public class Parcela {
    private float superficie;   //Superficie de la parcela
    private float precio;       //Precio de la parcela
    private boolean luz;        //Si la parcela tiene o no luz
    private int id;
    private boolean disponible; // Si la parcela esta disponible o no
    private static ArrayList <Parcela> lista = new ArrayList<>();

    public Parcela(int id, float precio, boolean luz, float superficie, boolean disp) {
        this.superficie = superficie;
        this.precio = precio;
        this.luz = luz;
        this.id = id;
        this.disponible = disp;
    }

    public float getSuperficie() {
        return superficie;
    }

    public float getPrecio() {
        return precio;
    }

    public boolean getLuz() {
        return luz;
    }

    public boolean isDisponible() {
        return disponible;
    }
    
    public int getId (){
        return id;
    }
    
    public void reservar(){
        if (disponible)
            this.disponible = false;
    }
    
    public void liberar(){
        this.disponible = true;
    }

    public static void anyadirParcela(Parcela parcela) {
        lista.add(parcela);
    }
    
    public static ArrayList<Parcela> obtenerParcelas() {
        return lista;
    }

    public static Parcela buscarParcelaPorId(int id) {
        for (Parcela parcela: lista) {
            if (parcela.getId() == id) {
                return parcela;
            }
        }
        return null;
    }
    static {
        anyadirParcela(new Parcela(1, 33, true, 23, true));
        anyadirParcela(new Parcela(2, 32, true, 43, true));
    }
}
