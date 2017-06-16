package eventos_mouse;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class ClaseBotones {
	
	public static void main(String args[]) {
		Ventana ventana;
		ventana = new Ventana();
	}
}

class Ventana extends JFrame implements ActionListener {
	Container contenedor;
	JLabel etiqueta, mensaje;
	/* Se declara un arreglo de 5 botones */
	JButton boton[] = new JButton[5];
	int resul;

	Ventana() {
		contenedor = getContentPane();
		contenedor.setLayout(null);
		etiqueta = new JLabel();
		mensaje = new JLabel();
		int i, j = 10, k = 50;
		for (i = 0; i < 5; i++) {
			/* Se construye cada botón, se colocan las dimensiones y el texto */
			boton[i] = new JButton();
			boton[i].setBounds(j, k, 150, 20);
			k += 40;
			switch (i) {
			case 0:
				boton[i].setText("Boton1");
				break;
			case 1:
				boton[i].setText("Boton2");
				break;
			case 2:
				boton[i].setText("Boton3");
				break;
			case 3:
				boton[i].setText("Boton4");
				break;
			case 4:
				boton[i].setText("Boton5");
			}
		}
		mensaje.setBounds(5, 20, 495, 20);
		mensaje.setText("Presione un botón para ver el mensaje");
		etiqueta.setBounds(10, 330, 190, 20);
		contenedor.add(mensaje);
		for (i = 0; i < 5; i++) {
			contenedor.add(boton[i]);
			boton[i].addActionListener(this);
		}
		contenedor.add(etiqueta);
		setTitle("JButton");
		// Botones.java
		setSize(400, 400);
		show();
	}

	public void actionPerformed(ActionEvent evento) {
		int i = 0;
		for (i = 0; i < 5; i++)
			if (evento.getSource() == boton[i]) {
				etiqueta.setText("Ha presionado el boton: "
						+ boton[i].getText());
			}
	}
}
