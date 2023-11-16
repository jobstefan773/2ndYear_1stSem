public abstract class Employee {
    private String name;
    private String barName;

    public abstract String employeeTask();

    public Employee(String name) {
        this.name = name;
        this.barName = "JAVA Bar";
    }

    public String getName() {
        return name;
    }

    public String getBarName() {
        return barName;
    }

    public void setTip(double tip) {
    }
}