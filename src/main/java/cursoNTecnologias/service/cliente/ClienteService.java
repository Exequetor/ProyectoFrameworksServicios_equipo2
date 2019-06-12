package cursoNTecnologias.service.cliente;

import java.util.List;
import java.util.Map;

import cursoNTecnologias.bd.domain.Cliente;
import cursoNTecnologias.bd.domain.Direccion;
//import cursoNTecnologias.bd.mappers.DireccionMapper;

public interface ClienteService {
	
	List<Cliente> listarTodosClientes();
	List<Cliente> listarTodosClientesDireccion();
	Cliente clienteDireccion(Integer id);
	void insertarCliente(Cliente cliente);
	void eliminarCliente(Integer id);
	void actualizarCliente(Cliente cliente);
	
	
	//pusho lo del DAO
}
