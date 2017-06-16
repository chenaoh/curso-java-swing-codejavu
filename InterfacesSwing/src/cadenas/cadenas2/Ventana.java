package cadenas.cadenas2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class Ventana extends JFrame implements ActionListener
{
	Coordinador micoordinador;
	JLabel titulo;
	JButton botonComparar, concatenar, mayus;
	JLabel etiqueta1,etiqueta2,etiqueta3,resultado, longi;
	JTextField texto1,texto2;
	JButton caracter;
	char car;
	
public Ventana()
	{
	texto1=new JTextField();
	texto2=new JTextField();
	etiqueta1=new JLabel();
	etiqueta2=new JLabel();
	etiqueta3=new JLabel();
	resultado=new JLabel();
	titulo=new JLabel();
	longi=new JLabel();
	botonComparar=new JButton();
	concatenar=new JButton();
	caracter=new JButton("Buscar un caracter");
	mayus=new JButton();
	titulo.setHorizontalAlignment(SwingConstants.CENTER);
	titulo.setText("Concatenación de cadenas");
	titulo.setBounds(10,10,230,30);
	etiqueta1.setBounds(10,50,100,20);
	etiqueta1.setText ("Cadena 1:");
	etiqueta2.setBounds(10,80,100,20);
	etiqueta2.setText ("Cadena 2:");
	etiqueta3.setBounds(10,110,100,20);
	etiqueta3.setText ("Resultado:");
	texto1.setBounds(110,50,100,20);
	texto2.setBounds(110,80,100,20);
	resultado.setBounds(110,110,100,20);
	botonComparar.setText("comparar");
	botonComparar.setBounds(0,140,100,30);
	concatenar.setText("concatenar");
	concatenar.setBounds(120,140,100,30);
	caracter.setBounds(340,140,150,30);
	mayus.setText("Mayuscula");
	mayus.setBounds(235,140,100,30);
	longi.setBounds(300,110,100,30);
	setLayout(null);
	add(titulo);
	add(etiqueta1);
	add(etiqueta2);
	add(etiqueta3);
	add(texto1);
	add(texto2);
	add(resultado);
	add(botonComparar);
	add(concatenar);
	add(mayus);	
	add(caracter);
	add(longi);
	setTitle("Ejemplo de String");
	setSize(600,250);
	setResizable(true);
	show();
	caracter.addActionListener(this);
	botonComparar.addActionListener(this);
	concatenar.addActionListener(this);
	mayus.addActionListener(this);
}

public void setCoordinador(Coordinador nuevoCoordinador)
	{
	micoordinador=nuevoCoordinador;
	}
	
public void actionPerformed(ActionEvent evento)
	{
	try
		{
		if(evento.getSource()==botonComparar)
			{
			micoordinador.proceso();
			longi.setText("");
			}
		else
			if(evento.getSource()==concatenar)
				{
				int longi0=micoordinador.proceso1();
				longi.setText("la longitud es: "+longi0);
				}
			else
				if(evento.getSource()==mayus)
					{
					longi.setText("");
					micoordinador.proceso2();
					}
				else
					if(evento.getSource()==caracter)
						{
						String s=JOptionPane.showInputDialog(null,"Digite un caracter: ");
						char ch=s.charAt(0);
						micoordinador.proceso3(ch);
						}
		}catch(Exception e){}

}

public void setResultado(String cadena)
	{
	resultado.setText(cadena);
	}
	
public void modificarnombre(String cadena)
	{
	texto1.setText(cadena);
	}
	
public void salidacadena(char cadena[])
	{
	String res="";
	for(int i=0; i<cadena.length; i++)
	res=res+cadena[i]+" ";
	JOptionPane.showMessageDialog(null, "Los caracteres son: " +res);
	}
	
public String getTexto1()
	{
	return texto1.getText();
	}
	
public String getTexto2()
	{
	return texto2.getText();
	}
}