package Modue6Lectures;

public class DeclaringAndUsingMethods {
    public static void main(String[] args) {
        DeclaringAndUsingMethods.sayHi();//This will be displayed
        sayHi();// This will be displayed

        DeclaringAndUsingMethods.sayHello();//This is not displayed as the String is lost
        sayHello();// This is not Displayed as the String is lost
        String str = sayHello();// This is Displayed as the String is addressed
        System.out.println( "str: " + str);// This is Displayed as the String is addressed

        DeclaringAndUsingMethods daum = new DeclaringAndUsingMethods();// daum is the constructors variable declared
        int sum = daum.add(10 , 20 );// what do you want to do with daum
        System.out.println("Sum: " + sum);

        daum.displayValues(100 , 200); //use object to call upon method

    }
    public static void sayHi(){
        System.out.println("Hi");
    }
    public static String sayHello(){
        return "Hello";
    }
    public int add (int a, int b){ //non-static methods must have object to call upon
        return a + b;
    }
    public void displayValues (int a, int b){//non-static
        System.out.println("The values of a and b : " + a + " and " + b);
    }
}
