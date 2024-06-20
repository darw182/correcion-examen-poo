import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Ruta ruta1 = new Ruta("Ciudad A", "Ciudad B", 100.0);

        Servicio servicioNormal1 = new Normal("Normal", "Asiento pasillo, espacio para 1 maleta", "Pasillo", 1, true);


        ArrayList<String> serviciosAdicionales = new ArrayList<>();
        serviciosAdicionales.add("WiFi");
        Servicio servicioVIP1 = new Vip("VIP", "Asiento ventana, espacio para 2 maletas, WiFi incluido", "Ventana", 2, true, serviciosAdicionales);


        ruta1.agregarServicio(servicioNormal1);
        ruta1.agregarServicio(servicioVIP1);


        Pasajero pasajero1 = new Pasajero("Juan", "Pérez", "12345678");


        Ticket ticket1 = new Ticket(1, ruta1, (Normal) servicioNormal1, pasajero1);


        Ticket ticket2 = new Ticket(2, ruta1, (Vip) servicioVIP1, pasajero1);


        System.out.println("Precio del Ticket 1: $" + ticket1.calcularPrecio());
        System.out.println("Precio del Ticket 2: $" + ticket2.calcularPrecio());
        }
    }
