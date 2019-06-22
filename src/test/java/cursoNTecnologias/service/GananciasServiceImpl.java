package cursoNTecnologias.service;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoNTecnologias.bd.domain.Ganancias;

import cursoNTecnologias.service.ganancias.GananciasService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class GananciasServiceImpl {
	@Inject 
	GananciasService gs;
	
	@Test
	public void pruebaMostrarMarcas(){
		try{
			System.out.println("Ganancias test");
			List<Ganancias> lista= gs.queryAllGanancias();
			for(Ganancias g : lista) {
				System.out.println(g);
			}
			System.out.println("Ganancias test end");
		}catch(Exception  e){
			
		}
	}
}
