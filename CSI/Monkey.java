//Author: Molly Nelson
//Last Revision 9/10/21
//Assignment #1 Problem #3


import java.util.Scanner;
public class Monkey
{
public static void main(String[] args)
{
//variables
int man1, man2, man3, man4, man5, coconuts, originalCoconuts, days;
Scanner keyboard = new Scanner(System.in);

//user input 
System.out.println("Enter the intial number of days");
days = keyboard.nextInt();//the user enters the number of days and then the program calculates the number of coconuts

//calculations
originalCoconuts = 12495 + 15625*days;
coconuts = originalCoconuts;

man1 = coconuts/5;
coconuts -= man1;
coconuts -= 1;

man2 = coconuts/5;
coconuts -= man2;
coconuts -= 1;

man3 = coconuts/5;
coconuts -= man3;
coconuts -= 1;

man4 = coconuts/5;
coconuts -= man4;
coconuts -= 1;

man5 = coconuts/5;
coconuts -= man5;
coconuts -= 1;

//output

System.out.println("The initial number of coconuts is: " + originalCoconuts);
System.out.println("Man 1: " + man1 + " coconuts; Monkey: 1 coconut.");
System.out.println("Man 2: " + man2 + " coconuts; Monkey: 1 coconut.");
System.out.println("Man 3: " + man3 + " coconuts; Monkey: 1 coconut.");
System.out.println("Man 4: " + man4 + " coconuts; Monkey: 1 coconut.");
System.out.println("Man 5: " + man5 + " coconuts; Monkey: 1 coconut.");
System.out.println(coconuts + " coconuts remain, each gets " + coconuts/5 + " and one for the monkey.");

}//end main
}//end class