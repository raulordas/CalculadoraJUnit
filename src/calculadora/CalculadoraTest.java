package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	Calculadora calcu = null;
	
	@Before
	public void creaCalculadora() {
		calcu = new Calculadora (20, 30);
	}
	
	@After
	public void borraCalculadora() {
		calcu = null;
	}
	
	@Test
	public void testSuma() {
		int resultado = calcu.suma();
		assertEquals(50, resultado);
	}

	@Test
	public void testRest() {
		int resultado = calcu.rest();
		assertEquals(10, resultado);
	}

	@Test
	public void testMultiplicacion() {
		int resultado = calcu.multiplicacion();
		assertEquals("Fallo en la multilpicaci�n" ,600, resultado);
	}

	@Test
	public void testDivision() {
		//Calculadora calcu = new Calculadora(8, 2);
		int resultado = calcu.division();
		assertEquals(0, resultado);
	}
	
	@Test
	public void testDivisionPorCero() {
		//Calculadora calcu = new Calculadora(2, 0);
		try {
			int resultado = calcu.division();
			
		} catch (ArithmeticException excp) {
			fail ("FALLO, deber�a haber lanzado la excepcion");
		//PRUEBA SATISFACTORIA	
		}
	}
	
	@Test
	public void num1EsMayor() {
		Calculadora calcu = new Calculadora(20, 30);
		boolean resultado = calcu.num1EsMayor();
		//assertEquals(false, resultado)
		//assertTrue("No es true", resultado); -- Con esto fallar�a la prueba porque deber�a ser false con los datos
		assertFalse("No es true", resultado);
	}
	
	@Test
	public void divisionPorCero2() {
		//Calculadora calcu = new Calculadora(2, 0);
		Integer resultado = calcu.division2();
		assertNotNull(resultado);
	}
	
	/*@Test(expected=java.lang.ArithmeticException.class)
	public void divisionPorCero3() {
		//Calculadora calcu = new Calculadora (2, 0);
		int resultado = calcu.division3();	
	}
	*/
}
