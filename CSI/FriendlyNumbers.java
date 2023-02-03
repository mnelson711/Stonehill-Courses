//Author: Molly Nelson
//Last Revision: 9/14/21
//Assignment #2 Problem #2
import java.util.Scanner;

public class FriendlyNumbers
{
public static void main(String[] args)
{

//variables
int inputNumber, digit1, digit2, digit3, digit4, digit5;
Scanner keyboard = new Scanner(System.in);
boolean notFriendly = true;

//user input
System.out.println("Enter in a five digit number");
inputNumber = keyboard.nextInt();

//calculations
digit1 = inputNumber / 10000;
digit2 = inputNumber / 1000;
digit3 = inputNumber / 100;
digit4 = inputNumber / 10;
digit5 = inputNumber / 1;


if(digit1 % 1 == 0)
   {
      if(digit2 % 2 == 0)
      {
         if(digit3 % 3 == 0)
         {
            if(digit4 % 4 == 0)
            {
               if(digit5 % 5 == 0)
               {
                System.out.println("This number is Friendly");
                notFriendly = false;
                
               }
            }
         }
      }
   }
if(notFriendly)
{
System.out.println("This number is not Friendly");
}

}//end main
}//end class