package Module2Labs;

import java.util.*;

public class Calculate2 {
    //Application asking user for three integers
    //Prints the Largest
    //Prints the Smallest
    //Prints the Sum
    //Prints the Product
    //Prints the Average of Three integers

    public static void main(String[] args){
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        int num1; // first integer
        int num2; // second integer
        int num3; // third integer
        int largest;// larger value
        int smallest;// smaller value
        int sum; // num1 plus num2
        int product; // num1 multiply num2
        int average; // num1, num2, num3 average

        //determine numbers

        System.out.print("Enter First Number:"); // first prompt
        num1 = input.nextInt();

        System.out.print("Enter Second Number:"); // second prompt
        num2 = input.nextInt();

        System.out.print("Enter Third Number:"); // third prompt
        num3 = input.nextInt();


        //determine the largest number

        largest = num1;// assume num1 is the largest number

        if (num2 > largest) // determine whether num2 is the largest
            largest = num2;

        if (num3 > largest)// determine whether num3 is the largest
            largest = num3;


        //determine the smallest number

        smallest = num1; //assume num1 is the smallest number

        if (num2 < smallest)// determine whether num2 is the smallest
            smallest = num2;

        if (num3 < smallest)// determine whether num3 is the smallest
            smallest = num3;

        System.out.printf(" Largest is %d\n", largest);

        System.out.printf("Smallest is %d\n", smallest);

        //determine calculations
      sum = num1 + num2 + num3;
        System.out.printf("Sum is %d\n", sum);

      product = num1 * num2 * num3;
        System.out.printf("Product is %d\n", product);

      average = (sum/3);
        System.out.printf("Average is %d\n", average);

    }// end method
}// end class Calculate2
