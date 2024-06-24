import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

class HighScores {

    private final List<Integer> highScores;
    private final Integer latestScore;
    private final Integer highestScore;
    private final List<Integer> maxTopThree;

    public HighScores(List<Integer> highScores) {
        if (highScores == null || highScores.isEmpty())
            throw new IllegalArgumentException("List of scores can not be null or empty");

        this.highScores = highScores;
        latestScore = highScores.get(highScores.size() - 1);
        highestScore = Collections.max(highScores);

        List<Integer> copyOfScores = new ArrayList<Integer>(highScores);
        Collections.sort(copyOfScores, Collections.reverseOrder());
        maxTopThree = copyOfScores.subList(0, Math.min(3, copyOfScores.size()));
    }

    List<Integer> scores() {
        return highScores;
    }

    Integer latest() {
        return latestScore;
    }

    Integer personalBest() {
        return highestScore;
    }

    List<Integer> personalTopThree() {
        return maxTopThree;
    }

}