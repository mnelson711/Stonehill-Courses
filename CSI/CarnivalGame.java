//Author: Molly Nelson
//Last Revision: 10/5/21
//Assignment #5 Problem #2

import java.util.*;

public class CarnivalGame
{
public static void main(String[] args)
{
int playerWins = 0, sum = 0;

for(int i = 0; i < 100; ++i)
{
sum =
dieRoll(6) +
dieRoll(20) +
dieRoll(8) +
dieRoll(4) +
dieRoll(12);
if(sum > 35 || sum < 20)
{
playerWins += 1;
}//end if
}//end for loop
System.out.println("The player won " + playerWins + " times!");
}//end main

public static int dieRoll(int x)
{
Random rng = new Random();
int roll;
roll = rng.nextInt(x) + 1;
return roll;
}//end method

}//end class