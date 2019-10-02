

// Angela Richards
// This program will ask for temperature in F then display whether it is solid, liquid or gas at that temp. 

import java.util.Scanner;

public class water
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Temperature in Farenheit: ");
		float water = input.nextFloat();
		// asks for the temp in Farenheit

		if(water<=32)		
			System.out.println("Water at that temperature is a solid");
		// if the water is under or at 32 degrees it's ice
		
		else if(water>=212)
			System.out.println("Water at that temperature is a gas");
		// if the water is above or at 212 it is gas

		else
			System.out.println("Water at that temperature is a liquid");
		// if the temp is neither freezing nor boiling, it is a liquid

	}

}