public class Normal extends Servicio{
    private String tipoAsiento;
    private int espacioMaleta;
    private boolean maletaAdicional;

    public Normal(String tipo, String detalles, String tipoAsiento, int espacioMaleta, boolean maletaAdicional) {
        super(tipo, detalles);
        this.tipoAsiento = tipoAsiento;
        this.espacioMaleta = espacioMaleta;
        this.maletaAdicional = maletaAdicional;
    }

    @Override
    public double calcularFactorRecargo() {
        // Sin recargo adicional para Normal
        return 1.0;
    }
}
