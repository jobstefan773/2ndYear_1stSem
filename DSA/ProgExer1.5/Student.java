public class Student {
    private String lastName;
    private String firstName;

    public Student(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Student(String lastname2, String firstname2, String studentid, String course, char gender, int yearlevel) {
    }

    public String toString() {
        return lastName + ", " + firstName;
    }
}
