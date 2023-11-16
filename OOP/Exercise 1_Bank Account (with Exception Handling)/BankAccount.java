public abstract class BankAccount {

    private int accountNumber;
    private double currentBalance;

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.currentBalance = 0.0;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);

}
