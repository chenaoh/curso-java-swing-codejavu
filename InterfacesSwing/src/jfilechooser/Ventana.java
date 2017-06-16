package jfilechooser;

import java.util.Vector;
import java.util.Enumeration;
import javax.swing.*;
public class Ventana
{
static String mensaje="";
static Vector vector;
static Object vec[];
static Enumeration enumeration;
static JTextArea area;
static JScrollPane panel;
public static void main(String args[])
{
int i=0;
area=new JTextArea(15,25);
panel=new JScrollPane(area);
vector =new Vector();
mensaje="Capacidad: "+vector.capacity()+"\n";
mensaje+="Tamaño inicial: "+vector.size()+"\n";
vector.addElement(new Integer(1));
vector.addElement(new Integer(2));
vector.addElement(new Integer(3));
vector.addElement("Hola");
Object n=new Integer(10);
if(vector.contains(n))
mensaje+=n+" Está contenido\n";
else
mensaje+=n+" No esta contenido\n";
vector.addElement(new Integer(3));
listar();
mensaje+="\nTamaño actual: "+vector.size()+"\n";
vec=new Object[vector.size()];
vector.copyInto(vec);
vector.addElement(new Float(6.08));
vector.addElement(new Double(7));
listar();
mensaje+="\nTamaño actual: "+vector.size()+"\n";
final Object dato;
dato=vector.elementAt(3);
mensaje+="El elemento de la posicion cuatro es: "+dato+"\n";
mensaje+="Elemento de la posición dos: "
+vector.get(2)+"\n";
vector.addElement(new Double(11.234));
vector.addElement(new Integer(12));
listar();
mensaje+="\nTamaño actual: "+vector.size()+"\n";
mensaje+= "primer elemento: " +(Integer)vector.firstElement() +"\n"
+"ultimo elemento "+(Integer)vector.lastElement()+"\n";
if(vector.contains(new Integer(3)))
mensaje+="\nEl vector contiene el 3";
vector.insertElementAt(new String (" hola a todos"),2); //añade el elemento en la posicionespecificada
mensaje+="\nEn la posicion 2 se encuentra: "+ vector.elementAt(2)+"\n";
listar();
vector.setElementAt(new String("Hola amigos"),2);//situa el elemento indicado en la posiciónespecificada
listar();
mensaje+="\nSe eliminó el elemento de la posicion 2:";
vector.removeElementAt(2);
listar();
while(i<vector.size())
{
Object dato1=vector.elementAt(i);
if(dato1.equals(new Integer(3)))
{
vector.removeElement(dato1);
}
i++;
}
mensaje+="\nSe elimino el valor de 3 dentro del vector\n";
listar();
mensaje+="\n\n";
String cadena=vector.toString();
area.setText(mensaje);
area.append("\nLa cadena equivalente es: "+cadena);
JOptionPane.showMessageDialog(null,panel);
}
public static void listar()
{
mensaje+="\nLos elementos contenidos son: \n";
enumeration=vector.elements();
while(enumeration.hasMoreElements())
mensaje+=enumeration.nextElement()+" ";
}
}