
// Angela Richards
// This program will test the methods in Animal.java

import java.util.Scanner;

public class Animal_Test
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
			// Says that there will be a new input
		String x;
		long y;
		double z;
			// sets the variables for future inputs
		Animal a = new Animal();
			// calls for the Animal file and creates a new constructor for the default method	 

		System.out.println("Prints the default: ");

		System.out.println(a);
			// This will print out the default constructor, because there has been no call for input

		System.out.print("Enter a name: ");
			x = input.nextLine();
		System.out.print("Enter a population: ");
			y = input.nextLong();
		System.out.print("Enter a growth rate: ");
			z = input.nextDouble();
				// This one calls for user input concerning name, population and growth rate, so it won't print the default (and we can modify the info)

		Animal a1 = new Animal(x, y, z);
			// uses the overload method to set specific variables to the input

		a1.set_name(x);
		a1.set_population(y);
		a1.set_Rate(z);
			// returns the values after getting them

		System.out.println(a1);
			// uses toString method

		if(a.equals(a1))
			System.out.println("a and a1 are equal");
		else
			System.out.println("a and a1 are not equal");
		// tests if the default method and input method have the same isntance variable values

		if(a1.endangered() == true)
			System.out.println("false");
		else
			System.out.println("true");
		// returns true if the growth rate is negative

	}
}	