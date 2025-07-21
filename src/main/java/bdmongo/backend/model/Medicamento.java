package bdmongo.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "medicamentos")
public class Medicamento {

    @Id
    private String id;
    private String nombre;
    private String principio_activo;
    private String presentacion;
    private String laboratorio;
    private double precio;
    private String peso;

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPrincipio_activo() { return principio_activo; }
    public void setPrincipio_activo(String principio_activo) { this.principio_activo = principio_activo; }

    public String getPresentacion() { return presentacion; }
    public void setPresentacion(String presentacion) { this.presentacion = presentacion; }

    public String getLaboratorio() { return laboratorio; }
    public void setLaboratorio(String laboratorio) { this.laboratorio = laboratorio; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public String getPeso() { return peso; }
    public void setPeso(String peso) { this.peso = peso; }
}
