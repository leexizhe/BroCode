package OOP;

public class Abstraction {
    public static void main(String[] args) {
        Car car = new Car();
        car.stop();
        car.start();
    }

    public static abstract class Vehicle {
        // abstract class can have methods
        void stop() {
            System.out.println("stop");
        }

        // abstract method must be empty and need to be override in child
        abstract void start();
    }

    public static class Car extends Vehicle {

        @Override
        void start() {
            System.out.println("start");
        }
    }

}
