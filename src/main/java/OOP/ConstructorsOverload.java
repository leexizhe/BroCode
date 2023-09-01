package OOP;

public class ConstructorsOverload {

    public static void main(String[] args) {


        Pizza pizza1 = new Pizza("thicc crust", "tomato", "mozzerella", "pepperoni");

        System.out.println("Here are the ingredients of your pizza1: ");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.topping);
        System.out.println("");

        Pizza pizza2 = new Pizza("thicc crust", "tomato", "mozzerella");

        System.out.println("Here are the ingredients of your pizza2: ");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.cheese);

    }

    public static class Pizza {


        String bread;
        String sauce;
        String cheese;
        String topping;


        Pizza(String bread, String sauce, String cheese) {

            this.bread = bread;
            this.sauce = sauce;
            this.cheese = cheese;
        }

        Pizza(String bread, String sauce, String cheese, String topping) {

            this.bread = bread;
            this.sauce = sauce;
            this.cheese = cheese;
            this.topping = topping;
        }
    }
}
