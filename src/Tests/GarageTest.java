package Tests;

import Objects.Car;
import Objects.Garage;
import Objects.User;
import Shops.GarageShop;

import java.util.List;

public class GarageTest {
    public static void main(String[] args) {
        User user = new User("NS", 300000);
        Garage garage = new Garage("Standard", 10, 1000);
        Car car = new Car("Lambo", "avent", 2020, 200000);

        garage.addCar(car);
        System.out.println(garage.getCarsInGarage());

        GarageShop garageShop1 = new GarageShop("The garage shop", "C:\\Users\\noahs\\OneDrive\\Documents\\computing\\Mini java games\\ShoppingGame\\src\\Shops\\GarageShop.csv");
        garageShop1.buyItem(user, 1);

    }


}
