package object_oriented_programming;

public class Interface {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Eagle eagle = new Eagle();

        fish.flee();
        fish.hunt();
        System.out.println("");
        eagle.hunt();
    }

    public interface Prey {
        void flee();
    }

    public interface Predator {
        void hunt();
    }

    public static class Fish implements Prey, Predator {
        @Override
        public void flee() {
            System.out.println("flee");
        }

        @Override
        public void hunt() {
            System.out.println("swim");
        }
    }

    public static class Eagle implements Predator {
        @Override
        public void hunt() {
            System.out.println("fly");
        }
    }
}
