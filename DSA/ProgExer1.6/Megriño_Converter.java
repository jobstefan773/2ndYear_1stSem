import java.util.*;

public class Megriño_Converter {
    public static void main (String[] args) {

        Scanner userInput = new Scanner(System.in);


        System.out.print("Input Decimal Number: ");
        int decNum = userInput.nextInt();
        
        while (true) {

            System.out.print("Enter Base: ");
            int base = userInput.nextInt();

            if (base >= 2 && base <= 9) {

                int rem;
                Stack<Integer> stack = new Stack<>();

                while (decNum != 0) {
                    rem = decNum % base;
                    decNum = decNum / base; 
                    stack.push(rem);
                }

                System.out.print("Output: ");
                while (!stack.empty()) {
                    System.out.print(stack.pop());
                }

                break;

            } else {
                System.out.println("Invalid Input! Base must be between 2 and 9");
            }
        }

        userInput.close();

    }
}