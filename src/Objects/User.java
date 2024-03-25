package Objects;

import java.text.DecimalFormat;

public class User {
    private String Name;
    private double Balance;

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
