package advance;

public class InnerClassesAnonymous {
    public static void main(String[] args) {
        Greeting greeting1 = new Greeting();
        greeting1.welcome();

        Greeting greeting2 = new Greeting() {
            @Override
            public void welcome() {
                System.out.println("Hello World! This is new");
            }
        };
        greeting2.welcome();
    }

    public static class Greeting {
        public void welcome() {
            System.out.println("Hello World!");
        }
    }
}
