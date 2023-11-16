public class Manager extends Employee {
    private double salary;

    public Manager(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public String employeeTask() {
        return null;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}