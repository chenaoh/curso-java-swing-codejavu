package principal;
import paneles.PanelIntroduccion;
import paneles.PanelMensaje;
import ventana.VentanaPrincipal;

public class Aplicacion {

	public static void main(String[] args) {
		
	//Se declaran los objetos de las clases componentes de aplicación 
	Coordinador							coordinador;
	PanelIntroduccion			panelIntroduccion;
	PanelMensaje				panelMensaje;
	VentanaPrincipal 					miVentanaPrincipal;
	
	// Se instancian las clases		
	coordinador 				 	= 	new Coordinador();
	panelIntroduccion	 	=	new PanelIntroduccion();
	panelMensaje			= new PanelMensaje();
	miVentanaPrincipal				=	new VentanaPrincipal();
		
	//Se establece relaciones entre las clases
	panelIntroduccion.setCoordinador(coordinador);
	panelMensaje.setCoordinador(coordinador);
	miVentanaPrincipal.setCoordinador(coordinador);
							
	//Se establece relaciones con la clase coordinador
	coordinador.setPanelIntroduccion(panelIntroduccion);
	coordinador.setPanelMensaje(panelMensaje);
	coordinador.setVentanaPrincipal(miVentanaPrincipal);
	
	miVentanaPrincipal.setVisible(true);
	
	}
}
