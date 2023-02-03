//Author: Molly Nelson
//last revision: 9/9/21
//Assignment #1 Problem #2

import java.util.Scanner;
public class Money
{
public static void main(String[] args )
{
//variables
int change,
fiftyCents,
quarters,
dimes,
nickels,
pennies,
totalCoins;
Scanner keyboard = new Scanner(System.in);

//user input
System.out.print("Enter an amount of cents: ");
change = keyboard.nextInt();

//calculations
fiftyCents = change/50;
change %= 50;
quarters = change/25;
change %= 25;
dimes = change/10;
change%= 10;
nickels = change/5;
change %= 5;
pennies = change/1;
change %= 1;
totalCoins = fiftyCents + quarters + dimes + nickels + pennies;

//output
System.out.println("fifty-cent pieces : " + fiftyCents);
System.out.println("quarters : " + quarters);
System.out.println("dimes : " + dimes);
System.out.println("nickels : " + nickels);
System.out.println("pennies : " + pennies);
System.out.println("Total : " + totalCoins + " coins");


}//end main
}//end class