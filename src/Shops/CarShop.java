package Shops;

import Objects.Car;
import Objects.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a car shop where users can buy cars.
 */
public class CarShop {
    // List of cars in the car shop
    List<Car> carShop = new ArrayList<>();

    /**
     * Constructs a car shop by loading cars from a CSV file.
     * @param filename the name of the CSV file containing car information
     */
    public CarShop(String filename) {
        loadCarsFromFile(filename);
    }

    /**
     * Loads cars from a CSV file and adds them to the car shop.
     * @param filename the name of the CSV file containing car information
     */
    private void loadCarsFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String make = parts[0].trim();
                String model = parts[1].trim();
                int year = Integer.parseInt(parts[2].trim());
                double price = Double.parseDouble(parts[3].trim());
                carShop.add(new Car(make, model, year, price));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Displays the available cars in the car shop.
     */
    public void displayAvailableCars() {
        System.out.println("Available Cars:");
        for (int i = 0; i < carShop.size(); i++) {
            System.out.println((i + 1) + ". " + carShop.get(i));
        }
    }

    /**
     * Allows a user to buy a car from the car shop.
     * @param user the user who is buying the car
     * @param index the index of the car to be bought
     */
    public void buyCar(User user, int index) {
        if (index < 0 || index > carShop.size()) {
            System.out.println("Invalid Choice. ");
            return;
        }
        Car car = carShop.get(index - 1);
        if (user.getBalance() < car.getPrice()) {
            System.out.println("Insufficient Funds. ");
            return;
        }
        if (!user.isOwnsGarage()) {
            System.out.println("You need a garage to store this");
        } else {
            user.setBalance(user.getBalance() - car.getPrice());
            carShop.remove(car);
            System.out.println(user.getName() + " has just bought a " + car.getYear() + " " + car.getMake() + " " + car.getModel() + " for " + car.getPrice());
        }
    }
}

