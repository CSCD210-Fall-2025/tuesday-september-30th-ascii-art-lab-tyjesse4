public class UnclosedString {
    public static void main(String[] args) {
        System.out.println("This string never ends);
    }
}

// This file has a missing closing quote in the string literal.  When you
// compile it you will see an error such as:
//   UnclosedString.java:4: error: unclosed string literal
//         System.out.println("This string never ends);
//                                         ^
//   1 error