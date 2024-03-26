package Shops;

import Objects.Car;
import Objects.Garage;
import Objects.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GarageShop {
    // Create a list of garages
     List<Garage> garageList = new ArrayList<>();


    public GarageShop(String filename) {
        loadGaragesFromFile(filename);
    }
    // Load garages from csv
    private void loadGaragesFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String garageName = parts[0].trim();
                int garageCapacity = Integer.parseInt(parts[1].trim());
                double garagePrice = Double.parseDouble(parts[2].trim());
                // Add garages to list
                garageList.add(new Garage(garageName, garageCapacity, garagePrice));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayAvailableGarages() {
        System.out.println("Available Garages:");
        for (int i = 0; i < garageList.size(); i++) {
            System.out.println((i + 1) + ". " + garageList.get(i));
        }
    }

    /* Buys garage and adds to users garage list
     */
    public void buyGarage(User user, int index) {
        if (index < 0 || index > garageList.size()) {
            System.out.println("Invalid Choice. ");
            return;
        }
        Garage garage = garageList.get(index - 1);
        if (user.getBalance() < garage.getGaragePrice()) {
            System.out.println("Insufficient Funds. ");
            return;
        }
        user.setBalance(user.getBalance() - garage.getGaragePrice());
        garageList.remove(garage);
        user.addGarage(garage);
    }
}

