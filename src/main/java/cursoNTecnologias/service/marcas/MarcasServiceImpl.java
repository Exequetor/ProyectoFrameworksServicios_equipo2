package cursoNTecnologias.service.marcas;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import cursoNTecnologias.bd.MarcasDao.MarcasDao;
import cursoNTecnologias.bd.ProductosDao.ProductosDao;
import cursoNTecnologias.bd.domain.Marcas;
import cursoNTecnologias.bd.domain.Productos;

@Named
public class MarcasServiceImpl {
	
	@Inject
	MarcasDao marcaDao;
	
	public List<Marcas> listarMarcas(){
		return marcaDao.obtenerTodasMarca();
	}
	
	public void  insertMarca(Marcas m){
		marcaDao.agregarMarca(m);
	}
	public void deleteMarca(Integer id){
		marcaDao.deleteMarca(id);
	}
	public void updateMarca(Marcas m){
		marcaDao.updateMarca(m);
	}
}
