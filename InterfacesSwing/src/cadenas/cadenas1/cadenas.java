package cadenas.cadenas1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class cadenas
{
	public static void main(String args[])
	{
	Entidad entidad=new Entidad();
	Ventana ventana=new Ventana();
	Coordinador coordinador=new Coordinador();
	ventana.setCoordinador(coordinador);
	coordinador.setVentana(ventana);
	coordinador.setEntidad(entidad);
	}
}
class Entidad
{
public static String cadena1,cadena2, resultado;

public void crearCadenas(String nuevacadena1, String nuevacadena2)
	{
	cadena1=new String (nuevacadena1);
	cadena2=new String(nuevacadena2);
	}
	
public String getComparacion()
	{
	resultado=new String();
	if(cadena1.equals(cadena2)==true)
	resultado="son iguales";
	else
	resultado="Son distintas";
	return resultado;
	}
	
public String getConcatena()
	{
	String aux=cadena1.concat(" ");
	return aux.concat(cadena2);
	}
	
public String mayuscula()
	{
	return cadena1.toUpperCase()+cadena2.toUpperCase();
	}
	
	public int caracter(char ch)
	{
	return cadena1.indexOf(ch);
	}
	
public String reemplazo(char ch)
	{
	return cadena1.replace(ch,'p');
	}
	
public char [] toArray()
	{
	return cadena1.toCharArray();
	}
}

class Coordinador
{
Entidad miEntidad;
Ventana miventana;

public void setEntidad(Entidad nuevaEntidad)
	{
	miEntidad=nuevaEntidad;
	}
	
public void setVentana(Ventana nuevaVentana)
	{
	miventana=nuevaVentana;
	}
	
public void proceso()throws Exception
	{
	String texto1, texto2, resultado;
	texto1=miventana.getTexto1();
	texto2=miventana.getTexto2();
	miEntidad.crearCadenas(texto1,texto2);
	resultado=miEntidad.getComparacion();
	miventana.setResultado(resultado);
	}

public int proceso1()throws Exception
	{
	String texto1, texto2, resultado;
	int longi;
	texto1=miventana.getTexto1();
	texto2=miventana.getTexto2();
	miEntidad.crearCadenas(texto1,texto2);
	resultado=miEntidad.getConcatena();
	longi=resultado.length();
	miventana.setResultado(resultado);
	return longi;
	}
	
public void proceso2()throws Exception
	{
	String texto1, texto2, resultado;
	texto1=miventana.getTexto1();
	Entidad.cadena1=new String (texto1);
	resultado=miEntidad.mayuscula();
	miventana.setResultado(resultado);
	}
	
public void proceso3(char ch)throws Exception
	{
	String texto1;
	texto1=miventana.getTexto1();
	Entidad.cadena1=new String (texto1);
	int resul=miEntidad.caracter(ch);
	JOptionPane.showMessageDialog(null,"Este caracter se encuentra, dentro de la primeracadena, en la posicion: "+resul);
	JOptionPane.showMessageDialog(null,"este caracter será reemplazado por la p ");
	texto1=miEntidad.reemplazo(ch);
	miventana.modificarnombre(texto1);
	Entidad.cadena1=new String (texto1);
	char cadena[]=miEntidad.toArray();
	miventana.salidacadena(cadena);
	}
}

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
	caracter=new JButton();
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
	caracter.setText("Buscar un caracter");
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