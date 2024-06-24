import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

class HighScores {

    private final List<Integer> highScores;

    public HighScores(List<Integer> highScores) {
        if (highScores == null || highScores.isEmpty())
            throw new IllegalArgumentException("List of scores can not be null or empty");

        this.highScores = highScores;
    }

    List<Integer> scores() {
        return highScores;
    }

    Integer latest() {
        return highScores.get(highScores.size() - 1);
    }

    Integer personalBest() {
        return Collections.max(highScores);
    }

    List<Integer> personalTopThree() {
        List<Integer> copyOfScores = new ArrayList<Integer>(highScores);
        Collections.sort(copyOfScores, Collections.reverseOrder());
        List<Integer> maxTopThree = copyOfScores.subList(0, Math.min(3, copyOfScores.size()));
        return maxTopThree;
    }

}