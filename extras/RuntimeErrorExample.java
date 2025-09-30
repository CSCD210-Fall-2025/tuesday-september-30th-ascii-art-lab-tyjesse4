/**
 * A program that illustrates a runtime error.  It divides by zero, which
 * causes an ArithmeticException when run.  The code compiles fine, but
 * crashes when executed.
 */
public class RuntimeErrorExample {
    public static void main(String[] args) {
        int x = 0;
        System.out.println(5 / x);
        System.out.println("You'll never see this message.");
    }
}