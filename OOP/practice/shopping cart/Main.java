import java.util.*;

public class Main {
    public static void main (String[] args) {

        //declarations--------------------------------------------
        Scanner userInput = new Scanner (System.in);
        ArrayList <Item> cart = new ArrayList<Item>();

        //user input----------------------------------------------
        while (true) {

            String item_name = userInput.nextLine();
            int quantity = Integer.parseInt(userInput.nextLine());
            double price = Double.parseDouble(userInput.nextLine());
            String decision = userInput.nextLine();

            cart.add(new Item(item_name, quantity, price));

            if (decision.equalsIgnoreCase("N")) {
                break;
            }

        }

        userInput.close();

        //printing---------------------------------------------------
        double subTotal = 0.0;
        for (Item itemData : cart) {
            System.out.println(itemData);
            subTotal += itemData.total();
        }
        System.out.println("Total amount.in shopping cart: " + String.format("%.2f", subTotal));

    }
}
