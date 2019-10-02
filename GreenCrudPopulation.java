// GreenCrudPopulation.java

//Angela Richards
/*
Write a program that takes both the initial size 
of a green crud population (in pounds) and a number of days as 
input and outputs the number of pounds of green crud after that 
many days. Assume that the population size is the same for four 
days and then increases every fifth day. Your program should 
allow the user to repeat this calculation as often as desired.
*/

import java.util.Scanner;
public class GreenCrudPopulation
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		char repeat;
		
		do
		{
			System.out.print("Enter crud population: ");
			int oldPop = input.nextInt();
			//Asks for original population
			
			System.out.print("Number of days: ");
			int numberOfDays = input.nextInt();
			// asks for the number of days
			
			int oldCrud = 0;
			int newCrud = oldPop;
			int finalCrud = newCrud + oldCrud;
			// adds the amount of Crud beforehand to the new amount, to get the final amount
			
			for (int i = 1; i <= numberOfDays; i++)
			{
				if (i % 5 == 0)
				// if the remainder of the days is divisible by 5
				{
					finalCrud = newCrud + oldCrud;
					oldCrud = newCrud;
					newCrud = finalCrud;
					// adds the first value to the old value to create a new value 
				}
			}
			
			System.out.println("Amount of crud after " + numberOfDays + " days: " + finalCrud);
			
			System.out.print("\nPress y to repeat: ");
			// prompts the user if they want it repeated
			repeat = input.next().charAt(0);
			// reads the next character to see if it's 'y'
			System.out.println();

		} while (repeat == 'Y' || repeat == 'y');
		// once y or Y is pressed, repeat the loop

		input.close();
		// yah I know we haven't really learned this but I have previous experience so yah
		// This basically terminates the loop if y isn't pressed
	}
}