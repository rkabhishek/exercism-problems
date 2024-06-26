import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

class SumOfMultiples {

    private final int sum;

    SumOfMultiples(int number, int[] set) {
        Set<Integer> multiples = new HashSet<>();

        for (int i : set) {
            multiples.addAll(findMultiplesBelow(i, number));
        }

        sum = sumOfElements(multiples);
    }

    int getSum() {
        return sum;
    }

    private List<Integer> findMultiplesBelow(int base, int limit) {
        if (base == 0) {
            return List.of();
        }

        List<Integer> multiples = new ArrayList<>();
        for (int i = base; i < limit; i += base) {
            multiples.add(i);
        }

        return multiples;
    }

    private int sumOfElements(Set<Integer> set) {
        int sum = 0;
        for(int num: set) {
            sum += num;
        }

        return sum;
    }
}
