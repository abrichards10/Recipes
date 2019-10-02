
// Angela Richards
// This program will be used to track fuel and mileage for an automobile.  

import java.util.Scanner;

public class Odometer_Test
{
    private double old_miles ,total, milage, gallons;
    // sets variables as doubles
    
    public Odometer_Test(double miles,double average)
    {
        old_miles = miles;
        total = miles;
        milage = average;
    }
    // default constructor that sets the miles and averages
    
    public double addmiles(double newmiles)
    {
        total = 0;
        total = newmiles;
        return set_average(total);
    }
    // this method adds the miles to the previous input
    
    public double reset()
    {
        total = 0;
        return addmiles(total);
    }
    // this method resets the odometer
    
    public double set_average(double newtrip)
    {
        gallons = (newtrip / milage);
        return gallons;
    }
    // this method 
    
    public String toString()
    {
        return "The number of gallons used on a " + total + " mile trip is " + gallons + "\nThe total miles after the trip is: " + (old_miles+total);
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
            System.out.print("Miles driven: ");
        double miles = input.nextDouble();
        System.out.print("Gallons: ");
            double average = input.nextDouble();
        // This takes the input of the miles driven and the amount of gallons used

        Odometer_Test o1 = new Odometer_Test(miles, average);
        Odometer_Test o2 = new Odometer_Test(miles, average);
        // These two have an output based on the input

        Odometer_Test o3 = new Odometer_Test(34, 24);
        Odometer_Test o4 = new Odometer_Test(65, 87);
        Odometer_Test o5 = new Odometer_Test(300, 5);
        // This runs the inputs through the Odometer_Test methods with set variables

        o2.addmiles(40000);
        o3.addmiles(54.6);
        o4.addmiles(12);
        o5.addmiles(1);
        // adds miles to the previous amount of miles
        
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);
        System.out.println(o5);
        // This prints the previous miles along with the new ones
        
    }   
}
