//Author: Molly Nelson
//Last Revision: 9/21/21
//Assignment #2 Problem #5
import java.util.Scanner;
public class AmicableNumbers
{
public static void main(String args[])
{
//variables
int num1, num2;
int sum;
Scanner keyboard = new Scanner(System.in);
boolean run = true;

//user input
System.out.print("Enter Two Numbers");
num1 = keyboard.nextInt();
System.out.print("Enter Two Numbers");
num2 = keyboard.nextInt();


//calculations
sum = 0;
while(run == true)
{
for(int i = 1; i < num1; ++i)
{
if(num1 % i == 0)
{
sum += i;
}//end if

}//end loop
if(sum == num2)
{
System.out.println(num1 + " and " + num2 + " are amicable.");
}
else
{
System.out.println(num1 + " and " + num2 + " are not amicable.");
}

System.out.println("Run again? Type 1 for 'Yes' any other digit for 'No':");
if(keyboard.nextInt() == 1)
{
System.out.print("Enter Two Numbers");
num1 = keyboard.nextInt();
System.out.print("Enter Two Numbers");
num2 = keyboard.nextInt();
sum = 0;
}
else
{
run = false;
}
}//end while
System.out.println("Bye.");
}//end main
}//end class