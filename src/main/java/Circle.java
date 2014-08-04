
public class Circle {

	public double calcArea(int diameter) {
        double radius, area;
		
		radius = diameter / 2;
        area = Math.PI * radius * radius;

        return area;
	}

}
