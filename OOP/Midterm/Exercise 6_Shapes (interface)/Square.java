public class Square implements GetArea {
    private double sides;

    public Square(double sides) {
        this.sides = sides;
    }

    public double getArea() {
        return sides * sides;
    }

    public String toString() {
        return "Area of the square is: " + getArea();
    }

}