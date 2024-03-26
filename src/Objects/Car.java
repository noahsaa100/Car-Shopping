package Objects;

import java.text.DecimalFormat;

/**
 * Represents a car with make, model, year, and price.
 */
public class Car {
    private String Make;
    private String Model;
    private int Year;
    private double Price;

    /**
     * Constructs a car with the given make, model, year, and price.
     * @param make the make of the car
     * @param model the model of the car
     * @param year the year of the car
     * @param price the price of the car
     */
    public Car(String make, String model, int year, double price) {
        this.Make = make;
        this.Model = model;
        this.Year = year;
        this.Price = price;
    }

    /**
     * Gets the make of the car.
     * @return the make of the car
     */
    public String getMake() {
        return Make;
    }

    /**
     * Sets the make of the car.
     * @param make the make of the car
     */
    public void setMake(String make) {
        Make = make;
    }

    /**
     * Gets the model of the car.
     * @return the model of the car
     */
    public String getModel() {
        return Model;
    }

    /**
     * Sets the model of the car.
     * @param model the model of the car
     */
    public void setModel(String model) {
        Model = model;
    }

    /**
     * Gets the year of the car.
     * @return the year of the car
     */
    public int getYear() {
        return Year;
    }

    /**
     * Sets the year of the car.
     * @param year the year of the car
     */
    public void setYear(int year) {
        Year = year;
    }

    /**
     * Gets the price of the car.
     * @return the price of the car
     */
    public double getPrice() {
        return Price;
    }

    /**
     * Sets the price of the car.
     * @param price the price of the car
     */
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
