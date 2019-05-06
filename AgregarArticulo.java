package organizador;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AgregarArticulo extends JFrame{
    private  final JLabel titulo;
    private JLabel articulosTodos;
    private JComboBox tipos;
    private JButton terminar;
    private JButton agregar;
    private String articulos;
    
    private final static String[] opciones= {"DVD/CD/Blu-Ray","VHS", "Otros"};
    private Aparador Contenedor;
    
    private NuevoArticulo vent;
    private Disco disc;
    private VHS vhs;
    private Libro lib;
    private Otro xeno;
   
    public static int contador = 0; // contador
    private static int libros=0;
    private static int pelis=0;
    private static int discos=0;
    private static int xenos=0;
    
    public AgregarArticulo(Aparador temporal){
        super("Nuevo Articulo");
        
        Contenedor = temporal;
        
         
        this.setLayout(new BorderLayout(5,10));
        
        
        //texto de los articulos
        articulos = String.format("DVD/CD/Blu-Ray: %d VHS: %d Otros: %d",discos,pelis,xenos);
        articulosTodos = new JLabel(articulos);
        
        titulo = new JLabel("Agregar un articulo");
        
        //combobox
        tipos = new JComboBox(opciones);
        
        //botones
        terminar = new JButton("Listo");
        agregar = new JButton ("Agregar elemento");
        
        
        
        //agregar con border layour
        JPanel paneltop= new JPanel();
        JPanel panelcenter= new JPanel();
        JPanel panelright= new JPanel();
        JPanel panelbottom= new JPanel();
        
        paneltop.add(titulo);
        panelcenter.add(tipos);
        panelright.add(articulosTodos);
        panelbottom.add(agregar);
        panelbottom.add(terminar);
        
        
        add(paneltop, BorderLayout.NORTH);
        add(panelright, BorderLayout.EAST);
        add(panelcenter, BorderLayout.CENTER);
        add(panelbottom, BorderLayout.SOUTH);
        
        terminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                terminarMouseClick(evt);
            }
});
        agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarMouseClick(evt);
            }                
        });
    
    
    
    
}
     private void terminarMouseClick(MouseEvent evt) {
                //cambiar a la siguiente seccion
                if (contador ==0){
                    JOptionPane.showMessageDialog(null,"No ha agregado ningun artiuclo", "Error", JOptionPane.WARNING_MESSAGE);
                }else{
                    OrdenarEstantes vent;
                    vent = new OrdenarEstantes(Contenedor);
                    dispose();
                }
            }
     
     private void agregarMouseClick(MouseEvent evt) {
                String opcion;
                opcion= (String) tipos.getSelectedItem();
                if(opcion.equals("DVD/CD/Blu-Ray")){
                    vent = new NuevoArticulo(disc, Contenedor);
                    discos++;
                }else if(opcion.equals("VHS")){
                    
                   vent = new NuevoArticulo(vhs,  Contenedor);
                   pelis++;
                }else if(opcion.equals("Libros")){
                    
                    vent = new NuevoArticulo(lib, Contenedor);
                    libros++;
                }else if(opcion.equals("Otros")){
                    
                    vent = new NuevoArticulo(xeno, Contenedor);
                    xenos++;
                }
                contador ++;
                dispose();
            }
}
