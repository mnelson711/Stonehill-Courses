//Author: Molly Nelson
//Last Revision: 10/12/21
//Assignment #6 Problem #2
import java.util.*;
public class Monty
{
public static void main(String[] args)
{
Scanner keyboard = new Scanner(System.in);
boolean run = true;

while(run)
{
System.out.println("Hello, I am Monty Hall and welcome to 'Let's Make a Deal.' Here is our first contestant.");
userOutput();
System.out.println("want to play again? 1 for yes.");
int userInput = keyboard.nextInt();
if(userInput != 1)
{
run = false;
}
}

}//end main

public static int assignDoors()
{
Random rng = new Random();
int winner;
int door1 = 1, door2 = 2, door3 = 3;
winner = rng.nextInt(3) + 1;
switch(winner) 
{
case 1:
return door1;
case 2:
return door2;
case 3:
return door3;
default:
return 0;
}//end switch

}//end method

public static void userOutput()
{
int chosenDoor, assignedDoor;
Scanner keyboard = new Scanner(System.in);

assignedDoor = assignDoors();
System.out.println("Welcome to the show.  Now, in front of you are three doors.  Behind two of these doors is a goat \nbut behind the third door is a shiny new Jaguar. You may choose one of the doors. Which will it be : 1, 2, or 3?");
chosenDoor = keyboard.nextInt();
if(chosenDoor != 1)
{
   if(assignedDoor != 1)
      {
      System.out.println("OK , you choose door " + chosenDoor + ".  But before I show you what is behind door " + chosenDoor + ", let's take a look behind door 1.  Let's open door 1.\n  That's right, behind door 1 is a goat. Now do you want to keep door " + chosenDoor + " or switch?");
      chosenDoor = keyboard.nextInt();
      if(chosenDoor == assignedDoor)
      {
      System.out.println("Behind " + chosenDoor + " is a jaguar. Congratz you won!");
      }
      else
      {
      System.out.println("Behind " + chosenDoor + " is a goat. You lost.");
      }
      }
   else
      {
      System.out.println("OK , you choose door " + chosenDoor + ".  But before I show you what is behind door " + chosenDoor + ", let's take a look behind door 1.\n  Let's open door 1. Behind door 1 is a jaguar. You Lost ");
      }
}
else if(chosenDoor == 1)
{
if(assignedDoor != 2)
   {
   System.out.println("OK , you choose door " + chosenDoor + ".  But before I show you what is behind door " + chosenDoor + ", let's take a look behind door 2.\n  Let's open door 2.  That's right, behind door 2 is a goat. Now do you want to keep door " + chosenDoor + " or switch?");
   chosenDoor = keyboard.nextInt();
   if(chosenDoor == assignedDoor)
   {
   System.out.println("Behind " + chosenDoor + " is a jaguar. Congratz you won!");
   }
   else
   {
   System.out.println("Behind " + chosenDoor + " is a goat. You lost.");
   }
   }
else
   {
   System.out.println("OK , you choose door " + chosenDoor + ".  But before I show you what is behind door " + chosenDoor + ", let's take a look behind door 2.\n  Let's open door 2. Behind door 2 is a jaguar. You Lost");
   }

}



}//end method

}//end class
