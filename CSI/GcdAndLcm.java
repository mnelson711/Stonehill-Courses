//Author: Molly Nelson
//Last Revision: 10/11/21
//Assignment #6 Problem #1

import java.util.Scanner;

public class GcdAndLcm
{
public static void main(String[] args)
{
int num1, num2, input;
Scanner keyboard = new Scanner(System.in);
boolean run = true;

while(run)
{
System.out.print("Enter two positive integers: ");
num1 = keyboard.nextInt();
num2 = keyboard.nextInt();

System.out.println("the gcd is : " + gcd(num1, num2));
System.out.println("the lcm is : " + lcm(num1, num2));
System.out.println("Run again? 1 for Yes any other digit for No: ");
input = keyboard.nextInt();

if(input != 1) {
run = false;
}
}//end while loop
}//end main

public static int gcd(int a, int b)
{
int temp;
if(a < b)
{
int temp2;
temp2 = a;
a = b;
b = temp2;
}
while(b != 0)
{
temp = a;
a = b;
b = temp % b;
}
return a;
}//end gcd method

public static int lcm(int a, int b)
{
int lcm;
lcm = a * b;
lcm /= gcd(a,b);
return lcm;

}//end lcm method

}//end class