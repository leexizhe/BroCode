package Advance;

public class InnerClasses {
    public static void main(String[] args) {
        Outside outside = new Outside();
        Outside.Inside inside = outside.new Inside(); // Initialization of new inner class

        System.out.println(outside.x + inside.y);
        inside.greeting();
    }

    public static class Outside {
        String x = "Hello ";

        public class Inside {
            String y = "World!";

            public void greeting() {
                System.out.println(x+y);
            }
        }
    }

}
