package calculadora;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculadoraTestMultiParam {
	private int num1, num2, resultado;
	
	public CalculadoraTestMultiParam(int num1, int num2, int resultado) {
		this.num1 = num1;
		this.num2 = num2;
		this.resultado = resultado;
	}
	
	@Parameters
	public static Collection<Object[]> numeros() {
		return Arrays.asList(new Object[][] { {20,30,600},
											  {30,2, 60},
											  {5,2,10}
		});
	}
	
	@Test
	public void testMultiplicacion() {
		Calculadora calcu = new Calculadora(num1, num2);
		int resultadoReal =calcu.multiplicacion();
		assertEquals(resultado, resultadoReal);
	}

}
