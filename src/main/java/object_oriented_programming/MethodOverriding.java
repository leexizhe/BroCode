package object_oriented_programming;

public class MethodOverriding {
    public static void main(String[] args) {
        Animals animals = new Animals();
        Dogs dogs = new Dogs();

        animals.speak();
        dogs.speak();
    }

    public static class Animals {
        void speak() {
            System.out.println("The animals speaking now!");
        }
    }

    public static class Dogs extends Animals {
        @Override // annotation to inform others that the method is override
        void speak() {
            System.out.println("The dogs speaking now!");
        }
    }
}
