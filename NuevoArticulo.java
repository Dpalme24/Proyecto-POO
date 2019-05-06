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
    JLabel label4;
    JLabel label5;
    JLabel label6;
    
    JComboBox comboBox1;
    
    JTextField field1;
    JTextField field2;
    JTextField field3;
    JTextField field4;
    JTextField field5;
    JTextField field6;
    
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
        
        label1 = new JLabel("Alto");
        label2 = new JLabel("Título");
        label3 = new JLabel("Capacidad");
        
        field1 = new JTextField(10);
        field2 = new JTextField(10);
        field3 = new JTextField(10);
        
        comboBox1 = new javax.swing.JComboBox<>();
        comboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CD", "DVD", "Blu-Ray"}));
        
        boton = new JButton("Agregar");
        
        add(label1);
        add(field1);
        add(label2);
        add(field2);
        add(comboBox1);
        add(label3);
        add(field3);
        add(boton);
       
        
                
        opcion= "DVD";
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
        
        label1 = new JLabel("Ancho");
        label2 = new JLabel("Alto");
        label3 = new JLabel("Título");
        label4 = new JLabel("ISBN");
        label5 = new JLabel("Género");
        label6 = new JLabel("Portada");
        
        field1 = new JTextField(10);
        field2 = new JTextField(10);
        field3 = new JTextField(10);
        field4 = new JTextField(10);
        field5 = new JTextField(10);
        field6 = new JTextField(10);
        
        boton = new JButton("Agregar");
        
        add(label1);
        add(field1);
        add(label2);
        add(field2);
        add(label3);
        add(field3);
        add(label4);
        add(field4);
        add(label5);
        add(field5);
        add(label6);
        add(field6);
        add(boton);
        
        
        opcion = "lib";
        
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
        
        label1 = new JLabel("Alto");
        label2 = new JLabel("Título");
        label3 = new JLabel("Duración");
        label4 = new JLabel("Estado");
        label5 = new JLabel("Contenido");
        
        field1 = new JTextField(10);
        field2 = new JTextField(10);
        field3 = new JTextField(10);
        field4 = new JTextField(10);
        field5 = new JTextField(10);
        
        boton = new JButton("Agregar");
        
        add(label1);
        add(field1);
        add(label2);
        add(field2);
        add(label3);
        add(field3);
        add(label4);
        add(field4);
        add(label5);
        add(field5);
        add(boton);
        
        temp = Contenedor;
        opcion = "vhs";
        
         boton.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMouseClick(evt);
            }
            
            
        });
        

    }
    public NuevoArticulo(Otro xeno, Aparador Contenedor){
        setSize(150,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());   
        setVisible(true);
        
        label1 = new JLabel("Ancho");
        label2 = new JLabel("Alto");
        label3 = new JLabel("Título");
        label4 = new JLabel("Tipo");
        label5 = new JLabel("Descripción");
        
        field1 = new JTextField(10);
        field2 = new JTextField(10);
        field3 = new JTextField(10);
        field4 = new JTextField(10);
        field5 = new JTextField(10);
        
        boton = new JButton("Agregar");
        
        add(label1);
        add(field1);
        add(label2);
        add(field2);
        add(label3);
        add(field3);
        add(label4);
        add(field4);
        add(label5);
        add(field5);
        add(boton);
        
        
        temp= Contenedor;
        opcion = "xeno";
        
         boton.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMouseClick(evt);
            }
           

            
        });
    }
    
     private void botonMouseClick(MouseEvent evt) {
         try{
             if (opcion.equals("DVD")){   
             disco = new Disco(1,1,1,"r","r");
         disco.setAlto(Double.parseDouble( field1.getText() ));
             disco.setTitulo( field2.getText() );
             disco.setTipo((String) comboBox1.getSelectedItem());
             disco.setCapacidad( Double.parseDouble( field3.getText() ) );
             temp.agregarArticulo(disco);
     }else if (opcion.equals("lib")){
         libro = new Libro("1", "1", "1",1,1,"1","1");
         libro.setAlto(Double.parseDouble(field2.getText()));
         libro.setAncho(Double.parseDouble(field1.getText()));
             libro.setTitulo(field3.getText());
             libro.setISBN(field4.getText());
             libro.setGenero(field5.getText());
             libro.setPortada(field6.getText());
             
             temp.agregarArticulo(libro);
     }else if (opcion.equals("vhs")){
         vhs = new VHS("1", "1","1",1,1,"1","1");
         vhs.setAlto(Double.parseDouble(field1.getText()));
         vhs.setTitulo(field2.getText());
         vhs.setDuracion(field3.getText());
         vhs.setEstado(field4.getText());
         vhs.setContenido(field5.getText());
         
         temp.agregarArticulo(vhs);
     }else if (opcion.equals("xeno")){
         otro = new Otro("1",1,1,"1","1");
         otro.setAncho(Double.parseDouble(field1.getText()));
         otro.setAlto(Double.parseDouble(field2.getText()));
         otro.setTitulo(field3.getText());
         otro.setTipo(field4.getText());
         otro.setDescripcion(field5.getText());
         
         temp.agregarArticulo(otro);
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
