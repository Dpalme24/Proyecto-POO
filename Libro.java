package organizador;

public class Libro extends Articulo {
    private String ISBN, genero, portada;
    
    // getters y setters
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }
    
    
    // constructor

    public Libro(String ISBN, String genero, String portada, double ancho, double alto, String titulo, String tipo) {
        super(ancho, alto, titulo, tipo);
        tipo = "Libro";
        this.ISBN = ISBN;
        this.genero = genero;
        this.portada = portada;
    }

    
    
    
    
    
}
