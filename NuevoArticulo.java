package organizador;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NuevoArticulo extends JFrame{
    JLabel label1;
    JLabel label2;
    JLabel label3;
    
    JComboBox comboBox1;
    
    JTextField field1;
    JTextField field2;
    JTextField field3;
    
    JButton boton;
    
    private Libro libro;
    private Disco disco;
    private VHS vhs;
    private Otro otro;
    private Aparador temp;
    
    private String opcion;
    
    public NuevoArticulo(Disco disc, Aparador Contenedor){
        setSize(150,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());   
        setVisible(true);
        
        label1 = new JLabel("Nombre");
        label2 = new JLabel("Ano");
        
        field1 = new JTextField(14);
        field2 = new JTextField(5);
        
        boton = new JButton("Agregar");
        
        add(label1);
        add(field1);
        add(label2);
        add(field2);
        add(boton);
        
        opcion= "disco";
        temp = Contenedor;
        
        boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMouseClick(evt);
            }
        });
    }
    
    
    
    public NuevoArticulo(Libro lib, Aparador Contenedor){
        setSize(150,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());   
        setVisible(true);
        
        label1 = new JLabel("Título");
        label2 = new JLabel("Ano");
        label3 = new JLabel("Género");
        
        field1 = new JTextField(14);
        field2 = new JTextField(5);
        field3 = new JTextField(8);
        
        boton = new JButton("Agregar");
        
        add(label1);
        add(field1);
        add(label2);
        add(field2);
        add(label3);
        add(field3);
        add(boton); 
        
        opcion = "libro";
        
        boton.addMouseListener(new java.awt.event.MouseAdapter() {  
        public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMouseClick(evt);
        }});
    }
    
    public NuevoArticulo(VHS vid, Aparador Contenedor){
        setSize(150,310);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());   
        setVisible(true);
        
        label1 = new JLabel("Nombre");
        label2 = new JLabel("Ano");
        field1 = new JTextField(14);
        field2 = new JTextField(5);
        
        boton = new JButton("Agregar");
        
        add(label1);
        add(field1);
        add(label2);
        add(field2);
        add(boton);
        
        temp = Contenedor;
        opcion = "vhs";
        
        boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMouseClick(evt);
            }
        });
    }
    
    public NuevoArticulo(Otro otro, Aparador Contenedor){
        setSize(150,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());   
        setVisible(true);
        
        label1 = new JLabel("Nombre");
        label2 = new JLabel("Ano");
        label3 = new JLabel("Descripción");
        
        field1 = new JTextField(14);
        field2 = new JTextField(5);
        field3 = new JTextField(8);

        boton = new JButton("Agregar");
        
        add(label1);
        add(field1);
        add(label2);
        add(field2);
        add(label3);
        add(field3);
        add(boton);
        
        temp= Contenedor;
        opcion = "otro";
        
        boton.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMouseClick(evt);
            }    
        });
    }
    
    private void botonMouseClick(MouseEvent evt) {
        try{
            if (opcion.equals("disco")){   
                temp.agregarArticulo(new Disco(field1.getText(), Integer.parseInt(field2.getText())));
            }else if (opcion.equals("libro")){
                temp.agregarArticulo(new Libro(field3.getText(), field1.getText(), Integer.parseInt(field2.getText())));
            }else if (opcion.equals("vhs")){
                temp.agregarArticulo(new VHS(field1.getText(), Integer.parseInt(field2.getText())));
            }else if (opcion.equals("otro")){
                temp.agregarArticulo(new Otro(field3.getText(), field1.getText(), Integer.parseInt(field2.getText())));
            }

            AgregarArticulo vent;
            vent = new AgregarArticulo(temp);
            vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //determinar que hacer cuando se cierre la ventana
            vent.setSize(400,250); //tamaño ventana
            vent.setVisible(true); //hacer visible
            dispose();
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
