package sistemagestionflotas.integracion;

public class IntegracionExterna {
    public IntegracionExterna(Object proveedorMapas, Object proveedorCombustible) {
    }

    public String obtenerRutaOptimizada(String origen, String destino) {

        return "Ruta: " + origen + " -> " + destino;
    }

    public void registrarConsumoCombustible(String vehiculoId, double consumo) {

        System.out.println("Registrando consumo para vehículo " + vehiculoId + ": " + consumo + " litros");
    }
}