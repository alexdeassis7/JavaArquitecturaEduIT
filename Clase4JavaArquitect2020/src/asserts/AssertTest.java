package asserts;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import calculadora.Calculadora;

public class AssertTest {

	
	//Assertions
	
	//AssertEJ(mensaje en caso falla , valor esperado , valor real )
	
	@Test
	public void test() {
		
		//assertEquals( long ,long  ); sirve para todos los numericos 
	
		//assertEquals(Object , Object );//debe tener bien implementado el Equals en el object
//		assertEquals(double , double , double delta) el delta es la toleranci a fallas
//		assertEquals("3 es distito de 4", 4, 4);
//		assertEqualsArray( funciona igual que con los demas numerico )
//		assertFalse() y aserrtTru() sirve para validar que una determinada condicion sea falsa o verdadera
//		assertNotEquals() 
//		assertNotNull() sirve para comprobar si algo es null
//		assertSsame(expected , actual ); sirve para comprobar que los objetos sean los mismos
		Calculadora s1 = new Calculadora();
		Calculadora s2 = new Calculadora();
		
		String st1 = "hola";
		String st2 = "hola";
		
		assertEquals(st1,st2); 
		assertSame(s1 ,s2 );
		
		
	}
	
}
