package cursoNTecnologias.service.detalleVentas;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import cursoNTecnologias.bd.DetalleVentasDao.DetalleVentasDao;
import cursoNTecnologias.bd.domain.DetalleVentas;

@Named
public class DetalleVentasServiceImpl implements DetalleVentasService, Serializable {

	private static final long serialVersionUID = 7074380826127289832L;
	
	@Inject
	DetalleVentasDao detalleVentasDao;
	
	@Override
	public List<DetalleVentas> queryAllDetalleVentas() {
		return detalleVentasDao.queryAllDetalleVentasProductos();
	}

	@Override
	public List<DetalleVentas> queryDetalleVentasByVentaId(Integer id) {
		return detalleVentasDao.queryDetalleVentasProductosByVentaId(id);
	}

	@Override
	public void insertDetalleVentas(DetalleVentas dventas) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDetalleVentas(DetalleVentas dventas) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDetalleVentasByVentasId(Integer ventasId) {
		// TODO Auto-generated method stub
		
	}

}
