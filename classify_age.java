

//Angela Richards
// This program will ask the user's age then display the title of the person (baby, teenager, adult) 

import java.util.Scanner;

public class classify_age
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = input.nextInt();
		// prompts the user for an age

		if(age<1)
		{
			System.out.println("This person’s age category: infant");
			//If less than 1 year old, the person is an infant.
		}

		else if((age>=1)&&(age<3))
		{
			System.out.println("This person’s age category: toddler");
			// If at least 1 year old but younger than 3, the person is a toddler.
		}

		else if((age>=3)&&(age<13))
		{
			System.out.println("This person’s age category: child");
			// If at least 3 years old but younger than 13, the person is a child.
		}

		else if((age>=13)&&(age<18))
		{
			System.out.println("This person’s age category: teenager");
			// If at least 13 years old but younger than 18, the person is a teenager.
		}

		else if((age>=18)&&(age<65))
		{
			System.out.println("This person’s age category: adult");
			// If at least 18 years old but younger than 65, the person is an adult.
		}

		else
		{
			System.out.println("This person’s age category: senior");
			// If 65 or older, the person is a senior.
		}

	}
}

