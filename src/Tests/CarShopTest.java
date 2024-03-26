package Tests;

import Objects.User;
import Shops.CarShop;
import Shops.GarageShop;

public class CarShopTest {
    public static void main(String[] args) {
        // Create Car Shop Object
        CarShop carShop1 = new CarShop("NS MOTOS","C:\\Users\\noahs\\OneDrive\\Documents\\computing\\Mini java games\\ShoppingGame\\src\\Shops\\CarShop.csv");
        GarageShop garageShop1 = new GarageShop("the garage shop","C:\\Users\\noahs\\OneDrive\\Documents\\computing\\Mini java games\\ShoppingGame\\src\\Shops\\GarageShop.csv");
        User user = new User("Noah", 100_000); // Create User
        System.out.println(user.toString()); // Print User info
        carShop1.displayAvailableItems(); // Display available cars in car shop
        carShop1.buyItem(user, 10); // Buy car at index 10
        garageShop1.displayAvailableItems();
        carShop1.displayAvailableItems(); // Show Car has been bought and removed from list
        System.out.println(user.toString()); // Show Users balance decreased

    }
}