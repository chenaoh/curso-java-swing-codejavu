package jpopupMenu;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author samuel
 */
public class menuEmergente{
    JPopupMenu menu;
    JButton invoker;
    JFrame f;
    
    public menuEmergente(){
        menu = new JPopupMenu();
        JMenuItem acc1 = new JMenuItem("accion 1");
        menu.add(acc1); 
        JMenuItem acc2 = new JMenuItem("accion 2");
        menu.add(acc2); 
        
        f = new JFrame("ejemplo de JPoppupMenu");
        f.setBounds(200,200, 100, 50);
        f.setLayout(new BorderLayout());
        
        //agregamos el manejador de las acciones del menu

        accionMenu manejadorDeAcciones = new accionMenu();
        acc1.addActionListener(manejadorDeAcciones);
        acc2.addActionListener(manejadorDeAcciones);
        
        // definimos que componente los "invoca"

        invoker = new JButton("click here");   
        
        // agregamos el evento al botton para que al hacer click sobre el muestre el menu 

        invoker.addMouseListener(new MouseAdapter() {  
            @Override 
            public void mouseReleased(MouseEvent e){
                menu.show(invoker, e.getX(), e.getY());
            }
        });
        
        //terminamos de preparar el JFrame para mostrarlo

        f.getContentPane().add(invoker);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
}
    public static void main(String args[]){
        new menuEmergente();
    }
}
class accionMenu implements ActionListener{

    public void actionPerformed(ActionEvent arg0) {
        if( ((JMenuItem)arg0.getSource()).getText().compareTo("accion 1") == 0 ){
                    System.out.println("ACCION 1");
        }
    }
}
