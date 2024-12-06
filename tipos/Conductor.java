package sistemagestionflotas.tipos;

import java.util.Map;
import java.util.HashMap;

public class Conductor {
    private String id;
    private String nombre;
    private String licencia;
    private Map<String, Double> historialDesempeno;

    public Conductor(String id, String nombre, String licencia) {
        this.id = id;
        this.nombre = nombre;
        this.licencia = licencia;
        this.historialDesempeno = new HashMap<>();
    }

    // Getters y setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getLicencia() { return licencia; }
    public void setLicencia(String licencia) { this.licencia = licencia; }
    
    public void registrarDesempeno(String metrica, Double valor) {
        historialDesempeno.put(metrica, valor);
    }

    public Double obtenerDesempeno(String metrica) {
        return historialDesempeno.get(metrica);
    }
}
