//Author: Molly Nelson
//Last Revision: 9/14/21
//Assignment #2 Problem #4

import java.util.Scanner;

public class Stocks
{
public static void main(String[] args)
{
//variables
double userInput, commision = 0;
Scanner keyboard = new Scanner(System.in);
//user input
System.out.print("what is the input: ");
userInput = keyboard.nextDouble();

if(userInput < 100)
{
commision = 20;
}
else if(userInput < 999)
{
commision = 20 + .01*(userInput-99);
}
else if(userInput < 9999)
{
commision = 30 + .05*(userInput-999);
}
else if(userInput < 99999)
{
commision = 75 + .25*(userInput-9999);
}
else
{
System.out.println("invalid input");
}
//output
System.out.println("The commision is $" + commision);
}//end main
}//end class