import java.util.Scanner;

public class Main extends UI{
    public static void main(String[] args) {
        System.out.println("Welcome to my shopping game! Buy Cars and fill up your garage");
        System.out.println();
        ui.addUser();
        ui.displayBalance();
        ui.addShops(); // Adds shops to list
        ui.mainMenu();
    }
}