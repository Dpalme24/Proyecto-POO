package organizador;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class OrdenarEstantes extends JFrame {
    private final static String[] opciones={"A-Z", "Z-A"};
    private JComboBox ordenamiento;
    private JButton boton;
   
    private Aparador finale;
    
    
    
    
    public OrdenarEstantes(Aparador temporal){
      
        
        finale = temporal;
        ordenamiento = new JComboBox(opciones);
           
        
        setSize(200,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());   
        setVisible(true);
        
       
        
       
        
        
        
        add(ordenamiento);
        
        
        
        
       
        boton = new JButton("Finalizar");
        add(boton);
        
         boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMouseClick(evt);
            }});
    
}

            private void botonMouseClick(MouseEvent evt) {
                String texto = "";
                texto = (String) ordenamiento.getSelectedItem();
             Finalizado vent = new Finalizado(finale, texto);   
             vent.setVisible(true);
             dispose();
            }
    
    
}
