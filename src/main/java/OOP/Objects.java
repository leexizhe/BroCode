package OOP;

public class Objects {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brake();
        myCar.drive();
        System.out.println(myCar.color);
    }

    public static class Car {
        String make = "Chevrolet";
        String model = "Corvette";
        int year = 2020;
        String color = "blue";
        double price = 50000.00;

        void drive() {
            System.out.println("You drive the car");
        }
        void brake() {
            System.out.println("You step on the brakes");
        }
    }
}
