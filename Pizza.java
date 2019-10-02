
// Angela Richards
// This stores info about a single pizza

public class Pizza
{
	// sets the instance variables
	private String size;
	private double cheese;
	private double pepper;
	private double ham;
	private double cost;

	// default Pizza constrictor
	public Pizza()
	{
		this.size = "";
		this.cheese = 0;
		this.pepper = 0;
		this.ham = 0;
	}

	// constructor that sets instance variables
	public Pizza(String s, double c, double p, double h)
	{
		this.size = s;
		this.cheese = c;
		this.pepper = p;
		this.ham = h;
	}

	public double Toppings()
	{
		return cheese + pepper + ham;
	}
	// size mutator method
	public void set_size(String s)
	{
		 this.size = s;
	}
	// size accessor method
	public String get_size()
	{
		return size;
	}
	// cheese mutator method
	public void set_cheese(double c)
	{
		this.cheese = c;
	}
	// cheese accessor method
	public double get_cheese()
	{
		return cheese;
	}
	// pepperoni mutaotr method
	public void set_pepper(double p)
	{
		 this.pepper = p;
	}
	// pepperoni accessor method
	public double get_pepper()
	{
		return pepper;
	}
	// ham mutator method
	public void set_ham(double h)
	{
		this.ham = h;
	}
	// ham accessor method
	public double get_ham()
	{
		return ham;
	}

	public double calc_Cost()
	{

		if(size.equalsIgnoreCase("small"))
		{
			return 10 + 2*(cheese + pepper + ham);
		}
		else if(size.equalsIgnoreCase("medium"))
		{
			return 12 + 2*(cheese + pepper + ham);
		}
		else if(size.equalsIgnoreCase("large"))
		{
			return 14 + 2*(cheese + pepper + ham);
		}
		else
		{
			return 0.0;
		}
	}
	// calculates the cost of a single pizza based off the amount of toppings and size
	// also it ignores upper and lower case

	public String getDescription()
	{
		return ("Size: " + size + "\nNumber of cheeses: " + cheese + "\nNumber of pepperonis: " + pepper 
				+ "\nNumber of hams: " + ham + "\nTotal cost: " + calc_Cost() + "\n");
	}

}