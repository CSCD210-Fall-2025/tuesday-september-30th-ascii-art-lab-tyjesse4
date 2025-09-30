public class MissingBrace {
    public static void main(String[] args) {
        System.out.println("Missing brace at the end!");
    // The closing brace of main is missing on purpose.
}

// Because there is no closing brace for the main method, the compiler will
// reach the end of the file unexpectedly.  When you compile it you may see:
//   MissingBrace.java:6: error: reached end of file while parsing
//   }
//   ^
//   1 error