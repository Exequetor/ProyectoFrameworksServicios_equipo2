package cursoNTecnologias.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoNTecnologias.bd.domain.Marcas;
import cursoNTecnologias.service.marcas.MarcasServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class MarcasServiceImplTest {
	
	@Inject 
	MarcasServiceImpl marcaService;
	
	public void pruebaMostrarMarcas(){
		try{
			List<Marcas> lista= marcaService.listarMarcas();
		}catch(Exception  e){
			
		}
	}
	
	public void agregaMarca(){
		try{
			Marcas marca = new Marcas();
			marca.setIdmarca(0);
			marca.setNombremarca("Epson");
			
			marcaService.insertMarca(marca);
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	@Test
	public void deleteMarca() {
		try{
			marcaService.deleteMarca(4);	
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	
	public void updateMarca(){
		Marcas marca = new Marcas();
		marca.setIdmarca(2);
		marca.setNombremarca("Realteck");
		marcaService.updateMarca(marca);
	}
}
