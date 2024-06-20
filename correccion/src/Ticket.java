public class Ticket {
    private int id;
    private Ruta ruta;
    private Servicio servicio;
    private Pasajero pasajero;

    public Ticket(int id, Ruta ruta, Servicio servicio, Pasajero pasajero) {
        this.id = id;
        this.ruta = ruta;
        this.servicio = servicio;
        this.pasajero = pasajero;
    }

    public double calcularPrecio() {
        double precioBase = ruta.getPrecioBase();
        double precioFinal = precioBase * servicio.calcularFactorRecargo();
        return precioFinal;
    }
}
