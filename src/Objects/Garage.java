package Objects;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private String garageName;
    private int garageCapacity;
    private double garagePrice;
    private List<Car> carsInGarage = new ArrayList<>();


    //Initialize
    public Garage(String garageName, int garageCapacity, double garagePrice) {
        this.garageName = garageName;
        this.garageCapacity = garageCapacity;
        this.garagePrice = garagePrice;
    }
    //Getters and Setters
    public List<Car> getCarsInGarage() {
        return carsInGarage;
    }

    public void setCarsInGarage(List<Car> carsInGarage) {
        this.carsInGarage = carsInGarage;
    }

    public double getGaragePrice() {
        return garagePrice;
    }

    public void setGaragePrice(double garagePrice) {
        this.garagePrice = garagePrice;
    }

    public String getGarageName() {
        return garageName;
    }

    public void setGarageName(String garageName) {
        this.garageName = garageName;
    }

    public int getGarageCapacity() {
        return garageCapacity;
    }

    public void setGarageCapacity(int garageCapacity) {
        this.garageCapacity = garageCapacity;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "garageName='" + garageName + '\'' +
                ", garageCapacity=" + garageCapacity +
                ", garagePrice=" + garagePrice +
                '}';
    }

    // Add car to garage
    public void addCar(Car car){
        carsInGarage.add(car);
    }
}
