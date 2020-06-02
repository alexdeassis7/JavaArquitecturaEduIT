package testjunitsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import calculadora.CalculadoraTest;
import calculadorados.CalculadoraDosTest;
import testparametrizados.CalculadoraParametroTest;

@RunWith(Suite.class)
@SuiteClasses({
	CalculadoraTest.class,
	CalculadoraDosTest.class,	
	CalculadoraParametroTest.class,
})
public class AllTestSuite {

}
