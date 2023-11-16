import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        Triangle newShape = new Triangle();

        newShape.setSide1(userInput.nextDouble());
        newShape.setSide2(userInput.nextDouble());
        newShape.setSide3(userInput.nextDouble());

        userInput.nextLine();

        newShape.setColor(userInput.nextLine());

        String fill = userInput.nextLine();
        if (fill.equalsIgnoreCase("T")){
            newShape.setFilled(true);
        } else if (fill.equalsIgnoreCase("F")){
            newShape.setFilled(false);
        }

        System.out.println("area: " + newShape.getArea());
        System.out.println("perimeter: " + newShape.getPerimeter());
        System.out.println("color: " + newShape.getColor());
        System.out.println("filled: " + newShape.isFilled());

        userInput.close();
    }
}
