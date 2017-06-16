package cadenas.cadenas2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ejemplo_cadenas
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
