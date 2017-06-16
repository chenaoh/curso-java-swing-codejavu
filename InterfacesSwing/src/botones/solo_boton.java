package botones;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class solo_boton
{
//hace el llamado a la clase boton
public static void main(String args[])
	{
		boton miboton;
		miboton=new boton();
	}
}
//es la encargada de mostrar el boton en la pantalla
class boton extends JFrame implements ActionListener
	{
		JLabel etiqueta,mensaje;//inicializacion
		JButton boton1,boton2,salir;//inicializacion
		int result;
		
		private Container contenedor;
		
		public boton()//constructor
		{
			contenedor=getContentPane();
       		contenedor.setLayout(null);
		//	contenedor.setBackground( Color.green);
			int i=0;
			
				etiqueta= new JLabel();
				etiqueta.setBounds(60,130,290,15);
				mensaje= new JLabel();//creacion del JLabel permite insertar texto
				mensaje.setBounds(60,20,495,40);//coordenadas del JLabel
				for(i=0;i<3;i++)
				mensaje.setText("ESTE ES EL TEXTO PERMITIDO POR EL JLABEL"+i);//texto
				
				boton1=new JButton();//creacion del JButton
				boton2=new JButton();//creacion del JButton
				salir =new  JButton();
				
				boton1.setBounds(40,70,140,30);//coordenadas del boton
				boton2.setBounds(210,70,140,30);//coordenadas del boton
				salir.setBounds(380, 70, 140, 30);
								
				boton1.setText("nombre del boton ");
				boton2.setText("nombre del otro");
				salir.setText("SALIR");
				add(boton1);//llamada al boton
				add(boton2);//llamada al boton
				add(salir);
				
				add(mensaje);
				add(etiqueta);
				
				setTitle("CREACION DE UN BOTON");
				setSize(550,200);
				show();
				
				boton1.addActionListener(this);
				boton2.addActionListener(this);
				salir.addActionListener(this);
		}
		public void actionPerformed(ActionEvent evento)//metodo que permite imprimir el JTable
			{
				if(evento.getSource()==boton1)
					{
						etiqueta.setText("ESTE ES UN EJEMPLO DE LA FUNCION DEL BOTON");
					}
				if(evento.getSource()==boton2)
					{
						etiqueta.setText("CAMBIA AL OPRIMIRSE(ejemplo de JLabel)");
				
					}	
				if(evento.getSource()==salir )
					{
						System.exit(0);
					}
			}
	 
    
    
}
