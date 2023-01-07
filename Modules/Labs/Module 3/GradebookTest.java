package Module3Labs;

public class GradebookTest {
    public static void main(String[] args) {//main method to exedcute the program
        //Create Gradebook Object
        Gradebook GB = new Gradebook( "Introduction to Java Programming \n", "Justin Bieber");

        GB.displayMessage(); //display Welcome Message

        System.out.println( "\nChange instructors name to Ed Sheeran\n");
        GB.setCourseInstructor( "Ed Sheeran" );

    }// end main

}// end class GradeBookTest

