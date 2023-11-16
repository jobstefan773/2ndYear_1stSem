public class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber) {
        super(accountNumber);

    }

    public void deposit(double amount) {

        setCurrentBalance(getCurrentBalance() + amount);

    }

    public void withdraw(double amount) {

        if (amount > getCurrentBalance()) {
            System.out.println("Insufficient funds");
        } else {
            setCurrentBalance(getCurrentBalance() - amount);
            System.out.println("Withdrawed " + amount);
        }
    }

}
