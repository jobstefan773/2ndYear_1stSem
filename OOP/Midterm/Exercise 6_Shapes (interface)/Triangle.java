public class Triangle implements GetArea {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * (base * height);
    }

    public String toString() {
        return "Area of the triangle is: " + getArea();
    }
    
}