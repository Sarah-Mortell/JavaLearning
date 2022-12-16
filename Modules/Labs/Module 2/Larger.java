package Module2Labs;

import java.io.PrintStream;
import java.util.Scanner;

public class Larger {
    //Application that asks the user to enter two integers
    //Displays the larger number
    //The word is "Larger"
    //If the number are equal
    //Print "These numbers are equal"

    public static void main(String [] args){
        //Create A Scanner
        Scanner input = new Scanner(System.in);
        int num1; //first integer
        int num2; //second integer

        System.out.print("Enter First Number:");// first prompt
        num1 = input.nextInt();

        System.out.print("Enter Second Number:");// second prompt
        num2 = input.nextInt();

        if (num1 > num2) // greater than // DO NOT put ; after this otherwise it will print
        System.out.printf(" %d is larger\n ", num1);

        if (num1 < num2) // less than
        System.out.printf(" %d is larger\n ", num2);

        if (num1 == num2) // equals
        System.out.println("These numbers are equal\n");

    }//end of method
}// end class Larger
