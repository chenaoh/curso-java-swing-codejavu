package principal;

import javax.swing.JOptionPane;

import paneles.PanelIntroduccionAbstracta;
import paneles.PanelIntroduccionEspacial;
import paneles.PanelIntroduccionMatematica;
import paneles.PanelIntroduccionVerbal;

import ventana.VentanaInstrucciones;

public class Principal {
	
	public static void main(String arg[]){
		
		//Se declaran los objetos de las clases componentes de aplicación 
		Principal 							miPrincipal;
		Coordinador							coordinador;
		PanelIntroduccionAbstracta			panelIntroduccionAbstracta;
		PanelIntroduccionEspacial			panelIntroduccionEspacial;
		PanelIntroduccionMatematica			panelIntroduccionMatematica;
		PanelIntroduccionVerbal				panelIntroduccionVerbal;
		VentanaInstrucciones				ventanaInstrucciones;
		
		// Se instancian las clases		
		miPrincipal							=			new Principal();
		coordinador 				 		= 			new Coordinador();
		panelIntroduccionAbstracta	 		=			new PanelIntroduccionAbstracta();
		panelIntroduccionEspacial 	 		=			new PanelIntroduccionEspacial();
		panelIntroduccionMatematica 	 	=			new PanelIntroduccionMatematica();
		panelIntroduccionVerbal		 		=			new PanelIntroduccionVerbal();
		ventanaInstrucciones 		 		=			new VentanaInstrucciones(null, true);
		
		//Se establece relaciones entre las clases
		panelIntroduccionAbstracta.setCoordinador(coordinador);
		panelIntroduccionEspacial.setCoordinador(coordinador);
		panelIntroduccionMatematica.setCoordinador(coordinador);
		panelIntroduccionVerbal.setCoordinador(coordinador);
		ventanaInstrucciones.setCoordinador(coordinador);
		
		//Se establece relaciones con la clase coordinador
		coordinador.setPanelIntroduccionAbstracta(panelIntroduccionAbstracta);
		coordinador.setPanelIntroduccionEspacial(panelIntroduccionEspacial);
		coordinador.setPanelIntroduccionMatematica(panelIntroduccionMatematica);
		coordinador.setPanelIntroduccionVerbal(panelIntroduccionVerbal);
		coordinador.setVentanaInstrucciones(ventanaInstrucciones);
		
		ventanaInstrucciones.setVisible(true);
	}
	
	
}
