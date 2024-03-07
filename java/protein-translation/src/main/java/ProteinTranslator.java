import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class ProteinTranslator {

    private final static List<String> STOP_CODONS = List.of("UAA", "UAG", "UGA");
    private final static Map<String, String> translation;

    static {
        translation = new HashMap<String, String>();
        translation.put("AUG", "Methionine");
        translation.put("UUU", "Phenylalanine");
        translation.put("UUC", "Phenylalanine");
        translation.put("UUA", "Leucine");
        translation.put("UUG", "Leucine");
        translation.put("UCU", "Serine");
        translation.put("UCC", "Serine");
        translation.put("UCA", "Serine");
        translation.put("UCG", "Serine");
        translation.put("UAU", "Tyrosine");
        translation.put("UAC", "Tyrosine");
        translation.put("UGU", "Cysteine");
        translation.put("UGC", "Cysteine");
        translation.put("UGG", "Tryptophan");
    }

    List<String> translate(String rnaSequence) {
        List<String> result = new ArrayList<>();
        String codon;
        String protein;

        for (int i = 0 ; i < rnaSequence.length(); i += 3) {
            codon = rnaSequence.substring(i, Math.min(i + 3, rnaSequence.length()));
            if (codon.length() != 3) {
                throw new IllegalArgumentException("Invalid codon");
            }

            if (STOP_CODONS.contains(codon)) {
                break;
            }

            if (!translation.containsKey(codon)) {
                throw new IllegalArgumentException("Invalid codon");
            }

            protein = translation.get(codon);
            result.add(protein);
        }

        return result;
    }
}
