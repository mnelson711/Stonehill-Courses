import java.util.*;
public class Planets
{
public static void main(String[] args)
{
menu();

}//end main

public static double choiceOne(double[] li)
{
Scanner keyboard = new Scanner(System.in);
int weight = 0, code;
double newWeight;
System.out.println("Enter your weight on Earth:");
weight = keyboard.nextInt();
System.out.println("Enter your planet code:");
code = keyboard.nextInt();
newWeight = weight * li[code];
return newWeight;
}//end method

public static void choiceTwo(double[] li)
{
Scanner keyboard = new Scanner(System.in);
double newWeight, weight;
System.out.println("Enter your weight on Earth:");
weight = keyboard.nextInt();
for(int i = 0; i < li.length; ++i)
{
newWeight = weight * li[i];
System.out.println(newWeight);
}

}//end method

public static void choiceThree(String[] names, double[] li)
{
for(int i = 0; i < names.length; ++i)
{
System.out.println(i + "    " + names[i] + "   " + li[i]);
}//end loop

}//end method

public static void menu()
{
Scanner keyboard = new Scanner(System.in);
double[] gravities = new double[9];
int userInput;
boolean run = true;
//creating list of gravities
gravities[0] = .39;
gravities[1] = .91;
gravities[2] = 1.00;
gravities[3] = .38;
gravities[4] = 2.87;
gravities[5] = 1.32;
gravities[6] = .93;
gravities[7] = 1.23;
gravities[8] = .03;

String[] planets = new String[9];
//creating list of planets
planets[0] = "Mercury";
planets[1] = "Venus";
planets[2] = "Earth";
planets[3] = "Mars";
planets[4] = "Jupiter";
planets[5] = "Saturn";
planets[6] = "Uranus";
planets[7] = "Neptune";
planets[8] = "Pluto";

System.out.println("Welcome to the Planet Calculator!");
System.out.println("Enter 1 to find your weight on a given planet.");
System.out.println("Enter 2 to see your weight on all planets.");
System.out.println("Enter 3 to display  all planets and gravity factors.");
System.out.println("Enter 4 to show this menu at any time.");
System.out.println("Enter any other number to exit");
userInput = keyboard.nextInt();
while(run)
{
switch(userInput)
{
case 1:
System.out.println(choiceOne(gravities));
break;
case 2:
choiceTwo(gravities);
break;
case 3:
choiceThree(planets, gravities);
break;
case 4:
System.out.println("Welcome to the Planet Calculator!");
System.out.println("Enter 1 to find your weight on a given planet.");
System.out.println("Enter 2 to see your weight on all planets.");
System.out.println("Enter 3 to display  all planets and gravity factors.");
System.out.println("Enter 4 to show this menu at any time.");
System.out.println("Enter any other number to exit");
break;
default:
System.out.println("Bye");
run = false;
break;
}


if(userInput != 1 && userInput != 2 && userInput != 3 && userInput != 4)
{
run = false;
}
if(run)
{
System.out.print("choice: ");
userInput = keyboard.nextInt();
}

}
}//end method
}//end class