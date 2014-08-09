import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CircleTest {

	private Circle circle;

	@Before
	public void setup() {
		circle = new Circle(5);
	}
	
	@Test
	public void shouldReturnOutRadiusCircumAndArea() {
        assertEquals("Area is 12.57 and circumference is 15.71 for circle with radius 2 and diameter 5", circle.descr());
	}
}
