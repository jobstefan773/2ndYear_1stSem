import java.io.*;
import java.util.*;

public class MainApp {
    public static void main (String [] args) throws EOFException, FileNotFoundException {

        File file = new File("students.txt");
        Scanner fileInput = new Scanner(file);
        LinkedList<Student> list = new LinkedList<Student>();

        while (fileInput.hasNextLine()) {
            String lastName = fileInput.nextLine();
            String firstName = fileInput.nextLine();
            if(isVowel(lastName.toLowerCase().charAt(0))) {
                list.addFirst(new Student(lastName, firstName));
            } else {
                list.addLast(new Student(lastName, firstName));
            }
        }

        fileInput.close();

        for (Student x : list) {
            System.out.println(x);
        }
    }

    public static boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        else
            return false;
    }
}