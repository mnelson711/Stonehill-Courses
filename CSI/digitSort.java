public class digitSort
{
public static void main(String[] args)
{
   int[] array = {1234, 0003, 9876, 3321, 6719};
   int size = 4;
   
   sortByDigit(array,size);
   displayArray(array,size);


}//end main



public static void displayArray(int[] arrayPassed, int size)
{
for(int i = 0; i < size; ++i)
{
System.out.print(arrayPassed[i] + "  ");
}
System.out.println();
}//end method


public static void sortByDigit(int[] arrayPassed, int size) 
{  
int temp = 0;  
int x = 1;
for(int n = 0; n < 4; ++n)
{
for(int i=0; i < arrayPassed.length; i++){  
   for(int j=1; j < (arrayPassed.length-i); j++)
   {  
         if((arrayPassed[j-1] % (10*x)) / x > (arrayPassed[j] % (10*x)) / x)
         {  
         //swap elements  
         temp = arrayPassed[j-1];  
         arrayPassed[j-1] = arrayPassed[j];  
         arrayPassed[j] = temp;  
         }//end if                      
      }//end inner for loop
   } //end outer for loop
   displayArray(arrayPassed, size);
   x *= 10;
}
}//end method 

}//end class