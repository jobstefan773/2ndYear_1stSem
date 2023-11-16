import java.util.*;

public class UseSubject {
    
    public static void main(String[] args) {
        
        Subject data[] = new Subject[10];
        
        Scanner userInput = new Scanner(System.in);
        Scanner userInput2 = new Scanner (System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Subject Code: ");
            String subj = userInput.nextLine();
            System.out.print("Credit Unit: ");
            int unit = userInput2.nextInt();
            
            Subject tran = new Subject(unit, subj);
            data[i] = tran;
            
        }

        userInput.close();
        userInput2.close();
        
        System.out.printf("%-32s%-10s \n", "Subject", "Credit Units");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-32s%-10d \n", data[i].getSubjCode(), data[i].getCredUnits());
        } 
        
    }
}
