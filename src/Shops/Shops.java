package Shops;

import Objects.User;

public interface Shops {
    String getName();
    void displayAvailableItems();
    void buyItem(User user, int index);
}
