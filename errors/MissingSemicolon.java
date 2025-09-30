public class MissingSemicolon {
    public static void main(String[] args) {
        System.out.println("Hello world")
    }
}

// This file intentionally omits the semicolon at the end of the println call.
// When you compile it with javac you will see an error similar to:
//   MissingSemicolon.java:4: error: ';' expected
//         System.out.println("Hello world")
//                                         ^
//   1 error