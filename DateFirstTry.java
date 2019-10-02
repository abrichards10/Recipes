

public class DateFirstTry
{
	public String month;
	public int day;
	public int year;

	public void writeOutput()
	{
		System.out.println(this.month + " " + this.day + " " + this.year);
	}

	public int getYear()
	{
		return year;
	}

	public boolean equals(Person P2)
	{
		//Checks this in main:
		P2.equals(P1);
	}

	public int length;
	public int width;

	public static int getArea(int area)
	{
		area = width*length;
	}

	public int Rectangle(int width, int length)
	{	
		Scanner input = new Scanner(System.in);
		width = input.nextInt();
		length = input.nextInt();

		System.out.println("Area of rectangle: " + rectOne.getArea());
		int areaOfRectangle = newRectangle(100, 50).getArea();
	}
}
