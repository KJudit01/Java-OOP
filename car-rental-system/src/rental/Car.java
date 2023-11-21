package rental;

public class Car extends Vehicle {
    String model;
    Brand brand;


    @Override
    void displayInfo() {
        System.out.println("Márka: " + brand);
        System.out.println("Modell: " + model);
        System.out.println("Rendszám: "+ plateNumber);
        System.out.println("Bérlési ár: " + rentPrice);
    }

    @Override
    double calculateRentalCost(int days) {
        return rentPrice * days;
    }
}

