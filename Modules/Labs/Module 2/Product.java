package Module2Labs;

import java.util.Scanner;

public class Product {
    // Enter 3 Integers
    //Calculate the Product (Multiplying) of the integers

    public static void main(String [] args){
        //Create Scanner for User Input
        Scanner input = new Scanner (System.in);
        int num1; // first number
        int num2; // second number
        int num3; // third number
        int product; //first number * second number * third number

        System.out.println("Enter First Number: "); // prompt for user
        num1 = input.nextInt(); // Type first number

        System.out.println("Enter Second Number: "); // prompt for user
        num2 = input.nextInt(); // Type second number

        System.out.println("Enter Third Number: "); // prompt for user
        num3 = input.nextInt(); // Type third number

        product = num1 * num2 * num3; // product of 3 numbers
        System.out.printf( "Product is %d\n", product ); // display result



    }// end method
}
