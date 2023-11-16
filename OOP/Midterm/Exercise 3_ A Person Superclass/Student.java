public class Student extends Person {
    private int idNumber;
    private int year;

    
    public Student(String name, String address, int idNumber, int year) {
        super(name, address);
        this.idNumber = idNumber;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String toString() {
        return "[Student] Name: " + super.getName() + ", Address: " + super.getAddress() + ", idNumber: " + idNumber + ", Year: " + year;
    }
}