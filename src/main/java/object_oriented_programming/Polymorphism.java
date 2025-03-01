package object_oriented_programming;

public class Polymorphism {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Car car = new Car();
        Truck truck = new Truck();

        Vehicle[] vehicles = {bicycle, car, truck}; // all implements vehicles
        for (Vehicle x : vehicles) { // use for each to loop
            x.go();
        }
    }

    public interface Vehicle {
        void go();
    }

    public static class Bicycle implements Vehicle {

        @Override
        public void go() {
            System.out.println("Bicycle is moving.");
        }
    }

    public static class Car implements Vehicle {

        @Override
        public void go() {
            System.out.println("Car is moving.");
        }
    }

    public static class Truck implements Vehicle {

        @Override
        public void go() {
            System.out.println("Truck is moving.");
        }
    }
}
