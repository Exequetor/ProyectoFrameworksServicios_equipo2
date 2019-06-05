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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ventas> queryVentaByVentaId() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Ventas> queryVentasByClienteId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertVenta(Integer idCliente, List<Productos> productos) {
		ventasDao.insertVenta(idCliente, productos);
	}

	@Override
	public void updateVenta(Ventas ventas) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteVentaByVentaId(Integer ventasId) {
		// TODO Auto-generated method stub
	}

}
