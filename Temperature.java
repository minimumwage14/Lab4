import java.util.Scanner;
/**
* Program Description
* Temperature asks the user to input a temperature and either c or f, for celcius or farenheit
* Temperature will then convert that temperature from the given unit to the other. (i.e, from c to f, or f to c)
* Then, Temperature will ask the user if they wish to run the program again
* If the entered unit is invalid, Temperature will ask the user to enter c or f
*
* @author Jacob Antonio
* @version v1.0
* @since 9/28/2025
*/
public class Temperature{
public static void main (String[] args){
////vars section
double inputTemp, output;
char inputUnit;
String response;
Scanner keyboard = new Scanner(System.in);
do ////create working program and then put in do-while
  { 
  System.out.print("Enter a temperature, a space, and units (C or F).");
  inputTemp = keyboard.nextDouble();
  inputUnit = keyboard.next().charAt(0);
  inputUnit = Character.toUpperCase(inputUnit);
  while (inputUnit != 'C' && inputUnit != 'F')
  ////while loop pit. You want a 'C' OR 'F', if a user enters this
  ////you want to keep them out. So how do you do the opposite?
  ////How about using !
  ////If a user is in the while pit, tell them want you want to get
  ////them out by entering 'C' OR 'F'. Grab the char, just like above
  ////before the while pit.
  {

    System.out.print("\nEnter a unit (C or F).");
      inputUnit = keyboard.next().charAt(0);
      inputUnit = Character.toUpperCase(inputUnit);
  }
  if (inputUnit == 'F')
  ////compute output (F->C). Assuming you collected an int from the user, you will need
  ////to cast part of the equation as a double or using a double in the equation (ie 5.0).
  ////then nicely format (think printf here) the output to one decimal place.
  ////%d is for int, %c is for char, %f along with precision for double
  {
    output = (inputTemp - 32) * 5.0/9.0;
    System.out.printf("\n%.1f C", output);
  }
   else
  {
    output = inputTemp * 9.0/5.0 + 32;
    System.out.printf("\n%.1f F", output);
  }
  System.out.print("\nWould you like to compute another temperature? (yes/no): \n");
  response = keyboard.next();
  } while(response.equalsIgnoreCase("yes"));
//Now you can will need to collect input for the do-while part
//Message to user to enter yes to calculate another temp.
//can either use the String collected with equalsIgnoreCase("yes") orforce
// toUpperCase/toLowerCase and then grab charAt(0) and have the while evaluate to == 'Y' (or 'y')
}//// end main ()
}//// end class

