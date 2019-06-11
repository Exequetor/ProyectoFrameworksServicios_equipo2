package cursoNTecnologias.service.ventas;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import cursoNTecnologias.bd.VentasDao.VentasDao;
import cursoNTecnologias.bd.domain.Productos;
import cursoNTecnologias.bd.domain.Ventas;

@Named
public class VentasServiceImpl implements VentasService, Serializable{

	private static final long serialVersionUID = -6896933300788946L;

	@Inject
	VentasDao ventasDao;
	
	@Override
	public List<Ventas> queryAllVentas() {
		return ventasDao.queryAllVentas();
	}

	@Override
	public List<Ventas> queryVentasByVentaId(Integer id) {
		return ventasDao.queryVentasByVentaId(id);
	}

	public List<Ventas> queryVentasByClienteId(Integer id) {
		return ventasDao.queryVentasByClienteId(id);
	}

	@Override
	public void insertVenta(Integer idCliente, List<Productos> productos) {
		ventasDao.insertVenta(idCliente, productos);
	}

	@Override
	public void updateVenta(Ventas venta) {
		ventasDao.updateVentas(venta);
	}

	@Override
	public void deleteVenta(Integer ventaId) {
		ventasDao.deleteVentasByVentasId(ventaId);
	}

}
