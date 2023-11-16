public class Waiter extends Employee {

    private double tip;
    private double salary;
    private double totalSalary = 0.0;

    public Waiter(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public String employeeTask() {
        return null;
    }

    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.salary = tip;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void totalSalary(double tip) {
        this.totalSalary = this.salary + tip;
        this.salary = this.totalSalary;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

}