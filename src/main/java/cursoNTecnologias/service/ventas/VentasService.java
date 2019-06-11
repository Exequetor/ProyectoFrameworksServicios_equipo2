package cursoNTecnologias.service.ventas;

import java.util.List;

import cursoNTecnologias.bd.domain.Productos;
import cursoNTecnologias.bd.domain.Ventas;

public interface VentasService {
	/**
	 * Consultas
	 */
	public List<Ventas> queryAllVentas();
	public List<Ventas> queryVentasByVentaId(Integer id);
	public List<Ventas> queryVentasByClienteId(Integer id);
	
	/**
	 * Insert
	 */
	public void insertVenta(Integer idCliente, List<Productos> productos);
	
	/**
	 * Update
	 */
	public void updateVenta(Ventas venta);
	
	/**
	 * Delete
	 */
	public void deleteVenta(Integer ventaId);
}
