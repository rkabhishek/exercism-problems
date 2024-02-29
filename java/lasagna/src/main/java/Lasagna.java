public class Lasagna {

    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minutesInOven) {
        return expectedMinutesInOven() - minutesInOven;
    }

    public int preparationTimeInMinutes(int numLayers) {
        int timeToPrepareEachLayer = 2;
        return numLayers * timeToPrepareEachLayer;
    }

    public int totalTimeInMinutes(int numLayers, int minutesInOven) {
        return preparationTimeInMinutes(numLayers) + minutesInOven;
    }
}
