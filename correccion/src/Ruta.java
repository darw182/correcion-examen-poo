import java.util.ArrayList;

public class Ruta {
    private String origen;
    private String destino;
    private double precioBase;
    private ArrayList<Servicio> servicios;

    public Ruta(String origen, String destino, double precioBase) {
        this.origen = origen;
        this.destino = destino;
        this.precioBase = precioBase;
        this.servicios = new ArrayList<>();
    }

    public void agregarServicio(Servicio servicio) {
        servicios.add(servicio);
    }

    public double getPrecioBase() {
        return precioBase;
    }
}
