package Modue5Labs;

import java.time.temporal.IsoFields;
import java.util.*;

/*
    Sell 5 Products
    Write application that reads
    a) product number
    b) quantity sold
    Use switch statement to determine the retail price for the products
    Calculate and Display total retail value of all products sold
    Sentinel-Controlled loop to determine when the program should stop looping
    Display Final Results
 */
public class Sales {
    public void calculateSales() {
        Scanner input = new Scanner(System.in);

        double product1 = 2.98;
        double product2 = 4.50;
        double product3 = 9.98;
        double product4 = 4.49;
        double product5 = 6.87;

        int productNumber = 1;
        int quantitySold = 0;
        double sum = product1++ + product2 + product3 + product4 + product5;

        while (productNumber != 0) {

            System.out.println("Enter Product Number (0 to Stop): ");
            productNumber = input.nextInt();


            if (productNumber >= 1 && productNumber <= 5) {
                System.out.println("Enter Quantity Sold: ");
                quantitySold = input.nextInt();


                switch (productNumber) {

                    case 1:
                         product1 = quantitySold++ * 2.98;
                        break;
                    case 2:
                        product2 = quantitySold++ * 4.50;
                        break;
                    case 3:
                        product3 = quantitySold++ * 9.98;
                        break;
                    case 4:
                        product4 = quantitySold++ * 4.49;
                        break;
                    case 5:
                        product5 = quantitySold++ * 6.87;
                        break;
                }//end of Switch
            }// end of if
            else if( productNumber != 0)
                System.out.println("Product Number must be between 1-5 of 0 to stop");
        }// end of while loop


        System.out.println();
        System.out.printf("Product 1: €%.2f\n", product1);
        System.out.printf("Product 2: €%.2f\n", product2);
        System.out.printf("Product 3: €%.2f\n", product3);
        System.out.printf("Product 4: €%.2f\n", product4);
        System.out.printf("Product 5: €%.2f\n", product5);
        System.out.println("Total of all products:" + sum);

    }// end method
}// end class

