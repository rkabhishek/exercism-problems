class Darts {

    private static final int OUTER_RADIUS = 10;
    private static final int MIDDLE_RADIUS = 5;
    private static final int INNER_RADIUS = 1;

    private static final int NO_SCORE = 0;
    private static final int OUTER_SCORE = 1;
    private static final int MIDDLE_SCORE = 5;
    private static final int INNER_SCORE = 10;

    int score(double xOfDart, double yOfDart) {
        double distanceFromCenter = Math.sqrt(xOfDart * xOfDart + yOfDart * yOfDart);

        if (distanceFromCenter <= INNER_RADIUS) {
            return INNER_SCORE;
        } else if (distanceFromCenter <= MIDDLE_RADIUS) {
            return MIDDLE_SCORE;
        } else if (distanceFromCenter <= OUTER_RADIUS) {
            return OUTER_SCORE;
        } else {
            return NO_SCORE;
        }
    }
}
