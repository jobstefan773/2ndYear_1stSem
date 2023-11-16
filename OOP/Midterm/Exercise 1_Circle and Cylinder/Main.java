import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int decision;
        int userRadius;
        int userHeight;
        boolean selection = true;
        Circle c;

        while (selection) {
            menu();
            System.out.print("Enter Choice: ");
            decision = userInput.nextInt();

            switch (decision) {
                case 1:
                    System.out.print("Enter a radius: ");
                    userRadius = userInput.nextInt();
                    c = new Circle(userRadius);
                    c.toPrint();
                    break;

                case 2:
                    System.out.print("Enter a radius: ");
                    userRadius = userInput.nextInt();
                    System.out.print("Enter a height: ");
                    userHeight = userInput.nextInt();
                    c = new Cylinder(userRadius, userHeight);
                    c.toPrint();
                    break;

                case 3:
                    selection = false;
            }

        }
        userInput.close();
    }

    public static void menu() {
        System.out.println("-----------------------------------------");
        System.out.println("Choose Option!");
        System.out.println();
        System.out.println("1: Circle");                 
        System.out.println("2: Cylinder");;
        System.out.println("-----------------------------------------");
    }
}
