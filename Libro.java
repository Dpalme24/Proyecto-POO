package organizador;

public class Libro extends Articulo {
    private String genero;

    public String getGenero() {
        return genero;
    }

    public Libro(String genero, String titulo, int ano) {
        super(titulo, ano);
        this.genero = genero;
    }
}
