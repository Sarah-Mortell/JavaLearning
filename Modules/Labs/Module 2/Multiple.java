package Module2Labs;

import java.util.*;

public class Multiple {
    // A program
    // Determine if the first number entered is a multiple of the second number entered.

    public static void main(String[] args){
        //Create Scanner
        Scanner input = new Scanner (System.in);
        int firstNumber; //first number entered
        int secondNumber; //second number entered

        System.out.print("Enter First Number:");
        firstNumber = input.nextInt();

        System.out.print("Enter Second Number:");
        secondNumber = input.nextInt();

    // determine whether first number is a multiple of the second number
        if (secondNumber % firstNumber  == 0)
            System.out.printf("%d is a multiple of %d\n", firstNumber , secondNumber);
               else
            System.out.printf("%d is not a multiple of %d\n", firstNumber , secondNumber);


    }//end of method
}//end of Multiple.java Class
