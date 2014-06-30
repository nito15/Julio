package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import codigo.calcularTotalAlmacen2;

public class TestSuma {

	SumaMundo suma = new SumaMundo();
	
	
	@Before
	public void setUp() throws Exception {
		
		suma.setSumaMundo(10);
		suma.setSumaMundo2(20);
	
	}

	@Test
	public void test() {
		
		assertEquals(30,suma.suma());
		
	}

}
