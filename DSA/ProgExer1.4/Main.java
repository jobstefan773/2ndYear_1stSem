import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws EOFException, FileNotFoundException {

        File file = new File ("data.txt");
        Scanner fileInput = new Scanner (file);
        IntSkipList list = new IntSkipList();

        while (fileInput.hasNextLine()) {
            int num = Integer.parseInt(fileInput.nextLine());
            list.skipListInsert(num);
        }

        fileInput.close();

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Number to Search: ");
        int x = userInput.nextInt();

        if (list.skipListSearch(x) > 0) {
            System.out.println(x + " is found in " + list.skipListSearch(x) + " nodes.");
        } else {
            System.out.println(x + " is nonexistant.");
        }

        userInput.close();

    }
}
