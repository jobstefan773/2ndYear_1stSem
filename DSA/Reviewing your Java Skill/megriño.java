import java.util.*;

public class megriño {
    public static void main (String[] args) {

        Random random = new Random();
        Scanner userInput = new Scanner(System.in);
        final String RESET = "\u001B[0m";
        final String yellow = "\u001B[33m";
        final String red = "\u001B[31m";
        final String green = "\u001B[32m";

        //Ask the user for range
        System.out.print("\nGive me your desired range!\n");
        System.out.print(yellow + "Maximum " + RESET + "range: ");
        int upperBound = userInput.nextInt();
        System.out.print(yellow + "Minimum " + RESET + "range: ");
        int lowerBound = userInput.nextInt();

        //Random Number Generator
        int RNG = random.nextInt(upperBound - lowerBound) + lowerBound;


        //Number of attempts
        int att = 0;

        //User Input
        System.out.print("\nBetween " + yellow + lowerBound + RESET + "-" + yellow + upperBound + RESET + ". Guess the number: ");

        while (true) {

            int userNumber = userInput.nextInt();
            att++;

            if (userNumber == RNG) {
                System.out.print(yellow + "YOU ARE CORRECT!" + RESET);
                System.out.print(" It took you " + yellow + att + RESET + " attempt/s!");
                break;
            } else if (userNumber > RNG) {
                System.out.print(red + "LOWER!" + RESET + " Guess again: ");
            } else {
                System.out.print(green + "HIGHER!" + RESET + " Guess again: ");
            }

        }


        //Ask the player if they want to play again
        System.out.print("\n\nPlay again? " + green + "y" + RESET + "/" + red + "n" + RESET + "? ");

        boolean decision = true;
        while (decision) {

            String choice = userInput.nextLine();

            switch (choice.toUpperCase()) {
                case "Y":
                    main(args);
                    break;

                case "N":
                    System.out.print("Thank you for playing!");
                    decision = false;
                    break;
            }

        }

        userInput.close();

    }
}