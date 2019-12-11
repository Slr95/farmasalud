package ventanas;

import com.mysql.jdbc.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.SQLException;



public class RealizarPedido extends javax.swing.JFrame{
    
   ConexionBD con = new ConexionBD();
    Connection cn = con.conexion();
    String atributo="Id"; 

   
    public RealizarPedido() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarTabla("");
    }
    
    void mostrarTabla(String valor){
        DefaultTableModel modelo = new  DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre de Productos");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Sucursal");
        modelo.addColumn("Fecha de pedido");
        modelo.addColumn("Encargado");
        tabladatos.setModel(modelo);
        
        String sql = "";
        if(valor.equals("")){
            sql = "SELECT * FROM pedido";
        }
        else{
            sql = "SELECT * FROM pedido WHERE "+atributo+"='"+valor+"'";
        }
        
        String datos[] = new String [7];
        com.mysql.jdbc.Statement st;
        try {
             st = (com.mysql.jdbc.Statement) cn.createStatement(); 
              ResultSet rs = st.executeQuery(sql);
              while(rs.next()){
                  datos[0]=rs.getString(1);
                  datos[1]=rs.getString(2);
                  datos[2]=rs.getString(3);
                  datos[3]=rs.getString(4);
                  datos[4]=rs.getString(5);
                  datos[5]=rs.getString(6);
                  modelo.addRow(datos);
            
        }
              tabladatos.setModel(modelo);
        
        } catch (SQLException ex) {
            Logger.getLogger(RealizarPedido.class.getName()).log(Level.SEVERE, null, ex);
           
        }
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLFactura = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtSucursal = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtEncargado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLFactura.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLFactura.setForeground(new java.awt.Color(255, 255, 0));
        jLFactura.setText("Formulario de pedido");
        getContentPane().add(jLFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 230, 60));

        jButton5.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, 80, 30));

        jLabel2.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Cantidad");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Fecha de pedido");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Sucursal");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        txtNombre.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 210, 30));

        txtCantidad.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 210, 30));

        txtSucursal.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        getContentPane().add(txtSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 210, 30));

        txtFecha.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 210, 30));

        txtEncargado.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        getContentPane().add(txtEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 210, 30));

        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabladatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 160, 500, 300));

        jButton3.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 100, 30));

        jButton1.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 100, 30));

        jLabel5.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Encargado");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 90, 40));

        jLfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 994, 562));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    this.setVisible(false); 
    new MenuPrincipal().setVisible(true);         
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int fila=tabladatos.getSelectedRow();
        String valor=tabladatos.getValueAt(fila, 0).toString();
        if(fila>=0){
            try {
                PreparedStatement pps = cn.prepareStatement("DELETE FROM pedido WHERE Id='"+valor+"'");
                pps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(RealizarPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Dato eliminado");
            mostrarTabla("");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
           PreparedStatement pps = cn.prepareStatement("INSERT INTO pedido( `Nombre de Productos`, `Cantidad`, `Sucursal`, `Fecha de pedido`, `Encargado`) VALUES (?,?,?,?,?)");
            pps.setString(1, txtNombre.getText());
            pps.setString(2, txtCantidad.getText());
            pps.setString(3, txtSucursal.getText());
            pps.setString(4, txtFecha.getText());
            pps.setString(5, txtEncargado.getText());
           pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos guardados");
        } catch (SQLException ex) {
            Logger.getLogger(RealizarPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     DefaultTableModel modelo = (DefaultTableModel) tabladatos.getModel();


    Object [] fila=new Object[6];

        fila[1]=txtNombre.getText();
        fila[2]=txtCantidad.getText();
        fila[3]=txtSucursal.getText();
        fila[4]=txtFecha.getText();
        fila[5]=txtEncargado.getText();
       

        modelo.addRow(fila);


        tabladatos.setModel(modelo);
   
   
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RealizarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RealizarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RealizarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RealizarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealizarPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLFactura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLfondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladatos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtEncargado;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSucursal;
    // End of variables declaration//GEN-END:variables

    
   
    
   
        
    
}