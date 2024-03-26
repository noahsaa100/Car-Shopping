package Objects;

import java.text.DecimalFormat;

public class Car {
    private String Make;
    private String Model;
    private int Year;
    private double  Price;

    public Car(String make, String model, int year, double price) {
        this.Make = make;
        this.Model = model;
        this.Year = year;
        this.Price = price;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "Car: " +
                "Make: " + Make + '\'' +
                ", Model: '" + Model + '\'' +
                ", Year: " + Year +
                ", Price: " + df.format(Price);
    }
}
