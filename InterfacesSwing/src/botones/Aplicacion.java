package botones;
//Interfaz gráfica de usuario
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Aplicacion
{
public static void main(String args[])
{
Ventana ventana;
ventana=new Ventana();
}
}
class Ventana extends JFrame implements ActionListener
{
Container contenedor;
JLabel etiqueta;
JButton boton;
Ventana()
{
contenedor=getContentPane();
contenedor.setLayout(null);
etiqueta=new JLabel();
boton=new JButton();
boton.setBounds(10,20,80,20);
boton.setBackground(Color.red);
etiqueta.setBounds(10,50,190,20);
boton.setText("De clic");
contenedor.add(boton);
contenedor.add(etiqueta);
contenedor.setBackground(Color.black);
setTitle("JButton");
setSize(200,100);
show();
boton.addActionListener(this);
}
public void actionPerformed(ActionEvent evento)
{
etiqueta.setText("Ha presionado el botón");
}
}