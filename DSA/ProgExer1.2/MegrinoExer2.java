import java.io.*;
import java.util.*;

public class MegrinoExer2 {
    public static void main (String[] args) {
        
        ArrayList <Integer> grades = new ArrayList<Integer>();

        try {
            File file = new File("input.txt");
            Scanner fileInput = new Scanner(file);
            fileInput.useDelimiter(",\\s*");

            while (fileInput.hasNextLine()) {
                
                grades.add(fileInput.nextInt());

            }
            fileInput.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        Collections.sort(grades);

        //----------------------------------------------------------------------------
        int r0_24 = 0;
        int r25_49 = 0;
        int r50_74 = 0;
        int r75_99 = 0;
        int r100_124 = 0;
        int r125_149 = 0;
        int r150_174 = 0;
        int r175_200 = 0;

        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) <= 24) {
                r0_24++;
            } else if (grades.get(i) <= 49) {
                r25_49++;
            } else if (grades.get(i) <= 74) {
                r50_74++;
            } else if (grades.get(i) <= 99) {
                r75_99++;
            } else if (grades.get(i) <= 124) {
                r100_124++;
            } else if (grades.get(i) <= 149) {
                r125_149++;
            } else if (grades.get(i) <= 174) {
                r150_174++;
            } else if (grades.get(i) <= 200) {
                r175_200++;
            }
        }

        System.out.println("Ranges 0 - 24, Number of Students: " + r0_24);
        System.out.println("Ranges 25 - 49, Number of Students: " + r25_49);
        System.out.println("Ranges 50 - 74, Number of Students: " + r50_74);
        System.out.println("Ranges 75 - 99, Number of Students: " + r75_99);
        System.out.println("Ranges 100 - 124, Number of Students: " + r100_124);
        System.out.println("Ranges 125 - 149, Number of Students: " + r125_149);
        System.out.println("Ranges 150 - 174, Number of Students: " + r150_174);
        System.out.println("Ranges 175 - 200, Number of Students: " + r175_200);

    }
}