package cursoNTecnologias.service;

import javax.inject.Inject;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoNTecnologias.bd.domain.Direccion;
import cursoNTecnologias.service.Direccion.DireccionService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class DireccionServiceImplTest {
	@Inject
	DireccionService direccionService;
	
	@Ignore
	public void pruebaConsultarTodo() {
		try {
			System.out.println("Test consultar la dirección del cliente");
			direccionService.direccionId(1);	
		} catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	@Ignore
	public void insertarDireccion(){
		try{
			
			Direccion direccion = new Direccion();
			direccion.setCalle("Privada de Benito Juarez");
			direccion.setNumero(101);
			direccion.setColonia("Guelaguetza");
			direccion.setCiudad("Huajuapan");
			direccion.setEstado("Oaxaca");
			direccion.setPais("Mexico");
			direccion.setCodigopostal(6999);
			
			direccionService.insertarDireccion(direccion);
			
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	
	@Ignore
	public void eliminarDireccion(){
		try{
			direccionService.eliminarDireccion(6);		
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	
	@Test
	public void actualizarDireccion(){
		try{
			Direccion direccion = new Direccion();
			
			direccion.setCalle("Villa Alta");
			direccion.setNumero(100);
			direccion.setColonia("Niños Heroes");
			direccion.setCiudad("Oaxaca de Juarez, Oaxaca");
			direccion.setEstado("Oaxaca");
			direccion.setPais("Mexico");
			direccion.setCodigopostal(6001);
			direccion.setIddireccion(1);
			direccionService.actualizarDireccion(direccion);
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	
}
