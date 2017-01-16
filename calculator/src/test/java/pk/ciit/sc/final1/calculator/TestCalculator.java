package pk.ciit.sc.final1.calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestCalculator 
{
private static Calculator calc = new Calculator();
	
	@Test
	public void testFindMax()
	{
		
		/*int result = calc.findMax(2, 4, 5);
		
		assertEquals(5, result);
		*/
		int result1 = calc.findMax(-7, -2, -5);
		
		assertEquals(-2, result1);
	}
	
	@Test
	public void testFindSquare()
	{
		int square = calc.square(0);
		
		//assertEquals(9, square);
		assertEquals(0, square);
	}
	
	@Test
	public void testFindCube()
	{
		int cube = calc.cube(-2);
		
		//assertEquals(8, cube);
		assertEquals(4, cube);
	}
	
}
