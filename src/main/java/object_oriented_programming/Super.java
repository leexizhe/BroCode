package object_oriented_programming;

public class Super {
    public static void main(String[] args) {
        Superhero superhero1 = new Superhero("batman", 14, "money");
        System.out.println(superhero1.toString());

        Superhero superhero2 = new Superhero("superman", 22, "flying");
        System.out.println(superhero2.toString());
    }

    public static class Person {
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        String name;
        int age;

        @Override
        public String toString() {
            return "my name is " + name + " and my age is " + age;
        }
    }

    public static class Superhero extends Person {
        public Superhero(String name, int age, String power) {
            super(name, age);
            this.power = power;
        }

        String power;

        @Override
        public String toString() {
            return super.toString() + " and my power is " + power;
        }
    }
}
