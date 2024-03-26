package Objects;

import java.text.DecimalFormat;
import java.util.List;

public class User {
    private String Name;
    private double Balance;
    private boolean ownsGarage;
    private List<Garage> garagesOwned;

    public boolean isOwnsGarage() {
        if(!garagesOwned.isEmpty()){
            return true;
        }
        return false;
    }

    public void setOwnsGarage(boolean ownsGarage) {
        this.ownsGarage = ownsGarage;
    }

    public List<Garage> getGaragesOwned() {
        return garagesOwned;
    }

    public void setGaragesOwned(List<Garage> garagesOwned) {
        this.garagesOwned = garagesOwned;
    }

    public User(String name, double balance) {
        this.Name = name;
        this.Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public double getBalance() {
        return Balance;
    }

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
