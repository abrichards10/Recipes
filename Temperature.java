

// Angela Richards
// This whole program is a mess.. but I think it outputs temperature
// jesus (pardon) this took too long

public class Temperature
{
	// Declare the instance variables
	private double temperature;
	private char change;
	
		// accessor method to get temp in celcius
	public double get_Celsius()
	{
		if (change == 'C')
		{
			return temperature;
		}
		else
		{
			return ((double) (Math.round((5 * (temperature - 32.0) / 9.0) * 10.0)) / 10);
			// Round to the tenth
		}
	}
	
	// accessor method that returns temp in F
	public double get_Farenheit()
	{
		if (change == 'F')
		{
			return temperature;
		}
		else
		{
			return (Math.round((9 * (temperature / 5) + 32) * 10) / 10);
			// Round to the tenth
		}
	}
	
	// mutator method that sets the temperature
	public void set_Temp(double temperature)
	{
		this.temperature = temperature;
	}
	
	// mutator method that sets the change
	public void set_change(char change)
	{
		this.change = change;
	}
	
	// mutator method that sets the change and temperature
	public void set_Temp_change(double temperature, char change)
	{
		this.temperature = temperature;
		this.change = change;
	}


	// Default constructor
	public Temperature()
	{
		// Set to zero degrees
		temperature = 0;
		change = 'C';
	}
	
	// change constructor
	public Temperature(char change)
	{
		this.change = change;
		temperature = 0;
		// temp is 0 if there is no value
	}
	
	// temperature constructor
	public Temperature(double temperature)
	{
		this.temperature = temperature;
		change = 'C';
		// change is C if no temp is used
	}
	
	public Temperature(double temperature, char change)
	{
		this.temperature = temperature;
		this.change = change;
	}
	// constructors for temperature and change that we can call and assign

	// equals method that tests two temperatures
	public boolean equals(Object obj)
	{
		if (obj instanceof Temperature)
			// instanceof is used to test whether the OBJECT is an instance of the TYPE
			// god i hope i'm using this right 
		{
			Temperature t = (Temperature) obj;
			// creating a new temperature 
			return get_Celsius() == t.get_Celsius();
			// checking if the two celcius' are equal 
		}
		return false;
	}
	
	// tests whether one temp is larger than the other
	public boolean less_than(Object obj)
	{
		if (obj instanceof Temperature)
			// oof, here's instance of again 
		{
			Temperature t = (Temperature) obj;
			return get_Celsius() > t.get_Celsius();
			// checking if the two values are less than one another
		}
		return false;
	}
	
	// tests whether one method is less than the other
	public boolean greater_than(Object obj)
	{
		if (obj instanceof Temperature)
		{
			Temperature t = (Temperature) obj;
			return get_Celsius() < t.get_Celsius();
			// checks if the two values are greater than one another
		}
		return false;
	}
	
	// toString method
	public String toString()
	{
		if (change == 'C')
		{
			return String.format("%.1f degrees C = %.1f degrees F", temperature, get_Farenheit());
			// String.format makes it easier, so theres no unnecessary ++ 
			// also, printf doesn't work with the return apparently? 
		}
		else
		{
			return String.format("%.1f degrees F = %.1f degrees C", temperature, get_Celsius());
		}
	}

	public static void main(String[] args)
	{
		System.out.println("Celsius to Fahrenheit:");
		
		// object named c1
		Temperature c1 = new Temperature();
		c1.set_Temp(0);
		c1.set_change('C');
		System.out.println(c1.toString());

		//object named c2
		Temperature c2 = new Temperature('C');
		c2.set_Temp(-30);
		System.out.println(c2.toString());
		
		//object named c3
		Temperature c3 = new Temperature(420, 'C');
		System.out.println(c3.toString());
		
		// object named f1
		System.out.println("\nFahrenheit to Celsius:");
		Temperature f1 = new Temperature(0);
		f1.set_Temp_change(69, 'F');
		System.out.println(f1.toString());
		
		// compares the tempsss and printsss themmsss
		System.out.println("\nValues compared:");
		System.out.println("c1 < c2: " + c1.less_than(c2));
		System.out.println("c2 = c3: " + c1.equals(c3));
		System.out.println("c3 > f1: " + c3.greater_than(f1));		
	}	
}