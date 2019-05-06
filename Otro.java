package organizador;

public class Otro extends Articulo {
    private String descripcion;

    // getters y setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    // constructor

    public Otro(String descripcion, double ancho, double alto, String titulo, String tipo) {
        super(ancho, alto, titulo, tipo);
        this.descripcion = descripcion;
    }
    
    
}
