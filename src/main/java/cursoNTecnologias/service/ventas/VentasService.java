package cursoNTecnologias.service.ventas;

import java.util.List;

import cursoNTecnologias.bd.domain.Ventas;

public interface VentasService {
	/**
	 * Consultas
	 */
	public List<Ventas> queryAllVentas();
	public List<Ventas> queryVentasByVentaId();
	public List<Ventas> queryVentasByClienteId();
	
	/**
	 * Insert
	 */
	public void insertVentas(Ventas ventas);
	
	/**
	 * Update
	 */
	public void updateVentas(Ventas ventas);
	
	/**
	 * Delete
	 */
	public void deleteVentasByVentasId(Integer ventasId);
}
