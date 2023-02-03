//Author: Molly Nelson
//Last Revision: 9/9/21
//Assignment #1 Problem #4

import java.util.Scanner;
public class MathMagic
{
public static void main(String[] args )
{
//variables
int firstDigit, secondDigit, thirdDigit;
int secretDigit;
Scanner keyboard = new Scanner(System.in);
//user input
System.out.println("1. Choose 4 digits");
System.out.println("2. Make two four-digit numbers with these digits");
System.out.println("3. Subtract the smaller from the larger.");
System.out.println("4. Secretly pick a non-zero digit from the difference.");
System.out.println("5. Enter the remaining three digits, one per line");
firstDigit = keyboard.nextInt();
secondDigit = keyboard.nextInt();
thirdDigit = keyboard.nextInt();

//operations

secretDigit = firstDigit + secondDigit + thirdDigit;
secretDigit %= 9;
secretDigit = 9 - secretDigit;


System.out.println("The secret digit is " + secretDigit);


}//end main
}//end class