package Advance;

public class Lambda {
    public static void main(String[] args) {
        MyInterface myInterface1 = (x) -> System.out.println("Hello world! " + x);
        myInterface1.message("Bro");


        MyInterface myInterface2 = (x) -> {
            System.out.println("Hello world! 1 " + x);
            System.out.println("Hello world! 2 " + x);

        };

        myInterface2.message("Dog");
    }

    public interface MyInterface {
        public void message(String name);
    }
}
