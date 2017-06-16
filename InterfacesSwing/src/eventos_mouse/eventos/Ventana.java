package eventos_mouse.eventos;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Ventana extends JFrame implements MouseListener {
	JLabel etiqueta1, etiqueta2;
	JTextField campo;
	JButton boton1;

	public Ventana() {
		setLayout(null);
		etiqueta1 = new JLabel();
		etiqueta2 = new JLabel();
		campo = new JTextField("Mi campo de texto");
		boton1 = new JButton();
		boton1.setBounds(10, 20, 100, 20);
		etiqueta1.setBounds(10, 160, 190, 20);
		etiqueta2.setBounds(10, 180, 190, 20);
		boton1.setText("Mi botón");
		campo.setBounds(10, 100, 100, 20);
		add(etiqueta1);
		add(etiqueta2);
		add(boton1);
		add(campo);
		setTitle("Mi botón");
		setSize(400, 240);
		show();
		boton1.addMouseListener(this);
		campo.addMouseListener(this);
	}

	public void mouseClicked(MouseEvent evento) {
		if (evento.getSource() == boton1)
			etiqueta1.setText("Hizo clic en mi botón");
		else if (evento.getSource() == campo)
			etiqueta1.setText("Hizo clic en mi campo de texto");
	}

	public void mousePressed(MouseEvent evento) {
		etiqueta1.setText("");
		if (evento.getSource() == boton1)
			etiqueta2.setText("Presiono mi botón");
	}

	public void mouseReleased(MouseEvent evento) {
		if (evento.getSource() == boton1)
			etiqueta2.setText("Libero mi botón");
	}

	public void mouseExited(MouseEvent evento) {
		if (evento.getSource() == boton1)
			etiqueta1.setText("Salio de mi botón");
		else if (evento.getSource() == campo)
			etiqueta1.setText("Salio de mi campo de texto");
		etiqueta2.setText("");
	}

	public void mouseEntered(MouseEvent evento) {
		if (evento.getSource() == boton1)
			etiqueta1.setText("Entro a mi botón");
		else if (evento.getSource() == campo)
			etiqueta1.setText("Entro a mi campo de texto");
		etiqueta2.setText("");
	}
}