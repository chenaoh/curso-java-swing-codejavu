package pestañas.sineventos;
import javax.swing.*;

public class PanelCiudades extends JPanel
{
	public PanelCiudades ( )
	{
		JButton b1;
		JButton b2;
		JButton b3;
		JButton b4;
		
		b1 = new JButton ( "Nueva York" );
		b2 = new JButton ( "Londres"    );
		b3 = new JButton ( "Hong Kong"  );
		b4 = new JButton ( "Tokio"      );
		
		add ( b1 );
		add ( b2 );
		add ( b3 );
		add ( b4 );
	}
	
}
