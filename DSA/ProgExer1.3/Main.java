import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        ArrayList<Student> Student = new ArrayList<>();  

        try {
            File file = new File("student.txt");
            Scanner fileInput = new Scanner(file);
            //fileInput.useDelimiter(",\\s*");

            while (fileInput.hasNextLine()) {

                String studentid = fileInput.nextLine();
                String lastname = fileInput.nextLine();
                String firstname = fileInput.nextLine();
                char gender = fileInput.nextLine().charAt(0);
                String course = fileInput.nextLine();
                int yearlevel = Integer.parseInt(fileInput.nextLine());

                Student.add(new Student(lastname, firstname, studentid, course, gender, yearlevel));

            }   

            fileInput.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}