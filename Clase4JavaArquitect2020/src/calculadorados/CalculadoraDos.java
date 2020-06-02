package calculadorados;

import javax.sound.midi.Soundbank;

public class CalculadoraDos {
	private int ans;

	public CalculadoraDos() {
	}

	public int add(int a, int b) {
		ans = a + b;
		return ans;
	}

	public int sub(int a, int b) {
		ans = a - b;
		return ans;
	}

	public int div(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("no podes dividir por cero en los numeros Reales");
		}
		ans = a / b;
		return ans;
	}

	public int add(int v) {
		ans += v;
		return ans;
	}

	public int asn() {
		return ans;
	}

	public void clear() {
		ans = 0;
	}

	public void operacionOptima() {
		try {
			Thread.sleep(2000);// demoramos dos minutos la ejecucion del Hilo
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Esto demora demas ");
		}

	}

}
