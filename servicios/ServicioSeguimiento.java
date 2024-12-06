package sistemagestionflotas.servicios;

import sistemagestionflotas.tipos.Vehiculo;
import java.util.List;

public class ServicioSeguimiento implements ServicioBase {
    private List<Vehiculo> vehiculos;

    public ServicioSeguimiento(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public void procesar() {
        System.out.println("Procesando seguimiento en tiempo real");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Tracking vehículo: " + vehiculo.getId());
        }
    }
}
