package Module4Labs;

import java.util.Scanner;

public class Wages {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Create what's needed to run program
        double hour; //hours worked
        double rate; //hourly wage
        double pay; // gross pay
        int number; //employee number
        int count = 1; //number of employees working

        //Prompt User
        System.out.println("Enter Employee Number: ");
        number = s.nextInt();
        System.out.println("Enter Hours Worked: ");
        hour = s.nextDouble();
        System.out.println("Enter Hourly Rate: ");
        rate = s.nextDouble();

        //Calculate Gross Pay

        if (hour > 40){
            pay = ((40.0* rate) + (hour - 40)*(rate* 1.5)); // must use curly braces if multiple if statements
        } else {
            pay = hour * rate;

        }
        //Calculate Gross Pay
        System.out.println("Payslip:" + pay);



    }
}
