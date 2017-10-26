import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testAddition(){
		Calculator calculator = new Calculator();
		int sum = calculator.sumCalc(2, 3);
		assertEquals(5, sum);
	}
	
	@Test
	public void testSubtraction(){
		Calculator calculator = new Calculator();
		int sub = calculator.subCalc(1, 3);
		assertEquals(-2, sub);
	}
	
	@Test
	public void testMultiplication(){
		Calculator calculator = new Calculator();
		int mul = calculator.mulCalc(4, 5);
		assertEquals(20, mul);
	}
	
	@Test
	public void testDivision(){
		Calculator calculator = new Calculator();
		int div = calculator.divCalc(10, 2);
		assertEquals(5, div);
	}
	
}