package Car;

// SmallBus.java
public class SmallBus extends Car {

    public SmallBus(String model, String make, int year) {
        super(model, make, year);
    }

    @Override
    public double calculateRentalPrice() {
        return 100; // Basic rental price for a small bus
    }
}
