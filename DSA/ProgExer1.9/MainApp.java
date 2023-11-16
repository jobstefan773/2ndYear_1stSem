import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainApp {
    public static Scanner userInput = new Scanner (System.in);
    public static BST node = new BST();
    public static void main(String[] args) {    

        //txt to BST---------------------------------------------------------------------------
        try {

            File file = new File ("software.txt");
            Scanner fileInput = new Scanner(file);  
            fileInput.useDelimiter(",\\s*");

            while(fileInput.hasNextLine()) {
                String softName = fileInput.nextLine();
                String version = fileInput.nextLine();
                int quantity = Integer.parseInt(fileInput.nextLine());
                double price = Double.parseDouble(fileInput.nextLine());

                node.insert(new Software(softName, version, quantity, price));

            }

            fileInput.close();

        } catch (FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //MENU-------------------------------------------------------------------------------
        int choice;
        while (true) {
            choice = menu();

            switch (choice) {
                case 1 : showSoftware();
                    break;
                case 2 : addSoftware();
                    break;
                case 3 : ;
                    break;
                case 4 : System.exit(0);
                    break;
                default :
                    System.out.println("Invalid input, try again.");
            }
        }

    }

    public static int menu () {
        int choice;
        System.out.println("--------------------------------------------");
        System.out.println("1: Show Softwares");
        System.out.println("2: Add Softwares");
        System.out.println("3: Sell");
        System.out.println("4: Exit");
        System.out.println("--------------------------------------------");
        System.out.print("Enter Choice: ");
        choice = userInput.nextInt();
        System.out.println("--------------------------------------------");

        return choice; 
    }

    public static void showSoftware () {
        
    }

    public static void addSoftware () {

        System.out.println("Products Availble: \n");
        System.out.printf("%-30s  %-10s  %-10s  %-5s\n", 
            "Software Name",
            "Version",
            "Quantity",
            "Price",
            "\n");
        node.inOrderTraversal(node.root);

        System.out.println("");

    }
}