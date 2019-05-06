package organizador;

public class Disco extends Articulo {
    private double capacidad;
    
    // getters y setters
    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
    
    // constructor

    public Disco(double capacidad, double ancho, double alto, String titulo, String tipo) {
        super(ancho, alto, titulo, tipo);
        this.capacidad = capacidad;
    }

    
   
    
}
