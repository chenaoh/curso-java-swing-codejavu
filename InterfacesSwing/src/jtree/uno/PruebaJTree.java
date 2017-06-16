package jtree.uno;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.WindowConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


/**
 * Clase de ejemplo sencillo de uso del JTree
 *
 * @author Chuidiang
 */
public class PruebaJTree
{
    /**
     * Ejemplo sencillo de uso de JTree
     *
     * @param args Argumentos de linea de comandos. Se ignoran.
     */
    public static void main(String[] args)
    {
        // Construccion del arbol
        DefaultMutableTreeNode abuelo = new DefaultMutableTreeNode("abuelo");
        DefaultTreeModel modelo = new DefaultTreeModel(abuelo);
        JTree tree = new JTree(modelo);

        // Construccion de los datos del arbol
        DefaultMutableTreeNode padre = new DefaultMutableTreeNode("padre");
        DefaultMutableTreeNode tio = new DefaultMutableTreeNode("tio");
        modelo.insertNodeInto(padre, abuelo, 0);
        modelo.insertNodeInto(tio, abuelo, 1);

        DefaultMutableTreeNode hijo = new DefaultMutableTreeNode("hijo");
        DefaultMutableTreeNode hija = new DefaultMutableTreeNode("hija");
        modelo.insertNodeInto(hijo, padre, 0);
        modelo.insertNodeInto(hija, padre, 1);

        // Construccion y visualizacion de la ventana
        JFrame v = new JFrame();
        JScrollPane scroll = new JScrollPane(tree);
        v.getContentPane().add(scroll);
        v.pack();
        v.setVisible(true);
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}