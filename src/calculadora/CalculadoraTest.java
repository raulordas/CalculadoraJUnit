package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {
	static Calculadora calcu = null;
	
	//beforeclass ha de ser estático
	@BeforeClass
	public static void preCalcu() {
		calcu = new Calculadora (20, 30);
		System.out.println("PREPARANDO PRUEBAS!!");
	}
	
	@AfterClass
	public static void postCalcu() {
		System.out.println("FINALIZANDO LAS PRUEBAS!!");
		calcu = null;
	}
	
	@Before
	public void creaCalculadora() {
		/*podria estar aqui pero la vamos a probar en beforeclass
		 * 
		calcu = new Calculadora (20, 30);
		System.out.println("Inicio de Prueba");
		*/
	}
	
	@After
	public void borraCalculadora() {
		/*
		calcu = null;
		System.out.println("Fin de prueba");
		*/
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
		assertEquals("Fallo en la multilpicación" ,600, resultado);
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
			fail ("FALLO, debería haber lanzado la excepcion");
		//PRUEBA SATISFACTORIA	
		}
	}
	
	@Test
	public void num1EsMayor() {
		Calculadora calcu = new Calculadora(20, 30);
		boolean resultado = calcu.num1EsMayor();
		//assertEquals(false, resultado)
		//assertTrue("No es true", resultado); -- Con esto fallaría la prueba porque debería ser false con los datos
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
