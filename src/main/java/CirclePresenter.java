
public class CirclePresenter implements Presenter {

	private int diameter;
	private double area;
	private double circ;
	private int radius;
	
	@Override
	public String present(double c, double a, int d, int r) {
		diameter = d;
		area = a;
		circ = c;
		radius = r;
		
		return descr();
	}

	private String descr() {
		return String.format("Area is %.2f and circumference is %.2f for circle with radius %d and diameter %d"
				, area, circ, radius, diameter);
	}
	
}
