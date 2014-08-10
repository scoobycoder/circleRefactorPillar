import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Before;
import org.junit.Test;


public class CircleTest {

	private Circle circle;

	private DecimalFormat formatDecimal(double number) {
		DecimalFormat areaDf = new DecimalFormat("#.00");
		areaDf.format(number);
		return areaDf;
	}
	
	@Before
	public void setup() {
		circle = new Circle(5.0);
	}
	
	@Test
	public void shouldCalcRadius() {
		assertEquals(2.5, circle.calcRadius(), .000001);
	}
	
	@Test
	public void shouldCalcArea() {
		double area = 19.63;
		DecimalFormat areaDf = formatDecimal(area);
		assertEquals(areaDf, circle.calcArea());
	}

	@Test
	public void shouldCalcCircumference() {
		DecimalFormat circDf = formatDecimal(15.71);
		assertEquals(circDf, circle.calcCirc());
	}
	
	@Test
	public void shouldFormatCirclePresentation() {
		CirclePresenter circlePresent = new CirclePresenter();
		
		double area = 1.00;
		double circ = 2.00;
		int radius = 3;
		int diameter = 4;

		assertEquals("Area is 1.00 and circumference is 2.00 for circle with radius 3 and diameter 4",
        		circlePresent.present(circ, area, diameter, radius));
	}
}
