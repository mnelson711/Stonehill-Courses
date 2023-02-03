import java.util.Scanner;

public class MovingDay
{
public static void main(String[] args)
{
Scanner keyboard = new Scanner(System.in);
int numt, numf;
System.out.println("Number of Falses: ");
numf = keyboard.nextInt();
System.out.println("Number of Trues: ");
numt = keyboard.nextInt();

String[] gameBoard = createGame(numt, numf);
boolean run = true, win = false;
printArrayOfStrings(gameBoard);

while(run)
{
makeMoves(gameBoard);
printArrayOfStrings(gameBoard);
if(checkWin(gameBoard, numt))
{
run = false;
System.out.println("You WIN!");
}
if(checkLose(gameBoard))
{
run = false;
System.out.println("You LOSE!");
}
}//end while

}//end main

public static String[] createGame(int numt, int numf)
{
String[] gameBoard = new String[numf + numt + 1];

for(int i = 0; i < gameBoard.length; ++i)
{
if(i < numt)
{
gameBoard[i] = "T";
}
else if(i > numt)
{
gameBoard[i] = "F";
}
else
{
gameBoard[i] = " ";
}
}//end loop
return gameBoard;
}//end method

public static String[] makeMoves(String[] arrayPassed)
{
Scanner keyboard = new Scanner(System.in);
int move;
String temp;
System.out.println("Choose Move");
move = keyboard.nextInt();

if(arrayPassed[move] == "T")
{
if(arrayPassed[move+1] == " ")
{
temp = arrayPassed[move];
arrayPassed[move] = arrayPassed[move+1];
arrayPassed[move+1] = temp;
}
else if(arrayPassed[move+1] == "F" && arrayPassed[move+2] == " ")
{
temp = arrayPassed[move];
arrayPassed[move] = arrayPassed[move+2];
arrayPassed[move+2] = temp;
}
else
{
System.out.println("Cannot Make Move");
}
}
else if(arrayPassed[move] == "F")
{
if(arrayPassed[move-1] == " ")
{
temp = arrayPassed[move];
arrayPassed[move] = arrayPassed[move-1];
arrayPassed[move-1] = temp;
}
else if((arrayPassed[move-1] == "F" || arrayPassed[move-1] == "T") && arrayPassed[move-2] == " ")
{
temp = arrayPassed[move];
arrayPassed[move] = arrayPassed[move-2];
arrayPassed[move-2] = temp;
}
}
else
{
System.out.println("Cannot Make Move");
}
return arrayPassed;
}//end method

public static boolean checkWin(String[] arrayPassed, int numt)
{
for(int i = numt; i < arrayPassed.length; ++i)
{
if(arrayPassed[i] != "T")
{
return false;
}
}
return false;

}//end method

public static boolean checkLose(String[] arrayPassed)
{
boolean noMove = true;
for(int i = 0; i < arrayPassed.length; ++i)
{
if(i > 1 && i < arrayPassed.length-2)
{
if(arrayPassed[i] == "T")
{
if(arrayPassed[i+1] != " " && arrayPassed[i+2] != " ")
{
noMove = true;
}
else
{
return false;
}

}
else if(arrayPassed[i] == "F")
{
if(arrayPassed[i-1] != " " && arrayPassed[i-2] != " ")
{
noMove = true;
}
else
{
return false;
}
}
}

/*
else if(i > arrayPassed.length-1)
{
if(arrayPassed[i] == "T" && arrayPassed[i+1] != " ")
{
noMove = true;
}
}
else if(i < 1)
{
if(arrayPassed[i] == "F" && arrayPassed[i-1] != " ")
}
*/
}//end for loop

return noMove;

}//end method

public static void printArrayOfStrings(String[] arrayPassed)
{
for(int i = 0; i < arrayPassed.length; ++i)
{
System.out.print(i + "   ");
}
System.out.println();

for(int i = 0; i < arrayPassed.length; ++i)
{
System.out.print(arrayPassed[i] + " | ");
}
System.out.println();
}//end method
}//end class