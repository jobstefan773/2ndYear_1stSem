import java.util.*;

public class FirstQuiz {
    public static void main (String[] args) {

        Scanner userInput = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList <Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(userInput.nextInt());
        }

        for (int i = list.size(); i > 0; i--) {
            System.out.println(list.get(i-1));
        }

        userInput.close();

    }
}
