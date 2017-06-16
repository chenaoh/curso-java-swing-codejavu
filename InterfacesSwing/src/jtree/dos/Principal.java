package jtree.dos;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
 
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TreeModelListener;
import javax.swing.JButton;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.JScrollPane;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;
 
// La clase principal
public class Principal extends JFrame {
 
    // el panel contenedor
    private JPanel contentPane;
    // el JFrame
    static Principal frame;
 
    /**
     * esta es la función que primero se ejecuta creando el JFRame y visualizándolo
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new Principal();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
    /**
     * la creación del JFrame principal donde está programado todo lo de éste ejemplo
     */
    public Principal() {
        // título de ventana
        setTitle("Java Swing 8 El JTree by Jnj");
        // operación al cerra el JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // dimensiones y posición en el escritorio
        setBounds(100, 100, 450, 306);
        // se crea el panel
        contentPane = new JPanel();
        // los bordes
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        // se establece
        setContentPane(contentPane);
        contentPane.setLayout(null);
 
        // se pone el botón en la ventana
        JButton btnCargarrbolDe = new JButton(
                "Cargar \u00E1rbol de directorios");
        btnCargarrbolDe.setBounds(10, 11, 200, 23);
        contentPane.add(btnCargarrbolDe);
 
        // las barras de escroll para el JTree
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 45, 414, 206);
        contentPane.add(scrollPane);
 
        // el JTree
        final JTree tree = new JTree();
        // que captura el evento click
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent e) {
                // se obtiene el nodo seleccionado
            	 DefaultMutableTreeNode nseleccionado = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
                // visualiza el path del nodo
                JOptionPane.showMessageDialog(frame, nseleccionado.getPath());
            }
        });
        // se pone el árbol en el panel de las barras de scroll
        scrollPane.setViewportView(tree);
 
        // aquí el botón que borra el último elemento de los primeros hijos
        // es decir, desde el nodo root, borra sólo el último hijo
        JButton btnBorrarltimoNodo = new JButton("Borrar \u00FAltimo nodo");
        btnBorrarltimoNodo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
 
                DefaultTreeModel arbol = (DefaultTreeModel) tree.getModel();
                DefaultMutableTreeNode padre = (DefaultMutableTreeNode) arbol.getRoot();
                int numeroDeHijos = arbol.getChildCount(padre);
 
                // borra el último hijo del padre
                arbol.removeNodeFromParent((MutableTreeNode) arbol.getChild(
                        padre, numeroDeHijos - 1));
            }
        });
        btnBorrarltimoNodo.setBounds(220, 11, 204, 23);
        contentPane.add(btnBorrarltimoNodo);
 
        // evento click del botón de carga del árbol
        // simplemente añade el nodo root y llama a la función de carga
        // para añadir todos los nodos hijos al nodo root
        btnCargarrbolDe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
 
                DefaultTreeModel arbol = (DefaultTreeModel) tree.getModel();
                DefaultMutableTreeNode nroot = new DefaultMutableTreeNode(
                        "Árbol de directorios");
 
                arbol.setRoot(nroot);
 
                CargaEstructuraDirectorios(arbol, nroot, "/");
 
            }
        });
         
     
    }
 
    // función recursiva que lista todos los directorios y subdirectorios
    // a partir de una ruta, añadiéndolos a la estructura en árbol
    private void CargaEstructuraDirectorios(DefaultTreeModel arbol,
            DefaultMutableTreeNode padre, String ruta) {
        DefaultMutableTreeNode aux = null;
 
        File archivo = new File(ruta); // puntero al directorio de la ruta
        File[] archivos = archivo.listFiles(); // lista todos los archivos de la ruta
 
        // recorre lo que hay en la ruta
        if (archivos != null) {
            for (int i = 0; i < archivos.length; i++) {
 
                // creando un nodo con cada cosa del directorio
                aux = new DefaultMutableTreeNode(archivos[i].getName());
                // inserta el nodo hijo
                arbol.insertNodeInto(aux, padre, i);
 
                // si encontramos un directorio volvemos a hacer lo mismo con sus hijos
                if (archivos[i].isDirectory()) {
                    try {
                         
                        // llamando recursivamente de nuevo a ésta misma función
                        CargaEstructuraDirectorios(arbol, aux,
                                archivos[i].getAbsolutePath() + "/");
                         
                    } catch (Exception e) {
                        System.out.println(e.getMessage()); // por si acaso le he puesto un try xD
                    }
                }
 
            }
 
        }
    }
     
    // termina la creación del frame
}
 
// fin de la clase
