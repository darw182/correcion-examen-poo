import java.util.ArrayList;

public class Vip extends Servicio {
    private String tipoAsiento;
    private int espacioMaleta;
    private boolean maletaAdicional;
    private ArrayList<String> serviciosAdicionales;

    public Vip(String tipo, String detalles, String tipoAsiento, int espacioMaleta, boolean maletaAdicional, ArrayList<String> serviciosAdicionales) {
        super(tipo, detalles);
        this.tipoAsiento = tipoAsiento;
        this.espacioMaleta = espacioMaleta;
        this.maletaAdicional = maletaAdicional;
        this.serviciosAdicionales = serviciosAdicionales;
    }

    @Override
    public double calcularFactorRecargo() {
        // Recargo del 30% para VIP
        return 1.3;
    }
}
