package calculadora;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculadoraTestDivParam {
	private Integer num1, num2, resultado;
	
	public CalculadoraTestDivParam(Integer num1, Integer num2, Integer resultado) {
		this.num1 = num1;
		this.num2 = num2;
		this.resultado = resultado;
	}
	
	@Parameters
	public static Collection<Object[]> numeros() {
		return Arrays.asList(new Object[][] { {40,2,20},
											  {60,2, 30},
											  {10,0,null}
		});
	}
	@Test
	public void testDivision() {
		Calculadora calcu = new Calculadora(num1, num2);
		Integer resultadoReal =calcu.division2();
		assertEquals(resultado, resultadoReal);
	}

}
