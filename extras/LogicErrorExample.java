/**
 * A program containing a logic error.  It intends to print the result of
 * 1 + 1, but due to string concatenation rules it prints 11 instead.
 */
public class LogicErrorExample {
    public static void main(String[] args) {
        // The following line prints "1 + 1 = 11" because the numbers are
        // concatenated as strings.  Fix the logic by adding parentheses
        // around the arithmetic expression.
        System.out.println("1 + 1 = " + 1 + 1);
    }
}