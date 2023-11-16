
import java.util.*;

public class Main {

        public static void main(String[] args) {

                Scanner userInput = new Scanner(System.in);

                SavingsAccount bank = new SavingsAccount(userInput.nextInt());

                userInput.nextLine();

                double deposit = userInput.nextDouble();
                userInput.nextLine();

                double withdraw = userInput.nextDouble();
                userInput.nextLine();

                System.out.println("Savings Account " + bank.getAccountNumber() + " Current balance: "
                                + bank.getCurrentBalance());
                System.out.println("Deposited " + deposit);
                bank.deposit(deposit);

                System.out.println("Savings Account " + bank.getAccountNumber() + " Current balance: "
                                + bank.getCurrentBalance());
                bank.withdraw(withdraw);
                System.out.println("Savings Account " + bank.getAccountNumber() + " Current balance: "
                                + bank.getCurrentBalance());

                CheckingAccount checkbank = new CheckingAccount(userInput.nextInt());
                userInput.nextLine();

                double checkdeposit = userInput.nextDouble();
                userInput.nextLine();

                double checkwithdraw = userInput.nextDouble();
                userInput.nextLine();

                System.out.println("Checking Account " + checkbank.getAccountNumber() + " Current balance: "
                                + checkbank.getCurrentBalance());
                System.out.println("Deposited " + checkdeposit);
                checkbank.deposit(checkdeposit);
                System.out.println("Checking Account " + checkbank.getAccountNumber() + " Current balance: "
                                + checkbank.getCurrentBalance());
                checkbank.withdraw(checkwithdraw);
                System.out.println("Checking Account " + checkbank.getAccountNumber() + " Current balance: "
                                + checkbank.getCurrentBalance());

                userInput.close();
        }
}
