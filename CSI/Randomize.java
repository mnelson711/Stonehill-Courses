import java.util.*;
public class Randomize
{
public static void main(String[] args)
{
int n = 0;
Scanner keyboard = new Scanner(System.in);
Random rng = new Random();
System.out.println("----- Welcome to the Randomizer -----");
System.out.print("To display a list of random numbers between 0 and N enter an N: ");
n = keyboard.nextInt();

int[] lst = new int[n+1];
for(int i = 0; i <= n; ++i)
{
lst[i] = i;
}

shuffle(lst);
printArrayOfInts(lst);
}//end main

public static void printArrayOfInts(int[] arrayPassed)
{
for(int i = 0; i < arrayPassed.length; ++i)
{
System.out.print(arrayPassed[i] + " ");
}//end for loop
}//end method

public static void shuffle(int[] arrayPassed)
{
Random rng = new Random();
for(int i = 0; i < arrayPassed.length; ++i)
{
int rand1, rand2, tempNum;
rand1 = rng.nextInt(arrayPassed.length);
rand2 = rng.nextInt(arrayPassed.length);
tempNum  = arrayPassed[rand1];
arrayPassed[rand1] = arrayPassed[rand2];
arrayPassed[rand2] = tempNum;
}
}//end method

}//end class