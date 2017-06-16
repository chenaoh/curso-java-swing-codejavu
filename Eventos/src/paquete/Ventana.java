package paquete;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

class Ventana extends JFrame implements MouseListener,KeyListener {
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
		boton1.addMouseListener(this);
		campo.addMouseListener(this);
		boton1.addKeyListener(this);
		campo.addKeyListener(this);
	}

	public void mouseClicked(MouseEvent evento) {
		if (evento.getSource() == boton1){
			etiqueta1.setText("Hizo clic en mi botón");
		}
		else if (evento.getSource() == campo){
			etiqueta1.setText("Hizo clic en mi campo de texto");
		}
	}

	public void mousePressed(MouseEvent evento) {
		etiqueta1.setText("");
		if (evento.getSource() == boton1){
			etiqueta2.setText("Presiono mi botón");
		}
	}

	public void mouseReleased(MouseEvent evento) {
		if (evento.getSource() == boton1){
			etiqueta2.setText("Libero mi botón");
		}
	}

	public void mouseExited(MouseEvent evento) {
		if (evento.getSource() == boton1){
			etiqueta1.setText("Salio de mi botón");
		}
		else if (evento.getSource() == campo){
			etiqueta1.setText("Salio de mi campo de texto");
			}
		etiqueta2.setText("");
	}

	public void mouseEntered(MouseEvent evento) {
		if (evento.getSource() == boton1){
			etiqueta1.setText("Entro a mi botón");
		}
		else if (evento.getSource() == campo){
			etiqueta1.setText("Entro a mi campo de texto");
		}
		etiqueta2.setText("");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getSource()==campo)
		{
			if (e.VK_ENTER==e.getKeyCode()||e.VK_TAB==e.getKeyCode())
			{
				etiqueta1.setText("presiono la tecla en el campo");
			}
			if (e.VK_H==e.getKeyCode())
			{
				etiqueta1.setText("Escribe la H");
			}
			if (e.VK_J==e.getKeyCode())
			{
				etiqueta1.setText("Escribe la J");
			}
		}	
		if (e.getSource()==boton1)
		{
			if (e.VK_ENTER==e.getKeyCode())
			{
				etiqueta1.setText("enter con el foco en el boton");
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}