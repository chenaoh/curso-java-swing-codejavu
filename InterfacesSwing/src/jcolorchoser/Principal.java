package jcolorchoser;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Principal extends JFrame {

JButton btnColor;
Color color;
JPanel p;

public Principal(){
p=new JPanel();
p.setLayout(new FlowLayout());
btnColor=new JButton("Seleccionar Color");
btnColor.addActionListener(new ActionListener(){


     public void actionPerformed(ActionEvent e){
             JColorChooser Selectorcolor=new JColorChooser();
             color=Selectorcolor.showDialog(null, "Seleccione un Color", Color.BLUE);
             p.setBackground(color);
      }
});
p.add(btnColor);
add(p);
}
public static void main(String arg[]){
Principal p=new Principal();
p.setVisible(true);
p.setBounds(0, 0, 400, 400);
p.setLocationRelativeTo(null);
}
}