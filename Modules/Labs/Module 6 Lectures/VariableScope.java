package Modue6Lectures;

public class VariableScope {
    static int classVariable;// instance variables and class variables have default values
    static boolean isOpen;// initial value set to false
    double instanceVariable;// initial value = 0.0

    public static void main(String[] args) {

        System.out.println("Class Variable: " + classVariable);
        System.out.println("Is Open: " + isOpen);

        doStuff(100);

        VariableScope vs = new VariableScope();
        System.out.println("vs.instanceVariable: " + vs.instanceVariable);
    }
    public static void doStuff (int parameterVariable){
        System.out.println("parameterVariable is limited : " + classVariable);
        System.out.println("isOpen in doStuff : " + isOpen);
    }
}
