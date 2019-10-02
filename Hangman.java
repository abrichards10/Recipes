

import java.util.Random;
// imports the random function- used when choosing from an array
import java.util.Scanner;

public class Hangman
{	
	String phraseList[] = {"basketball", "television", "university", "Warriors", "meme", "San Francisco", "history", "park", "Starbucks", "Japan"};
	// list of ten phrases used

	Scanner input;
	String selectedPhrase;
	char userPhrase[];
	// variablesss

	void displayPhrase(char phrase[])
	// method that intakes the character guess
	{
		for(int c=0; c < phrase.length; c++)
		// the char starts at 0, checks is it is less than the length of the phrase, then adds one
		{
			System.out.print(phrase[c]);
			// then print the phrase with the char in it
		}
	}


	void gameStart()
	{
		Scanner input = new Scanner(System.in);
		int trys = 0;
		int correct = 0;
		int flag = 0; 
		int otherFlag = 0;
		int spaces = 0;
		char letter;
		int counter;
		// sets the variables for this method

		for(counter = 0; counter<userPhrase.length; counter++)
			// counter starts at zero, checks if it is less than the length of the phrase
			// then adds one if true
		{
			if(selectedPhrase.charAt(counter) == ' ')
				// if the phrase is equal to where the character is on the counter
			{
				userPhrase[counter] = ' ';
				spaces++;
				// add the char
			}

			else
			{
				userPhrase[counter] = '*';
				// or else it remains a mystery 
			}
		}

		System.out.println("Welcome to the hangman game program!");
		System.out.println("To begin playing, please enter a lower or upper case letter!");
		System.out.println("You have only 8 tries so good luck!");
		// starter phrases - prompts the user and greets them

		correct = spaces;
		// the number of spaces is equal to the number of correct characters

		do
		{
			displayPhrase(userPhrase);
			System.out.print("\nEnter a letter: ");
			letter = input.next().charAt(0);
			trys ++;
			// display the random phrase
			// prompts the user for a character

			for(int i=0; i<userPhrase.length;i++)
				// checks if the char is less than the length of the phrase
			{
				if(userPhrase[i]==letter)
					// if the phrase i equals the character input 
				{
					otherFlag = 1;
					break;
				}

			}


			if(otherFlag == 0)
			{
				for(counter = 0; counter < selectedPhrase.length(); counter++)
				// when the counter is less than the length of the phrase, add to the counter
				{

					// checks if the character at the point in the phrase is the same character that was guessed, whether it was upper or lower case
					if(selectedPhrase.charAt(counter)==Character.toLowerCase(letter)||selectedPhrase.charAt(counter)==Character.toUpperCase(letter))

					{
						// returns the guessed letter to appear inside the phrase
						userPhrase[counter] = letter;
						correct++;
						// add to the already correct letters
						flag = 1;
					}			
				}
				if(flag==0)
					{
						// if the whole guess is false, say it's not a match
						System.out.println("No match! ");
					}
			}

			else 
			{
				// if the letter was already guessed () then return this phrase
				System.out.println("That letter is already guessed! ");
				otherFlag = 0;
			}

			if(trys >=8)
			{
				System.out.println("You're out of guesses :( ");
				// prints this when you're out of guesses 
				break;
				// terminates the process
			}
		
		}while (correct != (selectedPhrase.length()));
		// once the phrase has finally 'reached the end', return these phrases

		System.out.println("Great job!");
		System.out.println("Correct word is: " + selectedPhrase);
		
	}

	public static void main(String args[])
	{
		// create a new Hangman() 
		Hangman h = new Hangman();
		// create a new random phrase
		Random r = new Random();
			int phraseNum = r.nextInt(10);
			// chooses from each of the ten phrases after pressing a number
			h.selectedPhrase = h.phraseList[phraseNum];
			// the phrase from hangman then chooses from the ten phrases
			h.userPhrase = new char[h.selectedPhrase.length()];
			// the phrase the user has is now checking for the characters
			h.gameStart();
	}

}