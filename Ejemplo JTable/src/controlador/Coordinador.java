package controlador;

import javax.swing.table.DefaultTableModel;

import modelo.Logica;
import modelo.dao.PersonaDao;
import modelo.vo.PersonaVo;
import vista.BuscarUsuarios;
import vista.VentanaBuscar;
import vista.VentanaPrincipal;
import vista.VentanaRegistro;


public class Coordinador {

	private Logica miLogica;
	private VentanaPrincipal miVentanaPrincipal;
	private VentanaRegistro miVentanaRegistro;
	private VentanaBuscar miVentanaBuscar;
	private BuscarUsuarios miBuscarUsuarios;
	
	public BuscarUsuarios getMiBuscarUsuarios() {
		return miBuscarUsuarios;
	}
	public void setMiBuscarUsuarios(BuscarUsuarios miBuscarUsuarios) {
		this.miBuscarUsuarios = miBuscarUsuarios;
	}
	public VentanaPrincipal getMiVentanaPrincipal() {
		return miVentanaPrincipal;
	}
	public void setMiVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
	}
	public VentanaRegistro getMiVentanaRegistro() {
		return miVentanaRegistro;
	}
	public void setMiVentanaRegistro(VentanaRegistro miVentanaRegistro) {
		this.miVentanaRegistro = miVentanaRegistro;
	}
	public VentanaBuscar getMiVentanaBuscar() {
		return miVentanaBuscar;
	}
	public void setMiVentanaBuscar(VentanaBuscar miVentanaBuscar) {
		this.miVentanaBuscar = miVentanaBuscar;
	}
	public Logica getMiLogica() {
		return miLogica;
	}
	public void setMiLogica(Logica miLogica) {
		this.miLogica = miLogica;
	}
		
	public void mostrarVentanaRegistro() {
		miVentanaRegistro.setVisible(true);
	}
	public void mostrarVentanaConsulta() {
		//miVentanaBuscar.setVisible(true);
		miBuscarUsuarios.consulta();
		miBuscarUsuarios.setVisible(true);
	}
	
	public void registrarPersona(PersonaVo miPersona) {
		miLogica.validarRegistro(miPersona);
	}
	
	public PersonaVo buscarPersona(String codigoPersona) {
		return miLogica.validarConsulta(codigoPersona);
	}
	
	public void modificarPersona(PersonaVo miPersona) {
		miLogica.validarModificacion(miPersona);
	}
	public void eliminarPersona(String codigo) {
		miLogica.validarEliminacion(codigo);
	}
	public void buscarUsuarios(DefaultTableModel model) {
		System.out.println("1");
		miLogica.buscarUsuarios(model);
	}


}
