

//Angela Richards
// THis assignment makes me cOnfused
//But i will power through
/* So what I wrote takes a value from the user and gives 
the sum. The sum is then taken again (if prompted) to be 
all of the values from 1 to 10, 50 and 100.  

//REMEMBER: n! = 1*2*3*4...*n
*/


import java.util.Scanner;
public class solveFactor
{
   public static void main(String[] args) {
       System.out.println();

       int repeat;
       // this is if the user wants to repeat the loop
       double number=1.0;
       double factor=1.0;
       double output=1.0;

           do {
             Scanner input = new Scanner(System.in);
             System.out.println("Enter number for x: ");
             double value = input.nextDouble();
             // prompts the user for an original value

              for (int n=1; n<=10; n++){
                //adds one

                 for (int i=1; i<=10; i++){
                    number = number*value;
                    //after adding another value after the first for
                    //the number is the multiplied by the original input
                  }

                  for (int i=1; i<=10; i++)
                  {
                    factor = factor*i;
                    //new factorial is multiplied by the input
                  }
                //takes the input through the for loop
                // this one multiplies the original factor by 

              output = output+(number/factor);
              // the output is finally given just by addig the output and num
              // but dividing it by fact, which is changed by the second for

              System.out.println();
              System.out.printf("e^%s", value);
              System.out.printf(" (n=%2s)", n);
              System.out.printf("%15.10f", output);
              System.out.println();  
              // prints using the printf statements
         
              }

          System.out.println("Enter 1 to repeat or 0 to end");      
          repeat = input.nextInt();
          // asks if the user wants to give another input
      
      } while (repeat == 1);
      // if the user presses one, then the loop repeats
      // otherwise it dies
   }
 }


