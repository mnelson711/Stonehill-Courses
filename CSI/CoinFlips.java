//Author: Molly Nelson
//Last Revision: 9/21/21
//Assignment #3 Problem #2
import java.util.*;
public class CoinFlips
{
public static void main(String args[])
{
//variables
Random rng = new Random();
Scanner keyboard = new Scanner(System.in);
int heads = 0, tails = 1;
int n, counter;
int currentCoinVal, currentBest;
currentBest = 0;
//user input
System.out.println("Enter the number of flips:");
n = keyboard.nextInt();
//calculations
counter = 0;
for(int i = 0; i < n; ++i)
   {
   currentCoinVal = rng.nextInt(2);
   if(currentCoinVal == heads)
   {
      counter += 1;
      if(counter > currentBest)
      {
         currentBest = counter;
      }
   }
   if(currentCoinVal == tails)
   {
      counter = 0;
   }
   }//end loop
System.out.println("The longest Sequence of heads is " + currentBest);
}
}//end class