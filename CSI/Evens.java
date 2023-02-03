//Author: Molly Nelson
//Last Revision: 10/11/21
//Assignment #6 Problem #3
import java.util.Scanner;
public class Evens
{
public static void main (String[] args)
{

        Scanner input = new Scanner(System.in);
         System.out.print("Enter a positive integer or 0 to end: ");
         int n = input.nextInt();

         while (n != 0)
        {
               System.out.print("The number of even integers between 0 and " + n + " is: ");

              System.out.println(evens(n));

               System.out.print("Enter a positive integer or 0 to end: ");
                n = input.nextInt();

           } 
         System.out.println("Bye");

} 


public static int evens1(int n)//this is how you could do the problem without recursion
{
int counter = 0;
for(int i = 0; i <= n; ++i)
{
if(i % 2 == 0)
{
++counter;
}
}
return counter;
}//end evens method

public static int evens(int n)//this is the problem with recursion
{
int counter = 0;
if(n == 0)
{
return 1;
}
if( n % 2 == 0)
{
++ counter;
}
return counter + evens(n-1);
}
}//end class