package cursoNTecnologias.service.productos;

import java.util.List;
import java.util.Map;

import cursoNTecnologias.bd.domain.Marcas;
import cursoNTecnologias.bd.domain.Productos;

public interface ProductosService {
	List <Productos> listarProductos ();
	void agregarProductoyMarca(Productos p,String m);
	Productos listarUnProducto(Productos p);
	void updateProducto(Productos p);
	void deleteProducto(Integer id);
	
	List<Productos> listarTodosProductosMarca();
	Productos productoMarca(Integer id);
	void agregarProducto(Productos p);
	Marcas obtenerMarcaPorId(Map<String, Integer> mapMarca);
}
