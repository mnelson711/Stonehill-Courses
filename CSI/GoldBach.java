//Author: Molly Nelson
//Last Revision: 10/4/21
//Assignment #5 Problem #1
import java.util.Scanner;
public class GoldBach
{
public static void main(String[] args)
{
Scanner keyboard = new Scanner(System.in);
int n, userinput;
boolean run = true;

while(run)
{
n = 1;
System.out.println("Enter an even positive integer greater than 2: ");
n = keyboard.nextInt();
while(n % 2 != 0 || n <= 2)
{
System.out.println("Enter an even positive integer greater than 2: ");
n = keyboard.nextInt();
}
goldbach(n);
System.out.println("Run again? 1 for yes");
userinput = keyboard.nextInt();

if(userinput != 1)
{
run = false;
}
}
}//end main


public static void goldbach(int nPassed)
{
int num = 0;
for(int i = 0; i < nPassed; ++i)
{
if(isPrime(i))
{
num = nPassed - i;

if(isPrime(num))
{
System.out.println(nPassed + " = " + num + " + " + i);
break;
}
}

}//end for loop

}//end method


public static boolean isPrime(int n)
{
boolean isPrimeNumber = true;

   if(n < 2)
   {
   isPrimeNumber = false;
   }//end if
   else if(n == 2)
   {
   isPrimeNumber = true;
   }//end if
   else for(int i = 2; i < Math.sqrt(n) + 1; ++i)
         {
         if(n % i == 0)
           {
            isPrimeNumber = false;
            break;
            }//end if
         }//end interior loop
    return isPrimeNumber;
}//end method

}//end class