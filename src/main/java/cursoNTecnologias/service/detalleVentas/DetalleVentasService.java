package cursoNTecnologias.service.detalleVentas;

import java.util.List;

import cursoNTecnologias.bd.domain.DetalleVentas;

public interface DetalleVentasService {
	/**
	 * Consultas
	 */
	public List<DetalleVentas> queryAllDetalleVentasProductos();
	public List<DetalleVentas> queryDetalleVentasProductosByVentaId(Integer id);
	
	/**
	 * Insert
	 */
	public void insertDetalleVentas(DetalleVentas dventas);
	
	/**
	 * Update
	 */
	public void updateDetalleVentas(DetalleVentas dventas);
	
	/**
	 * Delete
	 */
	public void deleteDetalleVentasByVentaId(Integer ventasId);
}
