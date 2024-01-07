package mainpackage;

import Car.Car;
import Client.Client;
import Client.Client;

public class CarLoanCompany {
    private Car[] inventory;
    private Client[] clients;
    private int carCount;
    private int clientCount;

    public CarLoanCompany() {
        this.inventory = new Car[10]; // Initial inventory size
        this.clients = new Client[10]; // Initial client base size
        this.carCount = 0;
        this.clientCount = 0;
    }

    // Add a car to the inventory
    public void addCar(Car car) {
        if (carCount < inventory.length) {
            inventory[carCount++] = car;
            System.out.println(car.toString() + " added to inventory.");
        } else {
            System.out.println("Inventory full. Cannot add more cars.");
        }
    }

    // Rent a car to a client
    public void rentCar(Client client, Car car) {
        if (clientCount < clients.length) {
            clients[clientCount++] = client;
            System.out.println(client.getName() + " has rented: " + car.toString() + ".");
        } else {
            System.out.println("Client base full. Cannot rent out more cars.");
        }
    }

    // Return a car from a client
    public void returnCar(Client client, Car car) {
        // Check if the client exists and if they have the specified car
        boolean foundClient = false;
        boolean foundCar = false;

        for (int i = 0; i < clientCount; i++) {
            if (clients[i].equals(client)) {
                foundClient = true;
                break;
            }
        }

        if (foundClient) {
            for (int i = 0; i < carCount; i++) {
                if (inventory[i].equals(car)) {
                    foundCar = true;
                    break;
                }
            }
        }

        if (foundClient && foundCar) {
            System.out.println(client.getName() + " has returned: " + car.toString() + ".");
        } else {
            System.out.println(client.getName() + " did not rent this car or is not a valid client.");
        }
    }

    // Display available cars in inventory
    public void displayInventory() {
        System.out.println("Available cars in inventory:");
        for (int i = 0; i < carCount; i++) {
            System.out.println(inventory[i].toString());
        }
    }

    // Display clients
    public void displayClients() {
        System.out.println("Current clients:");
        for (int i = 0; i < clientCount; i++) {
            System.out.println(clients[i].getName());
        }
    }

    Car[] getInventory() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}