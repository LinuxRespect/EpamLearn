package javaCollections;

public class Car {
    Integer cost;
    Double fuelConsumption;
    Integer averageSpeed;

    public Car(Integer cost, Double fuelConsumption, Integer averageSpeed) {
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
        this.averageSpeed = averageSpeed;
    }

    public Integer getCost() {
        return cost;
    }

    public Double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cost=" + cost +
                ", fuelConsumption=" + fuelConsumption +
                ", averageSpeed=" + averageSpeed +
                '}';
    }
}
