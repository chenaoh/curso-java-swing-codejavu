/**
 * Este ejemplo presenta un editor en el que se pueden cambiar, a través del
 * menu de barra, los estilos con que se escribe, mostrándose la capacidad
 * que se ha introducido en Swing a la manipulación de textos, que ahora
 * permite la presencia de textos de diferentes fuentes, tamaños y colores
 * sobre un mismo campo de texto
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;

public class java1409 extends JPanel implements ActionListener {
    private Style estiloRojo, estiloVerde, estiloAzul;
    private JTextPane texto;


    public java1409() {
        setLayout( new BorderLayout() );
        add( creaMenu(), BorderLayout.NORTH );

        creaEditor();
        add( texto, BorderLayout.CENTER );
    }


    private JMenuBar creaMenu() {
        JMenuBar menu = new JMenuBar();
        JMenu estilo = new JMenu( "Estilo" );
        menu.add( estilo );

        JMenuItem mi = new JMenuItem( "Rojo" );
        estilo.add( mi );
        mi.addActionListener( this );

        mi = new JMenuItem( "Verde" );
        estilo.add( mi );
        mi.addActionListener( this );

        mi = new JMenuItem( "Azul" );
        estilo.add( mi );
        mi.addActionListener( this );

        return( menu );
    }


    public void actionPerformed( ActionEvent evt ) {
        Style estilo = null;
        String color = (String)evt.getActionCommand();

        if ( color.equals( "Rojo" ) ) {
            estilo = estiloRojo;
        }
        else if ( color.equals( "Azul" ) ) {
            estilo = estiloAzul;
        }
        else if ( color.equals( "Verde" ) ) {
            estilo = estiloVerde;
        }
        texto.setCharacterAttributes( estilo, false );
    }


    private void creaEditor() {
        StyleContext sc = creaEstilos();
        DefaultStyledDocument doc = new DefaultStyledDocument( sc );

        texto = new JTextPane( doc );
    }


    private StyleContext creaEstilos() {
        StyleContext sc = new StyleContext();

        estiloRojo = sc.addStyle( null, null );
        StyleConstants.setForeground( estiloRojo, Color.red );

        estiloVerde = sc.addStyle( null, null );
        StyleConstants.setForeground( estiloVerde, Color.green );
        StyleConstants.setFontSize( estiloVerde,24 );

        estiloAzul = sc.addStyle( null, null );
        StyleConstants.setForeground( estiloAzul, Color.blue );

        return( sc );
    }


    public static void main( String argv[] ) {
        JFrame ventana = new JFrame( "Tutorial de Java, Swing" );
        ventana.setDefaultCloseOperation( ventana.EXIT_ON_CLOSE );
        ventana.getContentPane().add( new java1409(), BorderLayout.CENTER );
        ventana.setSize( 300,180 );
        ventana.setVisible( true );
    }
}
