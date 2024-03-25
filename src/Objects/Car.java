package Objects;

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
        return "Car: " +
                "Make: " + Make + '\'' +
                ", Model: '" + Model + '\'' +
                ", Year: " + Year +
                ", Price: " + Price;
    }
}
