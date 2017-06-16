package principal;

import paneles.PanelIntroduccion;
import paneles.PanelMensaje;

import ventana.VentanaPrincipal;

public class Coordinador {

	private PanelIntroduccion miPanelIntroduccion;
	private PanelMensaje miPanelMensaje;
	
	private VentanaPrincipal miVentanaPrincipal;
	
	public void setPanelIntroduccion(PanelIntroduccion panelIntroduccion) {
		miPanelIntroduccion=panelIntroduccion;
	}

	public void setPanelMensaje(PanelMensaje panelMensaje) {
		miPanelMensaje = panelMensaje;
	}

	public void setVentanaPrincipal(VentanaPrincipal ventana) {
		miVentanaPrincipal=ventana;
	}
	
	public void cargarPaneles(int panel){
		switch (panel)
		{
			case 1: miVentanaPrincipal.definirPanel(miPanelIntroduccion);
					break;
			case 2: miVentanaPrincipal.definirPanel(miPanelMensaje);
			break;
		}
	}
}
