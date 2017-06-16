package jtable.jtable2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DatosJtable {
	public static void main(String args[]) {
		Ventana ventana;
		Coordinador coordinador;
		Entidad entidad;
		ventana = new Ventana("Entrada de datos en un JTable", 3, 3);
		coordinador = new Coordinador();
		entidad = new Entidad();
		ventana.setCoordinador(coordinador);
		coordinador.setVentana(ventana);
		coordinador.setEntidad(entidad);
	}
}

class Entidad {
	String sumaelemento(int datos[][]) {
		int i, j, mayor;
		String salida = "";
		mayor = datos[0][0];
		int suma = 0;
		for (i = 0; i < datos.length; i++) {
			for (j = 0; j < datos[i].length; j++) {
				salida += datos[i][j] + " ";
				suma += datos[i][j];
			}
			salida += "\n";
		}
		salida += "\n" + "La suma de los elementos es: " + suma;
		return salida;
	}
}

class Coordinador {
	Ventana miventana;
	Entidad mientidad;

	void setVentana(Ventana nuevaVentana) {
		miventana = nuevaVentana;
	}

	void setEntidad(Entidad nuevaentidad) {
		mientidad = nuevaentidad;
	}

	void botonpresionado(JTable datos) {
		int i, j, valor, filas, columnas, matriz[][];
		String respuesta;
		columnas = datos.getColumnCount();
		filas = datos.getRowCount();
		matriz = new int[filas][columnas];
		for (i = 0; i < filas; i++)
			for (j = 0; j < columnas; j++) {
				valor = Integer.parseInt((String) datos.getValueAt(i, j));
				matriz[i][j] = valor;
			}
		respuesta = mientidad.sumaelemento(matriz);
		miventana.mostrarmensaje(respuesta);
	}
}

class Ventana extends JFrame implements ActionListener {
	Coordinador micoordinador;
	JTable mitabla;
	JButton boton;
	JScrollPane mibarra;

	Ventana(String titulo, int filas, int columnas) {
		boton = new JButton();
		mitabla = new JTable(filas, columnas);
		mibarra = new JScrollPane(mitabla);
		mibarra.setBounds(20, 20, 250, 100);
		boton.setText("Suma los elementos");
		boton.setBounds(90, 150, 150, 20);
		setLayout(null);
		add(mibarra);
		add(boton);
		setTitle(titulo);
		setSize(300, 300);
		show();
		boton.addActionListener(this);
	}

	void setCoordinador(Coordinador nuevoCoordinador) {
		micoordinador = nuevoCoordinador;
	}

	public void actionPerformed(ActionEvent evento) {
		String valor;
		micoordinador.botonpresionado(mitabla);
	}

	void mostrarmensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

	void mostrarError(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Error",
				JOptionPane.ERROR_MESSAGE);
	}
}