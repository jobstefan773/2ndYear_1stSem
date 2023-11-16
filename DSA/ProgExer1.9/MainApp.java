import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainApp {
    public static Scanner userInput = new Scanner (System.in);
    public static void main(String[] args) {
        BST node = new BST();

        //txt to BST---------------------------------------------------------------------------
        try {

            File file = new File ("software.txt");
            Scanner fileInput = new Scanner(file);
            

            while(fileInput.hasNextLine()) {
                String softName = fileInput.nextLine();
                userInput.nextLine();
                String version = fileInput.nextLine();
                userInput.nextLine();
                int quantity = fileInput.nextInt();
                double price = fileInput.nextDouble();

                node.insert(new Software(softName, version, quantity, price));

            }

            fileInput.close();

        } catch (FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //MENU---------------------------------------------------------------
        int choice;
        while (true) {
            choice = menu();

            switch (choice) {
                case 1 : ;
                    break;
                case 2 : addSoftware();
                    break;
                case 3 : ;
                    break;
                case 4 : System.exit(0);
                    break;
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

    public static void addSoftware () {

        

    }
}