public class SavingsAccount {

    private int accNum;
    private String cusName;
    private String phoNum;
    private double savBal;
    private double annInt;

    public SavingsAccount() {
        this.accNum = 0;
        this.cusName = "";
        this.phoNum = "";
        this.savBal = 0.0;
        this.annInt = 0.0;
    }

    public SavingsAccount(int accNum, String cusName, String phoNum, double savBal, double annInt) {
        this.accNum = accNum;
        this.cusName = cusName;
        this.phoNum = phoNum;
        this.savBal = savBal;
        this.annInt = annInt;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getPhoNum() {
        return phoNum;
    }

    public void setPhoNum(String phoNum) {
        this.phoNum = phoNum;
    }

    public double getSavBal() {
        return savBal;
    }

    public double getAnnInt() {
        return annInt;
    }

    public void setAnnInt(double annInt) {
        this.annInt = annInt;
    }
    

    //methods
    public double deposit (double deposit) {
        this.savBal = savBal + deposit;   
        return savBal;
    }
    
    public double withdraw (double withdraw) {
        this.savBal = savBal - withdraw;
        return savBal;

    }

    //annual interest
    public double calculateMonthlyInterest () {
        double monInt = annInt / 12;
        double aft = savBal + (savBal * monInt);
        return aft;
    }

}