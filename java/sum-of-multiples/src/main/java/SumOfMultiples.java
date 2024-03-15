import java.util.HashSet;
import java.util.Set;

class SumOfMultiples {

    private int sum;
    private final Set<Integer> multiples;

    SumOfMultiples(int number, int[] set) {
        multiples = new HashSet<>();

        for (int i : set) {
            for (int j = 1; j < number; j++) {
                if (i != 0 && j % i == 0 && !multiples.contains(j)) {
                    multiples.add(j);
                    sum += j;
                }
            }
        }
    }

    int getSum() {
        return sum;
    }
}
