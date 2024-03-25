package Shops;

import Objects.Car;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarShop {
    List<Car> carShop = new ArrayList<>();

    public CarShop(String filename) {
        loadCarsFromFile(filename);
    }



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

    public void displayAvailableCars() {
        System.out.println("Available Cars:");
        for (int i = 0; i < carShop.size(); i++) {
            System.out.println((i + 1) + ". " + carShop.get(i));
        }
    }
}
