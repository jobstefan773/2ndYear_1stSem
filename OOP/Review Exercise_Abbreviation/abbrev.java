package oldabbreviation;
import java.util.Scanner;
public class abbre {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word1;
		
		while(true) {
			word1 = in.nextLine();
			if(word1.equalsIgnoreCase("exit"))
				break;
			abbreviation(word1.toCharArray());
			}
		}
	public static boolean isConsonant(char x) {
		if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I'  || x == 'O' || x == 'U')
			return false;
		return true;
	}
	public static void abbreviation(char[] input) {
		StringBuilder abbreviation = new StringBuilder();

        // Check if the first letter is a consonant
        if (isConsonant(input[0])) {
            abbreviation.append(input[0]);
        } else {
            // If the first letter is a vowel, append it to the abbreviation
            abbreviation.append(Character.toUpperCase(input[0]));
        }

        // Find the last letter in the word
        char lastLetter = input[input.length - 1];

        // Append the last letter to the abbreviation
        abbreviation.append(lastLetter);

        System.out.println(abbreviation.toString());
    }
}

