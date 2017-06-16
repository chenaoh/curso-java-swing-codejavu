package cadenas.cadenas2;
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
	return cadena1.toUpperCase();
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