package Objects;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a user with a name, balance, ownership of garage, and list of owned garages.
 */
public class User {
    private String Name;
    private double Balance;
    private boolean ownsGarage;
    private List<Garage> garagesOwned;

    /**
     * Constructs a user with the given name and balance.
     * @param name the name of the user
     * @param balance the balance of the user
     */
    public User(String name, double balance) {
        this.Name = name;
        this.Balance = balance;
        this.garagesOwned = new ArrayList<>();
    }

    // Getters and setters

    /**
     * Adds a garage to the user's list of owned garages.
     * @param garage the garage to be added
     */
    public void addGarage(Garage garage){
        garagesOwned.add(garage);
    }

    /**
     * Checks if the user owns any garage.
     * @return true if the user owns at least one garage, false otherwise
     */
    public boolean isOwnsGarage() {
        return !garagesOwned.isEmpty();
    }

    /**
     * Gets the list of garages owned by the user.
     * @return the list of garages owned by the user
     */
    public List<Garage> getGaragesOwned() {
        return garagesOwned;
    }

    /**
     * Sets the list of garages owned by the user.
     * @param garagesOwned the list of garages to be set as owned by the user
     */
    public void setGaragesOwned(List<Garage> garagesOwned) {
        this.garagesOwned = garagesOwned;
    }

    /**
     * Gets the name of the user.
     * @return the name of the user
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets the name of the user.
     * @param name the name to be set for the user
     */
    public void setName(String name) {
        this.Name = name;
    }

    /**
     * Gets the balance of the user.
     * @return the balance of the user
     */
    public double getBalance() {
        return Balance;
    }

    /**
     * Sets the balance of the user.
     * @param balance the balance to be set for the user
     */
    public void setBalance(double balance) {
        this.Balance = balance;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "User: " +
                "Name: " + Name  +
                ", Balance: " + df.format(Balance);
    }
}

