//Author: molly Nelosn
//Last Revision: 9/30/21
//Assignment #4 Problem #4

import java.util.Scanner;
import java.util.Random;
public class SquirrelGame
{
public static void main(String args[])
{
//variables
int nuts, bet, reward, die1, die2, die3;
Scanner keyboard = new Scanner(System.in);
nuts = 10;
bet = 1;

while(nuts > 0 && bet != 0)
{
bet = getBet(nuts);
if(bet != 0)
{
die1 = rollDie();
die2 = rollDie();
die3 = rollDie();
reward = computeNetPayout(die1, die2, die3, bet);
System.out.println("Rolling dice --> D1: " + faceToScreen(die1) + " D2: " + faceToScreen(die2) + " D3: " + faceToScreen(die3));
if(reward != 0)
{
System.out.println("Congratulations! You won " + reward + " nuts.");
}
else
{
System.out.println("Sorry squirrel! You Lost!");
}
nuts -= bet;
nuts += reward;
}
}//end while

System.out.println("Bye squirrel. You started with 10 nuts and you ended with " + nuts + " nuts. Caw! Caw!");
}

public static int rollDie()
{
Random rng = new Random();
int die;
die = rng.nextInt(6) + 1;
return die;
}

public static int getBet(int nuts)
{
int bet = 0;
Scanner keyboard = new Scanner(System.in);
System.out.println("Welcome squirrel!  You have " + nuts + " nuts.  How many would you like to throw up in the air (0 to quit)?");
bet = keyboard.nextInt();
return bet;
}

public static String faceToScreen(int face)
{
String planet = "";
switch(face)
{
case 1:
planet = "Mercury";
break;

case 2:
planet = "Venus";
break;

case 3:
planet = "Earth";
break;

case 4:
planet = "Mars";
break;

case 5:
planet = "Jupiter";
break;

case 6:
planet = "Sun";
break;

}
return planet;
}

public static int computeNetPayout(int die1, int die2, int die3, int bet)
{
if(die1 == 6 && die2 == 6 && die3 == 6)
{
return bet*128;
}
else if(die1 == 5 && die2 == 5 && (die3 == 5 || die3 == 6))
{
return bet*64;
}
else if(die1 == 4 && die2 == 4 && (die3 == 4 || die3 == 6))
{
return bet*32;
}
else if(die1 == 3 && die2 == 3 && (die3 == 3 || die3 == 6))
{
return bet*16;
}
else if(die1 == 1 && die2 == 1 && die3 == 1)
{
return bet*8;
}
else if(die1 == 1 && die2 == 1)
{
return bet*4;
}
else if(die1 == 1)
{
return bet*2;
}
return 0;
}

}