package Module2Labs;

import java.util.Scanner;

public class Calculate {
    // Application that asks user to enter two integers
    //Print integer Sum
    //Print integer Product
    //Print integer Difference
    //Print integer Quotient

    public static void main(String [] args){
        //Create Scanner for User Input
        Scanner input = new Scanner (System.in);
        int num1; // first integer
        int num2; // second integer
        int sum; // first integer addition second integer
        int product; // first integer multiply second integer
        int difference; // second integer minus first integer
        int quotient; // second integer divide first integer

        System.out.println("Enter First Number:"); // first prompt
        num1 = input.nextInt();

        System.out.println("Enter Second Number:");// second prompt
        num2 = input.nextInt();

        sum = num1 + num2; // addition
        System.out.printf(" Sum is %d\n", sum);

        product =  num1 * num2; // mulitply
        System.out.printf(" Product is %d\n ", product);

        difference = num2 - num1; // minus
        System.out.printf(" Difference is %d\n", difference);

        quotient = num2 / num1; // divide
        System.out.printf(" Quotient is %d\n", quotient);

    }// end of method
}
