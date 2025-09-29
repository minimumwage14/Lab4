import java.util.Scanner;
/**
* Program Description
* Asks user to input int for max width of diamond
* If int is even, increases max width by 1
* prints diamond out of *
*
* @author Jacob Antonio
* @version v1.0
* @since 9/28/2025
*/
public class Stars{
public static void main (String args[]){
////vars section
int width,line,spaces,stars;
Scanner keyboard = new Scanner(System.in);
System.out.print("Enter max width for stars: ");
width = keyboard.nextInt();
if (width % 2 == 0) {
    width ++;
}
////top half section
for (line= 1,spaces= width/2;line<=width/2 + 1;line++,spaces--){ ////how many lines should be based on width
for (int i=1;i<=spaces;i++){ //this is for spaces
System.out.print(" ");
}
for (stars=1;stars<=line*2-1;stars++){ //this is for stars
System.out.print("*");
}
System.out.println(""); //this gets to next line
}
////bottom half
for (line=width/2,spaces=1;line>0;line--,spaces++){ //lines start one less than largest line in top half, go down, based on width
for (int i=1;i<=spaces;i++){ //this is for spaces
System.out.print(" ");
}
for (stars=1;stars<=line*2-1;stars++){ //this is for stars
System.out.print("*");
}
System.out.println(""); //this gets to next line
}
} ////end main()
} ////end class
