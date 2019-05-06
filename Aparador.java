package organizador;

import java.util.ArrayList;
import java.util.Collections;


public class Aparador {
    private int numEstantes;
    private Estante[] listaEstantes;
    private ArrayList<Articulo> listaArticulos;
    private double sumaTotal;
    
    
    public Aparador(int cantidad, double longitud ) {
      numEstantes = cantidad;
       listaEstantes = new Estante[numEstantes];
       listaArticulos = new ArrayList<>();
       
       for (int i=0; i<numEstantes; i++){
           Estante temporal = new Estante(longitud);
           listaEstantes[i]= temporal;
       }
    }
    
    public ArrayList<Articulo> getListaArticulos() {
        return listaArticulos;
    }

    public void setListaArticulos(ArrayList<Articulo> listaArticulos) {
        this.listaArticulos = listaArticulos;
    }
    
    public double getSumaTotal() {
        return sumaTotal;
    }

    public void setSumaTotal(double sumaTotal) {
        this.sumaTotal = sumaTotal;
    }

    public int getNumEstantes() {
        return numEstantes;
    }

    public void setNumEstantes(int numEstanes) {
        this.numEstantes = numEstanes;
    }

    public Estante[] getListaEstantes() {
        return listaEstantes;
    }

    public void setListaEstantes(Estante[] listaEstantes) {
        this.listaEstantes = listaEstantes;
    }
    
    public void agregarArticulo (Articulo art){
        listaArticulos.add(art);
    }
    
    public void bubbleSort( String opc ) {
        int n = listaArticulos.size();
        Articulo temp;
        if (n > 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < (n - j); j++) {
                    if(listaArticulos.get(j).getTitulo().compareTo(listaArticulos.get(j+1).getTitulo()) > 0) {
                        temp = listaArticulos.get(j);
                        listaArticulos.set(j,listaArticulos.get(j+1));
                        listaArticulos.set( (j+1), temp);
                    }
                }
            }

            if (opc.equals("Z-A")){
                Collections.reverse(listaArticulos);
            }
        }
    }
    
}
