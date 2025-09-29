import java.util.Scanner;
/**
 * Programs asks user to input a string
 * then asks for char to count
 * returns the number of times counted char appears in string
 *
 * @author Jacob Antonio
 * @version 1.0
 * @since 9/28/2025
 */
public class ProgChall5
{
    public static void main(String[] args) {
        String inputString;
        char assessChar;
        int count;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
          inputString = keyboard.nextLine();

        
        System.out.print("Enter the char to assess: ");
          String charInput = keyboard.nextLine().trim();
            assessChar = charInput.charAt(0);

        
        count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == assessChar) {
                count++;
            }
        }

        System.out.printf("In the phrase: %s %nThere are %d %c's",inputString, count, assessChar);
    }
}