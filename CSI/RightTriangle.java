//Author: Molly Nelson
//Last Revision: 9/22/21
//Assignment #3 Problem #5
import java.util.Scanner;
public class RightTriangle
{
public static void main(String args[])
{
//variables
Scanner keyboard = new Scanner(System.in);
int n;

//user input
System.out.println("Enter an integer n: ");
n = keyboard.nextInt();

//calculation
for(int i = 0; i < n; ++i)
{
for(int x = 0; x <= i; ++x)
{
System.out.print("x");
}//end interior loop
System.out.println("");
}//end exterior loop

}//end main
}//end class