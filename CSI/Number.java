//Author: Molly Nelson
//Last Revision: 9/22/21
//Assignment #3 Problem #4

import java.util.Scanner;
public class Number
{
public static void main(String args[])
{
//variables
long n, n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
int divisions = 0;
Scanner keyboard = new Scanner(System.in);
//user input
System.out.println("Enter a ten digit number");
n = keyboard.nextLong();

//calculations
n1 = n / 1000000000;
if(n1 % 1 == 0)
{
++divisions;
}
n2 = n / 100000000;
if(n2 % 2 == 0)
{
++divisions;
}

n3 = n / 10000000;
if(n3 % 3 == 0)
{
++divisions;

}
n4 = n / 1000000;
if(n4 % 4 == 0)
{
++divisions;

}
n5 = n / 100000;
if(n5 % 5 == 0)
{
++divisions;

}
n6 = n / 10000;
if(n6 % 6 == 0)
{
++divisions;

}
n7 = n / 1000;
if(n7 % 7 == 0)
{
++divisions;

}
n8 = n / 100;
if(n8 % 8 == 0)
{
++divisions;

}
n9 = n / 10;
if(n9 % 9 == 0)
{
++divisions;

}
n10 = n;
if(n10 % 10 == 0)
{
++divisions;
}
System.out.println(divisions);
}//end main
}//end class