//Author: Molly Nelson
//Last Revision 9/14/21
//Assignment #2 Problem #1

import java.util.Scanner;
public class PhoneCall
{
public static void main(String[] args)
{
//variables
double day = .15, evening = .07, weekend = .05;
int length, rateCode;
double cost;
Scanner keyboard = new Scanner(System.in);
//user input
System.out.println("Enter the length of the call: ");
length = keyboard.nextInt();
System.out.println("Enter the rate code: ");
rateCode = keyboard.nextInt();

//Calculations

switch(rateCode)
{
case 0:
cost = length*day;
System.out.printf("%s$%1.2f\n", "The cost of the call is ",cost);
break;
case 1:
cost = length*evening;
System.out.printf("%s$%1.2f\n", "The cost of the call is ",cost);
break;
case 2:
cost = length*weekend;
System.out.printf("%s$%1.2f\n", "The cost of the call is ",cost);
break;
default:
System.out.println("Illegal Rate Code");
} 



}//end main
}//end class