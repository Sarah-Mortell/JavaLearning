package Module3Labs;

import org.w3c.dom.ls.LSOutput;

public class InvoiceTest {

    public static void main(String[] args) {
        Invoice i1 = new Invoice(
                "123",
                "Screw Driver",
                10,
                19.99);
        // Assign Values to Variables

        //Initialise Invoice
        System.out.println(" Part Number :" + i1.getPartNumber());
        System.out.println(" Part Description :" + i1.getPartDescription());
        System.out.println(" Quantity of Item :" + i1.getQuantityOfItem());
        System.out.println(" Price per Item :"  + i1.getPricePerItem());
        System.out.println(" Get Invoice Amount :" + i1.getInvoiceAmount());


    }// end Main

}// end InvoiceTest
