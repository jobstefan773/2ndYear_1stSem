
import java.util.*;

public class Main {

        public static void main(String[] args) {

                Scanner userInput = new Scanner(System.in);


                try {
                        //----------------------------------------------
                        SavingsAccount savbank = new SavingsAccount(userInput.nextInt());
                        userInput.nextLine();
                
                        double deposit = userInput.nextDouble();
                        userInput.nextLine();

                        double withdraw = userInput.nextDouble();
                        userInput.nextLine();

                        System.out.println("Savings Account " + savbank.getAccountNumber() + " Current balance: " + savbank.getCurrentBalance());
                        savbank.deposit(deposit);
                        System.out.println("Savings Account " + savbank.getAccountNumber() + " Current balance: " + savbank.getCurrentBalance());

                        savbank.withdraw(withdraw);
                        System.out.println("Savings Account " + savbank.getAccountNumber() + " Current balance: " + savbank.getCurrentBalance());
                

                        //--------------------------------------
                        CheckingAccount checkbank = new CheckingAccount(userInput.nextInt());
                        userInput.nextLine();

                        double checkdeposit = userInput.nextDouble();
                        userInput.nextLine();

                        double checkwithdraw = userInput.nextDouble();
                        userInput.nextLine();

                        System.out.println("Checking Account " + checkbank.getAccountNumber() + " Current balance: " + checkbank.getCurrentBalance());
                        checkbank.deposit(checkdeposit);
                        System.out.println("Checking Account " + checkbank.getAccountNumber() + " Current balance: " + checkbank.getCurrentBalance());
                        
                        checkbank.withdraw(checkwithdraw);
                        System.out.println("Checking Account " + checkbank.getAccountNumber() + " Current balance: " + checkbank.getCurrentBalance());

                        userInput.close();

                } catch (Exception e) {
                        System.err.println("Invalid input");
                }
        }
}
