/**
 * OOPSBannerApp - UC7
 * Demonstrates storing character patterns using Inner Static Class
 */
public class OOPSBannerApp {

    private static final int ROWS = 7;

    /**
     * Inner Static Class to store character and its banner pattern
     */
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * 
         * @param character The character (O, P, S)
         * @param pattern   7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter method to retrieve character
         * 
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter method to retrieve pattern
         * 
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to find pattern for a given character
     * 
     * @param ch       Character to search
     * @param patterns Array of CharacterPatternMap
     * @return pattern if found
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {
        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return new String[ROWS];
    }

    /**
     * Utility method to print banner
     * 
     * @param word     Word to print
     * @param patterns Array of CharacterPatternMap
     */
    public static void printBanner(String word, CharacterPatternMap[] patterns) {

        for (int row = 0; row < ROWS; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, patterns);
                line.append(pattern[row]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        // Pattern for O
        CharacterPatternMap oPattern = new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        // Pattern for P
        CharacterPatternMap pPattern = new CharacterPatternMap('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        // Pattern for S
        CharacterPatternMap sPattern = new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        // Array of objects
        CharacterPatternMap[] patterns = { oPattern, pPattern, sPattern };

        // Print Banner
        printBanner("OOPS", patterns);
    }
}