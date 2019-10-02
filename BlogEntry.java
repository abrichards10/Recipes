

//Angela Richards
// This program will be used to store an entry for a Web blog

import java.util.Scanner;

public class BlogEntry
{
	private String username;
	private String baseTxt;
	private int day;
	private String month;
	private int year; 
	// instance variables


	// default constructor
	public BlogEntry()
	{
		username = "name";
		baseTxt = "base text";
		day = 1;
		month = "January";
		year = 2000;
	}


	public String get_Summary()
	{
		
		if(baseTxt.length() <= 10)
		{
			return baseTxt;
		}
		else 
		{
			String baseTxt_char = baseTxt.substring(0, 10);
			return baseTxt_char;
		}

	//	baseTxt_char = baseTxt.slice(baseTxt.length());

	//	return baseTxt;

	}

	public String toString()
	{
		return "username: " + username + "\nBase text: " + baseTxt + "\nDate: " + toDate(day, month, year);
	}
	// toString method

	public String toDate(int day, String month, int year)
	{
		return month + " " + day + " " + year;
	}
	// returns the da

	public void set_date(String m, int d, int y)
	{
		month =m;
		day =d;
		year =y;
	}

	// constructor 
	public BlogEntry(String name, String base, int d, String m, int y)
	{
		username = name;
		baseTxt = base;
		day = d;
		month = m;
		year = y;
	}

	// mutator method to set the username
	public void set_username(String nm)
	{
		String username = nm;
	}

	//accessor method to obtain the username
	public String get_username()
	{
		return username;
	}

	//mutator method to set the base text
	public void set_baseTxt(String base)
	{
		String baseTxt = base;
	} 

	public String get_baseTxt()
	{
		return baseTxt;
	}

	public static void main(String [] args)
	{

		BlogEntry a = new BlogEntry();

		String username;
		String baseTxt;
		int day;
		String month;
		int year;

		Scanner input = new Scanner(System.in);
		System.out.print("Set username: ");
			username = input.nextLine();
		System.out.print("\nSet text: ");
			baseTxt = input.nextLine();
		System.out.print("\nSet day: ");
			day = input.nextInt();
		System.out.print("\nSet month: ");
			month = input.nextLine();
			month = input.nextLine();
		System.out.print("\nSet year: ");
			year = input.nextInt();

		BlogEntry b = new BlogEntry(username, baseTxt, day, month, year);

		b.set_username(username);
		b.set_baseTxt(baseTxt);
		b.set_date(month, day, year);

		System.out.println(b.toString());

		System.out.println("First ten characters: " + b.get_Summary());
	}
}