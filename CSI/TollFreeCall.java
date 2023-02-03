//Author: Molly Nelson
//Last Revision: 9/14/21
//Assignment #2 Problem #3
import java.util.Scanner;

public class TollFreeCall
{
public static void main(String[] args)
{
//variables
Scanner keyboard = new Scanner(System.in);
long inputNumber;
long firstThree, secondThree, lastThree;

//user input
System.out.print("input: ");
inputNumber = keyboard.nextLong();

//calculations
firstThree = inputNumber / 10000000;

if((firstThree == 800) | (firstThree == 808) | (firstThree == 877) | (firstThree == 866))
{
System.out.println(inputNumber + " is a toll-free number");
}
else
{
System.out.println(inputNumber + " is not a toll-free numebr");
}

}//end main
}//end class