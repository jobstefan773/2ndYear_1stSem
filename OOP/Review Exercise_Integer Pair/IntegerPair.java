import java.util.*;

public class IntegerPair {
    public static void main (String[] args) {

        Scanner userInput = new Scanner(System.in);
        ArrayList <Integer> intSet = new ArrayList<Integer>(); 

        //INPUT-----------------------------------------------------------------------------
        boolean decision = true;
        while (decision) {

            System.out.print("Add integer: ");
            int integers = userInput.nextInt();

            if (integers != 0) {

                intSet.add(integers);

            } else {

                System.out.print("terminated!\n\n");
                decision = false;

            }

        }

        //REMOVING THE LAST ELEMENT IF THE ARRAY SIZE IS ODD-------------------------------
        int size = intSet.size();
        if (size % 2 != 0) {

            intSet.remove(size - 1);

        }

        //REMOVING ELEMENTS----------------------------------------------------------------
        for (int i = intSet.size() - 1; i >= 0; i-=2) {

            if (intSet.get(i) < intSet.get(i - 1)) {
                intSet.remove(i);
                intSet.remove(i-1);
            } 
            
        }

        //PRINTING THE OUTPUT--------------------------------------------------------------
        for (int i = 0; i < intSet.size(); i++) {
            System.out.println(intSet.get(i));
        }

        userInput.close();
    
    }
}   