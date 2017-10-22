package controlador;

import modelo.Logica;
import modelo.dao.UsuarioDao;
import modelo.vo.UsuarioVo;
import vista.VentanaConsultaIndividual;
import vista.VentanaLogin;
import vista.VentanaPrincipal;
import vista.VentanaRegistro;

public class Coordinador {

	private VentanaPrincipal miVentana;
	private VentanaLogin miLogin;
	private Logica miLogica;
	private VentanaRegistro miVentanaRegistro;
	private VentanaConsultaIndividual miVentanaConsultaIndividual;
	private UsuarioDao miUsuarioDao;

	public void setVentanaPrincipal(VentanaPrincipal miVentana) {
		this.miVentana=miVentana;
	}

	public void setVentanaLogin(VentanaLogin miLogin) {
		this.miLogin=miLogin;
	}

	public void setLogica(Logica miLogica) {
		this.miLogica=miLogica;
	}

	public String validarIngreso(int index, String pass) {		
		return miLogica.validarIngreso(index,pass);
	}

	public void cerrarVentanaLogin() {
		miLogin.dispose();
	}

	public void asignarPrivilegios(String usuario) {
		miVentana.asignarPrivilegios(usuario);
	}

	public void mostrarLogin() {
		miLogin.limpiar();
		miLogin.setVisible(true);
	}

	public void setVentanaRegistro(VentanaRegistro miVentanaRegistro) {
		this.miVentanaRegistro=miVentanaRegistro;
	}

	public void setVentanaConsultaIndividual(	VentanaConsultaIndividual miVentanaConsultaIndividual) {
		this.miVentanaConsultaIndividual=miVentanaConsultaIndividual;
	}

	public void mostrarVentanaRegistro() {
		miVentanaRegistro.setVisible(true);
	}

	public void mostrarVentanaConsulta() {
		miVentanaConsultaIndividual.setVisible(true);
	}

	public void setUsuarioDao(UsuarioDao miUsuarioDao) {
		this.miUsuarioDao=miUsuarioDao;
	}

	public String registrarUsuario(UsuarioVo miUsuarioVo) {
		return miUsuarioDao.registrarUsuario(miUsuarioVo);
	}

	public boolean validarCampos(UsuarioVo miUsuarioVo) {
		return miLogica.validarCampos(miUsuarioVo);
	}

	public Integer validarEdad(String edadIngresada) {
		// TODO Auto-generated method stub
		return miLogica.validarEdad(edadIngresada);
	}

	public UsuarioVo consultarUsuario(String doc) {
		
		return miUsuarioDao.consultarUsuario(doc);
	}

	public String actualizaUsuario(UsuarioVo miUsuarioVo) {
		return miUsuarioDao.actualizaUsuario(miUsuarioVo);
	}

	public String eliminarUsuario(String documento) {
		return miUsuarioDao.eliminarUsuario(documento);
	}
	
}
