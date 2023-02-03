//Author: Molly Nelson
//Last Revision: 9/22/21
//Assignment #3 Problem #3

import java.util.Scanner;

public class Baseball
{
public static void main(String args[])
{
//variables
int n = 0;
double currentNumerator = 1, currentDenominator = 1, denominator = 1, numerator = 1;
int games;
double finalAnswer, roundedAnswer;
Scanner keyboard = new Scanner(System.in);

//user input
System.out.println("Enter an integer:");
n = keyboard.nextInt();

//calculations
games = 2*n + 1;

for(int i = 1; i < games/2+1; ++i)
{

currentNumerator = 2*i - 1;
currentDenominator = 2*i;
numerator = numerator * currentNumerator;
denominator = denominator * currentDenominator;

}
//final answer formatting
finalAnswer = numerator/denominator;
roundedAnswer = Math.round(finalAnswer * 100.0);
System.out.println("there is a " + roundedAnswer + "% chance that this competition will go all the way");
}
}//end class