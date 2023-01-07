package Module3Labs;

public class Invoice { //Created Class Invoice

    private String partNumber; // State instant Variable partNumber
    private String partDescription; // State instant Variable partDescription
    private int quantityOfItem; // State instant Variable quantityOfItem
    private double pricePerItem;// State instant Variable pricePerItem

    //Constructor for four instance variables
    //Initialise variables

        public Invoice(String partNumber, String partDescription,
                   int quantityOfItem , double pricePerItem){ //Constructor Created for 4 Variables
            this.partNumber = partNumber; // initialisation of the variable partNumber
            this.partDescription = partDescription; // initialisation of the variable partDescription
            this.quantityOfItem = quantityOfItem; // initialisation of the variable quantityOfItem
            this.pricePerItem = pricePerItem; //initialisation of the variable pricePerItem

    }
    //Provide Setter and Getter Method for Each Instance Variable
    public String getPartNumber(){ return partNumber;} // gets partNumber
    public void setPartNumber(String partNumber) { this.partNumber = partNumber; //sets the partNumber
        } // end setter ang getter for partNumber

    public String getPartDescription(){ return partDescription;}// get partDescription
    public void setPartDescription (String partDescription) { this.partDescription = partDescription; // set partDescription
        } // end setter and getter for partDescription

    public int getQuantityOfItem (){ return quantityOfItem;}// get quantityOfItem
    public void setQuantityOfItem( int quantityOfItem)
                { if (quantityOfItem >= 0)
                    this.quantityOfItem = quantityOfItem;
                  else {
                    this.quantityOfItem = 0;
                              System.out.println("Quantity of Item was set to 0");
                }
        }// end setter and getter for quantityOfItem


    public double getPricePerItem(){ return pricePerItem; }// get pricePerItem
    public void setPricePerItem ( double pricePerItem )
                { if (pricePerItem >= 0)
                    this.pricePerItem = pricePerItem ;
                  else {
                    this.pricePerItem = 0;
                    System.out.println("Price Per Item was set to 0");

                }
        }// end of setter and getter for pricePerItem

    //Calculate and Returns invoiceAmount
    public double getInvoiceAmount () {
            return getQuantityOfItem() *  getPricePerItem(); //calculate the total cost
    }// end method get Payment Amount

}// end class Invoice
