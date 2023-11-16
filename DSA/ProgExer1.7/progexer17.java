import java.util.*;

public class progexer17 {
    public static void main (String[] args) {
        
        Scanner userInput = new Scanner (System.in);

        while (true) {
            System.out.print("decimal value: ");
            int dec = userInput.nextInt();

            if (dec < 0) {
                System.out.print("thank you for using the program. bye!");
                break;
            }

            System.out.print("target base: ");
            int base = userInput.nextInt();

            if (base < 0) {
                System.out.print("thank you for using the program. bye!");
                break;
            }

            String val = recursion(dec, base);

            //OUTPUT
            System.out.println("value of " + dec + " in base " + base + " is " + val);
        }

        userInput.close();
    }

    public static String recursion(int dec, int base) {

        String[] z = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"    };

        int rem = dec % base;
        int quo = dec / base; 

        if (quo != 0) {
            return recursion(quo, base) + z[rem];
        } else {
            return z[rem];
        }
    }
}