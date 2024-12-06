package sistemagestionflotas.servicios;

import sistemagestionflotas.tipos.Vehiculo;
import java.util.List;

public class ServicioMantenimiento implements ServicioBase {
    private List<Vehiculo> vehiculos;

    public ServicioMantenimiento(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public void procesar() {
        System.out.println("Generando alertas de mantenimiento predictivo");
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.isSensorMantenimiento()) {
                System.out.println("Alerta para mantenimiento: Vehículo " + vehiculo.getId());
            }
        }
    }
}