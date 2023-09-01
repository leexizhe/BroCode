package Array;

public class ArrayList {
    public static void main(String[] args) {

        // ArrayList = 	a resizable array.
        //	Elements can be added and removed after compilation phase
        //  store reference data types

        java.util.ArrayList<String> food = new java.util.ArrayList<>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(0, "sushi");
        food.remove(1);

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
