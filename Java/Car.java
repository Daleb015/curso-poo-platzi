package Java;

public class Car {

    Integer id;
    String license;
    Account driver;
    Integer passengers;

    public Car(String license, Integer passengers, Account driver) {
        this.driver = driver;
        this.license = license;
        this.passengers = passengers;
        printDataCar();
    }

    void printDataCar(){
        System.out.println("License: "+license);
    }
}