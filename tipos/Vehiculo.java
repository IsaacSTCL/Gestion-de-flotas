package sistemagestionflotas.tipos;

public class Vehiculo {
	private String id;
    private TipoVehiculo tipo;
    private boolean sensorGps;
    private boolean sensorMantenimiento;

    public Vehiculo(String id, TipoVehiculo tipo) {
        this.id = id;
        this.tipo = tipo;
        this.sensorGps = true;
        this.sensorMantenimiento = true;
    }

    // Getters y setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public TipoVehiculo getTipo() { return tipo; }
    public void setTipo(TipoVehiculo tipo) { this.tipo = tipo; }
    public boolean isSensorGps() { return sensorGps; }
    public void setSensorGps(boolean sensorGps) { this.sensorGps = sensorGps; }
    public boolean isSensorMantenimiento() { return sensorMantenimiento; }
    public void setSensorMantenimiento(boolean sensorMantenimiento) { this.sensorMantenimiento = sensorMantenimiento; }
}
