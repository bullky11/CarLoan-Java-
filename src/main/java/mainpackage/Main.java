package mainpackage;

import Car.SUV;
import Car.SmallBus;
import Car.SmallCar;
import Client.Client;
import Client.Client;
import mainpackage.CarLoanCompany.*;
public class Main {
    public static void main(String[] args) {
        CarLoanCompany company = new CarLoanCompany();

        // Adding cars to inventory
        company.addCar(new SmallCar("ABC", "Toyota", 2020));
        company.addCar(new SUV("XYZ", "Ford", 2019));
        company.addCar(new SmallBus("123", "Mercedes", 2022));

        // Display available cars
        company.displayInventory();

        // Creating a client
        Client client1 = new Client("Alice");

        // Renting a car to the client
        company.rentCar(client1, company.getInventory()[0]);

        // Displaying clients
        company.displayClients();

        // Returning a car from the client
        company.returnCar(client1, company.getInventory()[0]);

        // Displaying available cars after returning
        company.displayInventory();
    }
}