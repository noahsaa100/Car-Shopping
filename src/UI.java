import Objects.User;
import Shops.CarShop;
import Shops.GarageShop;
import Shops.Shops;
import com.sun.tools.javac.Main;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UI  {
    protected static int choice;

    protected static User user = new User("", 50000);
    protected static CarShop carShop1 = new CarShop("NS MOTOS","C:\\Users\\noahs\\OneDrive\\Documents\\computing\\Mini java games\\ShoppingGame\\src\\Shops\\CarShop.csv");
    protected static GarageShop garageShop1 = new GarageShop("The garage shop","C:\\Users\\noahs\\OneDrive\\Documents\\computing\\Mini java games\\ShoppingGame\\src\\Shops\\GarageShop.csv");
    protected static List<Shops> shopsList = new ArrayList<>();
    static UI ui = new UI();
    public void addShops(){
        shopsList.add(carShop1);
        shopsList.add(garageShop1);
    }

    public void addUser(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Players Name");
        String name = scanner.nextLine();
        user.setName(name);
        System.out.println("Player " + name + " Has been created.");
    }
    public void displayBalance(){
        System.out.println("Balance: " + user.getBalance());
    }

    public void mainMenu(){
        System.out.println("1. View Shops");
        System.out.println("2. View Your Garages");

        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        if (ui.validChoice(String.valueOf(choice))){
            switch (choice) {
                case 1:
                    ui.shopMenu();
            }
        }
    }
    public void shopMenu(){
        System.out.println("1. View Car Shops");
        System.out.println("2. View Garage Shops");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        if (ui.validChoice(String.valueOf(choice))){
            switch (choice) {
                case 1:
                    ui.displayCarShops();
                    break;
                case 2:
                    ui.displayGarageShops();
            }
        }
    }
    public void displayAllShops(){
        for (Shops shop : shopsList) {
            System.out.println(shop.getName());
        }
    }
    public void displayCarShops() {
        System.out.println("Car Shops:");
        int carShopIndex = 0;
        for (int i = 0; i < shopsList.size(); i++) {
            Shops shop = shopsList.get(i);
            if (shop instanceof CarShop) {
                carShopIndex++;
                System.out.println((carShopIndex + 1)+". " + shopsList.get(i).getName());
            }
        }
    }


    public void displayGarageShops() {
        System.out.println("Garage Shops:");
        int garageIndex = 0;
        for (int i = 0; i < shopsList.size(); i++) {
            Shops shop = shopsList.get(i);
            if (shop instanceof GarageShop) {
                garageIndex++;
                System.out.println((garageIndex + 1)+". " + shop.getName());
            }
        }
    }
    public boolean validChoice(String choice){
        try {
            Integer.parseInt(choice);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input - Please choose a valid number");
            return false;
        }
    }

}

