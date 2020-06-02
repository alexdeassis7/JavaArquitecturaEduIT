package calculadorados;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraDosTest {

	static CalculadoraDos calc;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("  BeforeClass()");
		calc = new CalculadoraDos();
	}

	@Before
	public void before() {
		System.out.println("    before()");
		calc.clear();
	}

	@After
	public void after() {
		System.out.println("    After()");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println(" AfterClass()");
		calc.clear();
	}

	@Test
	public void TestSum() {
		System.out.println("    Ejecutando Test :TestSum()");
		int result = calc.add(3, 2);
		int esper = 5;
		assertEquals(esper, result);
	}

	@Test
	public void TestAnsSum() {
		System.out.println("    Ejecutando Test :TestAnsSum()");
		int result = calc.add(3, 2);
		int esper = 5;
		assertEquals(esper, result);
	}

	@Test
	public void TestDiv() {
		System.out.println("    Ejecutando Test :TestDiv()");
		int result = calc.div(6, 2);
		assertEquals(3, result);
	}

	@Test(expected = ArithmeticException.class)
	public void testDivPorCero() {
		System.out.println("    Ejecutando Test :testDivPorCero()");
		int result = calc.div(5, 0);
	}

	public void testAlgoritmoOptimo() {
		System.out.println("     Ejecutando Test : testAlgoritmoOptimo()");
		calc.operacionOptima();
	}

}
