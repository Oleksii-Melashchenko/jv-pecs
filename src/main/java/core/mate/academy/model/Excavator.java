package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double armLength;
    private double bucketCapacity;

    public Excavator(double armLength, double bucketCapacity) {
        this.armLength = armLength;
        this.bucketCapacity = bucketCapacity;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public String toString() {
        return "Excavator{"
                + "armLength=" + armLength
                + ", bucketCapacity=" + bucketCapacity
                + '}';
    }
}
