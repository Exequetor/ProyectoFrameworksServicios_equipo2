package cursoNTecnologias.service.productos;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoNTecnologias.bd.domain.Productos;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class ProductosServiceImplTest {
	
	@Inject 
	ProductosServiceImpl productoService;
	
	
	public void pruebaMostrarProductos(){
		try{
			List<Productos> lista= productoService.listarProductos();
			assertEquals(lista.size(),7);
		}catch(Exception  e){
			
		}
	}
	
	public void listarTodosProductosMarca() {
		try {
			System.out.println("\nTest consultar todos los productos con su marca");
			productoService.listarTodosProductosMarca();
		} catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	
	public void productoMarca() {
		try {
			System.out.println("Test consultar unsolo producto con su marca");
			productoService.productoMarca(2);
		} catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	public void updateProducto(){
		System.out.println("Actualizando un producto.");
		try{
			Productos producto=new Productos();
			producto.setIdproducto(1);
			producto.setNombre("iPhone XS");
			producto.setPrecio(25000.0);
			producto.setPreciovta(32000.0);
			producto.setCantidad(1);
			producto.setMarcaid(1);
			productoService.updateProducto(producto);
			
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	
	public void deleteProducto() {
		try{
			System.out.println("Eliminando un producto por id");
			productoService.deleteProducto(5);	
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	@Test
	public void agregaProductoNuevo(){
		try{
			System.out.println("Agregando un nuevo producto");
			Productos producto = new Productos();
			producto.setNombre("Kit de office");
			producto.setPrecio(3000.0);
			producto.setPreciovta(5500.0);
			producto.setMarcaid(1);
			producto.setCantidad(205);
			
			productoService.agregarProducto(producto);
			
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex);                          
		}
	}
}
