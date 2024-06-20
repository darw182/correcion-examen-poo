public abstract class Servicio {
    protected String tipo;
    protected String detalles;

    public Servicio(String tipo, String detalles) {
        this.tipo = tipo;
        this.detalles = detalles;
    }

    public abstract double calcularFactorRecargo();
}
