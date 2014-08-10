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
		
		double area = 19.63;
		double circ = 15.71;
		int radius = 2;
		int diameter = 5;

		assertEquals("Area is 19.63 and circumference is 15.71 for circle with radius 2 and diameter 5",
        		circlePresent.present(circ, area, diameter, radius));
	}
}
