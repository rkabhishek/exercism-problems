import java.util.Map;
import java.util.HashMap;

class NucleotideCounter {

    private final Map<Character, Integer> counts = new HashMap<Character, Integer>(Map.of('A', 0, 'C', 0, 'G', 0, 'T', 0));

    public NucleotideCounter(String sequence) {

        for (char c: sequence.toCharArray()) {
            if (!counts.containsKey(c)) {
                throw new IllegalArgumentException(String.format("Invalid DNA sequence: character '%c' is not a valid nucleotide", c));
            }

            int count = counts.get(c);
            counts.put(c, count + 1);
        }
    }

    public Map<Character, Integer> nucleotideCounts() {
        return counts;
    }

}