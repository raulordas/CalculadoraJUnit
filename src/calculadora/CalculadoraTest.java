package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
	Calculadora calcu = new Calculadora(20, 30);
	@Test
	public void testSuma() {
		Calculadora calcu = new Calculadora(20, 30);
		int resultado = calcu.suma();
		assertEquals(50, resultado);
	}

	@Test
	public void testRest() {
		Calculadora calcu = new Calculadora(20, 30);
		int resultado = calcu.rest();
		assertEquals(-10, resultado);
	}

	@Test
	public void testMultiplicacion() {
		Calculadora calcu = new Calculadora(20, 30);
		int resultado = calcu.multiplicacion();
		assertEquals("Fallo en la multilpicación" ,600, resultado);
	}

	@Test
	public void testDivision() {
		Calculadora calcu = new Calculadora(8, 2);
		int resultado = calcu.division();
		assertEquals(4, resultado);
	}
	
	@Test
	public void testDivisionPorCero() {
		Calculadora calcu = new Calculadora(2, 0);
		
		try {
			int resultado = calcu.division();
			fail ("FALLO, debería haber lanzado la excepcion");
		} catch (ArithmeticException excp) {
		//PRUEBA SATISFACTORIA	
		}
	}
}
