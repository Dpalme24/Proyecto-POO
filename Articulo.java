package organizador;


public abstract class Articulo {
    // atributos
    protected double ancho, alto;
    protected String titulo, tipo;
    
    
    public Articulo(double ancho, double alto, String titulo, String tipo) {
        this.ancho = ancho;
        this.alto = alto;
        this.titulo = titulo;
        this.tipo = tipo;
    }
    
    
    // getters y setters
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
