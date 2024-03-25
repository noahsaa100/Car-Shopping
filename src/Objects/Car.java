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
