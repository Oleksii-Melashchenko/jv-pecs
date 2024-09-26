package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double loadCapacity;
    private double cargoVolume;

    public Truck(double loadCapacity, double cargoVolume) {
        this.loadCapacity = loadCapacity;
        this.cargoVolume = cargoVolume;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public String toString() {
        return "Truck{"
                + "loadCapacity=" + loadCapacity
                + ", cargoVolume=" + cargoVolume
                + '}';
    }
}
