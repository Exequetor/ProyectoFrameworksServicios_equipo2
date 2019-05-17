package cursoNTecnologias.service.detalleVentas;

import java.util.List;

import cursoNTecnologias.bd.domain.DetalleVentas;

public interface DetalleVentasService {
	/**
	 * Consultas
	 */
	public List<DetalleVentas> queryAllDetalleVentas();
	public List<DetalleVentas> queryDetalleVentasByVentaId(Integer id);
	
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
	public void deleteDetalleVentasByVentasId(Integer ventasId);
}
