package jtable;

import java.awt.*;
import javax.swing.*;

public class Aplicacion {
	public static void main(String args[]) {
		Ventana ventana;
		ventana = new Ventana();
		ventana.mostrarDatos();
	}
}

class Ventana extends JFrame {
	JTable mitabla;
	JScrollPane mibarra;

	Ventana() {
		mibarra = new JScrollPane();
		mibarra.setBounds(20, 20, 200, 130);
		setLayout(null);
		add(mibarra);
		setTitle("Ejemplo de Jtable");
		setSize(300, 200);
		show();
	}

	public void mostrarDatos() {
		String datos[][] = { { "2", "1", "3" }, { "4", "3", "11" },
				{ "6", "5", "17" }, { "2", "1", "3" }, { "4", "3", "11" },
				{ "2", "1", "3" }, { "4", "3", "11" }, { "6", "5", "17" },
				{ "6", "5", "17" } };
		String titulos[] = { "Pares", "Impares", "Primos" };
		mitabla = new JTable(datos, titulos);
		
		mitabla.setEnabled(false);
		mitabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		mibarra.setViewportView(mitabla);
	}
}