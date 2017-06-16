package jpopupMenu;
import javax.swing.*;

class Menu extends JFrame {
 //PopUpMenu Boton derecho 
 JPopupMenu PopMenu=new JPopupMenu (); 
   JMenuItem PopCortar=new JMenuItem ("Cortar");
   JMenuItem PopCopiar=new JMenuItem ("Copiar");
   JMenuItem PopPegar=new JMenuItem ("Pegar");
   JMenuItem PopSelTodo=new JMenuItem ("Seleccionar Todo");
 JTextArea Texto = new JTextArea();

    public Menu() {

  //JPopUpMenu
        PopMenu.add (PopCortar); 
        PopMenu.add(PopCopiar);
        PopMenu.add(PopPegar);
        add(Texto);
        //Establecer PopUpMenu al JFrame
        Texto.setComponentPopupMenu (PopMenu);
  
  setTitle("Ejemplos JPopUpMenu"); 
     setSize(800,600);
  setVisible(true);
    }
    
 public static void main (String []args){
  new Menu();
 }   
    
}