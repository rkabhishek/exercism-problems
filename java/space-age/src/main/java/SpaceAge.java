class SpaceAge {

    private final double seconds;
    private final static double EARTH_ORBITAL_PERIOD_IN_SECONDS = 31557600;
    private final static double MERCURY_ORBITAL_PERIOD_IN_SECONDS = 0.2408467 * EARTH_ORBITAL_PERIOD_IN_SECONDS;
    private final static double VENUS_ORBITAL_PERIOD_IN_SECONDS = 0.61519726 * EARTH_ORBITAL_PERIOD_IN_SECONDS;
    private final static double MARS_ORBITAL_PERIOD_IN_SECONDS = 1.8808158 * EARTH_ORBITAL_PERIOD_IN_SECONDS;
    private final static double JUPITER_ORBITAL_PERIOD_IN_SECONDS = 11.862615 * EARTH_ORBITAL_PERIOD_IN_SECONDS;
    private final static double SATURN_ORBITAL_PERIOD_IN_SECONDS = 29.447498 * EARTH_ORBITAL_PERIOD_IN_SECONDS;
    private final static double URANUS_ORBITAL_PERIOD_IN_SECONDS = 84.016846 * EARTH_ORBITAL_PERIOD_IN_SECONDS;
    private final static double NEPTUNE_ORBITAL_PERIOD_IN_SECONDS = 164.79132 * EARTH_ORBITAL_PERIOD_IN_SECONDS;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return getSeconds() / EARTH_ORBITAL_PERIOD_IN_SECONDS;
    }

    double onMercury() {
        return getSeconds() / MERCURY_ORBITAL_PERIOD_IN_SECONDS;
    }

    double onVenus() {
        return getSeconds() / VENUS_ORBITAL_PERIOD_IN_SECONDS;
    }

    double onMars() {
        return getSeconds() / MARS_ORBITAL_PERIOD_IN_SECONDS;
    }

    double onJupiter() {
        return getSeconds() / JUPITER_ORBITAL_PERIOD_IN_SECONDS;
    }

    double onSaturn() {
        return getSeconds() / SATURN_ORBITAL_PERIOD_IN_SECONDS;
    }

    double onUranus() {
        return getSeconds() / URANUS_ORBITAL_PERIOD_IN_SECONDS;
    }

    double onNeptune() {
        return getSeconds() / NEPTUNE_ORBITAL_PERIOD_IN_SECONDS;
    }

}
