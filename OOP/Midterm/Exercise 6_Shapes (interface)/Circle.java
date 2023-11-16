public class Circle implements GetArea {
    private double radius;
    private double final_PI = 3.14;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return final_PI * (radius * radius);
    }

    public String toString() {
        return "Area of the circle is: " + getArea();
    }
    
}