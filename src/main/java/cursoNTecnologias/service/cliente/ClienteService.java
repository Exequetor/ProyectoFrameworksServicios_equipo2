package cursoNTecnologias.service.cliente;

import java.util.List;

import cursoNTecnologias.bd.domain.Cliente;

public interface ClienteService {
	
	List<Cliente> listarTodosClientes();
	List<Cliente> listarTodosClientesDireccion();
	Cliente clienteDireccion(Integer id);
	void insertarCliente(Cliente cliente);
	void eliminarCliente(Integer id);
	void actualizarCliente(Cliente cliente);
	
	
	
	//pusho lo del DAO
}
