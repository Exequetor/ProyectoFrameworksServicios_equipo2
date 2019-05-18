package cursoNTecnologias.service;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoNTecnologias.service.detalleVentas.DetalleVentasService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class DetalleVentasServiceImplTest {
	@Inject
	DetalleVentasService detalleVentasService;

	@Test
	public void testQueryAll () {
		try {
			detalleVentasService.queryAllDetalleVentas();
		} catch(Exception e) {
			System.out.println("Error en test: DetalleVentasService->queryAllDetalleVentas");
			e.printStackTrace();
		}
	}
}
