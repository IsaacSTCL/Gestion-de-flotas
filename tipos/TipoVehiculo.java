package sistemagestionflotas.tipos;

public enum TipoVehiculo {
	LOGISTICA("Logística"),
    TRANSPORTE_PUBLICO("Transporte Público"),
    SERVICIO_ENTREGA("Servicio de Entrega");

    private final String descripcion;

    TipoVehiculo(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
