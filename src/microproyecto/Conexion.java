
package microproyecto;
import java.sql.*;
import javax.swing.*;
import java.util.*;

public class Conexion {
     Connection con;
    
    public Connection Conectar()
    {
        try
        {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/CINE");
           JOptionPane.showMessageDialog(null, "BASE DE DATOS CONECTADA EXITOSA");
            return con;
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
        }
        return null;
    }
    
    
}
