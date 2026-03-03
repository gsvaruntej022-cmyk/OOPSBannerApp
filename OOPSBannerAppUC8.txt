import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App - UC8
 * 
 * Demonstrates use of HashMap to store and retrieve
 * banner character patterns efficiently.
 */
public class OOPSBannerAppUC8 {

    /**
     * Builds and returns a HashMap containing
     * character-to-pattern mappings.
     *
     * @return Map<Character, String[]>
     */
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ******",
                "*     *",
                "*     *",
                " ******",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ******",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ******"
        });

        return patternMap;
    }

    /**
     * Renders the banner text using the pattern map.
     *
     * @param text the word to display
     * @param patternMap the character pattern map
     */
    public static void printBanner(String text, Map<Character, String[]> patternMap) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < text.length(); i++) {

                char ch = text.charAt(i);
                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        System.out.println("OOPS Banner App - UC8\n");

        Map<Character, String[]> patternMap = buildCharacterPatterns();

        printBanner("OOPS", patternMap);

        System.out.println("\nProgram Executed Successfully!");
    }
}