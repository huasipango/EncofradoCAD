/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanaherramientas;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Angeloni
 */
public class FrmHerramientas2 extends javax.swing.JFrame {

    Usuario us1;
    /**
     * Creates new form FrmHerramientas
     */
    Conexion conx = new Conexion();//HACIENDO LA CONEXIÓN
    Connection conn = conx.obtener();
    DefaultTableModel modelo = new DefaultTableModel();
    Herramienta her_aux;
    
    public FrmHerramientas2(Usuario us1) {
        initComponents();
        this.us1=us1;
        mostrarTabla();
        setLocationRelativeTo(null);
    }
    
    void mostrarTabla(){
        
        
        modelo.addColumn("Código");
        modelo.addColumn("Herramienta");
        modelo.addColumn("Disponibles");
        modelo.addColumn("Totales");
        modelo.addColumn("Precio");
        tabla_herramientas.setModel(modelo);
        
        String sql = "SELECT * FROM t_herramienta";
        
        String datos[] = new String[5];
        Statement stm;
        try {
            stm=conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                modelo.addRow(datos);   
            }
            tabla_herramientas.setModel(modelo);
            
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en la carga de la tabla "+e);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_herramientas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        bt_add_cru_cor = new javax.swing.JButton();
        bt_add_cruc_lar = new javax.swing.JButton();
        bt_add_dist = new javax.swing.JButton();
        bt_add_vigue_cor = new javax.swing.JButton();
        bt_add_vigue_lar = new javax.swing.JButton();
        bt_add_table = new javax.swing.JButton();
        bt_volver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Recargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla_herramientas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabla_herramientas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_herramientas);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setText("Agregar:");

        bt_add_cru_cor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bt_add_cru_cor.setText("Cruceta Corta");
        bt_add_cru_cor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_add_cru_corActionPerformed(evt);
            }
        });

        bt_add_cruc_lar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bt_add_cruc_lar.setText("Cruceta Larga");
        bt_add_cruc_lar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_add_cruc_larActionPerformed(evt);
            }
        });

        bt_add_dist.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bt_add_dist.setText("Distanciador");
        bt_add_dist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_add_distActionPerformed(evt);
            }
        });

        bt_add_vigue_cor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bt_add_vigue_cor.setText("Vigueta Pequeña");
        bt_add_vigue_cor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_add_vigue_corActionPerformed(evt);
            }
        });

        bt_add_vigue_lar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bt_add_vigue_lar.setText("Vigueta Larga");
        bt_add_vigue_lar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_add_vigue_larActionPerformed(evt);
            }
        });

        bt_add_table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bt_add_table.setText("Tablero");
        bt_add_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_add_tableActionPerformed(evt);
            }
        });

        bt_volver.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bt_volver.setText("Volver");
        bt_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_volverActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel4.setText("Stock");

        Recargar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Recargar.setText("Recargar");
        Recargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_add_cruc_lar)
                    .addComponent(bt_add_cru_cor)
                    .addComponent(bt_add_dist, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_add_table)
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_add_vigue_cor)
                            .addComponent(bt_add_vigue_lar))
                        .addGap(42, 42, 42))))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_volver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Recargar)
                        .addGap(133, 133, 133))))
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_add_cruc_lar)
                    .addComponent(bt_add_vigue_lar)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_add_cru_cor)
                    .addComponent(bt_add_vigue_cor))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_add_table)
                    .addComponent(bt_add_dist))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Recargar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_add_cru_corActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_add_cru_corActionPerformed
        // TODO add your handling code here:
        int cruceta_corta = cantidadHerramienta("cruceta pequeña");
        
        boolean prueba = updateTotalHerramienta(cruceta_corta, "cruceta pequeña");
    }//GEN-LAST:event_bt_add_cru_corActionPerformed

    private void bt_add_cruc_larActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_add_cruc_larActionPerformed
        // TODO add your handling code here:
        int cruceta_larga = cantidadHerramienta("cruceta larga");
        boolean prueba = updateTotalHerramienta(cruceta_larga, "cruceta larga");
    }//GEN-LAST:event_bt_add_cruc_larActionPerformed

    private void bt_add_distActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_add_distActionPerformed
        // TODO add your handling code here:
        int distanciadores = cantidadHerramienta("distanciador");
        boolean prueba = updateTotalHerramienta(distanciadores, "distanciador");
    }//GEN-LAST:event_bt_add_distActionPerformed

    private void bt_add_vigue_corActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_add_vigue_corActionPerformed
        // TODO add your handling code here:
        int vigueta_corta = cantidadHerramienta("vigueta pequeña");
        boolean prueba = updateTotalHerramienta(vigueta_corta, "vigueta pequeña");
    }//GEN-LAST:event_bt_add_vigue_corActionPerformed

    private void bt_add_vigue_larActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_add_vigue_larActionPerformed
        // TODO add your handling code here:
        int vigueta_larga = cantidadHerramienta("vigueta larga");
        boolean prueba = updateTotalHerramienta(vigueta_larga, "vigueta larga");
    }//GEN-LAST:event_bt_add_vigue_larActionPerformed

    private void bt_add_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_add_tableActionPerformed
        // TODO add your handling code here:
        int tablero = cantidadHerramienta("tablero");
        boolean prueba = updateTotalHerramienta(tablero, "tablero");
    }//GEN-LAST:event_bt_add_tableActionPerformed

    private void bt_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_volverActionPerformed
        // TODO add your handling code here:
        WinPrincipal winprincipal1 = new WinPrincipal(us1);
        this.setVisible(false);
        winprincipal1.show();
    }//GEN-LAST:event_bt_volverActionPerformed

    private void RecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecargarActionPerformed
       DefaultTableModel modelo2 = new DefaultTableModel();
        modelo2.addColumn("Código");
        modelo2.addColumn("Herramienta");
        modelo2.addColumn("Disponibles");
        modelo2.addColumn("Totales");
        modelo2.addColumn("Precio");
        modelo=modelo2;
        tabla_herramientas.setModel(modelo);
        
        String sql = "SELECT * FROM t_herramienta";
        
        String datos[] = new String[5];
        Statement stm;
        try {
            stm=conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                modelo.addRow(datos);   
            }
            tabla_herramientas.setModel(modelo);
            
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en la carga de la tabla "+e);
        }
    }//GEN-LAST:event_RecargarActionPerformed

    private int cantidadHerramienta(String tipo)
    {
         int cantidad=0;
        int s=0;
        do {    
            s=0;
        try {
            cantidad=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuánt@s "+tipo+" ingresará?"));   
        } catch (Exception e) {
            s=1;
             JOptionPane.showMessageDialog(null, "Ingrese un Numero valido");
        }
        } while (s==1);

             
        return cantidad;
    }
    
    private boolean updateTotalHerramienta(int cantidad, String tipo)
    {
        boolean conf;
        try {
            String sql="UPDATE t_herramienta SET total_her=total_her+? WHERE nombre_her=? ";
            String sql_disp="UPDATE t_herramienta SET disponibilidad_her=disponibilidad_her+? WHERE nombre_her=? ";

            PreparedStatement pst = conn.prepareStatement(sql);
            PreparedStatement pst_disp = conn.prepareStatement(sql_disp);

            pst.setInt(1, cantidad);
            pst.setString(2, tipo);
            
            pst_disp.setInt(1, cantidad);
            pst_disp.setString(2, tipo);
            
            int n = pst.executeUpdate();
            int n_disp = pst_disp.executeUpdate();
            System.out.println(n);
            conf=true;
            System.out.println("Satisfactorio ingreso");
        } catch (Exception e) {
            conf=false;
        }
        return conf;
    }
    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Recargar;
    private javax.swing.JButton bt_add_cru_cor;
    private javax.swing.JButton bt_add_cruc_lar;
    private javax.swing.JButton bt_add_dist;
    private javax.swing.JButton bt_add_table;
    private javax.swing.JButton bt_add_vigue_cor;
    private javax.swing.JButton bt_add_vigue_lar;
    private javax.swing.JButton bt_volver;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_herramientas;
    // End of variables declaration//GEN-END:variables

}
