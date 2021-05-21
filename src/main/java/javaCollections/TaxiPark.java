package javaCollections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaxiPark {
    static final Integer MIN_ALLOW_SPEED = 70;
    static final Integer MAX_ALLOW_SPEED = 100;

    public static void main(String[] args) {
        TaxiPark taxiPark = new TaxiPark();
        List<Car> listTaxiPark = new ArrayList<>();
        listTaxiPark.add(new MediumCar(1200, 10.5, 40));
        listTaxiPark.add(new MediumCar(5000, 8.3, 50));
        listTaxiPark.add(new LuxuryCar(95000, 25.3, 100));
        listTaxiPark.add(new MiniCar(50000, 5.5, 60));
        System.out.println("Total cost taxi park = " + taxiPark.calculateCost(listTaxiPark) + "$");
        taxiPark.sortCarAboutFuelConsumption(listTaxiPark);
        System.out.println("List cars which match speed mode = " +
                taxiPark.chooseCarDefineSpeed(listTaxiPark, MIN_ALLOW_SPEED, MAX_ALLOW_SPEED));
    }

    private List<Car> chooseCarDefineSpeed(List<Car> carList, int minAllowSpeed, int maxAllowSpeed) {
        List<Car> listCarMatchSpeedMode = carList.stream()
                .filter(s -> s.averageSpeed <= maxAllowSpeed && s.averageSpeed >= minAllowSpeed)
                .collect(Collectors.toList());
        return listCarMatchSpeedMode;
    }

    private void sortCarAboutFuelConsumption(List<Car> carList) {
        List<Car> sortedCarList = carList.stream()
                .sorted(Comparator.comparing(Car::getFuelConsumption))
                .collect(Collectors.toList());
        System.out.println("Sort cars based on fuel consumption : " + sortedCarList.toString());
    }

    private Integer calculateCost(List<Car> listTaxiPark) {
        int totalCostTaxiPark = listTaxiPark.stream()
                .mapToInt(Car::getCost)
                .sum();
        return totalCostTaxiPark;
    }
}
