package Tests;

import Shops.CarShop;

public class CarShopTest {
    public static void main(String[] args) {
        CarShop carShop1 = new CarShop("C:\\Users\\noahs\\OneDrive\\Documents\\computing\\Mini java games\\ShoppingGame\\src\\Shops\\CarShop.csv");
        carShop1.displayAvailableCars();
    }
}