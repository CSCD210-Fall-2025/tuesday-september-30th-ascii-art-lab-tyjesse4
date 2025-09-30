public class WrongCase {
    public static void main(String[] args) {
        system.out.println("Oops wrong case");
    }
}

// In Java, class and method names are case sensitive.  Here 'system' should
// be capitalised as 'System'.  When you compile this file you will see an
// error similar to:
//   WrongCase.java:4: error: cannot find symbol
//         system.out.println("Oops wrong case");
//         ^
//   symbol:   variable system
//   location: class WrongCase
//   1 error