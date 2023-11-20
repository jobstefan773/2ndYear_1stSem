import java.util.*;

public class app {
    public static void main (String[] args) {

        Scanner userInput = new Scanner(System.in);
        SavingsAccount user = new SavingsAccount(0, null, null, 0, 0);

        user.setAccNum(userInput.nextInt());
        user.setCusName(userInput.nextLine());
        userInput.nextLine();
        user.setPhoNum(userInput.nextLine());
        double stabal = userInput.nextDouble();
        double deposit = userInput.nextDouble();
        user.setAnnInt(userInput.nextDouble());
        double withdraw = userInput.nextDouble();

        user.deposit(stabal);
        System.out.println("Deposited " + String.format("%.2f", deposit) +  " new balance is " + String.format("%.2f", user.deposit(deposit)));
        if (withdraw > user.getSavBal()) {
            System.out.println("Insufficient funds, available amount is " + String.format("%.2f", user.getSavBal()));
        } else {
            System.out.println("Withdrawed " + String.format("%.2f", withdraw) + " new balance is " + String.format("%.2f", user.withdraw(withdraw)));
        }
        System.out.printf("New balance after interest rate is applied " + String.format("%.2f", user.calculateMonthlyInterest()));


        userInput.close();
    }
}