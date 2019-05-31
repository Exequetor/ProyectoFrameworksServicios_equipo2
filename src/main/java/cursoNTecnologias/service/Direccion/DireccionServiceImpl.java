package cursoNTecnologias.service.Direccion;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import cursoNTecnologias.bd.DireccionDao.DireccionDao;
import cursoNTecnologias.bd.domain.Direccion;
@Named
public class DireccionServiceImpl implements DireccionService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	DireccionDao direccionDao;
	
	public List<Direccion> listarDireccion() {
		return direccionDao.listarDireccion();
	}

	public Direccion direccionId(Integer id) {
		return direccionDao.direccionId(id);
	}

	public void insertarDireccion(Direccion direccion) {
		direccionDao.insertarDireccion(direccion);	
	}

	public void eliminarDireccion(Integer id) {
		direccionDao.eliminarDireccion(id);
	}

	public void actualizarDireccion(Direccion direccion) {
		direccionDao.actualizarDireccion(direccion);
		
	}

}
