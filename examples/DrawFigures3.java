/**
 * A fully refactored version of DrawFigures1.  This program uses multiple
 * helper methods to build each figure (diamond, X, and rocket) out of
 * smaller pieces.  Notice how clean the main method becomes.
 */
public class DrawFigures3 {
    public static void main(String[] args) {
        drawDiamond();
        drawX();
        drawRocket();
    }

    // High-level method for the diamond: a cone on top and an inverted cone
    public static void drawDiamond() {
        drawCone();
        drawInvertedCone();
        System.out.println();
    }

    // High-level method for the X: an inverted cone followed by a cone
    public static void drawX() {
        drawInvertedCone();
        drawCone();
        System.out.println();
    }

    // High-level method for the rocket
    public static void drawRocket() {
        drawCone(); // nose
        drawBox();  // top box
        // middle box with text and bottom box combined
        System.out.println("|United|");
        System.out.println("|States|");
        System.out.println("+------+ ");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+ ");
        drawCone(); // tail
    }

    // Helper method: prints the cone shape
    public static void drawCone() {
        System.out.println("    /\\");
        System.out.println("   /  \\");
        System.out.println("  /    \\");
    }

    // Helper method: prints an inverted cone (a V shape)
    public static void drawInvertedCone() {
        System.out.println("  \\    /");
        System.out.println("   \\  /");
        System.out.println("    \\\/");
    }

    // Helper method: prints a simple 4-line box
    public static void drawBox() {
        System.out.println("+------+ ");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+ ");
    }
}