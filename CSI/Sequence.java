public class Sequence
{
public static void main(String[] args)
{
int[] array = {4, 5, 7, 3, 12, 2, 5, 6, 19, 21, 14};
longestSequence(array);
}//end main

public static void longestSequence(int[] arrayPassed)
{
int temp = -999, counter = 0, bestCounter = 0, bestCounterIndex = 0, endCounter = 0;
int[] newArray = new int[arrayPassed.length];
for(int x = 0; x > newArray.length; ++x)
{
newArray[x] = 0;
}
for(int i = 0; i < arrayPassed.length; ++i)
{
if(arrayPassed[i] > temp)
{
++counter;
newArray[i] = arrayPassed[i];
temp = arrayPassed[i];
}
else
{
temp = arrayPassed[i];
if(counter > bestCounter)
{
bestCounter = counter;
bestCounterIndex = i - bestCounter - 1;
endCounter = i;
}
counter = 0;
}

}
System.out.println("The length of the sequence is " + (bestCounter+1));
System.out.print("The longest Sequence is ");
for(int i = 0; i < arrayPassed.length; ++i)
{
if(arrayPassed[i] != 0 && i >= bestCounterIndex && i < endCounter)
{
System.out.print(arrayPassed[i] + " ");
}
}
//printArrayOfInts(newArray);
}//end method

}//end class