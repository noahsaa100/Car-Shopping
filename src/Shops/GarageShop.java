package Shops;

import Objects.Garage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GarageShop {
    private List<Garage> garageList;


    public GarageShop(String filename) {
        List<Garage> garageList = new ArrayList<>();
        loadGaragesFromFile(filename);
    }

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

    public void displayAvailableGarages() {
        System.out.println("Available Cars:");
        for (int i = 0; i < garageList.size(); i++) {
            System.out.println((i + 1) + ". " + garageList.get(i));
        }
    }
}

