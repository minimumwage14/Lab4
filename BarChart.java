import java.util.Random;
/**
* Program Description
* Random creates three random integers from 0-999
* printStars divides each number by 100 and rounds down
* prints 1 star for each hundred in numbers 1, 2, and 3
*
* @author Jacob Antonio
* @version v1.0
* @since 9/28/2025
*/
public class BarChart{ 
public static void main (String[] args) {
////vars section
//int vars for first, second, third
int first, second, third;
////generate and assign random numbers section
Random random = new Random();
 first = random.nextInt(1000); 
 second = random.nextInt(1000);
 third = random.nextInt(1000);
 ////Print out numbers
System.out.printf("Number 1 is: %d.%nNumber 2 is: %d.%nNumber 3 is: %d.%n", first, second, third);
 System.out.println("");
////Bar Chart Section
//Print out NUMBER BAR CHART as a header
System.out.print("NUMBER BAR CHART\n");
////first stars
System.out.print("Number 1: ");
 printStars(first);
////second stars
System.out.print("Number 2: ");
 printStars(second);
////third stars
System.out.print("Number 3: ");
 printStars(third);
}////end main()
/**
* Accepts int input and prints stars
* @param input - number of stars to print out
*/
public static void printStars(int input){
if (input<100) {
  System.out.println("<100 no stars");
}
  else {
    int starsCount = input/100;
    for (int i = 0; i < starsCount; i++) {
                System.out.print("*");
  }
  System.out.println();
}
}////end printStars()
}////end BarChart

