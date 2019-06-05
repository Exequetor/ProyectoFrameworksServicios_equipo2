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
	
	
	public List<DetalleVentas> queryAllDetalleVentasProductos() {
		return detalleVentasDao.queryAllDetalleVentasProductos();
	}


	public List<DetalleVentas> queryDetalleVentasProductosByVentaId(Integer id) {
		return detalleVentasDao.queryDetalleVentasProductosByVentaId(id);
	}

	
	public void insertDetalleVentas(DetalleVentas dventas) {
		detalleVentasDao.insertDetalleVentas(dventas);
	}


	public void updateDetalleVentas(DetalleVentas dventas) {
		detalleVentasDao.updateDetalleVentas(dventas);
	}

	
	public void deleteDetalleVentasByVentaId(Integer ventasId) {
		detalleVentasDao.deleteDetalleVentasByVentaId(ventasId);
	}

}
