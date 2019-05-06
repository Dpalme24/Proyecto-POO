package organizador;

public class Otro extends Articulo {
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public Otro(String descripcion, String titulo, int ano) {
        super(titulo, ano);
        this.descripcion = descripcion;
    }
}
