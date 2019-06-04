package cursoNTecnologias.service.ventas;

import java.util.List;

import cursoNTecnologias.bd.domain.Productos;
import cursoNTecnologias.bd.domain.Ventas;

public interface VentasService {
	/**
	 * Consultas
	 */
	public List<Ventas> queryAllVentas();
	public List<Ventas> queryVentaByVentaId();
	public List<Ventas> queryVentasByClienteId();
	
	/**
	 * Insert
	 */
	public void insertVenta(Integer idCliente, List<Productos> productos);
	
	/**
	 * Update
	 */
	public void updateVenta(Ventas ventas);
	
	/**
	 * Delete
	 */
	public void deleteVentaByVentaId(Integer ventasId);
}
