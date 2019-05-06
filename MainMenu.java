package organizador;

import java.awt.FlowLayout;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainMenu extends JFrame {
    private JButton NuevoBoton; //Boton para nuevo estante
    private JButton CargarBoton; //Boton para cargar estante
    private Image background;
    private String dirArchivo; //Direccion de estante a cargar
    private int numEstantes; //Cuantos estantes tendra el nuevo
    private double longitud; //Longitud de los estantes
   

    public MainMenu() {
        super("Menu Principal");
        this.setLayout(new FlowLayout());
        NuevoBoton = new JButton("Nuevo estante");
        NuevoBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuevoBotonMouseClick(evt);
            }
        });
        CargarBoton = new JButton("Cargar Estante");
        CargarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarBotonMouseClick(evt);
            }
        });
        
   
        
        add(NuevoBoton);
        
     
    }
    
    private void NuevoBotonMouseClick(java.awt.event.MouseEvent evt){
        //ir a otra ventana
        try{
        
        //numEstantes = Integer.parseInt(JOptionPane.showInputDialog("Dame la cantidad de estantes:")); // agregar excepcion si no es numero entero
        //longitud = Double.parseDouble(JOptionPane.showInputDialog("Dame la longitud de los estantes:"));
        numEstantes=1;
        longitud=1;
                
        //crear interfaz con tantos estantes
        Aparador Contenedor = new Aparador(numEstantes, longitud);
        //cambiar a ventana para agregar articulos y cerrar ventana
        
        AgregarArticulo vent;
        vent = new AgregarArticulo(Contenedor);
        vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //determinar que hacer cuando se cierre la ventana
        vent.setSize(400,250); //tamaño ventana
        vent.setVisible(true); //hacer visible
        dispose();
        
         }catch(Exception e){
            System.err.println("Solo numeros y no lo dejes vacio");
        }
        
    }
    
    private void CargarBotonMouseClick(java.awt.event.MouseEvent evt){
        //ir a pop up
        dirArchivo = JOptionPane.showInputDialog("Dame la direccion del archivo:");
        System.out.println(dirArchivo);
        //abrir archivo
    }
    
    
    
}
