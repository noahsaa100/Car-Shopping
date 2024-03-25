package Tests;

import Objects.User;

import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User("", 0);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        user1.setName(name);
        user1.setBalance(100000.50);
        System.out.println(user1.toString());
    }
}
