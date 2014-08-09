
public class Circle {

	private int diameter;
	private Double area;
	private Double circ;
	private int radius;

	public Circle(int d) {
		diameter = d;
	}
	
	private void calc() {
		calcRadius();
		calcArea();
		calcCirc();
	}
	
	private void calcRadius() {
		radius = (diameter / 2);
	}
	
	private void calcArea() {
        double radius;
        radius = diameter / 2;
        area = Math.PI * radius * radius;
	}

	private void calcCirc() {
		circ =  Math.PI * diameter;
	}


	public String descr() {
		calc();
		return String.format("Area is %.2f and circumference is %.2f for circle with radius %d and diameter %d"
				, area, circ, radius, diameter);
	}

}
