package Car;


import Car.Car;

public class SmallCar extends Car {
    public SmallCar(String model, String make, int year) {
        super(model, make, year);
    }

    @Override
    public double calculateRentalPrice() {
        return 50; // Basic rental price for a small car
    }
}