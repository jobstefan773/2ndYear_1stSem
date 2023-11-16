import java.util.*;

public class Main {
    public static ArrayList <Person> list =  new ArrayList<>();
    public static Scanner userInput = new Scanner(System.in);
    public static void main (String[] args) {

        // declarations -----------------------------------------------------------
        boolean selection = true;
        String decision;

        // display and user options -----------------------------------------------
        while (selection) {
        menu();
        System.out.print("Enter Choice: ");
        decision = userInput.nextLine();
        System.out.println("-----------------------------------------");
            switch(decision.toUpperCase()) {
                case "T" : addTeacher();
                    break;
                case "S" : addStudent();
                    break;
                case "D" : displayTeacher();
                    break;
                case "Q" : selection = false;
                    break;
                
            }
        }
    }

    public static void addTeacher() {
        
        System.out.print("Enter Name: ");
        String name = userInput.nextLine();
        while (checkTeacher(name)) {
            System.out.print("Enter Name AGAIN: ");
            name = userInput.nextLine();
        }
        System.out.print("Enter Address: ");
        String address = userInput.nextLine();
        System.out.print("Enter Department: ");
        String department = userInput.nextLine();

        list.add(new Teacher(name, address, department));

    }

    public static void addStudent() {

        System.out.print("Enter Name: ");
        String name = userInput.nextLine();
        System.out.print("Enter Address: ");
        String address = userInput.nextLine();
        System.out.print("Enter ID Number: ");
        int idNumber = Integer.parseInt(userInput.nextLine());
        while (checkStudent(idNumber)) {
            System.out.print("Enter ID Number AGAIN: ");
            idNumber = Integer.parseInt(userInput.nextLine());
        }
        System.out.print("Enter Year Level: ");
        int year = Integer.parseInt(userInput.nextLine());

        list.add(new Student(name, address, idNumber, year));

    }

    public static void displayTeacher() {

        int index = 1;
        String decision;

        System.out.println("Which Department would you like to display?");
        for (Person x : list) {
            if (x instanceof Teacher) {
                Teacher y = (Teacher) x;

                // EDIT HERE ************************************************ (prints out every department even if they are the same)
            
            }
            index++;
        }
        System.out.print("Enter Number: ");
        decision = userInput.nextLine();

        for (Person x : list) {
            if (x instanceof Teacher) {
                Teacher y = (Teacher) x;
                
                // EDIT HERE ************************************************** (does not print the desired department)

            }
        }

    }

    // constant methods ----------------------------------------------------------------------------

    public static boolean checkTeacher (String name) {
        for (Person x : list) {
            if (x.getName().equalsIgnoreCase(name)) {
                System.out.println("Invalid! Teacher already exist.");
                return true;
            }
        }
        return false;
    }

    public static boolean checkStudent (int id) {
        for (Person x : list) {
            if (x instanceof Student) {
                Student y = (Student) x;
                if (y.getIdNumber() == id)  {
                    System.out.println("Invalid! ID Number already exist.");
                    return true;
                } 
            } 
        }
        return false;
    }

    public static void menu() {
        System.out.println("-----------------------------------------");
        System.out.println("Choose Option!");
        System.out.println();
        System.out.println("T: Add Teacher");                 
        System.out.println("S: Add Student");
        System.out.println("D: Display Teachers");
        System.out.println("Q: Quit Program");
        System.out.println("-----------------------------------------");
    }
}