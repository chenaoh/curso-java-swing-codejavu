package principal;

import paneles.PanelIntroduccionAbstracta;
import paneles.PanelIntroduccionEspacial;
import paneles.PanelIntroduccionMatematica;
import paneles.PanelIntroduccionVerbal;
import ventana.VentanaInstrucciones;

public class Coordinador {

	private PanelIntroduccionAbstracta miPanelIntroduccionAbstracta;
	private PanelIntroduccionEspacial miPanelIntroduccionEspacial;
	private PanelIntroduccionMatematica miPanelIntroduccionMatematica;
	private PanelIntroduccionVerbal miPanelIntroduccionVerbal;
	private VentanaInstrucciones miVentanaInstrucciones;
	
	public void setPanelIntroduccionAbstracta(PanelIntroduccionAbstracta panelIntroduccionAbstracta) {
		miPanelIntroduccionAbstracta=panelIntroduccionAbstracta;
	}

	public void setPanelIntroduccionEspacial(PanelIntroduccionEspacial panelIntroduccionEspacial) {
		miPanelIntroduccionEspacial=panelIntroduccionEspacial;
	}

	public void setPanelIntroduccionMatematica(PanelIntroduccionMatematica panelIntroduccionMatematica) {
		miPanelIntroduccionMatematica=panelIntroduccionMatematica;
	}

	public void setPanelIntroduccionVerbal(PanelIntroduccionVerbal panelIntroduccionVerbal) {
		miPanelIntroduccionVerbal=panelIntroduccionVerbal;
	}

	public void setVentanaInstrucciones(VentanaInstrucciones ventanaInstrucciones) {
		miVentanaInstrucciones=ventanaInstrucciones;
	}
	
	public void cargarPaneles(int panel){
		switch (panel)
		{
			case 1: miVentanaInstrucciones.definirPanel(miPanelIntroduccionEspacial);
					break;
			case 2: miVentanaInstrucciones.definirPanel(miPanelIntroduccionAbstracta);
					break;
			case 3: miVentanaInstrucciones.definirPanel(miPanelIntroduccionMatematica);
					break;
			case 4: miVentanaInstrucciones.definirPanel(miPanelIntroduccionVerbal);
			break;
		}
	}
	
}
