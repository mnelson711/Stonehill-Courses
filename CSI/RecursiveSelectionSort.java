public class RecursiveSelectionSort
{
public static void main(String[] args)
{
int[] myArray = {9,7,8,6,4,5,2,1,3};
recursiveSelectionSort(myArray, 0);
printArrayOfInts(myArray);
}//end main

public static void recursiveSelectionSort(int[] arr, int i)
{
   int min_index = i;
   int n = arr.length;
   for (int j = i + 1; j < n; j++)
   {
      if (arr[j] < arr[min_index]) 
      {
      min_index = j;
      }
   }
   int temp = arr[min_index];
   arr[min_index] = arr[i];
   arr[i] = temp;
    
   if (i + 1 < n) 
      {
      recursiveSelectionSort(arr, i + 1);
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