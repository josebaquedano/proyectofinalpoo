/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microproyecto;

/**
 *
 * @author EDWIN
 */
public class articulos {
    
    String codigo;
    String articulo, categoria;
   
    
    public articulos() {
        
    }   
    
    public articulos(String cod, String art, String cat) {
        codigo = cod;
        articulo = art;
        categoria = cat;
    }       

    public String getCodigo() {
        return codigo;
    }

    public String getArticulo() {
        return articulo;
    }

    public String getCategoria() {
        return categoria;
    }
    
}
