package Module2Labs;

import java.util.Scanner;

public class LargeSmall {
    //Application asks user for 5 integers
    //Largest of the 5 integers
    //Smallest of the 5 integers

    public static void main(String[] args){
        //Create Scanner
        Scanner input = new Scanner(System.in);
        int num1; //first number
        int num2; //second number
        int num3; //third number
        int num4; //fourth number
        int num5; //fifth number
        int largest; //largest number of the 5 integers
        int smallest; //smallest number of the 5 integers

        //determine numbers

        System.out.print("Enter First Number:");//first prompt
        num1 = input.nextInt();
        System.out.print("Enter Second Number:");//second prompt
        num2 = input.nextInt();
        System.out.print("Enter Third Number:");//third prompt
        num3 = input.nextInt();
        System.out.print("Enter Fourth Number:");//fourth prompt
        num4 = input.nextInt();
        System.out.print("Enter Fifth Number:");//fifth prompt
        num5 = input.nextInt();

        //determine the largest

        largest = num1;// assume largest is num1

        if (num2 > largest)// determine whether number 2 is the largest
            largest = num2;
        if (num3 > largest)// determine whether number 3 is the largest
            largest = num3;
        if (num4 > largest)// determine whether number 4 is the largest
            largest = num4;
        if (num5 > largest)// determine whether number 5 is the largest
            largest = num5;

        //determine the smallest

        smallest = num1; // assume smallest is num1

        if (num2 < smallest)// determine whether number 2 is the smallest
            smallest = num2;
        if (num3 < smallest)// determine whether number 3 is the smallest
            smallest = num3;
        if (num4 < smallest)// determine whether number 4 is the smallest
            smallest = num4;
        if (num5 < smallest)// determine whether number 5 is the smallest
            smallest = num5;

        System.out.printf("Largest is %d\n", largest);
        System.out.printf("Smallest is %d\n", smallest);

    }// end of method

}// end class LargeSmall
