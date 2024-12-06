package sistemagestionflotas.gestion;

import sistemagestionflotas.tipos.Vehiculo;
import sistemagestionflotas.tipos.Conductor;
import sistemagestionflotas.tipos.TipoVehiculo;
import sistemagestionflotas.servicios.ServicioBase;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GestorFlota {
    private List<Vehiculo> vehiculos;
    private List<Conductor> conductores;
    private List<ServicioBase> servicios;

    public GestorFlota() {
        this.vehiculos = new ArrayList<>();
        this.conductores = new ArrayList<>();
        this.servicios = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void agregarConductor(Conductor conductor) {
        conductores.add(conductor);
    }

    public void agregarServicio(ServicioBase servicio) {
        servicios.add(servicio);
    }

    public void procesarServicios() {
        for (ServicioBase servicio : servicios) {
            servicio.procesar();
        }
    }

    public List<Vehiculo> obtenerVehiculosPorTipo(TipoVehiculo tipo) {
        return vehiculos.stream()
                .filter(v -> v.getTipo() == tipo)
                .collect(Collectors.toList());
    }
}