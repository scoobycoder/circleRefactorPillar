class Rextester
{  
    public static void main(String args[])
    {
        printCircle();
        printBigCircle();
        printBiggerCircle();
    }
    

    public static void printCircle()
    {
        double radius, diameter, circumference, area;
        
        diameter = 1;
        radius = diameter / 2;
        area = Math.PI * radius * radius;
        circumference = Math.PI * diameter;
        
        System.out.printf("Area is %f and circumference is %f for circle with radius %f and diameter %f\n", area, circumference, radius, diameter);
    }
    
    public static void printBigCircle()
    {
        double radius, diameter, circumference, area;
        
        diameter = 2;
        radius = diameter / 2;
        area = Math.PI * radius * radius;
        circumference = Math.PI * diameter;
        
        System.out.printf("Area is %f and circumference is %f for circle with radius %f and diameter %f\n", area, circumference, radius, diameter);  
    }
    
    public static void printBiggerCircle()
    {
        double radius, diameter, circumference, area;
        
        diameter = 4;
        radius = diameter / 2;
        area = Math.PI * radius * radius;
        circumference = Math.PI * diameter;
        
        System.out.printf("Area is %f and circumference is %f for circle with radius %f and diameter %f\n", area, circumference, radius, diameter);   
    }
}