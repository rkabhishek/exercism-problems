import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};
    private static final String SHIP_REGISTRY_PREFIX = "NCC-";
    private static final int MIN_REGISTRY_NUMBER = 1000;
    private static final int MAX_REGISTRY_NUMBER = 9999;
    private static final double MIN_STARDATE = 41000.0;
    private static final double MAX_STARDATE = 42000.0; // exclusive
    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(PLANET_CLASSES.length)];
    }

    String randomShipRegistryNumber() {
        return SHIP_REGISTRY_PREFIX + random.nextInt(MIN_REGISTRY_NUMBER, MAX_REGISTRY_NUMBER + 1);
    }

    double randomStardate() {
        return random.nextDouble(MIN_STARDATE, MAX_STARDATE);
    }
}
