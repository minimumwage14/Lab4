import java.util.Scanner;
/**
* Program Description
* 1) Fill in steps
*
* @author Name, optional email
* @version v1.0
* @since date
*/
public class Reverse_Word{
public static void main (String[] args){
////vars section
//String for word, remaining, combined, and flipped
String word, remaining, combined, flipped, response;
char firstLetter;
Scanner keyboard = new Scanner(System.in);
//do{ ////optional do while. Get main program up and running and then the do while
do { 
  System.out.print("Enter words seperated by a space. End with the word quit: ");
  while (keyboard.hasNext()) {
      ////this program allows for adding all words with quit as last word
      ////you can get the first word using .next() and forcing .toLowerCase();
      word = keyboard.next().toLowerCase();
      
      if (word.equals("quit")){
          ////Since we don't know how many words, best to use a while. Create while loop (pit) looking
          ////for the word quit, since we don't want "quit' to work, think ! here
          break;
      }
      
      firstLetter = word.charAt(0);
      remaining = word.substring(1);
      combined = remaining + firstLetter;
      flipped = "";
      for (int i = combined.length() - 1; i>= 0; i--){
          flipped += combined.charAt(i);
      }
      
      if (flipped.equals(word)) {////Print out <word> works
          System.out.println(word + " works");
      }
      else {////Print out <word> does not work
          System.out.println(word + " does not work");
      }
  } ////end while
  keyboard.nextLine();
  ////Optional do while, print msg to process another line (ie type yes)
  System.out.print("Enter yes to process another line? ");
    response = keyboard.nextLine();
} while (response.equalsIgnoreCase("yes"));//while to see if desired input was word to repeat, .use equalsIgnoreCase());
} ////end main ()
} ////end class
