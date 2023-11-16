import java.util.*;

public class Main {
    public static ArrayList <Item> shoppingCart = new ArrayList <Item>();
    public static Scanner userInput = new Scanner(System.in);
    public static void main (String[] args) {

        //declarations---------------------------------------------------------
        boolean selection = true;
        String decision;

        //menu bar and user input----------------------------------------------
        while (selection) {
            System.out.println("--------------------------------------------");
            System.out.println("A: Add Items to Cart");                 
            System.out.println("V: View Cart");
            System.out.println("E: Edit Item");
            System.out.println("D: Delete item");
            System.out.println("C: Compute Total and Clear the Cart");
            System.out.println("Q: Quit");
            System.out.println("--------------------------------------------");
            System.out.print("Enter Choice: ");
            decision = userInput.nextLine();
            System.out.println("--------------------------------------------");

            switch(decision.toUpperCase()) {
                case "A" : addToCart(shoppingCart);
                    break;
                case "V" : viewCart(shoppingCart);
                    break;
                case "E" : editItem(shoppingCart);
                    break;
                case "D" : deleteItem(shoppingCart);
                    break;
                case "C" : checkOut(shoppingCart);
                    break;
                case "Q" : selection = false ;
                    break;
                
            }
        }
    }

    public static void addToCart (ArrayList<Item> sCart) {

        boolean selection = true;
        while (selection) {

            System.out.print("Enter Item Name: ");
            String item_name = userInput.nextLine();
            System.out.print("Enter Quantity: ");
            int quantity = Integer.parseInt(userInput.nextLine());
            System.out.print("Enter Price: ");
            double price = Double.parseDouble(userInput.nextLine());

            System.out.print("Want to continue? Type Y/N: ");
            String decision = userInput.nextLine();

            sCart.add(new Item(item_name, quantity, price));

            switch (decision.toUpperCase()) {
                case "Y" : 
                    continue;
                case "N" :
                    selection = false;
            }

        }

    }
 
    public static void viewCart (ArrayList<Item> sCart) {
        
        if (sCart.size() > 0) {
            for (Item itemData : sCart) {
                itemData.Display();
                itemData.total();
            }
        } else {
            System.out.println("There are no items in you cart!");
        }
    }

    public static void editItem(ArrayList<Item> sCart) {

        int index = 1;
        if (sCart.size() > 0) {
            while (sCart.size() > 0) {
                for (Item itemData : sCart) {
                    System.out.print("Item " + index + ": ");
                    itemData.Display();
                    index++;
                }

                System.out.print("Select number you want to edit: ");
                int num = userInput.nextInt();
                userInput.nextLine();
                index = 1;

                System.out.println("--------------------------------------------");
                System.out.print("Enter New Item Name: ");
                String item_name = userInput.nextLine();
                System.out.print("Enter New Quantity: ");
                int quantity = Integer.parseInt(userInput.nextLine());
                System.out.print("Enter New Price: ");
                double price = Double.parseDouble(userInput.nextLine());
                System.out.println("--------------------------------------------");

                sCart.set(num - 1, new Item (item_name, quantity, price));

                for (Item itemData : sCart) {
                    System.out.print("Item " + index + ": ");
                    itemData.Display();
                    index++;
                }
                index = 1;

                System.out.print("Want to continue? Type Y/N: ");
                String decision = userInput.nextLine();
                if (decision.equalsIgnoreCase("N")) {
                    break;
                } else {
                    System.out.println("--------------------------------------------");
                }
            }
        } else {
            System.out.println("There are no items in you cart!");
            main(null);
        }

    }

    public static void deleteItem (ArrayList<Item> sCart) {

        int index = 1;
        if (sCart.size() > 0) {
            while (sCart.size() > 0) {
                for (Item itemData : sCart) {
                    System.out.print("Item " + index + ": ");
                    itemData.Display();
                    index++;
                }

                System.out.print("Select number you want to remove: ");
                int delNum = userInput.nextInt();
                userInput.nextLine();
                sCart.remove(delNum - 1);
                index = 1;

                if (sCart.size() > 0) {
                    System.out.print("Want to continue? Type Y/N: ");
                    String decision = userInput.nextLine();
                    if (decision.equalsIgnoreCase("N")) {
                        break;
                    }
                }
            }
        } else {
            System.out.println("There are no items in you cart!");
        }
    }

    public static void checkOut (ArrayList<Item> sCart) {
        double subTotal = 0.0;

        if (sCart.size() > 0) {
            for (Item itemData : sCart) {
                subTotal += itemData.total();
            }
            System.out.println("Total amount in shopping cart: " + String.format("%.2f", subTotal));
            sCart.clear();
            System.out.println("Cleared your shopping cart!");
        } else {
           System.out.println("There are no items in you cart!");
        }
    }
}
