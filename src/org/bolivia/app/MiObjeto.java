package org.bolivia.app;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * @web http://www.jc-mouse.net/
 * @author Mouse
 */
public class MiObjeto extends JLabel implements MouseListener, MouseMotionListener{
    
    /** Identificador de objeto */
    private String key = "";    
    /** Posicion de imagen */
    private Point posicion = new Point(0,0);
    /** Tamaño de imagen */
    private Dimension d = new Dimension(120,60);    
    /** variable que sirve para calcular el movimiento del objeto */
    private Point start_loc;
    /** variable que sirve para calcular el movimiento del objeto */
    private Point start_drag;
    /** variable que sirve para calcular el movimiento del objeto */
    private Point offset;
    /** variables auxiliares para el desplazamiento del objeto*/
    private int nuevo_X = 1;
    private int nuevo_Y = 1;
    private JPanel _contenedor;
    /**
     * Constructor de clase
     */
    public MiObjeto(String key, JPanel jpanel, String obj ){        
        //se inician propiedades de objeto
        if(obj=="2")
            d= new Dimension(60,120);
        this._contenedor=jpanel;
        this.key = key;
        this.setToolTipText( key );
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));        
        this.setSize(d);
        this.setPreferredSize(d);
        this.setIcon( new ImageIcon(getClass().getResource("/org/bolivia/app/res/" + obj + ".png")) ); 
        this.setText("");
        this.setVisible( true );
        this.setLocation( posicion );
        //se agregan los listener
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {
       this.start_drag = getScreenLocation(e);
       this.start_loc = this.getLocation();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
        if(this.getLocation().x>0&&this.getLocation().x<_contenedor.getWidth()-this.getWidth()){
            nuevo_X = (this.getLocation().x);
        }else if(this.getLocation().x<0){
            nuevo_X =0;
        }else
            nuevo_X=_contenedor.getWidth()-this.getWidth();
        
        if(this.getLocation().y>0&&this.getLocation().y<_contenedor.getHeight()-this.getHeight()){
            nuevo_Y = (this.getLocation().y);
        }else if(this.getLocation().y<0){
            nuevo_Y=0;
        }else
            nuevo_Y=_contenedor.getHeight()-this.getHeight();
        
        this.setLocation( nuevo_X, nuevo_Y );
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setBorder(BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51), 1));   
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBorder( null );   
    }

    @Override
    public void mouseDragged(MouseEvent e) {
      Point current = this.getScreenLocation(e);
      offset = new Point((int) current.getX() - (int) start_drag.getX(),(int) current.getY() - (int) start_drag.getY());
      Point new_location = new Point((int) (this.start_loc.getX() + offset.getX()), (int) (this.start_loc.getY() + offset.getY()));
      this.setLocation(new_location);          
    }

    @Override
    public void mouseMoved(MouseEvent e) {}
    
    
   /**
    * metodo para obtener la posicion  del frame en la pantalla
    * @param MouseEvent evt
    */
    private Point getScreenLocation(MouseEvent evt) {
        Point cursor = evt.getPoint();
        Point target_location = this.getLocationOnScreen();
        return new Point((int) (target_location.getX() + cursor.getX()),
               (int) (target_location.getY() + cursor.getY()));
    }
    
}//-> fin clase
