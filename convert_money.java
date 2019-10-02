

//Angela Richards
//This program will prompt the user to US dollars, Euros, Chinese Yuan, Indian Rupees and Bitcoin.  Depending on which letter the user enters, the program displays "Amount of ... to convert" 

import java.util.Scanner;

public class convert_money
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
			System.out.println("Currency to convert to U.S. dollars: e = Euros, c= Chinese Yuan, r = Indian Rupees, b = Bitcoin:");
			String money = input.nextLine();
			// prompts the user for USD

			switch(money)
			{
				case "e":
				case "E":
				System.out.println("Amount of Euros to convert: ");
					double currency1 = input.nextDouble();
					double euro = (currency1*1.16);
					System.out.println("In US dollars that is: $" + euro);
					// if e or E is pressed, USD will convert to Euros

				break;

				case "c":
				case "C":
				System.out.println("Amount of Yuan to convert: ");
					double currency2 = input.nextDouble();
					double yuan = (currency2*.15);
					System.out.println("In US dollars that is: $" + yuan);
					// if c or C is pressed, USD will convert to Yuan

				break;

				case "r":
				case "R":
				System.out.println("Amount of Rupees to convert: ");
					double currency3 = input.nextDouble();
					double rupee = (currency3*.015);
					System.out.println("In US dollars that is: $" + rupee);
					// if r or R is pressed, USD will convert to Rupees

				break;

				case "b":
				case "B":
				System.out.println("Amount of Bitcoin to convert: ");
					double currency4 = input.nextDouble();
					double bitcoin = (currency4*6923.80);
					System.out.println("In US dollars that is: $" + bitcoin);
					// if b or B is pressed, USD will convert to bitcoin

				break;
				
				default:
				System.out.println("Not an option I'm afraid");
			}


	}
}