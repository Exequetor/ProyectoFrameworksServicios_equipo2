package cursoNTecnologias.service.ganancias;

import java.util.List;

import cursoNTecnologias.bd.domain.Ganancias;

public interface GananciasService {
	/**
	 * Consultas
	 */
	public List<Ganancias> queryAllGanancias();
	public List<Ganancias> queryGananciasByVentaId(Integer id);
	
	/**
	 * Insert
	 */
	public void insertGanancia(Ganancias ganancia);
	
	/**
	 * Update
	 */
	public void updateGanancia(Ganancias ganancia);
	
	/**
	 * Delete
	 */
	public void deleteGanancia(Integer id);
}
