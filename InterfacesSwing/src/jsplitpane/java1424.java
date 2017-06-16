package jsplitpane;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.sun.java.swing.*;

class java1424 extends JPanel implements ChangeListener {
  private JSplitPane panelPrincipal;
  private JScrollPane ScrollPane1;
  private JScrollPane ScrollPane2;
  
  public java1424() {
    setLayout( new BorderLayout() );
    // Se crea una zona para presentar el texto correspondiente al fichero
    creaPanelSup();
    // Se crea una zona inferior para mostrar el gráfico
    creaPanelInf();
    // Se crea un panel dividido verticalmente
    panelPrincipal = new JSplitPane( JSplitPane.HORIZONTAL_SPLIT );
    add( panelPrincipal,BorderLayout.CENTER );
    // Se incorporan las dos zonas que se habían creado a las dos
    // partes en que se ha dividido el panel principal
    panelPrincipal.setLeftComponent( ScrollPane1 );
    panelPrincipal.setRightComponent( ScrollPane2 );
	//pone la ventana en el Centro de la pantalla
	//setLocationRelativeTo(null);
  }
  
  
  public void stateChanged( ChangeEvent evt ) {
    // Si el evento proviene del panel principal, seguimos...
    if( evt.getSource() == ScrollPane1.getViewport() ) {
      // Cogemos la posición actual dentro de la vista correspondiente
      // al panel principal
      Point point = ScrollPane1.getViewport().getViewPosition();
      // Ahora determinamos la escala correcta para las vistas, para las
      // dos zonas del panel principal
      Dimension dim1 = ScrollPane1.getViewport().getViewSize();
      Dimension dim2 = ScrollPane2.getViewport().getViewSize();
      float escalaX = 1;
      float escalaY = 1;
      if( dim1.width > dim2.width ) {
	escalaX = (float)dim1.width / (float)dim2.width;
	escalaY = (float)dim1.height / (float)dim2.height;
	// Escalamos en función del movimiento
	point.x /= escalaX;
	point.y /= escalaY;
      }
      else {
	escalaX = (float)dim2.width / (float)dim1.width;
	escalaY = (float)dim2.height / (float)dim1.height;
	// Escalamos en función del movimiento
	point.x *= escalaX;
	point.y *= escalaY;
      }
      // Movemos la otra vista en función de lo que movamos la de texto
      ScrollPane2.getViewport().setViewPosition( point );
    }
  }
  
  
  private void creaPanelSup() {
    // Creamos el panel de la zona de texto
    JTextArea areaTexto = new JTextArea();
    // Se carga el fichero en el área de texto, cuidando de capturar
    // todas las excepciones que se puedan producir
    try {
      FileReader fileStream = new FileReader( "java1424.java" );
      areaTexto.read( fileStream, "java1424.java" );
    } catch( FileNotFoundException e ) {
      System.out.println( "Fichero no encontrado" );
    } catch( IOException e ) {
      System.out.println( "Error por IOException" );
    }
    // Creamos el panel desplazable para el área de texto
    ScrollPane1 = new JScrollPane();
    ScrollPane1.getViewport().add( areaTexto );
    ScrollPane1.getViewport().addChangeListener( this );
  }
  
  
  private void creaPanelInf() {
    // Cargamos el gráfico, o imagen , en la panatalla
    Icon imagenP2 = new ImageIcon( "main.gif" );
    JLabel etiqP2 = new JLabel( imagenP2 );
    
    // Creamos el panel para el gráfico
    ScrollPane2 = new JScrollPane();
    ScrollPane2.setVerticalScrollBarPolicy(
      ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER );
    ScrollPane2.setHorizontalScrollBarPolicy(
      ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER );
    ScrollPane2.getViewport().add( etiqP2 );
    ScrollPane2.getViewport().addChangeListener( this );
  }
  
  
  public static void main( String args[] ) {
    JFrame ventana = new JFrame( "Tutorial de Java, Swing" );
    
    ventana.addWindowListener( new WindowAdapter() {
      public void windowClosing( WindowEvent evt ){
	System.exit( 0 );
      }
    } );
    ventana.getContentPane().add( new java1424(),BorderLayout.CENTER );
    ventana.setSize( 460,300 );
    
    ventana.setVisible( true );
  }
}