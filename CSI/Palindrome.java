//Author: Molly Nelson
//Last Revision: 10/5/21
//Assignment #5 Problem #3
import java.util.Scanner;
public class Palindrome
{
public static void main(String[] args)
{
Scanner keyboard = new Scanner(System.in);
int input = 0;
System.out.println("--- Welcome to the Palindrome Detector! ---");
boolean run = true;
while(run)
{
System.out.print("Enter a positive integer(-1 to quit): ");
input = keyboard.nextInt();
if(input == -1)
{
run = false;
System.out.println("A Santa spits tips at NASA... bye!");
break;
}
if(isPalindrome(input))
{
System.out.println("PALINDROME");
}
else
{
System.out.println("NOT PALINDROME");
}


}//end while

}//end main

public static boolean isPalindrome(int nPassed)
{
int numberBackwards = 0, number;
int originalNum = nPassed;
while(nPassed != 0)
{
number = nPassed % 10;
numberBackwards += number;
numberBackwards *= 10;
nPassed /= 10;
}//end while
numberBackwards /= 10;


if(originalNum == numberBackwards)
{
return true;
}
else
{
return false;
}
}//end method

}//end class