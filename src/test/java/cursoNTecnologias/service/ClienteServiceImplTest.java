package cursoNTecnologias.service;

import java.util.List;

import javax.inject.Inject;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoNTecnologias.bd.domain.Cliente;
import cursoNTecnologias.service.cliente.ClienteService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class ClienteServiceImplTest {
	
	@Inject
	ClienteService clienteService;
	
	@Ignore
	public void listarTodosClientes (){
		try{
			List<Cliente> lista = clienteService.listarTodosClientes();
			//assertEquals(lista.size(),7);
		}
		catch(Exception e){
			System.out.println("error" + e);
		}
	}
	
	@Ignore
	public void insertarClienteNuevo(){
		try{
			Cliente cliente = new Cliente();
			cliente.setNombre("El que sea");
			cliente.setApellido("Mtz");
			cliente.setEmail("elquesea@gmail.com");
			cliente.setSexo("Masculino");
			cliente.setIddireccion(3);
			
			clienteService.insertarCliente(cliente);
			
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	
	@Ignore
	public void actualizarCliente(){
		try{
			Cliente cliente=new Cliente();
			cliente.setNombre("Liz");
			cliente.setApellido("Morales");
			cliente.setEmail("lvmrobles@gmail.com");
			cliente.setSexo("Femenino");
			cliente.setIddireccion(3);
			cliente.setId(6);
			clienteService.actualizarCliente(cliente);
	
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	@Test
	public void eliminarCliente(){
		try{
			clienteService.eliminarCliente(7);
			
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
}
