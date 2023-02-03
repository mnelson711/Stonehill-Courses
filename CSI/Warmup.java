
public class Warmup
{
public static void main(String[] args)
{
int[] cardDeck = new int[52];
for(int i = 0; i < cardDeck.length; ++i)
{
cardDeck[i] = i;
}
printArrayOfInts(cardDeck);
}

public static void printArrayOfInts(int[] arrayPassed)
{
for(int i = 0; i < arrayPassed.length; ++i)
{
if(arrayPassed[i] % 13 + 2 == 11)
{
System.out.print("Jack");
}
else if(arrayPassed[i] % 13 + 2 == 12)
{
System.out.print("Queen");
}
else if(arrayPassed[i] % 13 + 2 == 13)
{
System.out.print("King");
}
else if(arrayPassed[i] % 13 + 2 == 14)
{
System.out.print("Ace");
}
else
{
System.out.print(arrayPassed[i] % 13 + 2);

}
if(arrayPassed[i] / 13 == 0)
{
System.out.print(" of Hearts");
}
else if(arrayPassed[i] / 13 == 1)
{
System.out.print(" of Diamonds");
}
else if(arrayPassed[i] / 13 == 2)
{
System.out.print(" of Clubs");
}
else if(arrayPassed[i] / 13 == 3)
{
System.out.print(" of Spades");
}
System.out.println();
}
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
}