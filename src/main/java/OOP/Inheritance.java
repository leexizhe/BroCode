package OOP;

public class Inheritance {
    // process where one class acquires the attributes and methods of another class

    public static void main(String[] args) {
        Transport transport = new Transport();
        Car car = new Car();
        Motor motor = new Motor();

        transport.start();
        car.start();
        motor.start();

        transport.stop();
        car.stop();
        motor.stop();

        System.out.println(car.wheels);
        System.out.println(motor.wheels);
    }


    public static class Transport {
        void stop() {
            System.out.println("The transport is stopping.");
        }

        void start() {
            System.out.println("The transport is moving.");
        }
    }

    public static class Car extends Transport {
        int wheels = 4;
    }

    public static class Motor extends Transport {
        int wheels = 2;
    }
}
