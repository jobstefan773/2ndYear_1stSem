public class Main {
    public static void main (String[] args) {

        Shape x = new Shape("Red");
        getArea(x);
        x = new Rectangle("Blue", 20, 10);
        getArea(x);
        x = new Triangle("Yellow", 20, 10.25);
        getArea(x);
        
    }

    public static void getArea(Shape shape) {
        if (shape instanceof Triangle) {
            Triangle x = (Triangle) shape;
            System.out.println(x);
        } else if (shape instanceof Rectangle) {
            Rectangle x = (Rectangle) shape;
            System.out.println(x);
        } else {
            System.out.println("Invalid Shape!\n");
        }
    }
}

