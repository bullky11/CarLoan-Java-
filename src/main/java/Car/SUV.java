package Car;

// SUV.java
public class SUV extends Car {
    public SUV(String model, String make, int year) {
        super(model, make, year);
    }

    @Override
    public double calculateRentalPrice() {
        return 80; // Basic rental price for an SUV
    }
}