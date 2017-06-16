package ventana;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Panel extends Container implements ActionListener{
	
	public ImageIcon icono;
	public JLabel labelTitulo;
	JButton boton;
	
	public Panel(){
		 icono = new ImageIcon (getClass().getResource("/imagenes/portada.jpg"));
		 		 
		 labelTitulo= new JLabel();
		 labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 28));
		 labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		 labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
		 labelTitulo.setText("IMAGEN DE FONDO");
		 labelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		 labelTitulo.setBounds(20, 10, 300, 40);
		 
		 boton=new JButton();
		 boton.setBounds(90,50, 200, 35);
		 boton.setText("Boton Mio");
		 boton.addActionListener(this);
		 add(boton);
		 
		 add(labelTitulo);
	} 
	
	public void paint (Graphics g)
    {
        Rectangle r = g.getClipBounds();
        g.setColor(this.getBackground());
        g.fillRect (r.x, r.y, r.width, r.height);
        g.drawImage (icono.getImage(), 0, 0, this.getWidth(), this.getHeight(), this.getBackground(), this);
        super.paint(g);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "HOLAAAA");
	}
}
