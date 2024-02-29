public class ElonsToyCar {

    private int metersDriven;
    private int batteryLevel = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", metersDriven);
    }

    public String batteryDisplay() {
        return batteryLevel == 0 ? "Battery empty" : String.format("Battery at %d%%", batteryLevel);
    }

    public void drive() {
        if (batteryLevel != 0) {
            metersDriven += 20;
            batteryLevel -= 1;
        }
    }
}
