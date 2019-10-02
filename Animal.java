

// Angela Richards
// This program will be filled with methods for Animal_Test

public class Animal
{
	// define instance variables for name, population and growth rate
	private String name;
	private long population;
	private double growth_rate;

	// define constructors
	public Animal()
	{
		name = "Human";
		population = 80000000;
		growth_rate = 4.6;
	}

	// 
	public Animal(String nm, long pop, double growth)
	{
		name = nm;
		population = pop;
		growth_rate = growth;
	}

	// equals method that checks for equality when called
	public boolean equals(Animal other)
	{
		if ((this.population == other.population) && (this.growth_rate == other.growth_rate))
			return true;
		else
			return false;
	}
	
	// method to print everything
	public String toString()
	{
		return 	"Animal name: " + name + "\nAnimal population: " + population + "\nAnimal growth rate: " + growth_rate + "%";
	}

	public boolean endangered()
	{
		if(growth_rate < 0)
			// checks if the growth rate is negative
			return true;
		else
			return false;
	}
	// method that returns true when the growth value is negative

	public void set_name(String nm) // mutator method to set name
	{
		String name = nm;
	}

	public String get_name() // accessor method for name
	{
		return name;
	}

	public void set_population(long pop) // mutator method to set population
	{
		long population = pop;
	}

	public long get_population() // accessor method to get population
	{
		return population;
	}

	public void set_Rate(double growth) // mutator method to set growth rate
	{
		double growth_rate = growth;
	}

	public double get_Rate() // accessor method to get growth rate
	{
		return growth_rate;
	}
}



