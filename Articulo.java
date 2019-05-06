package organizador;


public abstract class Articulo {
    protected String titulo;
    protected int ano;
    
    public Articulo(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }
}
