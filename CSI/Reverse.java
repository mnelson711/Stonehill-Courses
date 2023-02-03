import java.util.Scanner;
public class Reverse
{
public static void main(String[] args)
{
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter the size of the array: ");
int n = keyboard.nextInt();

int[] a = new int[n];
for(int i = 0; i < a.length; ++i)
{
a[i] = i;
}
reverseInt(a, 0, n-1);
printArrayOfInts(a);

}
public static void reverseInt(int[] a, int lo, int hi)
{
int temp = 0;
if ( hi == lo) // just one element
return;
if ( hi - lo == 1 )  // two elements
{
temp = a[hi];
a[hi] = a[lo];
a[lo] = temp;
return;
}
temp = a[hi];
a[hi] = a[lo];
a[lo] = temp;
reverseInt(a, lo+1, hi-1);

}//end method

public static void printArrayOfInts(int[] arrayPassed)
{
for(int i = 0; i < arrayPassed.length; ++i)
{
System.out.println(arrayPassed[i]);
}
}//end method

}//end class