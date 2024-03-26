package Tests;

import Objects.User;
import Shops.GarageShop;

public class GarageShopTest {
    public static void main(String[] args) {
        User user = new User("NS", 300000);
        GarageShop garageShop1 = new GarageShop("C:\\Users\\noahs\\OneDrive\\Documents\\computing\\Mini java games\\ShoppingGame\\src\\Shops\\GarageShop.csv");
        garageShop1.buyGarage(user, 1); // User buys garage
        System.out.println(user.getGaragesOwned()); // Adds garage to list of garages owned
        garageShop1.displayAvailableGarages(); // Show available garages
    }
}
