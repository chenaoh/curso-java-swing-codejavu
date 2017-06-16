package Menu;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestMenu {
    JTextArea output;
    JScrollPane scrollPane;
    static JFrame frame ;

    public JMenuBar createMenuBar() {
     
        JMenuBar menuBar;
        JMenu menu, submenu;
        JMenuItem menuItem;
        JRadioButtonMenuItem rbMenuItem;
        JCheckBoxMenuItem cbMenuItem;

        MenuListener  listener = new MenuListener();

        //Crear la barra del menu.
        menuBar = new JMenuBar();

        //Crear el primer menu.
        menu = new JMenu("Archivo");
        menu.setMnemonic(KeyEvent.VK_A);
        menuBar.add(menu);

        //Un item de menu JMenuItem
        menuItem = new JMenuItem("Nuevo");
        menuItem.setMnemonic(KeyEvent.VK_N);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));      
        menuItem.addActionListener(listener);
        menu.add(menuItem);

        //Un menu radio boton
        menu.addSeparator();
        ButtonGroup group = new ButtonGroup();

        rbMenuItem = new JRadioButtonMenuItem("Imagenes");
        rbMenuItem.setSelected(true);
        rbMenuItem.setMnemonic(KeyEvent.VK_I);
        rbMenuItem.addActionListener(listener);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        rbMenuItem = new JRadioButtonMenuItem("Textos");
        rbMenuItem.setMnemonic(KeyEvent.VK_T);
        rbMenuItem.addActionListener(listener);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        //Un menu check box.
        menu.addSeparator();
        cbMenuItem = new JCheckBoxMenuItem("Europa");
        cbMenuItem.setMnemonic(KeyEvent.VK_E);
        cbMenuItem.addActionListener(listener);
        menu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("Asia");
        cbMenuItem.setMnemonic(KeyEvent.VK_S);
        cbMenuItem.addActionListener(listener);
        menu.add(cbMenuItem);

        //un submenu
        menu.addSeparator();
        submenu = new JMenu("Directivas");
        submenu.setMnemonic(KeyEvent.VK_D);

        menuItem = new JMenuItem("Segunda Ley");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
        menuItem.addActionListener(listener);
        submenu.add(menuItem);

        menuItem = new JMenuItem("Tercera Ley");
        menuItem.addActionListener(listener);
        submenu.add(menuItem);
        menu.add(submenu);

        //Segundo menu en la barra.
        menu = new JMenu("Edicion");       
        menu.setMnemonic(KeyEvent.VK_D);
        menuBar.add(menu);

        return menuBar;
    }

    public Container createContentPane() {
        //Crear el panel contenedor.
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setOpaque(true);

        //Crear un area de texto con scroll.
        output = new JTextArea(5, 30);
        output.setEditable(false);
        scrollPane = new JScrollPane(output);

        //Agregar esta area como contenido de la ventana.
        contentPane.add(scrollPane, BorderLayout.CENTER);

        return contentPane;
    }

    private static void crearAplicacion() {
        //Definir decoradores de la ventana.
        JFrame.setDefaultLookAndFeelDecorated(true);

        //Crear y configurar la ventana
        frame = new JFrame("TestMenu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Crear y configurar el contenido
        TestMenu demo = new TestMenu();
        frame.setJMenuBar(demo.createMenuBar());
        frame.setContentPane(demo.createContentPane());

        //Mostrar la ventana.
        frame.setSize(450, 260);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                  crearAplicacion();
            }
        });
    }
   
    public class MenuListener implements ActionListener {
          public void actionPerformed(ActionEvent e)
          {
              JMenuItem jmenuitem = (JMenuItem)e.getSource();
            String opcion  = jmenuitem.getText();
            String mensaje = "Opcion : "+opcion+"\n";
           
            output.append(mensaje);
           
            /*
            if (opcion.equals("Nuevo")) {
                ComponentesContent c=new ComponentesContent();
            }*/
          }
    }   
}