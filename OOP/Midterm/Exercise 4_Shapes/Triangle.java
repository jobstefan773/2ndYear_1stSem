public class Triangle extends Shape {
    private double base;
    private double height;
    
    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * (this.base * this.height);
    }

    public String toString() {
        return "Triangle Area is: " + getArea() +  "\nColor is: " + super.getColor() + "\n";
    }
}