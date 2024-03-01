public class Hamming {
    private int difference;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("strands must be of equal length");
        }

        for(int i = 0; i < leftStrand.length(); i++) {
            difference += leftStrand.charAt(i) != rightStrand.charAt(i) ? 1 : 0;
        }
    }

    public int getHammingDistance() {
        return difference;
    }
}
