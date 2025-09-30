/**
 * A simple program to illustrate the order of execution when methods call
 * other methods.  Predict the output before running it!
 */
public class MethodTrace {
    public static void methodA() {
        System.out.println("Inside A");
        methodB();
        System.out.println("Done A");
    }

    public static void methodB() {
        System.out.println("Inside B");
    }

    public static void main(String[] args) {
        System.out.println("Start main");
        methodA();
        System.out.println("End main");
    }
}