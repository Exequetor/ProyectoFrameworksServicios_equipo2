package cursoNTecnologias.service.productos;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import cursoNTecnologias.bd.domain.Productos;
import cursoNTecnologias.bd.mappers.ProductosMapper;
import cursoNTecnologias.bd.ProductosDao.ProductosDao;

@Named
public class ProductosServiceImpl implements ProductosService{
	
	@Inject
	ProductosDao productoDao;
	
	public List<Productos> listarProductos(){
		System.out.println("Service impl");
		return productoDao.listarProductos();
	}
	
	public List<Productos> listarTodosProductosMarca() {
		return productoDao.listarTodosProductosMarca();
	}
	
	public void agregarProducto(Productos p){
		productoDao.agregarProducto(p);
	}
	public void updateProducto(Productos p){
		productoDao.updateProducto(p);
	}
	public void deleteProducto(Integer id){
		productoDao.deleteProducto(id);
	}
	public Productos listarUnProducto(Productos p){
		return productoDao.listarUnProducto(p);
	}
	public Productos productoMarca(Integer id){
		return productoDao.productoMarca(id);
	}
	public void agregarProductoyMarca(Productos p, String name){
		productoDao.agregarProducto(p,name);
	}
}
