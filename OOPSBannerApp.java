/**
 * OOPSBannerApp
 *
 * UC5: Prints OOPS banner using Inline Array Initialization
 *
 * @author Varun
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline declaration and initialization
        String[] banner = {

            String.join(" ",
                    " *****  ",
                    " *****  ",
                    "******* ",
                    "******* "),

            String.join(" ",
                    "*     * ",
                    "*     * ",
                    "*     * ",
                    "*       "),

            String.join(" ",
                    "*     * ",
                    "*     * ",
                    "*     * ",
                    "*       "),

            String.join(" ",
                    "*     * ",
                    "*     * ",
                    "******* ",
                    "******* "),

            String.join(" ",
                    "*     * ",
                    "*     * ",
                    "*       ",
                    "      * "),

            String.join(" ",
                    "*     * ",
                    "*     * ",
                    "*       ",
                    "      * "),

            String.join(" ",
                    " *****  ",
                    " *****  ",
                    "*       ",
                    "******* ")
        };

        // Enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}