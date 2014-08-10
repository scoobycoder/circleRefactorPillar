import java.text.DecimalFormat;


public class Circle {

	private double diameter;

	public Circle(double d) {
		diameter = d;
	}
	
	public double calcRadius() {
		return diameter / 2;
	}
	
	public DecimalFormat calcArea() {
        double radius;
		radius = diameter / 2;
		DecimalFormat area = formatDecimal(Math.PI * radius * radius);
		return area;
	}

	public DecimalFormat calcCirc() {
		DecimalFormat circ = formatDecimal(Math.PI * diameter);
		return circ; 
	}
	
	private DecimalFormat formatDecimal(double number) {
		DecimalFormat df = new DecimalFormat("#.00");
		df.format(number);
		return df;
	}
}
