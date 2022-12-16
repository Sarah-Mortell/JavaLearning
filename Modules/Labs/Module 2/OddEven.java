package Module2Labs;

import java.util.*;

public class OddEven {
    //Application asking user to enter an integer
    //Determines if the number is odd or even

    public static void main(String[] args){
        //Create Scanner
        Scanner input = new Scanner (System.in);
        int num; //number chosen
        int odd; //number chosen is odd
        int even; //number chosen is even

        //determine numbers
        System.out.print("Enter Number:");
        num = input.nextInt();

        //determine odd number
        odd = num;// assume the number chosen is odd

        if (num % 2 != 0)
            System.out.println("The Number is Odd");
        else
            System.out.println("The Number is Even");

    }// end of method
}// end of OddEven Class

