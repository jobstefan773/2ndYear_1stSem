public class CheckingAccount extends BankAccount {

    public CheckingAccount(int accountNumber) {
        super(accountNumber);

    }

    public void deposit(double amount) {

        setCurrentBalance(getCurrentBalance() + amount);
        System.out.println("Deposited " + amount);

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
