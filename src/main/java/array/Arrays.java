package array;

public class Arrays {

    public static void main(String[] args) {
        // method 1
        System.out.println();
        String[] cars = {"BMW", "Nissan", "KIA"};
        System.out.println(cars[0]);
        cars[0] = "NIL"; // replace the first index
        System.out.println(cars[0]);

        // method 2
        System.out.println();
        String[] truck = new String[3];
        truck[0] = "A";
        truck[1] = "B";
        truck[2] = "C";

        for (int i = 0; i < 3; i++) {
            System.out.println(truck[i]);
        }
    }
}
