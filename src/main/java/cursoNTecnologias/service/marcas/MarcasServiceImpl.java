package cursoNTecnologias.service.marcas;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import cursoNTecnologias.bd.MarcasDao.MarcasDao;
import cursoNTecnologias.bd.ProductosDao.ProductosDao;
import cursoNTecnologias.bd.domain.Marcas;
import cursoNTecnologias.bd.domain.Productos;

@Named
public class MarcasServiceImpl implements MarcasService{
	
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

	public Marcas obtenerMarcaPorId(Integer idMarca) {
		java.util.Map<String, Integer> mapMarca = new HashMap<>();
		mapMarca.put("idmarca", idMarca);
		return marcaDao.obtenerMarcaPorId(mapMarca);
	}

	@Override
	public List<Marcas> obtenerTodasMarca() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregarMarca(Marcas m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Marcas obtenerMarcaId(Integer idMarca) {
		java.util.Map<String, Integer> mapMarca = new HashMap<>();
		mapMarca.put("idMarca", idMarca);
		return marcaDao.obtenerMarcaPorId(mapMarca);
	}
}
