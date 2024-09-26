package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double bladeWidth;
    private int enginePower;

    public Bulldozer(int enginePower, double bladeWidth) {
        this.enginePower = enginePower;
        this.bladeWidth = bladeWidth;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public String toString() {
        return "Bulldozer{"
                + "bladeWidth=" + bladeWidth
                + ", enginePower=" + enginePower
                + '}';
    }
}
