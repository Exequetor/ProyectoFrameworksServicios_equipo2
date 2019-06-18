package cursoNTecnologias.service.cliente;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import cursoNTecnologias.bd.ClienteDao.ClienteDao;
import cursoNTecnologias.bd.DireccionDao.DireccionDao;
import cursoNTecnologias.bd.domain.Cliente;
import cursoNTecnologias.bd.domain.Direccion;

@Named
public class ClienteServiceImpl implements ClienteService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	ClienteDao clienteDao;

	public List<Cliente> listarTodosClientes() {
		return clienteDao.listarTodosClientes();
	}

	public List<Cliente> listarTodosClientesDireccion() {
		return clienteDao.listarTodosClientesDireccion();
	}

	public Cliente clienteDireccion(Integer id) {
		return clienteDao.clienteDireccion(id);
	}

	public void insertarCliente(Cliente cliente) {
		clienteDao.insertarCliente(cliente);

	}

	public void eliminarCliente(Integer id) {
		clienteDao.eliminarCliente(id);
	}

	public void actualizarCliente(Cliente cliente) {
		clienteDao.actualizarCliente(cliente);
	}

}
