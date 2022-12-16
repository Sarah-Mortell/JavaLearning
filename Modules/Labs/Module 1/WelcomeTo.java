package HelloWorld;

public class WelcomeTo {
    // Using print vs. println
    public static void main(String [] args){
        System.out.print("Welcome to");
        System.out.println(" Java programming");
    // print will print the code of one line at a time
        // println allows code to be printed together

        System.out.print("My Name is");
        System.out.print("\nSarah Mortell\n");
        // backslash \n will print the code on a new line

        System.out.println("My\tName\nIs\nSarah\nMortell");
        // backslash \t will tab the next word over

        System.out.println("My Name \ris Sarah Mortell");
        // backslash \r removes everything before the positioning of the \r and only displays what's after the \r

    }
}
