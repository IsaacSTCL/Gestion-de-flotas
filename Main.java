package sistemagestionflotas;

import sistemagestionflotas.tipos.Vehiculo;
import sistemagestionflotas.tipos.TipoVehiculo;
import sistemagestionflotas.gestion.GestorFlota;
import sistemagestionflotas.servicios.ServicioSeguimiento;
import sistemagestionflotas.servicios.ServicioMantenimiento;
import sistemagestionflotas.integracion.IntegracionExterna;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        GestorFlota gestor = new GestorFlota();


        Vehiculo vehiculo1 = new Vehiculo("VEH001", TipoVehiculo.LOGISTICA);
        Vehiculo vehiculo2 = new Vehiculo("VEH002", TipoVehiculo.TRANSPORTE_PUBLICO);


        gestor.agregarVehiculo(vehiculo1);
        gestor.agregarVehiculo(vehiculo2);


        ServicioSeguimiento servicioSeguimiento = new ServicioSeguimiento(Arrays.asList(vehiculo1, vehiculo2));
        ServicioMantenimiento servicioMantenimiento = new ServicioMantenimiento(Arrays.asList(vehiculo1, vehiculo2));


        gestor.agregarServicio(servicioSeguimiento);
        gestor.agregarServicio(servicioMantenimiento);


        gestor.procesarServicios();


        IntegracionExterna integracion = new IntegracionExterna(null, null);
        String ruta = integracion.obtenerRutaOptimizada("CiudadA", "CiudadB");
        System.out.println(ruta);
    }
}
