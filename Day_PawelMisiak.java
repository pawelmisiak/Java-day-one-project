/*
 Day_PawelMisiak.java
 Project name: 	Assignment 1
 Programmer:    Pawel Misiak
 Instructor:    SWEETY VARGHESE
 Class:         Java Application Development
 Date:          02/02/17
 
 Software Development Method
 
 1) Problem  -   Design and implement the class Day_yourname that implements the day of the week in a program.  The class Day_yourname should store the day(eg: Sunday,Monday...etc).  The program should be able to perform the following operations on an object of type Day:

A. Set the day.

B. Print the day.

C. Return the day.

D. Return the next day.

E. Return the previous day.

F. Calculate and return the day by adding certain days to the current day.  For example, if the current day is Monday and we add four days, the day to be returned is Friday.  Similarly, if today is Tuesday and we add 13 days, the day to be returned is Monday.

G. Add the appropriate constructors.

H. Write the definitions of the methods to implement the operations for the class Day, as defined in A through G.

I. Write a test/driver program to test various operations on the class Day.
 
 2) User input:   
 In the first part, the user has to input a number from 0 (Sunday) to 6 (Saturday)
 In the second part, the user has to input a number of days he would like the program to calculate the correct day from the day chosen in the first part.
 
 3) Example of an output:
Current day is: Tuesday
Next day will be: Wednesday
Previous day was: Monday
Enter number of days to the future from now: 3
The future day 3 days from now will be: Friday
 */

import java.util.Scanner;	// adds utility necessary for user input
public class Day_PawelMisiak // class name
{
	// Create array to hold days Sunday - Saturday
	public final static String[] days = {"Sunday","Monday", "Tuesday", "Wednesday","Thursday","Friday","Saturday",};
	
	static int theDay;
	
	public void Day_PawelMisiak()
	{
		theDay = 0;	 //initialize day to default (Sunday)
	}
	//Sets the day from the user input
	public void setDay(int enteredDay)
	{
		theDay = enteredDay;
	}   
	//returns the current day
	public int getDay()
	{
		return theDay;
	}
	//returns the next day, in case the current day falls on Saturday(6), it will return Sunday(0)
	public static int nextDay(int theDay)
	{
		if(theDay == 6)
			return 0;
		else
			return theDay + 1;
	}
	//returns the previous day, in case the current day falls on Sunday(0), it will return Saturday(6)
	public static int previousDay(int theDay)
	{
		if(theDay == 0)
			return 6;
		else
			return theDay - 1;
	}
	//returns the day that will occur in amount of days specified by the user input
	public static int futureDay(int theDay, int entered) 
	{
		return (theDay + entered) % 7;
	}
	//prints the day
	public void printDay(int entered)
	{
		System.out.println(days[entered]);
	}   


	public static void main(String[] args) 
	{
		Day_PawelMisiak theDay = new Day_PawelMisiak(); //creating new object of class Day_PawelMisiak
		Scanner input = new Scanner(System.in);  
		           
		System.out.println("Enter the current day: \n 0 for Sunday \n 1 for Monday \n 2 for Tuesday \n 3 for Wednesday \n 4 for Thursday \n 5 for Friday \n 6 for Saturday \n ");
		
		int entered = input.nextInt(); //first user input, setting the current day
		theDay.setDay(entered);
		System.out.print("\nCurrent day is: ");// printing the current day
		theDay.printDay(entered);
		System.out.print("Next day will be: ");// printing the next day
		theDay.printDay(nextDay(entered));	
		System.out.print("Previous day was: ");// printing the previous day
		theDay.printDay(previousDay(entered));
		System.out.print("Enter number of days to the future from now: ");
		int xDays = input.nextInt();	//second user input, setting the amount of days from current day
		System.out.print("The future day " + xDays +" days from now will be: "); // printing the future day
		theDay.printDay(futureDay(entered, xDays));
	}
}