import java.util.*;

public class StudentGrade {
    public static void main (String[] args) {

        ArrayList <Integer> students = new ArrayList<>();
        Scanner userInput = new Scanner (System.in);

        //ARRAY SIZE; NUMBER OF STUDENTS-----------------------------------------------------------------------
        int size = userInput.nextInt();
        
        //ELEMENTS OF THE ARRAY; STUDENTS GRADES---------------------------------------------------------------
        for (int i = 0; i < size; i++) {
            students.add(userInput.nextInt());
        } 

        //HIGHEST GRADE----------------------------------------------------------------------------------------
        int best = Collections.max(students);

        //CONVERT TO LETTER GRADE------------------------------------------------------------------------------
        for (int i = 0; i < size; i++) {
            if (students.get(i) >= best - 10) {
                System.out.println("Student " + i + " score is " + students.get(i) + " and grade is A");
            } else if (students.get(i) >= best - 20) {
                System.out.println("Student " + i + " score is " + students.get(i) + " and grade is B");
            } else if (students.get(i) >= best - 30) {
                System.out.println("Student " + i + " score is " + students.get(i) + " and grade is C");
            } else if (students.get(i) >= best - 40) {
                System.out.println("Student " + i + " score is " + students.get(i) + " and grade is D");
            } else {
                System.out.println("Student " + i + " score is " + students.get(i) + " and grade is F");
            }
        }

        userInput.close();
    }
}