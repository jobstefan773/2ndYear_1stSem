import java.util.*;

public class Main {
    public static void main (String[] args) {

        Scanner userInput = new Scanner(System.in);

        Invoice x = new Invoice(userInput.nextLine(), userInput.nextLine(), userInput.nextInt(), userInput.nextDouble());

        System.out.print("Invoice amount is: " + String.format("%.2f", x.getInvoice(x.getQuantity(), x.getPrice())));

        userInput.close();
    }
}