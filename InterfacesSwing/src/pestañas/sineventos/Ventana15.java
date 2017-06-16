package pestañas.sineventos;
import javax.swing.*;

public class Ventana15 extends JFrame
{
	public Ventana15 ( )
	{
	    JTabbedPane   fichas;
	    PanelCiudades ciudades;
	    PanelColores  colores;
	    PanelSabores  sabores;
	    
	    fichas   = new JTabbedPane   ( );
	    ciudades = new PanelCiudades ( );
	    colores  = new PanelColores  ( );
	    sabores  = new PanelSabores  ( );
	    
	    fichas.addTab ( "Ciudades", ciudades );
	    fichas.addTab ( "Colores", colores   );
	    fichas.addTab ( "Sabores", sabores   );

	    getContentPane ( ).add ( fichas );

		setTitle     ( "JTabbedPane" ); 
		setSize      ( 330, 170   );
		show ( );

	}
}

