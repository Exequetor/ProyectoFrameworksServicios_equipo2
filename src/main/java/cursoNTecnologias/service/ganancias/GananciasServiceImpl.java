package cursoNTecnologias.service.ganancias;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import cursoNTecnologias.bd.GananciasDao.GananciasDao;
import cursoNTecnologias.bd.domain.Ganancias;

@Named
public class GananciasServiceImpl implements GananciasService, Serializable{

	private static final long serialVersionUID = 1611811112640737680L;
	@Inject
	GananciasDao dao;
	
	@Override
	public List<Ganancias> queryAllGanancias() {
		return dao.queryAllGanancias();
	}

	@Override
	public List<Ganancias> queryGananciasByVentaId(Integer id) {
		return dao.queryGananciasByVentaId(id);
	}

	@Override
	public void insertGanancia(Ganancias ganancia) {
		dao.insertGanancia(ganancia);
	}

	@Override
	public void updateGanancia(Ganancias ganancia) {
		dao.updateGanancia(ganancia);
	}

	@Override
	public void deleteGanancia(Integer id) {
		dao.deleteGanancia(id);
	}

}
