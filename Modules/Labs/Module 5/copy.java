package Modue5Labs;
import java.util.Scanner;
public class copy {


     // calculates sales for 5 products
        public void calculateSales()
        {
            Scanner input = new Scanner( System.in );

            double product1 = 0; // amount sold of first product
            double product2 = 0; // amount sold of second product
            double product3 = 0; // amount sold of third product
            double product4 = 0; // amount sold of fourth product
            double product5 = 0; // amount sold of fifth product

            int productId = 1; // current product id number

            // ask user for product number until flag value entered
            while ( productId != 0 )
            {
                // determine the product chosen
                System.out.print(
                        "Enter product number (1-5) (0 to stop): " );
                productId = input.nextInt();

                if ( productId >= 1 && productId <= 5 )
                {
                    // determine the number sold of the item
                    System.out.print( "Enter quantity sold: " );
                    int quantity = input.nextInt();

                    // increment the total for the item by the
                    // price times the quantity sold
                    switch ( productId )
                    {
                        case 1:
                            product1 += quantity * 2.98;
                            break;

                        case 2:
                            product2 += quantity * 4.50;
                            break;

                        case 3:
                            product3 += quantity *  9.98;
                            break;

                        case 4:
                            product4 += quantity * 4.49;
                            break;

                        case 5:
                            product5 += quantity * 6.87;
                            break;
                    } // end switch
                } // end if
                else if ( productId != 0 )
                    System.out.println(
                            "Product number must be between 1 and 5 or 0 to stop" );
            } // end while loop

            // print summary
            System.out.println();
            System.out.printf( "Product 1: $%.2f\n", product1 );
            System.out.printf( "Product 2: $%.2f\n", product2 );
            System.out.printf( "Product 3: $%.2f\n", product3 );
            System.out.printf( "Product 4: $%.2f\n", product4 );
            System.out.printf( "Product 5: $%.2f\n", product5 );
        } // end method calculateSales
    } // end class Sales


