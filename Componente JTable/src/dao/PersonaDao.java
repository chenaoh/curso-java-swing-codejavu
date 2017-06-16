package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import vo.PersonaVo;

import conexion.Conexion;

/**
 * Clase que permite el acceso a la base de datos
 * 
 * @author chenao
 * 
 */
public class PersonaDao {

	/**
	 * Usa el objeto enviado para almacenar la persona
	 * @param miPersona
	 */
	public void registrarPersona(PersonaVo miPersona) {
		Conexion conex = new Conexion();

		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("INSERT INTO persona VALUES ('"
					+ miPersona.getIdPersona() + "', '"
					+ miPersona.getNombrePersona() + "', '"
					+ miPersona.getEdadPersona() + "', '"
					+ miPersona.getProfesionPersona() + "', '"
					+ miPersona.getTelefonoPersona() + "')");
			JOptionPane.showMessageDialog(null,
					"Se ha registrado Exitosamente", "Información",
					JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null,
					"No se Registro, verifique la consola para ver el error",
					"Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Usa el objeto model para almacenar directamente la información obtenida
	 * de la BD, y se muestra en la tabla, el tamaño es 5 por defecto ya que
	 * conocemos el numero de columnas
	 * 
	 * @param model
	 */
	public void buscarUsuariosConTableModel(DefaultTableModel model) {

		Conexion conex = new Conexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			ResultSet rs = estatuto.executeQuery("SELECT * FROM persona ");

			while (rs.next()) {
				// es para obtener los datos y almacenar las filas
				ArrayList<Object> obj= new ArrayList<Object>();
				//Object[] fila = new Object[5];
				
				// para llenar cada columna con lo datos almacenados
				for (int i = 0; i <5; i++){
					//fila[i] = rs.getObject(i + 1);
					obj.add(rs.getObject(i + 1));
				}
				Object[] arreglo = (Object[]) obj.toArray();	
				// es para cargar los datos en filas a la tabla modelo
				model.addRow(arreglo);

			}
			rs.close();
			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Error al consultar", "Error",
					JOptionPane.ERROR_MESSAGE);

		}
	}

	/**
	 * Retorna una lista con los datos de la BD, para luego ser 
	 * recorrida y almacenada en la tabla por medio de la Matriz
	 * @return
	 */
	public ArrayList<PersonaVo> buscarUsuariosConMatriz() {

		Conexion conex = new Conexion();
		ArrayList<PersonaVo> miLista = new ArrayList<PersonaVo>();
		PersonaVo persona;
		try {
			Statement estatuto = conex.getConnection().createStatement();
			ResultSet rs = estatuto.executeQuery("SELECT * FROM persona ");

			while (rs.next()) {
				persona = new PersonaVo();
				persona.setIdPersona(Integer.parseInt(rs.getString("id")));
				persona.setNombrePersona(rs.getString("nombre"));
				persona.setEdadPersona(Integer.parseInt(rs.getString("edad")));
				persona.setProfesionPersona(rs.getString("profesion"));
				persona.setTelefonoPersona(Integer.parseInt(rs.getString("telefono")));
				miLista.add(persona);
			}
			rs.close();
			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Error al consultar", "Error",
					JOptionPane.ERROR_MESSAGE);

		}
		return miLista;
	}
}
