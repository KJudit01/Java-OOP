package rental;

import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
    List<Car> availableCars = new ArrayList<>();
    void addCar(Car car){
        availableCars.add(car);
    }
    void displayAvailableCars(){
        for(Car car : availableCars){
            System.out.println(car);
        }
    }
    Car findCarByPlateNumber(String plateNumber){
        for(Car car : availableCars){
            if(plateNumber.equals(car.plateNumber)){
                return car;
            }
        }
        return null;
    }
    void rentCar(Car car, int days){
        System.out.println("Kivetted a kocsit " + days + " napra. A kocsi paraméterei: " + car.brand + car.model + car.plateNumber);
    }
}
