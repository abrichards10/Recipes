

// Angela Richards
// Grading program for a class with specific grading policies

import java.util.Scanner;

public class Student_Record
{
	//instance variables for the quizzes, midterm and final
	private double quiz1;
	private double quiz2;
	private double quiz3;
	private double midterm;
	private double final_1;
	private double total_grade;
	// sets the variables

	public static void main(String [] args)
	{
	// final exam counts for 40% of grade
	// midterm counts for 35% of grade
	// quizzes Together count for 25% of grade

	double quiz1, quiz2, quiz3, midterm, final_1, total_grade;
	// restates variables in main method

	Scanner input = new Scanner(System.in);

	System.out.print("Quiz 1 score: ");
		quiz1 = input.nextDouble();
	System.out.print("Quiz 2 score: ");
		quiz2 = input.nextDouble();
	System.out.print("Quiz 3 score: ");
		quiz3 = input.nextDouble();
	System.out.print("Midterm score: ");
		midterm = input.nextDouble();
	System.out.print("Final score: ");
		final_1 = input.nextDouble();
	// asks for user input

	Student_Record record = new Student_Record(quiz1, quiz2, quiz3, midterm, final_1);
	// creates a new record from the constructor

	System.out.println(record);
	// prints a new record

	}

	//Equals method
	public boolean equals(Student_Record other)
	{
		if ((this.quiz1 == other.quiz1) && (this.quiz2 == other.quiz2)&& (this.quiz3 == other.quiz3))
			return true;
		else
			return false;
	}

	public void Student_Record()
	{
		quiz1 = 0;
		quiz2 = 0;
		quiz3 = 0;
		midterm = 0;
		final_1 = 0;
	}
	// default constructor

	public Student_Record(double q1, double q2, double q3, double mt, double fn)
	{
		midterm = mt;
		final_1 = fn;
		// assigns value

		if(q1 > 10 || q1 < 0)
        {    
            System.out.println("Invalid quiz score: must be out of 10");
            System.exit(0);
        }
        else
        {
            quiz1 = q1;
        }
        if(q2 > 10 || q2 < 0)
        {    
            System.out.println("Invalid quiz score: must be out of 10");
            System.exit(0);
        }
        else
        {
            quiz2 = q2;
        }   
        if(q3 > 10 || q3 < 0)
        {    
            System.out.println("Invalid quiz score: must be out of 10");
            System.exit(0);
        }
        else
        {
            quiz3 = q3;
        }

        if(mt > 100)
        {
            System.out.println("Invalid midterm score: must be out of 100");
            System.exit(0); 
        }
        else
        {
            midterm = mt;
        }
        if(fn > 100)
        {
            System.out.println("Invalid final Exam score: must be out of 100");
            System.exit(0); 
        }
        else
        {
            final_1 = fn;
        }

	}

	// ToString Method
	public String toString()
	{
		return ("Quiz 1 score: " + quiz1 + "\nQuiz 2 score: " + quiz2 + "\nQuiz 3 score: " + 
				quiz3 + "\nMidterm score: " + midterm + "\nFinal score: " + final_1 + 
				"\nNumber grade: " + num_grade() + "\nLetter grade: " 
				+ letter_grade(num_grade()));
	}

	public double get_quiz()
	{
		return(((quiz1 + quiz2 + quiz3)*.25)/3);
	}
	// gets the quiz score

	public double get_midterm()
	{
		return .35*midterm;
	}
	// gets the midterm score

	public double get_final()
	{
		return .4*final_1;
	}
	// gets the final score

	public double num_grade()
	{
		return get_quiz() + get_midterm() + get_final();
	}
	// calculates the numeric grade

	// method to compute the letter grade
	public String letter_grade(double total_grade)
	{
		if(total_grade >= 90)
		{
			return "A";
		}
		// prints A if 90 or above
		else if((total_grade < 90)&&(total_grade >80))
		{
			return "B";
		}
		// prints B if.. 
		else if((total_grade < 80)&&(total_grade >70))
		{
			return "C";
		}
		// prints C if.. 
		else if((total_grade < 70)&&(total_grade >60))
		{
			return "D";
		}
		// prints D if..
		else
		{
			return "F";
		}
		// prints F as last resort
	}

}