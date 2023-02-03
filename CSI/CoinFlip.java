import java.util.*;
public class CoinFlip
{
public static void main(String[] args)
{
System.out.println("Length    Number of Runs of Heads");
coinFlip();
}//end main

public static void coinFlip()
{
Random rng = new Random();
int n = 100000;
int[] lengths = new int[n];
int currentCoinVal = 0, heads = 0, tails = 1, currentBest = 0, counter = 0;
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
      lengths[counter] += 1;
      counter = 0;
   }

}
int[] numbers = new int[currentBest];
for(int x = 1; x <= numbers.length; ++x)
{
System.out.println(x + "         " + lengths[x]);
}
}//end method

}//end class