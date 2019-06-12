package cursoNTecnologias.service.Direccion;

import java.util.List;
import java.util.Map;

import cursoNTecnologias.bd.domain.Direccion;

public interface DireccionService {
	List <Direccion> listarDireccion();
	Direccion direccionId(Integer id);
	void insertarDireccion(Direccion direccion);
	void eliminarDireccion(Integer id);
	void actualizarDireccion(Direccion direccion);
	Direccion obtenerDireccionPorId(Integer idDireccion);
}
