package object_oriented_programming;

public class Method {
    public static void main(String[] args) {

        // method = a block of code that is executed whenever it is called upon

        int x = 3;
        int y = 4;

        int z = add(x, y);

        System.out.println(z);
    }

    static int add(int x, int y) {

        return x + y;
    }
}
