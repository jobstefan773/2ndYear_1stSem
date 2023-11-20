public class Student {
    private String lastname, firstname, studentid, course;
    private char gender;
    private int yearlevel;    
    
    public Student(String ln, String fn, String id, String cors, char g, int yl) {
    	lastname = ln;
    	firstname = fn;
    	studentid = id;
    	course = cors;
    	gender = g;
    	yearlevel = yl;
    }
    
    public void display() {    	
        System.out.printf("ID: %-8s  Name: %-20s  Sex: %c  Course: %-8s  Year: %d\n", studentid, (lastname + ", " + firstname), gender, course, yearlevel );
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getYearlevel() {
        return yearlevel;
    }

    public void setYearlevel(int yearlevel) {
        this.yearlevel = yearlevel;
    }
    
    
}