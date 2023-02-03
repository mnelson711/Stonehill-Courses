//Author: Molly Nelson
//Last revision: 9/30/21
//Assignment #4 Problem #3

import java.util.Scanner;
public class SquareRoot
{
public static void main(String args[])
{
//variables
double n, newNum, old, oldNum = 0, guess, formatedNum;
Scanner keyboard = new Scanner(System.in);

System.out.println("enter an integer");
n = keyboard.nextDouble();
System.out.println("enter an guess");
guess = keyboard.nextDouble();
old = guess;
newNum = 0;

do
{
newNum = old + n/old;
newNum /= 2;
oldNum = old;
old = newNum;

formatedNum = newNum * 100000;
formatedNum = (long)formatedNum;
formatedNum /= 100000;
System.out.println(formatedNum);

} while(Math.abs(oldNum - newNum) > .00001);

}//end main
}//end class