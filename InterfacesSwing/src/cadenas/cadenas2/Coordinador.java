package cadenas.cadenas2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


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