import java.util.*;
class RnaTranscription {
    private static final Map<Character, Character> dnaToRna;

    static {
        dnaToRna = new HashMap<>();
        dnaToRna.put('G', 'C');
        dnaToRna.put('C', 'G');
        dnaToRna.put('T', 'A');
        dnaToRna.put('A', 'U');
    }

    public String transcribe(String dnaStrand) {
        StringBuilder rnaSb = new StringBuilder();

        for (int i = 0; i < dnaStrand.length(); i++) {
            rnaSb.append(dnaToRna.get(dnaStrand.charAt(i)));
        }

        return rnaSb.toString();
    }
}
