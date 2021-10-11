

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class GUI extends JFrame implements ActionListener {
 
    static JFrame Contenedor;
    
    static JTextField contenidoNombreInput;
    static JTextField contenidoRUT;                             
    static JTextField contenidotelefono;                        
    static JTextField contenidoDireccion;
    static JTextField contenidoMotivoContacto;
    
    static JComboBox dropDownRegiones;
    static JComboBox dropDownCalidadContacto;
    
    static JLabel contenidoRegistrado;
    static JButton enviar;
    
 
    // main class
    public static void main(String[] args)
    {
        // Contenedor Principal        
        Contenedor = new JFrame("Tarea 8");
     
        String regiones[] = {
            "Arica y Parinacota", 
            "Tarapacá", 
            "Antofagasta", 
            "Atacama", 
            "Coquimbo", 
            "Valparaíso", 
            "Región del Libertador Gral. Bernardo O’Higgins", 
            "Región del Maule", 
            "Región del Biobío", 
            "Región de la Araucanía", 
            "Región de Los Ríos", 
            "Región de Los Lagos", 
            "Región Aisén del Gral. Carlos Ibáñez del Campo", 
            "Región de Magallanes y de la AntárVca Chilena", 
            "Región Metropolitana de Santiago"};            
        dropDownRegiones = new JComboBox(regiones);
        
        String calidadContacto[] = {"1","2","3","4","5"};
        dropDownCalidadContacto = new JComboBox(calidadContacto);
         
        // Inputs
        contenidoNombreInput = new JTextField("", 16);   
        contenidoRUT = new JTextField("", 16);                             
        contenidotelefono = new JTextField("", 16);                        
        contenidoDireccion = new JTextField("", 16);
        contenidoMotivoContacto = new JTextField("", 16);
        
        // Contenido Registrado
        contenidoRegistrado = new JLabel("-");
        
        // Boton Enviar
        GUI contenedor = new GUI();
        enviar = new JButton("enviar");
        enviar.addActionListener(contenedor);
        
        
        
        
        // Panel
        JPanel Panel = new JPanel();      
        
        Panel.add(new JLabel("Ingrese Nombre"));
        Panel.add(contenidoNombreInput);
         Panel.add(new JLabel("Ingrese Rut"));
        Panel.add(contenidoRUT);   
         Panel.add(new JLabel("Ingrese Telefono"));
        Panel.add(contenidotelefono);           
         Panel.add(new JLabel("Ingrese Direccion"));
        Panel.add(contenidoDireccion);
         Panel.add(new JLabel("Ingrese Motivo Contacto"));
        Panel.add(contenidoMotivoContacto);
        
        
        Panel.add(new JLabel("Seleccione Region:"));
        Panel.add(dropDownRegiones);
        
        Panel.add(new JLabel("Calidad Contanto (1 mala ) - ( 5 buena):"));
        Panel.add(dropDownCalidadContacto);
        
        Panel.add(enviar);
      
        Panel.add(new JLabel("Cotenido Registrado:"));
        Panel.add(contenidoRegistrado);
        
        
        // Panel.setLayout(new GridLayout(10, 0));
        // Panel.setLayout(new FlowLayout(10));
        
          
        // Contenedor
        Contenedor.add(Panel); 
        Contenedor.setSize(300, 600);  
        Contenedor.show();
        
        
        
        
        
        
    }
 
    
    
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("enviar")) {
            // get content and display
            contenidoRegistrado.setText(
            "<html>"
            +"Nombre: "+contenidoNombreInput.getText()+"<br>"
            +"Region: "+dropDownRegiones.getSelectedItem().toString()+"<br>"
            +"Calidad Contacto: "+dropDownCalidadContacto.getSelectedItem().toString()+"<br>"
            +"RUT: "+contenidoRUT.getText()+"<br>"
            +"Telefono: "+contenidotelefono.getText()+"<br>"
            +"Direccion: "+contenidoDireccion.getText()+"<br>"
            +"Motivo Contacto: "+contenidoMotivoContacto.getText()+"<br>"
            +"</html>"
            ); 
            
            
            // reset input
            // contenidoNombreInput.setText("");
            
        }
    }
}
