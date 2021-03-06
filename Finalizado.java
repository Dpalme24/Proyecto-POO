package organizador;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;


public class Finalizado extends javax.swing.JFrame {
private ArrayList<Articulo> finale;
    
    public Finalizado() {
              
        initComponents();
    }

    public Finalizado(Aparador Final, String ordenamiento){
      initComponents();
      String texto = "";
      Final.bubbleSort(ordenamiento);
      finale = Final.getListaArticulos();
      for (int i=0; i < finale.size(); i++){
          texto = String.format("%s %s %n ",  texto, finale.get(i).getTitulo(), finale.get(i).getAno());
             
    }
      jTextArea1.setText(texto);
      jTextArea1.setEditable(false);
      abrirArchivo();
      escribirArchivo(texto);
      cerrarArchivo();
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Su estante contiene");

        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
      
        JOptionPane.showMessageDialog(this, "Encontrara su documento guardado en la misma carpeta donde esta este proyecto con el nombre g fa");
    }//GEN-LAST:event_jButton1MouseClicked


    public static void abrirArchivo(){
        try {
            archivo = new Formatter("g_fa.txt");
        } catch (FileNotFoundException ex) {
            System.err.println("No existe el archivo");
            System.exit(1);
        }catch(SecurityException ex){
            System.err.println("El archivo no tiene permisos de escritura");
            System.exit(1);
            
        }
    }
    public static void escribirArchivo(String texto){
        try{
                  archivo.format( "%s", texto );
          
            }catch( FormatterClosedException e ){
                System.err.println("Error al abrir el archivo!");
                JOptionPane.showMessageDialog(null, "Error al abrir el archivo!",
                        "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                
            }catch( NoSuchElementException e ){
                
                    System.err.println("Entrada invalida!");
                    JOptionPane.showMessageDialog(null, "Entrada invalida!",
                        "Advertencia", JOptionPane.WARNING_MESSAGE);
                   
                
            }
    }
     public static void cerrarArchivo(){
        if(archivo!=null)
            archivo.close();
    }
    private static Formatter archivo;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
