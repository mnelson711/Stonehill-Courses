public class Shuffle1
{
public static void main(String[] args)
{
int[] deck = new int[52];
for(int i = 0; i < deck.length; ++i)
{
deck[i] = i+1;
}
System.out.println("It takes " + Shuffle1(deck) + " shuffles to restore the deck");

}//end main

public static int Shuffle1(int[] deck)
{
int[] pile1 = new int[26];
int[] pile2 = new int[26];
boolean run = true;
int counter = 0;

while(run)
{
++counter;
for(int i = 0; i < pile1.length; ++i)
{
pile1[i] = deck[i];
}
for(int i = 0; i < pile2.length; ++i)
{
pile2[i] = deck[i+26];
}

for(int i = 0; i < 26; ++i)
{
deck[2*i] = pile1[i];
deck[2*i+1] = pile2[i];
}
for(int i = 1; i < deck.length+1; ++i)
{
if(deck[i-1] == i)
{
run = false;
}
else
{
run = true;
break;
}
}
}//end while
return counter;
}//end method



public static void printArrayOfInts(int[] arrayPassed)
{
for(int i = 0; i < arrayPassed.length; ++i)
{
System.out.println(arrayPassed[i]);
}
}//end method
}//end class