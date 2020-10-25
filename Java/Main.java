package Java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        Account account = new Account();
        account.document="1022359525";

        Car car = new Car("AAA333",5,account);

        System.out.println("Car License: "+car.license);

    }
}