package rental;

public abstract class Vehicle {
    String plateNumber;
    double rentPrice;

    abstract void displayInfo();

    abstract double calculateRentalCost(int days);
}
