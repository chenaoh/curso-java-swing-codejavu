package ejemplo1;
/**
 * Ejemplo de seleccion de nodos en un arbol
 */
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.WindowConstants;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreePath;

/**
 * Crea un JTree y muestra lo que se selecciona en el.
 */

public class prueba extends JFrame {
	public static void main(String[] args) {
		
		// Creación de los datos para el JTree. Un padre, con hijo1 e hijo2. hijo1 tiene
		// ademas un nieto.
		DefaultMutableTreeNode padre = new DefaultMutableTreeNode(new Integer(3));
		DefaultMutableTreeNode hijo1 = new DefaultMutableTreeNode("hijo1");
		DefaultMutableTreeNode hijo2 = new DefaultMutableTreeNode("hijo2");
		DefaultMutableTreeNode nieto1 = new DefaultMutableTreeNode(new Float(2.2));
		DefaultTreeModel modelo = new DefaultTreeModel(padre);
		modelo.insertNodeInto(hijo1, padre, 0);
		modelo.insertNodeInto(hijo2, padre, 1);
		modelo.insertNodeInto(nieto1, hijo1, 0);
		
		// Creacion y visualizacion de la ventana
		JFrame v = new JFrame("arbolito");
		JTree arbol = new JTree(modelo);
		v.getContentPane().add(arbol);
		v.pack();
		v.setVisible(true);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// Nos suscribimos a la seleccion de un nodo en el arbol.
		arbol.getSelectionModel().addTreeSelectionListener(new TreeSelectionListener() {
		
			public void valueChanged(TreeSelectionEvent e) {
				
				// Obtenemos y escribimos en pantalla  el path seleccionado
				TreePath path = e.getPath();
				Object [] nodos = path.getPath();
				System.out.print("Path seleccionado: ");
				for (Object nodo: nodos)
					System.out.print (nodo.toString() + " | ");
				System.out.println("");
				
				// Mirando el ultimo nodo del path, sabemos qué nodo en concreto
				// se ha seleccionado.
				DefaultMutableTreeNode ultimoNodo = 
					(DefaultMutableTreeNode)nodos[nodos.length-1];
				
				// Por ejemplo, para ver si se ha seleccionado el "hijo1"...
				if (ultimoNodo.getUserObject().equals("hijo1"))
				{
					// Necesitamos el modeloSeleccion para saber si "hijo1" se ha
					// seleccionado o deseleccionado.
					DefaultTreeSelectionModel modeloSeleccion = 
						(DefaultTreeSelectionModel)e.getSource();
					if (modeloSeleccion.isPathSelected(path))
						System.out.println("Has seleccionado hijo 1");
					else
						System.out.println("Has deseleccionado hijo 1");
				}
			}
		
		});
	}

}