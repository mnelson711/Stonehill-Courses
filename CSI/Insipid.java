import java.util.Scanner;
public class Insipid
{
public static void main(String args[])
{
int sum, userInput, userInput2, n;
Scanner keyboard = new Scanner(System.in);
boolean run = true;


while(run)
{
System.out.print("enter number");
userInput = keyboard.nextInt();
n = userInput;
sum = 0;
System.out.print("The sequence starting at " + userInput + " is : ");
while(n != 1 || n != 58)
{
if(n == 58 || n == 1)
{
break;
}
sum = 0;
while( n > 0)
{
sum += Math.pow(n % 10, 2);
n /= 10;
}
n = sum;
System.out.print(n + " ");
}

if(n == 1)
{
System.out.println("\nnumber is insipid");
}
if(n == 58)
{
System.out.println("\nnumber is not insipid");
}
System.out.println("run again? 1 for yes");
userInput2 = keyboard.nextInt();

if(userInput2 != 1)
{
run = false;
}
}

}//end main
}//end class