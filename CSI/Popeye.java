//Author: Molly Nelson
//Last Revision: 9/9/21
//Assignment #1 problem #1

import java.util.Scanner;
public class Popeye
{
public static void main(String[] args)
{

//variables
double nauticalMiles, regularMiles, topSpeed, bestTravelTime, averageSpeed, averageTime;
Scanner keyboard = new Scanner(System.in);

//user input
System.out.print("Enter the distance to travel in nautical miles: ");
nauticalMiles = keyboard.nextDouble();
System.out.print("Enter the top speed of the boat in knots: ");
topSpeed = keyboard.nextDouble();
System.out.print("Enter the average speed of the boat in knots: ");
averageSpeed = keyboard.nextDouble();

//calculations
regularMiles = nauticalMiles * 1.1508;
bestTravelTime = nauticalMiles / topSpeed;
averageTime = nauticalMiles / averageSpeed;

//output

System.out.println("The distance to travel in regular miles is: " + regularMiles);
System.out.printf("The best case travel time is: %.5f", bestTravelTime);
System.out.print(" hours at " + topSpeed + " knots\n");
System.out.println("The average case travel time is: " + averageTime + " hours at " + averageSpeed + " knots");

}//end main
}//end class