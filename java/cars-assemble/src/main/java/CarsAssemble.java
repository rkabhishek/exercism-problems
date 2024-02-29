public class CarsAssemble {

    private final static int BASE_HOURLY_PRODUCTION_RATE = 221;
    private final static int MINUTES_PER_HOUR = 60;

    public double productionRatePerHour(int speed) {
        return BASE_HOURLY_PRODUCTION_RATE * speed * successRate(speed);
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed) / MINUTES_PER_HOUR);
    }

    private static double successRate(int speed) {
        double successRate;
        if (speed <= 4) {
            successRate = 1.0;
        } else if (speed <= 8) {
            successRate = 0.9;
        } else if (speed == 9) {
            successRate = 0.8;
        } else {
            successRate = 0.77;
        }
        return successRate;
    }
}
