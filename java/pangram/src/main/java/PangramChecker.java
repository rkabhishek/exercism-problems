public class PangramChecker {

    boolean[] letterPresence = new boolean[26];

    public boolean isPangram(String input) {
        input = input.toLowerCase();

        for (char c: input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letterPresence[c - 'a'] = true;
            }
        }

        for (boolean b: letterPresence) {
            if (!b) {
                return false;
            }
        }

        return true;
    }
}
