package Objects;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a garage with a name, capacity, price, and list of cars.
 */
public class Garage {
    private String garageName;
    private int garageCapacity;
    private double garagePrice;
    private List<Car> carsInGarage = new ArrayList<>();

    /**
     * Initializes a garage with the given name, capacity, and price.
     * @param garageName the name of the garage
     * @param garageCapacity the maximum number of cars the garage can hold
     * @param garagePrice the price to purchase the garage
     */
    public Garage(String garageName, int garageCapacity, double garagePrice) {
        this.garageName = garageName;
        this.garageCapacity = garageCapacity;
        this.garagePrice = garagePrice;
    }

    /**
     * Gets the list of cars currently parked in the garage.
     * @return the list of cars in the garage
     */
    public List<Car> getCarsInGarage() {
        return carsInGarage;
    }

    /**
     * Sets the list of cars in the garage.
     * @param carsInGarage the list of cars to be set in the garage
     */
    public void setCarsInGarage(List<Car> carsInGarage) {
        this.carsInGarage = carsInGarage;
    }

    /**
     * Gets the price of the garage.
     * @return the price of the garage
     */
    public double getGaragePrice() {
        return garagePrice;
    }

    /**
     * Sets the price of the garage.
     * @param garagePrice the price to be set for the garage
     */
    public void setGaragePrice(double garagePrice) {
        this.garagePrice = garagePrice;
    }

    /**
     * Gets the name of the garage.
     * @return the name of the garage
     */
    public String getGarageName() {
        return garageName;
    }

    /**
     * Sets the name of the garage.
     * @param garageName the name to be set for the garage
     */
    public void setGarageName(String garageName) {
        this.garageName = garageName;
    }

    /**
     * Gets the capacity of the garage.
     * @return the capacity of the garage
     */
    public int getGarageCapacity() {
        return garageCapacity;
    }

    /**
     * Sets the capacity of the garage.
     * @param garageCapacity the capacity to be set for the garage
     */
    public void setGarageCapacity(int garageCapacity) {
        this.garageCapacity = garageCapacity;
    }

    /**
     * Adds a car to the garage.
     * @param car the car to be added to the garage
     */
    public void addCar(Car car){
        carsInGarage.add(car);
    }

    @Override
    public String toString() {
        return "Garage{" +
                "garageName='" + garageName + '\'' +
                ", garageCapacity=" + garageCapacity +
                ", garagePrice=" + garagePrice +
                '}';
    }
}

