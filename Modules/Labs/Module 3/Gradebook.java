package Module3Labs;

public class Gradebook { //sets up the method
    /*
    Modify Class Gradebook as Follows;
    1. Include String instance variable that represents name of the course instructor.
    2. set method to change instructor's name.
    3. get method to retrieve instructors name.
    4. modify constructor to specify two parameters - one for course name and one for instructors name.
    5. displayMessage first outputs welcome message and course name,
        then outputs "This course is presented by: " followed by the instructor's name.
    6. Use modified class in TestGradebook to demonstrate the class's new capabilites.
     */

    // Create Attributes (Setter and Getter)

    private String courseName; // Course name for this Gradebook
    private String courseInstructor; // Course instructor's name for this Gradebook

                //this is my made constructor
                public Gradebook( String courseName , String courseInstructor){
                    this.courseName = courseName;//initialises courseName
                    this.courseInstructor = courseInstructor;// initialises courseInstructor
                }//end constructor
                //this is my empty or default constructor
                public Gradebook(){
                }//end empty or default constructor


        //Method to set and get the courseName
        public String getCourseName() { //method to retrieve the course name
            return courseName;
        }
        public void setCourseName(String courseName) { //method to set the course name
            this.courseName = courseName;
        }//end method to set and get courseName


        //Method to set and get the courseInstructor
        public String getCourseInstructor() { //method to retrieve Instructors Name
            return courseInstructor;
        }
        public void setCourseInstructor(String ed_sheeran) { //method to change instructors name
            this.courseInstructor = courseInstructor;
        }//end method to set and get the courseInstructor



    //display a welcome message to the Gradebook User
    public void displayMessage() {
        System.out.println("Welcome to the course " + getCourseName());
        System.out.println("This course is presented by:  " + getCourseInstructor());
    }// end displayMessage

}// end Class Gradebook
