package organizador;

public class VHS extends Articulo {
    private String duracion, estado, contenido;

    // getters y setters
    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    
    
    // constructor

    public VHS(String duracion, String estado, String contenido, double ancho, double alto, String titulo, String tipo) {
        super(ancho, alto, titulo, tipo);
        this.duracion = duracion;
        this.estado = estado;
        this.contenido = contenido;
    }

    
    
}
