/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microproyecto;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author KEVIN BAQUEDANO
 */
public class ticket extends javax.swing.JInternalFrame {
Conexion conex = new Conexion();
    Connection con2;
    /**
     * Creates new form ticket
     */
    public ticket() {
        initComponents();
         Principal.controlArt = true;
         cargarPeliculas();
         this.jBimprimirFactura.setEnabled(false);
         this.JtxtNombre.setEnabled(false);
    }

     public void ingresar(){
    
     con2 = conex.Conectar();

           
                try
                {
                    Statement insertar = con2.createStatement();
                    String query = "INSERT INTO TICKET (IDTICKET, NOMBRE_CLIENTE, PELICULAS, PRECIO, CANTIDAD, DESCUENTO, TOTAL)"
                    + " VALUES (" + this.JtxtID.getText() + ",'" + this.JtxtNombre.getText() + "','" + this.JBCpeliculas.getSelectedItem() + "'," 
                            + this.JtxtPrecio.getText() + "," + this.JtxtCantidad.getText() + ","+ this.JtxtDescuento.getText()+","+ this.JtxtTotal.getText() + ")";
                    insertar.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "¡VENTA ALMACENADA CORRECTAMENTE!");
                   
                }
                catch(SQLException ex)
                {
                    JOptionPane.showMessageDialog(null, "Error: " + ex);
                }
            
    
    
    }
    
    public void cargarPeliculas(){
        this.JBCpeliculas.removeAllItems();
        this.JBCpeliculas.addItem("Seleccione un Pelicula");
        this.JBCpeliculas.addItem("Veronica");
        this.JBCpeliculas.addItem("THOR:Ragnarok ");
        this.JBCpeliculas.addItem("Rapidos y Furiosos 9");
        this.JBCpeliculas.addItem("Chucky de Regreso");
        this.JBCpeliculas.addItem("La Noche del Demonio");
        this.JtxtCantidad.setText("");
}
   public void limpiar (){
   
        this.JtxtSubtotal.setText("");
        this.JtxtISV.setText("");
        this.JtxtTotal.setText("");
        this.JtxtCantidad.setText("");
        this.JtxtPrecio.setText("");
   
   }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Jlimagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAsinopsis = new javax.swing.JTextArea();
        JBCpeliculas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jRB2d = new javax.swing.JRadioButton();
        jRB3d = new javax.swing.JRadioButton();
        jRBvip = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jCBestudiantes = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jCBterceraEdad = new javax.swing.JCheckBox();
        jCBmitad = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        JtxtCantidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JtxtSubtotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        JtxtISV = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        JtxtDescuento = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        JtxtTotal = new javax.swing.JTextField();
        JBcalcular = new javax.swing.JButton();
        jBimprimirFactura = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        JtxtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        JtxtID = new javax.swing.JTextField();
        JtxtNombre = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jBSi = new javax.swing.JButton();
        jBNo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/microproyecto/iconos/cinepolis.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jlimagen, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jlimagen, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTAsinopsis.setEditable(false);
        jTAsinopsis.setColumns(20);
        jTAsinopsis.setRows(5);
        jScrollPane1.setViewportView(jTAsinopsis);

        JBCpeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCpeliculasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Peliculas");

        jRB2d.setText("2D");
        jRB2d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB2dActionPerformed(evt);
            }
        });

        jRB3d.setText("3D");
        jRB3d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB3dActionPerformed(evt);
            }
        });

        jRBvip.setText("VIP");
        jRBvip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBvipActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Salas");

        jCBestudiantes.setText("Estudiantes 10%");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Descuentos");

        jCBterceraEdad.setText("Tercera edad 25%");

        jCBmitad.setText("Mitad de precio");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Cantidad de boletos");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Sub Total");

        JtxtSubtotal.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("ISV (15%)");

        JtxtISV.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Descuentos");

        JtxtDescuento.setEditable(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Total");

        JtxtTotal.setEditable(false);

        JBcalcular.setText("Calcular");
        JBcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcalcularActionPerformed(evt);
            }
        });

        jBimprimirFactura.setText("Imprimir Factura");
        jBimprimirFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBimprimirFacturaActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Precio");

        JtxtPrecio.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Lp.80");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Lp.100");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Lp.150");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Sinopsis");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Nombre :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("ID Cliente:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Con Nombre la Facturacion :");

        jBSi.setText("Si");
        jBSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSiActionPerformed(evt);
            }
        });

        jBNo.setText("No");
        jBNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNoActionPerformed(evt);
            }
        });

        jButton1.setText("VER TABLA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(JBCpeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel6))
                            .addComponent(jRB2d)
                            .addComponent(jLabel14))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jRB3d))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JtxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jRBvip))))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel11))
                            .addComponent(jCBestudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBterceraEdad)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addComponent(JtxtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jCBmitad))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(JtxtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(57, 57, 57)
                        .addComponent(JtxtISV, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(50, 50, 50)
                        .addComponent(JtxtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(JtxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jBimprimirFactura)
                        .addGap(38, 38, 38)
                        .addComponent(JBcalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JtxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBNo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(JtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(JtxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jBSi)
                            .addComponent(jBNo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(JtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(JBCpeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(7, 7, 7)
                                .addComponent(jRB2d)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel14))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(7, 7, 7)
                                .addComponent(jRB3d))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(7, 7, 7)
                                .addComponent(jRBvip)
                                .addGap(7, 7, 7)
                                .addComponent(JtxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel11)
                                .addGap(7, 7, 7)
                                .addComponent(jCBestudiantes)
                                .addGap(7, 7, 7)
                                .addComponent(jCBterceraEdad)))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(JtxtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCBmitad))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JtxtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel10))
                            .addComponent(JtxtISV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4))
                            .addComponent(JtxtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel12))
                            .addComponent(JtxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBimprimirFactura)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JBcalcular)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel13)
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
       Principal.controlArt = false;
    }//GEN-LAST:event_formInternalFrameClosing

    private void JBCpeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCpeliculasActionPerformed
        

        if(this.JBCpeliculas.getSelectedItem() == "Veronica"){
        Jlimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/microproyecto/iconos/vero.jpg")));
        this.jTAsinopsis.setText("En el Madrid de los años 90, "
                +"\n"+ "un grupo de amigas hacen una sesión de ouija."
                +"\n"+ " Al acabar, una de las adolescentes es poseída "
                +"\n"+ "por unas presencias sobrenaturales que"
                +"\n"+ " amenazan con hacerles daño a ella y sus familiares.");
                limpiar();
        }
       
            if(this.JBCpeliculas.getSelectedItem() == "THOR:Ragnarok "){
        Jlimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/microproyecto/iconos/thor.jpg")));
        this.jTAsinopsis.setText("Thor está preso en el otro extremo del universo"
                +"\n"+ " Necesita regresar a tiempo para evitar que la "
                +"\n"+ "todopoderosa Hela destruya su mundo, "
                +"\n"+ "pero para escapar de su confinamiento y evitar el"
                +"\n"+ " apocalipsis tendrá que vencer"
                +"\n"+ " antes al Increíble Hulk en un torneo de gladiadores.");
                limpiar();
        }
            
    if(this.JBCpeliculas.getSelectedItem() == "Rapidos y Furiosos 9"){     
        Jlimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/microproyecto/iconos/rapidos y furiosos 9.jpg")));
         this.jTAsinopsis.setText("Con Dom y Letty de luna de miel, Brian"
                 +"\n"+ " y Mia retirados y el resto de la pandilla"
                 +"\n"+ " viviendo en paz, parece que todo está tranquilo"
                 +"\n"+ ". Sin embargo, una misteriosa mujer seducirá a"
                 +"\n"+ " Dom para adentrarlo en el mundo del crimen "
                 +"\n"+ "y traicionar a la pandilla.");
                limpiar();
                }
                
    if(this.JBCpeliculas.getSelectedItem() == "Chucky de Regreso"){
        Jlimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/microproyecto/iconos/11.jpg")));
         this.jTAsinopsis.setText("Un detective (Chris Sarandon) "
                 +"\n"+ "de Chicago persigue a Chucky,un muñeco"
                 +"\n"+ " asesino comprado por una madre(Catherine Hicks)"
                 +"\n"+ "  para su hijo (Alex Vincent).");
                 limpiar();  
                }
                    
    if(this.JBCpeliculas.getSelectedItem() == "La Noche del Demonio"){
        Jlimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/microproyecto/iconos/la noche del demonio.jpg")));
         this.jTAsinopsis.setText("Una prestigiosa parapsicóloga"
                 +"\n"+ " y su equipo se desplazan a Nuevo México "
                 +"\n"+ "para investigar los fenómenos que ocurren en la "
                 +"\n"+ "casa en la que ella creció. Allá, ella deberá "
                 +"\n"+ "enfrentarse a su mayor miedo: el demonio "
                 +"\n"+ "que sin querer liberó en el pasado.");
                limpiar();
        }
    if(this.JBCpeliculas.getSelectedItem() == "Seleccione un Pelicula"){
        Jlimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
                this.jTAsinopsis.setText("");
                 limpiar();
        }
    
    }//GEN-LAST:event_JBCpeliculasActionPerformed

    private void jRB2dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB2dActionPerformed
        if (this.jRB2d.isSelected())
        {
            this.jRB3d.setSelected(false);
            this.jRBvip.setSelected(false);
            this.JtxtPrecio.setText("80");
        } else{
        this.JtxtPrecio.setText("");
        }
    }//GEN-LAST:event_jRB2dActionPerformed

    private void jRB3dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB3dActionPerformed
         if (this.jRB3d.isSelected())
        {
            this.jRB2d.setSelected(false);
            this.jRBvip.setSelected(false);
             this.JtxtPrecio.setText("100");
        } else{
        this.JtxtPrecio.setText("");
        }
    }//GEN-LAST:event_jRB3dActionPerformed

    private void jRBvipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBvipActionPerformed
        if (this.jRBvip.isSelected())
        {
            this.jRB3d.setSelected(false);
            this.jRB2d.setSelected(false);
             this.JtxtPrecio.setText("150");
        }
        else{
        this.JtxtPrecio.setText("");
        }
    }//GEN-LAST:event_jRBvipActionPerformed

    private void JBcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcalcularActionPerformed
        double edad, estudantes,precio,mitad, subtotal, isv, descuento, total;
        int cantidad;
      this.jBimprimirFactura.setEnabled(true);
        if(this.JtxtID.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Ingrese Su ID.....");
        }else{
      if(this.JBCpeliculas.getSelectedItem().equals("Seleccione un Pelicula")){  
        JOptionPane.showMessageDialog(null, "Debe de Seleccionar Pelicula..");
      }else{
          if(this.JtxtPrecio.getText().equals("")){  
        JOptionPane.showMessageDialog(null, "Debe de Seleccionar una Sala...Porfavor");
          }else{
        if(this.JtxtCantidad.getText().equals(""))
       {
           this.JtxtCantidad.setBackground(Color.red);
           JOptionPane.showMessageDialog(null, "Debe de Ingresar la Cantidad de Boletos...Gracias...");
           
          
       }
       else
       {
           try
           {
             
               precio = Double.parseDouble(this.JtxtPrecio.getText());
               cantidad = Integer.parseInt(this.JtxtCantidad.getText());
               
               subtotal = cantidad * precio;
               isv = subtotal * 0.15;
               
               if(this.jCBestudiantes.isSelected()){
                   estudantes = 0.10;
                   this.jCBterceraEdad.setSelected(false);
         
               }else{
                   estudantes = 0;
                           }
               if(this.jCBterceraEdad.isSelected()){
                   edad = 0.25;
                   this.jCBestudiantes.setSelected(false);
               }else{
                   edad = 0;
               }
               if(this.jCBmitad.isSelected())
                   mitad = 0.50;
               else
                   mitad = 0;
               
              if(this.jCBestudiantes.isSelected() || this.jCBterceraEdad.isSelected() || this.jCBmitad.isSelected())                   
                   descuento = ((estudantes + edad + mitad)/100) * subtotal;
               else
                   descuento = 0;
               
               total = (subtotal + isv) - descuento;
               
               this.JtxtSubtotal.setText(""+subtotal);
               this.JtxtISV.setText(""+isv);
               this.JtxtDescuento.setText(""+descuento);
               this.JtxtTotal.setText(""+total);
               ingresar();
           }
           catch(NumberFormatException ex)
           {
               JOptionPane.showMessageDialog(null, "ERROR, deben ser solo numeros");   
           }
       }
    }//GEN-LAST:event_JBcalcularActionPerformed
      }
    }
    }
          
    private void jBimprimirFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBimprimirFacturaActionPerformed
        if(this.JtxtCantidad.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Primero Calcule los datos....Gracias..");
        }else{
       JOptionPane.showMessageDialog(null,"NOMBRE CLIENTE:"+this.JtxtNombre.getText()+"\n"+"NOMBRE PELICULA:"+this.JBCpeliculas.getSelectedItem().toString()
               +"\n"+"PRECIO:"+this.JtxtPrecio.getText()+"\n"+"CANTIDAD:"+this.JtxtCantidad.getText()+"\n"+
               "SUBTOTAL:"+this.JtxtSubtotal.getText()+"\n"+"ISV(15%):"+this.JtxtISV.getText()+"\n"+
               "DESCUENTO:"+this.JtxtDescuento.getText()+"\n"+"TOTAL:"+this.JtxtTotal.getText(),"FACTURA TICKET CINEPOLIS", JOptionPane.INFORMATION_MESSAGE);
        }
      
        Jlimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        this.jTAsinopsis.setText("");
         limpiar();
        this.JtxtDescuento.setText("");
        this.JtxtNombre.setText("");
        this.JtxtID.setText("");
        this.JtxtNombre.setEnabled(false);
        this.jRB3d.setSelected(false);
        this.jRB2d.setSelected(false);
        this.jRBvip.setSelected(false);
       
    }//GEN-LAST:event_jBimprimirFacturaActionPerformed

    private void jBSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSiActionPerformed
        this.JtxtNombre.setEnabled(true);
    }//GEN-LAST:event_jBSiActionPerformed

    private void jBNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNoActionPerformed
        this.JtxtNombre.setEnabled(false);
    }//GEN-LAST:event_jBNoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       TablaTicket t = new TablaTicket();
       t.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
      
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JBCpeliculas;
    private javax.swing.JButton JBcalcular;
    private javax.swing.JLabel Jlimagen;
    private javax.swing.JTextField JtxtCantidad;
    private javax.swing.JTextField JtxtDescuento;
    private javax.swing.JTextField JtxtID;
    private javax.swing.JTextField JtxtISV;
    private javax.swing.JTextField JtxtNombre;
    private javax.swing.JTextField JtxtPrecio;
    private javax.swing.JTextField JtxtSubtotal;
    private javax.swing.JTextField JtxtTotal;
    private javax.swing.JButton jBNo;
    private javax.swing.JButton jBSi;
    private javax.swing.JButton jBimprimirFactura;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCBestudiantes;
    private javax.swing.JCheckBox jCBmitad;
    private javax.swing.JCheckBox jCBterceraEdad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRB2d;
    private javax.swing.JRadioButton jRB3d;
    private javax.swing.JRadioButton jRBvip;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAsinopsis;
    // End of variables declaration//GEN-END:variables
}
