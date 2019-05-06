package organizador;

import java.util.ArrayList;

public class Estante {
    private double lenEstante;
    private ArrayList<Articulo> listaArticulos;
    

    public double getLenEstante() {
        return lenEstante;
    }

    public void setLenEstante(double lenEstante) {
        this.lenEstante = lenEstante;
    }

    public ArrayList<Articulo> getListaArticulos() {
        return listaArticulos;
    }

    public void setListaArticulos(ArrayList<Articulo> listaArticulos) {
        this.listaArticulos = listaArticulos;
    }

    public Estante(double longitud){
        lenEstante= longitud;
        
    }
}
