package pestañas.sineventos;
import javax.swing.*;

class PanelColores extends JPanel
{
	public PanelColores ( )
	{
		JCheckBox opcion1;
		JCheckBox opcion2;
		JCheckBox opcion3;
		JCheckBox opcion4;
		JCheckBox opcion5;
		
		opcion1 = new JCheckBox ( "Rojo"     );
		opcion2 = new JCheckBox ( "Amarillo" );
		opcion3 = new JCheckBox ( "Azul"     );
		opcion4 = new JCheckBox ( "Verde"    );
		opcion5 = new JCheckBox ( "Negro"    );

		add ( opcion1 );
		add ( opcion2 );
		add ( opcion3 );
		add ( opcion4 );
		add ( opcion5 );
	}
}
