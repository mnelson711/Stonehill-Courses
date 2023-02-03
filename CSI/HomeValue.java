//Author: Molly Nelson
//Last Revision: 10/5/21
//Assignment #5 Problem #4
import java.util.Scanner;
public class HomeValue
{
public static void main(String[] args)
{
int years;
Scanner keyboard = new Scanner(System.in);
boolean run = true;
while(run)
{
System.out.println("Enter an integer between 1 and 6: ");
years = keyboard.nextInt();

switch(years)
{
case 1:
System.out.println("Enter the percent increase or decrease: ");
double percent = keyboard.nextDouble();
System.out.println(geometricMean(percent));
break;

case 2:
System.out.println("Enter the percent increase or decrease: ");
percent = keyboard.nextDouble();
System.out.println("Enter the next percent increase or decrease: ");
double percent2 = keyboard.nextDouble();
System.out.println(geometricMean2(percent, percent2));
break;

case 3:
System.out.println("Enter the percent increase or decrease: ");
percent = keyboard.nextDouble();
System.out.println("Enter the next percent increase or decrease: ");
percent2 = keyboard.nextDouble();
System.out.println("Enter the next percent increase or decrease: ");
double percent3 = keyboard.nextDouble();
System.out.println(geometricMean3(percent, percent2, percent3));
break;

case 4:
System.out.println("Enter the percent increase or decrease: ");
percent = keyboard.nextDouble();
System.out.println("Enter the next percent increase or decrease: ");
percent2 = keyboard.nextDouble();
System.out.println("Enter the next percent increase or decrease: ");
percent3 = keyboard.nextDouble();
System.out.println("Enter the next percent increase or decrease: ");
double percent4 = keyboard.nextDouble();
System.out.println(geometricMean4(percent, percent2, percent3, percent4));
break;

case 5:
System.out.println("Enter the percent increase or decrease: ");
percent = keyboard.nextDouble();
System.out.println("Enter the next percent increase or decrease: ");
percent2 = keyboard.nextDouble();
System.out.println("Enter the next percent increase or decrease: ");
percent3 = keyboard.nextDouble();
System.out.println("Enter the next percent increase or decrease: ");
percent4 = keyboard.nextDouble();
System.out.println("Enter the next percent increase or decrease: ");
double percent5 = keyboard.nextDouble();
System.out.println(geometricMean5(percent, percent2, percent3, percent4, percent5));
break;

case 6:
System.out.println("Enter the percent increase or decrease: ");
percent = keyboard.nextDouble();
System.out.println("Enter the next percent increase or decrease: ");
percent2 = keyboard.nextDouble();
System.out.println("Enter the next percent increase or decrease: ");
percent3 = keyboard.nextDouble();
System.out.println("Enter the next percent increase or decrease: ");
percent4 = keyboard.nextDouble();
System.out.println("Enter the next percent increase or decrease: ");
percent5 = keyboard.nextDouble();
System.out.println("Enter the next percent increase or decrease: ");
double percent6 = keyboard.nextDouble();
System.out.println(geometricMean6(percent, percent2, percent3, percent4, percent5, percent6));
break;
}//end switch
System.out.println("run again? 1 for yes");
int userInput = keyboard.nextInt();

if (userInput != 1)
{
run = false;
System.out.println("BYE");
}
}//end while

}//end main

public static double geometricMean(double num)
{
double geometricMean = 0;
num = num / 100 + 1;
geometricMean = Math.pow(num, 1.0);
return geometricMean;
}//end method



public static double geometricMean2(double num, double num2)
{
double geometricMean = 0;

num = num / 100 + 1;
num2 = num2 / 100 + 1;
geometricMean = Math.pow((num * num2), 1.0 / 2.0);
return geometricMean;
}//end method

public static double geometricMean3(double num, double num2, double num3)
{
double geometricMean = 0;

num = num / 100 + 1;
num2 = num2 / 100 + 1;
num3 = num3 / 100 + 1;
geometricMean = Math.pow((num * num2 * num3), 1.0 / 3.0);
return geometricMean;
}//end method

public static double geometricMean4(double num, double num2, double num3, double num4)
{
double geometricMean = 0;

num = num / 100 + 1;
num2 = num2 / 100 + 1;
num3 = num3 / 100 + 1;
num4 = num4 / 100 + 1;
geometricMean = Math.pow((num * num2 * num3 * num4), 1.0 / 4.0);
return geometricMean;
}//end method

public static double geometricMean5(double num, double num2, double num3, double num4, double num5)
{
double geometricMean = 0;

num = num / 100 + 1;
num2 = num2 / 100 + 1;
num3 = num3 / 100 + 1;
num4 = num4 / 100 + 1;
num5 = num5 / 100 + 1;
geometricMean = Math.pow((num * num2 * num3 * num4 * num5), 1.0 / 5.0);
return geometricMean;
}//end method

public static double geometricMean6(double num, double num2, double num3, double num4, double num5, double num6)
{
double geometricMean = 0;

num = num / 100 + 1;
num2 = num2 / 100 + 1;
num3 = num3 / 100 + 1;
num4 = num4 / 100 + 1;
num5 = num5 / 100 + 1;
num6 = num6 / 100 + 1;
geometricMean = Math.pow((num * num2 * num3 * num4 * num5 * num6), 1.0 / 6.0);
return geometricMean;
}//end method

}//end class