package controlador;

import modelo.Logica;
import modelo.dao.UsuarioDao;
import vista.VentanaConsultaIndividual;
import vista.VentanaLogin;
import vista.VentanaPrincipal;
import vista.VentanaRegistro;

public class Aplicacion {
	
	public void iniciarSistema(){
		
		//Instanciamos las clases unicas
		VentanaPrincipal miVentana=new VentanaPrincipal();
		VentanaLogin miLogin=new VentanaLogin(miVentana, true);
		Coordinador miCoordinador=new Coordinador();
		Logica miLogica=new Logica();
		VentanaRegistro miVentanaRegistro=new VentanaRegistro(miVentana, true);
		VentanaConsultaIndividual miVentanaConsultaIndividual=new VentanaConsultaIndividual(miVentana, true);
		UsuarioDao miUsuarioDao=new UsuarioDao();
		
		
		//Relacionamos las clases con el coordinador				
		miVentana.setCoordinador(miCoordinador);
		miLogin.setCoordinador(miCoordinador);
		miLogica.setCoordinador(miCoordinador);
		miVentanaRegistro.setCoordinador(miCoordinador);
		miVentanaConsultaIndividual.setCoordinador(miCoordinador);
		miUsuarioDao.setCoordinador(miCoordinador);
		
		//Relacionamos el Coordinador con las Clases
		miCoordinador.setVentanaPrincipal(miVentana);
		miCoordinador.setVentanaLogin(miLogin);
		miCoordinador.setLogica(miLogica);
		miCoordinador.setVentanaRegistro(miVentanaRegistro);
		miCoordinador.setVentanaConsultaIndividual(miVentanaConsultaIndividual);
		miCoordinador.setUsuarioDao(miUsuarioDao);
		
		miVentana.setVisible(true);
		miLogin.setVisible(true);
	}

}
