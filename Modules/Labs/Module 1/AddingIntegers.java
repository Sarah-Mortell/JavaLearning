package HelloWorld;

import java.util.Scanner;

public class AddingIntegers {
    // Use a Scanner to Display 2 integers
    // Use Printf to display the sum of two integers

    public static void main(String [] args){
        //Create Scanner for User input
        Scanner input;
        input = new Scanner ( System.in );
        int num1; //first number
        int num2; //second number
        int sum; // sum of first number and second number

        System.out.println("Enter first number: "); // prompt for user
        num1 = input.nextInt(); // read first number

        System.out.println("Enter Second Number"); // prompt for user
        num2 = input.nextInt(); // read second number

        sum = num1 + num2; // addition of the two numbers
        System.out.printf("Sum is %d\n", sum ); // display the result

    } // end method
}
