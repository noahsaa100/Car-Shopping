package Shops;

import Objects.Car;
import Objects.Garage;
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
 * Represents a shop where users can buy garages.
 */
public class GarageShop implements Shops {
    // List of garages available in the shop
    List<Garage> garageList = new ArrayList<>();
    private String name;



    /**
     * Constructs a garage shop by loading garages from a CSV file.
     * @param filename the name of the CSV file containing garage information
     */
    public GarageShop(String name, String filename) {
        loadGaragesFromFile(filename);
        this.name = name;
    }

    /**
     * Loads garages from a CSV file and adds them to the garage shop.
     * @param filename the name of the CSV file containing garage information
     */
    private void loadGaragesFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String garageName = parts[0].trim();
                int garageCapacity = Integer.parseInt(parts[1].trim());
                double garagePrice = Double.parseDouble(parts[2].trim());
                garageList.add(new Garage(garageName, garageCapacity, garagePrice));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Displays the available garages in the garage shop.
     */
    public void displayAvailableItems() {
        System.out.println("Available Garages:");
        for (int i = 0; i < garageList.size(); i++) {
            System.out.println((i + 1) + ". " + garageList.get(i));
        }
    }

    /**
     * Allows a user to buy a garage from the garage shop and adds it to the user's garage list.
     * @param user the user who is buying the garage
     * @param index the index of the garage to be bought
     */
    public void buyItem(User user, int index) {
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
    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


