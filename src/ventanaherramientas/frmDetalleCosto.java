/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanaherramientas;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import org.bolivia.app.interfaz;


public class frmDetalleCosto extends javax.swing.JFrame {
    private int numcl=0;
    private int numcp=0;
    private int numd=0;
    private int numv=0;
    private int numt=0;
    private int numvp=0;
    private int nump=0;
    private float costo=0;
    private Herramienta crucetaLarga; 
    private Herramienta crucetaPequena;
    private Herramienta distanciadores;
    private Herramienta viguetas;
    private Herramienta tablero;
    private Herramienta vigetasPequenas;
    private Herramienta puntal;
    public frmDetalleCosto(int numcl,int numcp,int numd,int nump,int numt,int numv,int numvp,Herramienta crucetaLarga,Herramienta distanciadores,Herramienta viguetas,Herramienta tablero,Herramienta puntal ) {
            this.numcl=numcl;
            this.numcp=numcp;
            this.numd=numd;
            this.numv=numv;
            this.numt=numt;
            this.numvp=numvp;
            this.nump=nump;
            this.crucetaLarga= crucetaLarga;
            this.crucetaPequena= new Herramienta(002,"Cruceta Pequeña", 0, 0, 5);
            this.distanciadores= distanciadores;
            this.viguetas= viguetas;
            this.tablero= tablero;
            this.vigetasPequenas= new Herramienta(006,"vigetasPequeñas", 0, 0, 5);
            this.puntal= puntal;
        costo=(numcl*crucetaLarga.getPrecio_her())+(numd*distanciadores.getPrecio_her())+(numv*viguetas.getPrecio_her())+(numt*tablero.getPrecio_her())+(nump*puntal.getPrecio_her());
        initComponents();
        cruzetaltxt.setText(Integer.toString(numcl));
        crucetaptxt.setText(Integer.toString(numcp));
        distanciadortxt.setText(Integer.toString(numd));
        puntaltxt.setText(Integer.toString(nump));
        tablerotxt.setText(Integer.toString(numt));
        vigetatxt.setText(Integer.toString(numv));
        vigetaptxt.setText(Integer.toString(numvp));
        costotxt.setText(Float.toString(costo));
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cruzetaltxt = new javax.swing.JTextField();
        crucetaptxt = new javax.swing.JTextField();
        distanciadortxt = new javax.swing.JTextField();
        puntaltxt = new javax.swing.JTextField();
        vigetatxt = new javax.swing.JTextField();
        tablerotxt = new javax.swing.JTextField();
        vigetaptxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        costotxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Herramientas");

        jLabel6.setText("Cruzeta Larga");

        jLabel7.setText("Cruzeta Pequeña");

        jLabel8.setText("Distanciadores");

        jLabel12.setText("Puntal");

        jLabel9.setText("Vigetas");

        jLabel10.setText("Tablero");

        jLabel11.setText("Vigetas Pequeñas");

        jLabel2.setText("Cantidad");

        crucetaptxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crucetaptxtActionPerformed(evt);
            }
        });

        puntaltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntaltxtActionPerformed(evt);
            }
        });

        jLabel3.setText("Costo");

        costotxt.setEnabled(false);
        costotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costotxtActionPerformed(evt);
            }
        });

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(costotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel6)
                                                            .addComponent(jLabel1))
                                                        .addGap(66, 66, 66))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel7)
                                                        .addGap(51, 51, 51)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addGap(64, 64, 64))
                                                .addComponent(jLabel12)
                                                .addComponent(jLabel9)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(99, 99, 99)))
                                    .addComponent(jLabel11))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tablerotxt)
                                    .addComponent(puntaltxt)
                                    .addComponent(crucetaptxt)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cruzetaltxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(distanciadortxt)
                                    .addComponent(vigetatxt)
                                    .addComponent(vigetaptxt))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnactualizar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addComponent(cruzetaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addComponent(crucetaptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(distanciadortxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(puntaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(vigetatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tablerotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(vigetaptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(costotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnactualizar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crucetaptxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crucetaptxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crucetaptxtActionPerformed

    private void puntaltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntaltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puntaltxtActionPerformed

    private void costotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costotxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
       this.numcl=Integer.parseInt(cruzetaltxt.getText());
       this.numcp=Integer.parseInt(crucetaptxt.getText());
       this.numd=Integer.parseInt(distanciadortxt.getText());
       this.numv=Integer.parseInt(puntaltxt.getText());
       this.numt=Integer.parseInt(tablerotxt.getText());
       this.numvp=Integer.parseInt(vigetaptxt.getText());
       this.nump=Integer.parseInt(puntaltxt.getText());
       costo=(numcl*crucetaLarga.getPrecio_her())+(numd*distanciadores.getPrecio_her())+(numv*viguetas.getPrecio_her())+(numt*tablero.getPrecio_her())+(nump*puntal.getPrecio_her());
       costotxt.setText(Float.toString(costo));
    }//GEN-LAST:event_btnactualizarActionPerformed
public float obtenerCosto(){
    this.numcl=Integer.parseInt(cruzetaltxt.getText());
       this.numcp=Integer.parseInt(crucetaptxt.getText());
       this.numd=Integer.parseInt(distanciadortxt.getText());
       this.numv=Integer.parseInt(puntaltxt.getText());
       this.numt=Integer.parseInt(tablerotxt.getText());
       this.numvp=Integer.parseInt(vigetaptxt.getText());
       this.nump=Integer.parseInt(puntaltxt.getText());
       costo=(numcl*crucetaLarga.getPrecio_her())+(numd*distanciadores.getPrecio_her())+(numv*viguetas.getPrecio_her())+(numt*tablero.getPrecio_her())+(nump*puntal.getPrecio_her());
    return(costo);
}
    /**
     * @param args the command line arguments
     */

    public frmDetalleCosto() throws HeadlessException {
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JTextField costotxt;
    private javax.swing.JTextField crucetaptxt;
    private javax.swing.JTextField cruzetaltxt;
    private javax.swing.JTextField distanciadortxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField puntaltxt;
    private javax.swing.JTextField tablerotxt;
    private javax.swing.JTextField vigetaptxt;
    private javax.swing.JTextField vigetatxt;
    // End of variables declaration//GEN-END:variables
}