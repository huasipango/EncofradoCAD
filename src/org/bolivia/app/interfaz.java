package org.bolivia.app;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.*;
import javax.swing.*;
import ventanaherramientas.Conexion;
import ventanaherramientas.Herramienta;
import ventanaherramientas.Proyecto;
import ventanaherramientas.frmDetalleCosto;
import java.util.*;
import ventanaherramientas.Usuario;

/**
 * @web http://www.jc-mouse.net/
 * @author Mouse
 */
public class interfaz extends javax.swing.JFrame {

    private MiSistema ms ;
    private DefaultListModel listModel = new DefaultListModel();
    JFrame j1;
    private Herramienta crucetaLarga; 
    private Herramienta crucetaPequena;
    private Herramienta distanciadores;
    private Herramienta viguetas;
    private Herramienta tablero;
    private Herramienta vigetasPequenas;
    private Herramienta puntal;
    private int numcl=0;
    private int numcp=0;
    private int numd=0;
    private int numv=0;
    private int numt=0;
    private int numvp=0;
    private int nump=0;
    public float costo=0;
    private Proyecto p1;
    private int contador_pr=0;
    Usuario us1;
            int alto=0;
        int largo=0;
        
        
        
    Conexion conx = new Conexion();//HACIENDO LA CONEXIÓN
    Connection conn = conx.obtener();
    public interfaz(JFrame j1, Usuario us1) {
        //aqui cargamos los datos
        cargarHer();
        contador_pr=cargarNumeroProyectos();
            /*crucetaLarga= new Herramienta(001,"Cruceta Larga", 10, 10, 10);
            crucetaPequena= new Herramienta(002,"Cruceta Pequeña", 10, 10, 5);
            distanciadores= new Herramienta(003,"Cruceta Pequeña", 10, 10, 10);
            viguetas= new Herramienta(004,"viguetas", 100,10, 10);
            tablero= new Herramienta(005,"tablero", 10, 10, 10);
            vigetasPequenas= new Herramienta(006,"vigetasPequeñas", 10, 10, 5);
            
            */
        //
        puntal= new Herramienta(007,"puntal", 50, 50, 10);
        this.j1=j1;
        this.us1=us1;//agarro el usuario
        int s=0;

        do {            
            s=0;
            try {
                String name =(JOptionPane.showInputDialog(this, "Ingrese el alto del terreno"));
                alto=Integer.parseInt(name)*20;
                name =(JOptionPane.showInputDialog(this, "Ingrese el ancho del terreno"));
                largo=Integer.parseInt(name)*20;    
                if(alto>700||largo>700){
                    imprimirMensajeError("las dimensiones del terreno estan fuera de rango");
                    s=1;}
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingrese Numeros");
                s=1;
            }
        } while (s==1);
        
        initComponents();
        setLocationRelativeTo(null);
        //crea nueva instancia e inicia parametros
       __contenedor.setPreferredSize(new java.awt.Dimension(largo,alto));
        ms = new MiSistema( this.__contenedor, this.listModel );        
        //agrega ListModel a JList
        this.__objetos.setModel(listModel);
        
    }
    public static void imprimirMensajeError(String text){
    	   JFrame as= new JFrame();
    	   JDialog dialog=new JDialog();
    	   as.getToolkit().beep();
           JOptionPane optionPane = new JOptionPane(text,JOptionPane.WARNING_MESSAGE);
           dialog = optionPane.createDialog("Warning!");
           dialog.setAlwaysOnTop(true);
           dialog.setVisible(true);
       }
    void cargarHer()
    {
        int i=0;
         String sql = "SELECT * FROM t_herramienta";
         String datos[]= new String[5];
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
                if(i==0)
                {
                    crucetaLarga=new Herramienta(Integer.parseInt(datos[0]), datos[1] , Integer.parseInt(datos[2])
                        , Integer.parseInt(datos[3]), Float.parseFloat(datos[4]));
                }else
                    if(i==1){
                        crucetaPequena=new Herramienta(Integer.parseInt(datos[0]), datos[1] , Integer.parseInt(datos[2])
                        , Integer.parseInt(datos[3]), Float.parseFloat(datos[4]));
                    }else
                        if(i==2){
                            distanciadores=new Herramienta(Integer.parseInt(datos[0]), datos[1] , Integer.parseInt(datos[2])
                        , Integer.parseInt(datos[3]), Float.parseFloat(datos[4]));
                        }else
                            if(i==3){
                                    viguetas=new Herramienta(Integer.parseInt(datos[0]), datos[1] , Integer.parseInt(datos[2])
                        , Integer.parseInt(datos[3]), Float.parseFloat(datos[4]));
                                }else
                                    if(i==4){
                                        vigetasPequenas=new Herramienta(Integer.parseInt(datos[0]), datos[1] , Integer.parseInt(datos[2])
                        , Integer.parseInt(datos[3]), Float.parseFloat(datos[4]));
                                    }else
                                        if(i==5){
                                            tablero=new Herramienta(Integer.parseInt(datos[0]), datos[1] , Integer.parseInt(datos[2])
                        , Integer.parseInt(datos[3]), Float.parseFloat(datos[4]));
                                        }
                                
                                 
                System.out.println(i);        
                i++;
            }
            
                
        } catch (Exception e) {
        }
        /*String datos[] = new String[5];
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
         */
    }

    int cargarNumeroProyectos()
    {
        int i=0;
         String sql = "SELECT * FROM t_proyecto";
         Statement stm;
         try {
            stm=conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                i++;
            }    
        } catch (Exception e) {
        }
        System.out.println("Proyectos: "+i);
        return  i;
    }
    
    void actualizar(int cantidad, String tipo)
    {
        String sql = "UPDATE t_herramienta SET disponibilidad_her=disponibilidad_her-? WHERE nombre_her=? ";
        
         
         try {
            
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, cantidad);
            pst.setString(2, tipo);

            int n = pst.executeUpdate();
             System.out.println(n);
             System.out.println("actualizó");
        } catch (Exception e) {
             System.out.println("Error al actualizar " +e);
        }
            
    }
    
     private void initComponents() {
  java.awt.GridBagConstraints gridBagConstraints;

        __contenedor = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        __agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        __objetos = new javax.swing.JList();
        __cambiar = new javax.swing.JButton();
        __agregar1 = new javax.swing.JButton();
        btnCosto = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnterminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ENCOFR");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        __contenedor.setBackground(new java.awt.Color(204, 204, 255));
        __contenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
         __contenedor.setPreferredSize(new java.awt.Dimension(1200, 6000));

        javax.swing.GroupLayout __contenedorLayout = new javax.swing.GroupLayout(__contenedor);
        __contenedor.setLayout(__contenedorLayout);
        __contenedorLayout.setHorizontalGroup(
            __contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        __contenedorLayout.setVerticalGroup(
            __contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(__contenedor, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(210, 500));

        __agregar.setText("Horizontal");
        __agregar.setPreferredSize(new java.awt.Dimension(170, 32));
        __agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                __agregarActionPerformed(evt);
            }
        });

        __objetos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(__objetos);

        __cambiar.setText("Eliminar");
        __cambiar.setPreferredSize(new java.awt.Dimension(170, 32));
        __cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                __cambiarActionPerformed(evt);
            }
        });

        __agregar1.setText("Vertical");
        __agregar1.setPreferredSize(new java.awt.Dimension(170, 32));
        __agregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                __agregar1ActionPerformed(evt);
            }
        });

        btnCosto.setText("Consultar Costo");
        btnCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostoActionPerformed(evt);
            }
        });

        jButton2.setText("Volver");
        jButton2.setVisible(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnterminar.setText("Terminar");
        btnterminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnterminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(__cambiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(__agregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(__agregar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnterminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCosto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(__agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(__agregar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(__cambiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnterminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jPanel2, gridBagConstraints);

        pack();
     }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
  /*  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        __contenedor = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        __agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        __objetos = new javax.swing.JList();
        __cambiar = new javax.swing.JButton();
        __agregar1 = new javax.swing.JButton();
        btnCosto = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnterminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ENCOFR");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        __contenedor.setBackground(new java.awt.Color(204, 204, 255));
        __contenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        __contenedor.setPreferredSize(new java.awt.Dimension(600, 500));

        javax.swing.GroupLayout __contenedorLayout = new javax.swing.GroupLayout(__contenedor);
        __contenedor.setLayout(__contenedorLayout);
        __contenedorLayout.setHorizontalGroup(
            __contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        __contenedorLayout.setVerticalGroup(
            __contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(__contenedor, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(210, 500));

        __agregar.setText("Horizontal");
        __agregar.setPreferredSize(new java.awt.Dimension(170, 32));
        __agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                __agregarActionPerformed(evt);
            }
        });

        __objetos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(__objetos);

        __cambiar.setText("Eliminar");
        __cambiar.setPreferredSize(new java.awt.Dimension(170, 32));
        __cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                __cambiarActionPerformed(evt);
            }
        });

        __agregar1.setText("Vertical");
        __agregar1.setPreferredSize(new java.awt.Dimension(170, 32));
        __agregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                __agregar1ActionPerformed(evt);
            }
        });

        btnCosto.setText("ALQUILER");
        btnCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostoActionPerformed(evt);
            }
        });

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnterminar.setText("CANCELAR");
        btnterminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnterminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(__cambiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(__agregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(__agregar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnterminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCosto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(__agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(__agregar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(__cambiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnterminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jPanel2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
*/
    /** crea nuevo objeto al presionar el boton */
    private void __agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event___agregarActionPerformed
        if(crucetaLarga.getDisponibilidad_her()>0){
        if(crucetaPequena.getDisponibilidad_her()>0){
            if(distanciadores.getDisponibilidad_her()>0){
                if(viguetas.getDisponibilidad_her()>0){
                    if(tablero.getDisponibilidad_her()>0){
                        if(vigetasPequenas.getDisponibilidad_her()>0){
                            if(puntal.getDisponibilidad_her()>0){
                                ms.Nuevo_Objeto("1");
                                crucetaLarga.setDisponibilidad_her(crucetaLarga.getDisponibilidad_her()-2);
                                distanciadores.setDisponibilidad_her(distanciadores.getDisponibilidad_her()-1);
                                viguetas.setDisponibilidad_her(viguetas.getDisponibilidad_her()-2);
                                tablero.setDisponibilidad_her(tablero.getDisponibilidad_her()-5);
                                puntal.setDisponibilidad_her(puntal.getDisponibilidad_her()-4);
                                    numcl+=2;
                                    numd+=1;
                                    numv+=2;
                                    numt+=5;
                                    nump+=4;
                            }else{
                                JOptionPane.showMessageDialog(this,"No hay suficientes puntales");
                            }
                        }else{
                            JOptionPane.showMessageDialog(this,"No hay suficientes viguetasPequeñas");
                        }
                    }else{
                        JOptionPane.showMessageDialog(this, "No hay suficientes tableros");
                    }
                }else{
                    JOptionPane.showMessageDialog(this,"No hay suficientes viguetas");
                }
            }else{
                JOptionPane.showMessageDialog(this,"No hay suficientes distanciadores");
            }
        }else{
            JOptionPane.showMessageDialog(this,"No hay suficientes crucetaLarga");
        }
       }else{
           JOptionPane.showMessageDialog(this,"No hay suficientes crucetasPequeñas");
       }    
    }//GEN-LAST:event___agregarActionPerformed

    /** Cambia la imagen de un objeto que este seleccionado en el jlist */
    private void __cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event___cambiarActionPerformed
        int index = this.__objetos.getSelectedIndex();//obtiene index seleccionado
        if(index!=-1)//Si existen datos en el JLIST
        {
            String objUsuario=(String) this.listModel.getElementAt( index ); 
            ms.Cambiar_Imagen(objUsuario);
            listModel.removeElementAt(index);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un objeto", "Atención", JOptionPane.INFORMATION_MESSAGE );
        }
    }//GEN-LAST:event___cambiarActionPerformed

    private void __agregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event___agregar1ActionPerformed
        if(crucetaLarga.getDisponibilidad_her()!=0){
        if(crucetaPequena.getDisponibilidad_her()!=0){
            if(distanciadores.getDisponibilidad_her()!=0){
                if(viguetas.getDisponibilidad_her()!=0){
                    if(tablero.getDisponibilidad_her()!=0){
                        if(vigetasPequenas.getDisponibilidad_her()!=0){
                            if(puntal.getDisponibilidad_her()!=0){
                                ms.Nuevo_Objeto("2");
                                crucetaLarga.setDisponibilidad_her(crucetaLarga.getDisponibilidad_her()-2);
                                distanciadores.setDisponibilidad_her(distanciadores.getDisponibilidad_her()-1);
                                viguetas.setDisponibilidad_her(viguetas.getDisponibilidad_her()-2);
                                tablero.setDisponibilidad_her(tablero.getDisponibilidad_her()-5);
                                puntal.setDisponibilidad_her(puntal.getDisponibilidad_her()-4);
                                    numcl+=2;
                                    numd+=1;
                                    numv+=2;
                                    numt+=5;
                                    nump+=4;
                            }else{
                                JOptionPane.showMessageDialog(this,"No hay suficientes puntales");
                            }
                        }else{
                            JOptionPane.showMessageDialog(this,"No hay suficientes viguetasPequeñas");
                        }
                    }else{
                        JOptionPane.showMessageDialog(this, "No hay suficientes tableros");
                    }
                }else{
                    JOptionPane.showMessageDialog(this,"No hay suficientes viguetas");
                }
            }else{
                JOptionPane.showMessageDialog(this,"No hay suficientes distanciadores");
            }
        }else{
            JOptionPane.showMessageDialog(this,"No hay suficientes crucetaLarga");
        }
       }else{
           JOptionPane.showMessageDialog(this,"No hay suficientes crucetasPequeñas");
       }
    }//GEN-LAST:event___agregar1ActionPerformed

    private void btnterminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnterminarActionPerformed
        
        
        if(0==JOptionPane.showConfirmDialog(this, "Esta seguro que desea terminar?")){
            this.dispose();
        j1.setVisible(true);
        /*    int s=0;
            String nombre=JOptionPane.showInputDialog(this, "Ingrese el nombre del proyecto");
            SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
            sdf.setLenient(false);
            java.util.Date fecha = null;
            java.sql.Date fecha2 = null;
            do{
            try {
                s=0;
                String fecha_limite = JOptionPane.showInputDialog
                (this, "Ingrese la fecha límite en formato dd-mm-yyyy:");
                fecha=sdf.parse(fecha_limite);
                
                fecha2=new java.sql.Date(fecha.getTime());
                System.out.println(fecha2);
                if((1900+fecha2.getYear())<2018)
                {
                    System.out.println(fecha2.getYear());
                    s=1;
                }
            } catch (Exception e) {
                s=1;
            }
            finally{
                if(s==1)
                    JOptionPane.showMessageDialog(null,"Debes ingresar una fecha correcta.");
            }
            }while(s==1);
            JOptionPane.showMessageDialog(this, "Proyecto guardado satisfactoriamentes");
            p1= new Proyecto(001, nombre,null,null ,costo,alto*largo );//PROYECTO
            
            
            actualizar(numcl,"cruceta larga");
            actualizar(numcp, "cruceta pequeña");
            actualizar(numd, "distanciador");
            actualizar(numv, "vigueta larga");
            actualizar(numvp, "vigueta pequeña");
            actualizar(numt, "tablero");
            this.dispose();
            j1.setVisible(true);
            
            
            //Proyecto proy1 = new Proyecto(contador_pr);
            */
        }
        
            
    }//GEN-LAST:event_btnterminarActionPerformed

    private void btnCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostoActionPerformed

        costo=(numcl*crucetaLarga.getPrecio_her())+(numd*distanciadores.getPrecio_her())+(numv*viguetas.getPrecio_her())+(numt*tablero.getPrecio_her())+(nump*puntal.getPrecio_her());
        frmDetalleCosto fd1 =new frmDetalleCosto(numcl,numcp,numd,nump,numt,numv,numvp,crucetaLarga,distanciadores,viguetas,tablero,puntal,us1,largo,alto);
        fd1.setVisible(true);
        System.out.println(costo);
    }//GEN-LAST:event_btnCostoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        j1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton __agregar;
    private javax.swing.JButton __agregar1;
    private javax.swing.JButton __cambiar;
    private javax.swing.JPanel __contenedor;
    private javax.swing.JList __objetos;
    private javax.swing.JButton btnCosto;
    private javax.swing.JButton btnterminar;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
