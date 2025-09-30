/**
 * A partially refactored version of DrawFigures1.  This program introduces
 * a helper method to print the cone shape that appears multiple times.
 */
public class DrawFigures2 {
    public static void main(String[] args) {
        // Diamond
        drawCone();
        System.out.println("  \\    /");
        System.out.println("   \\  /");
        System.out.println("    \\\/");
        System.out.println();

        // X
        System.out.println("  \\    /");
        System.out.println("   \\  /");
        System.out.println("    \\\/");
        drawCone();
        System.out.println();

        // Rocket
        drawCone();
        System.out.println("+------+ ");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+ ");
        System.out.println("|United|");
        System.out.println("|States|");
        System.out.println("+------+ ");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+ ");
        drawCone();
    }

    /**
     * Prints the three-line cone shape used at the top and bottom of the
     * diamond, X, and rocket.  Using a helper method avoids duplicating
     * identical lines of output.
     */
    public static void drawCone() {
        System.out.println("    /\\");
        System.out.println("   /  \\");
        System.out.println("  /    \\");
    }
}