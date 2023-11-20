import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        
        ArrayList<String> letters = new ArrayList<>();
        File file = new File("graph.txt");
        Scanner fileInput = new Scanner(file);

        while (fileInput.hasNextLine()) {
            
            String let = fileInput.nextLine();
            letters.add(let);

        }

        fileInput.close();

        System.out.println(letters);
    }
}