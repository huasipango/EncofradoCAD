package org.bolivia.app;
import java.awt.Point;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 * @web http://www.jc-mouse.net/
 * @author Mouse
 */
public class MiSistema {

    /** COntador interno de objetos */
    private int contador_de_objetos = 0;
    /** Los objetos se almacenaran en un MAP */
    private Map map = new HashMap();   
    /** JPanel */
    private JPanel contenedor;
    /** DefaultListModel */
    private DefaultListModel listModel;
    private Point posicion=new Point(0,0);
    private int auxiliar=0;
    private int auxiliar2=0;
    
    /** Constructor de clase 
     * @param JPanel Donde se colocaran los objetos
     * @param DefaultListModel Aqui se almacenaran los key (identificadores) de objetos
     */
    public MiSistema(JPanel jpanel , DefaultListModel listModel ){
        this.contenedor = jpanel;
        this.listModel = listModel;
    }
    
    /**
     * Metodo que crea un nuevo objeto
     */
    public void Nuevo_Objeto(String obj )
    {
        if(posicion.x<contenedor.getWidth()){
            posicion.x=posicion.x+auxiliar;
        }
        if(posicion.x>=contenedor.getWidth()){
        posicion.x=0;
        posicion.y=posicion.y+auxiliar2;
        }
        
        //aumenta contador en +1        
        this.contador_de_objetos +=1;
        //Crea una nueva instancia de "MiObjeto"
        MiObjeto tmp = new MiObjeto( "Objeto " + this.contador_de_objetos,this.contenedor,obj );
        //coloca al objeto creado en una posicion aleatoria
        tmp.setLocation(posicion);
        auxiliar=tmp.getWidth();
        auxiliar2=tmp.getHeight();

        //agrega el objeto en el MAP
        map.put("Objeto " + this.contador_de_objetos, tmp );        
        //agrega el KEY en el List
        listModel.addElement( "Objeto " + this.contador_de_objetos );
        //agrega el objeto en el JPanel
        this.contenedor.add(tmp);
        //actualiza graficos
        this.contenedor.repaint();
    }
    
    /**
     * Metodo que cambia la imagen actual de un objeto por otra imagen aleatoria
     * @param String Key identificador de objeto
     */
    public void Cambiar_Imagen( String key )
    {
        MiObjeto tmp = (MiObjeto) map.get( key );
        map.remove(tmp);
        contenedor.remove(tmp);
        this.contenedor.repaint();
    }
     
    /**
     * Metodo que cambia todas las imagenes de todos los objetos que existan en el MAP
     */
    public void Cambiar_Imagen_all()
    {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            Cambiar_Imagen( e.getKey().toString() );            
        }
    }
    
    /**
     * Retorna un numero entero aleatorio entre 0 y un numero pasado como parametro
     * @param int numero entero
     */
    public int rndNum( int value ){
        int num = (int) Math.floor(Math.random()*value+1);            
        return num;
    }
    
}//->fin de clase
