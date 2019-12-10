
package microproyecto;

import javax.swing.JOptionPane;


public class MicroProyecto {

  
    public static void main(String[] args) {
        
       bienvenido Welcome =new bienvenido(); 
     JOptionPane.showMessageDialog(null,""+Welcome.getbienvenidoastrac());

        Login L = new Login();
        L.setVisible(true);
        
    }
    
}
