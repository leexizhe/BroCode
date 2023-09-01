package Advance;

public class InnerClassesAnonymous {
    public static void main(String[] args) {
        Greeting greeting1 = new Greeting();
        greeting1.Welcome();

        Greeting greeting2 = new Greeting() {
            @Override
            public void Welcome() {
                System.out.println("Hello World! This is new");
            }
        };
        greeting2.Welcome();
    }

    public static class Greeting {
        public void Welcome() {
            System.out.println("Hello World!");
        }
    }
}
