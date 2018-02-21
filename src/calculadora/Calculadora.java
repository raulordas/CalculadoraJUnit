package calculadora;

public class Calculadora {
	private int num1;
	private int num2;
	
	Calculadora(int a, int b) {
		num1 = a;
		num2 = b;
	}
	
	public int suma() {
		return num1 + num2;
	}
	
	public int rest() {
		return num1 - num2;
	}
	
	public int multiplicacion() {
		return num1 * num2;
	}
	
	public int division() {
		return num1 / num2;
	}
}
