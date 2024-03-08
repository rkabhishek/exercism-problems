class NaturalNumber {

    private final Classification classification;

    NaturalNumber(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }

        int sum = getAliquotSum(number);
        if (sum == number) {
            classification = Classification.PERFECT;
        } else if (sum > number) {
            classification = Classification.ABUNDANT;
        } else {
            classification = Classification.DEFICIENT;
        }
    }

    Classification getClassification() {
        return classification;
    }

    private int getAliquotSum(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            sum += number % i == 0 ? i : 0;
        }
        return sum;
    }
}
