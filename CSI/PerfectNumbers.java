//Author: Molly Nelson
//Last Revision: 9/21/21
//Assignment #3 Problem #1

public class PerfectNumbers
{
public static void main(String args[])
{
//variables
int sum;
//user output
System.out.println("The perfect numbers between 2 and 10,000 are:");
//calculations
for(int i = 2; i < 10000; ++i)
{
sum = 0;
for(int n = 1; n < i; ++n)
{
if(i % n == 0)
{
sum += n;
}
}
if(sum == i)
{
System.out.println(sum);
}
}
}//end main
}//end class