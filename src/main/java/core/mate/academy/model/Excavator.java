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

    public double getArmLength() {
        return armLength;
    }

    public void setArmLength(double armLength) {
        this.armLength = armLength;
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
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
