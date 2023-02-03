//Author: Molly Nelson
//Last Revision: 10/12/21
//Assignment #6 Problem #4

public class Pascal
{
public static void main(String[] main)
{
Print(8);
}//end main

public static int Pascal(int r, int e)
{
if(e == 0 || e == r)
{
return 1;
}
else
{
return Pascal(r - 1, e - 1) + Pascal(r - 1, e);
}
}//end method


public static void Print(int rows)
{
for(int i = 0; i <= rows; ++i)
{
System.out.print("row " + i);
for(int j = 0; j <= (rows - i) + 1; ++j)
{
System.out.print(" ");
}
for(int n = 0; n <= i; ++n)
{
System.out.print(Pascal(i, n)+ " ");
}//end interior loop
System.out.println();
}//end exterior loop



}//end method

public static String spaceCounter(int n)
{
String str = "";
for(int i = n; i <= 0; --i)
{
str = str + " ";
}
return str;
}//end method

}//end class