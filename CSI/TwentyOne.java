//Author: Molly Nelson
//Last Revision: 9/29/21
//Assignment #4 Problem #1

import java.util.Scanner;
import java.util.Random;

public class TwentyOne
{
public static void main(String args[])
{
//variables
Scanner keyboard = new Scanner(System.in);
Random rng = new Random();
int die1, die2, userInput, roll, score, gamesWon, gamesLost, playAgain, computerScore;
boolean run = true;
score = 0;
playAgain = 1;
gamesWon = 0;
gamesLost = 0;
//user input
System.out.print("Enter 1 to roll 2 to quit: ");
userInput = keyboard.nextInt();

while(playAgain == 1)
{
while(run)
{
if(userInput == 1)
{
roll = roll();
score += roll;
System.out.println("You rolled a " + roll + ". Score is " + score);
}
if(userInput == 2)
{
System.out.println("your score is " + score);
run = false;
computerScore = computerRoll(score);
if(computerScore < score || computerScore > 21)
{
System.out.println("Player Wins");
gamesWon += 1;
}
else if(computerScore > score)
{
System.out.println("Computer Wins");
gamesLost += 1;
}
}

if(score > 21)
{
System.out.println("You lose.");
run = false;
gamesLost += 1;
}
else if(run)
{
System.out.print("Enter 1 to roll 2 to quit: ");
userInput = keyboard.nextInt();
}

}//end interior while
System.out.println("Play again? Enter 1 for yes.");
playAgain = keyboard.nextInt();
if(playAgain == 1)
{
run = true;
userInput = 1;
score = 0;
}
else
{
System.out.println("Games won: " + gamesWon);
System.out.println("Games lost: " + gamesLost);

}
}//end exterior while


}//end main

public static int roll()
{
Random rng = new Random();
int die1, die2, userInput, roll;
roll = 0;

die1 = rng.nextInt(6) + 1;
die2 = rng.nextInt(6) + 1;
roll = die1 + die2;

return roll;
}//end roll


public static int computerRoll(int score)
{
//variables
int computerScore, computerRoll;
computerScore = 0;
computerRoll = 0;
//computer roll system
System.out.println("");
System.out.println("Computer rolls");
while(computerScore <= score && computerScore < 22)
{
computerRoll = roll();
computerScore += computerRoll;
System.out.println("computer rolls " + computerRoll + " score is " + computerScore);
}
System.out.println("Computer stops. Score is " + computerScore);

return computerScore;
}//end computer roll

}//end class

