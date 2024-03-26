package Shops;

import Objects.Car;
import Objects.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarShop {
    //List of cars in car shop
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
    public void buyCar(User user, int index){
        if(index < 0 || index > carShop.size()){
            System.out.println("Invalid Choice. ");
            return;
        }
        Car car = carShop.get(index -1);
        if(user.getBalance() < car.getPrice()){
            System.out.println("Insufficient Funds. ");
            return;
        }
        if(!user.isOwnsGarage()){
            System.out.println("You need a garage to store this");
        }else {
            user.setBalance(user.getBalance() - car.getPrice());
            carShop.remove(car);
            System.out.println(user.getName() + " has just bought a " + car.getYear() + " " + car.getMake() + " " + car.getModel() + " for" + car.getPrice());
        }
    }
}
