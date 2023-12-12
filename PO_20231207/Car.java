public class Car implements Cloneable{
    String make;
    String model;
    double mileage;

    public Car(String make, String model, double mileage) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "" + mileage;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
