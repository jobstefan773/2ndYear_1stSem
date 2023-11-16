import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner userInput = new Scanner(System.in);

        Rectangle rectangle = new Rectangle(userInput.nextDouble(), userInput.nextDouble());
        Square square = new Square(userInput.nextDouble());
        Triangle triangle = new Triangle(userInput.nextDouble(), userInput.nextDouble());
        Circle circle = new Circle(userInput.nextDouble());

        userInput.close();

        //output
        System.out.println(rectangle.toString());
        System.out.println(square.toString());
        System.out.println(triangle.toString());
        System.out.println(circle.toString());

    }
}