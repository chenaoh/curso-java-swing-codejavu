
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
class Aplicacion
{
public static void main(String args[])
{
Ventana ventana;
ventana=new Ventana();
}
}
class Ventana extends JFrame implements ChangeListener
{
JProgressBar barra;
JSlider deslizador;
JLabel salida;
JLabel titulo;
Ventana()
{
titulo=new JLabel();
barra=new JProgressBar();
deslizador=new JSlider(JSlider.HORIZONTAL,0,100,60 );
salida=new JLabel();
titulo.setHorizontalAlignment(SwingConstants.CENTER);
titulo.setText("Deslice sobre la barra");
titulo.setBounds(10,20,310,30);
deslizador.setBounds(180,50,30,200);
barra.setBounds(150,270,110,20);
deslizador.setPaintTicks( true );
deslizador.setMajorTickSpacing( 20 );
deslizador.setMinorTickSpacing( 5 );
deslizador.setBorder( new TitledBorder("") );
deslizador.setValue(0);
salida.setBounds(10,290,310,16);
salida.setText("El valor del deslizador es: 0%");
setLayout(null);
add(titulo);
add(deslizador);
add(barra);
add(salida);
setTitle("Barra de progreso");
setSize(500,350);
setResizable(true);
show();
deslizador.addChangeListener(this);
}
public void stateChanged(ChangeEvent evento)
{
int valor;
if(evento.getSource()==deslizador)
{
	valor=deslizador.getValue();
salida.setText("El valor del deslizador es: "+valor+"%");
barra.setValue(valor);
}
}
}