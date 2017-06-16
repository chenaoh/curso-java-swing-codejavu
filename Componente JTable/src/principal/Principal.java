package principal;

import ventanas.VentanaRegistro;

public class Principal {

	/**
	 * Llama la ventana principal
	 * @param args
	 */
	public static void main(String[] args) {
		VentanaRegistro miVentanaRegistro;
		miVentanaRegistro= new VentanaRegistro();
		miVentanaRegistro.setVisible(true);
	}

}
