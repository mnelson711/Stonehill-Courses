import java.util.*;

public class PokerHand
{
public static void main(String[] args)
{
int fullHouseCount = 0;
int[] cardDeck = new int[52];
for(int i = 0; i < cardDeck.length; ++i)
{
cardDeck[i] = i;
}
for(int x = 0; x < 999999; ++x)
{
if(dealCards(cardDeck))
{
++fullHouseCount;
}
}
System.out.println((float)fullHouseCount/1000000);
}//end main

public static boolean dealCards(int[] arrayPassed)
{
int[] hand = new int[5];
shuffle(arrayPassed);
for(int i = 0; i < 5; ++i)
{
hand[i] = arrayPassed[i];
}//this creates the new dealt hand of five cards
//printArrayOfInts(hand);
return fullHouse(hand);
}//end method

public static boolean fullHouse(int[] arrayPassed)
{
int[] handRank = new int[15];
int counter = 0;
boolean condition1 = false, condition2 = false;
for(int n = 0; n < arrayPassed.length; ++n)
{
handRank[arrayPassed[n] % 13 + 2] += 1;
}//end loop

//printArrayOfInts(handRank);
for(int i = 0; i < handRank.length; ++i)
{
if(handRank[i] == 3)
{
condition1 = true;
}
if(handRank[i] == 2)
{
condition2 = true;
}
}//end loop
if(condition1 && condition2)
{
return true;
}
return false;
}//end method

public static void shuffle(int[] arrayPassed)
{
Random rng = new Random();
for(int i = 0; i < arrayPassed.length; ++i)
{
int rand1, rand2;
int tempNum;
rand1 = rng.nextInt(arrayPassed.length);
rand2 = rng.nextInt(arrayPassed.length);
tempNum  = arrayPassed[rand1];
arrayPassed[rand1] = arrayPassed[rand2];
arrayPassed[rand2] = tempNum;
}
}//end method

public static void printArrayOfInts(int[] arrayPassed)
{
for(int i = 0; i < arrayPassed.length; ++i)
{
System.out.println(arrayPassed[i]);
}
}//end method




}//end class