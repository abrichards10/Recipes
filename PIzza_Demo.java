

// Angela Richards
// This program tests the methods from Pizza

import java.util.Scanner;

public class Pizza_Demo
{

public static void main(String [] args)
	{
		// Uses the Pizza class
		Scanner input = new Scanner(System.in);
		System.out.print("Size of pizza: ");
			String size = input.nextLine();
		System.out.print("Amount of cheese: ");
			double cheese = input.nextDouble();
		System.out.print("Amount of pepperoni: ");
			double pepper = input.nextDouble();
		System.out.print("Amount of ham: ");
			double ham = input.nextDouble();
		System.out.println();
		// prompts the user and gives an exttra line

		Pizza p = new Pizza(size, cheese, pepper, ham);
		// prints out the information given by the input 

		Pizza p0 = new Pizza("small", 0, 6, 9);
		Pizza p1 = new Pizza("medium", 4, 2, 0);
		Pizza p2 = new Pizza("large", 1, 1 ,2);
		// sets three new pizzas with the constructor and set variables

		PizzaOrder order = new PizzaOrder();
		// starts a new pizza order

		// uses the PizzaOrder class
		order.setNumPizzas(3);
		order.setPizza1(p0);
		order.setPizza2(p1);
		order.setPizza3(p2);
		double total = order.calc_Total();

		System.out.println(p.getDescription());
		System.out.println(p0.getDescription());
		System.out.println(p1.getDescription());
		System.out.println(p2.getDescription());
		// prints out the info for the three pizzas
		// and also the user pizza

		System.out.println("Total: $" + total);
		// prints the total cost of all three pizzas

	}

}