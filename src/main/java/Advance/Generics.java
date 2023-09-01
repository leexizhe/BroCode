package Advance;

public class Generics {
    public static void main(String[] args) {
        Integer[] intArrays = {1, 2, 3, 4, 5};
        Double[] doubleArrays = {1.0, 2.0, 3.0, 4.0, 5.0};
        Character[] characterArrays = {'A', 'B', 'C', 'D', 'E'};

        // generics methods
        displayArray(intArrays);
        displayArray(doubleArrays);
        displayArray(characterArrays);

        // generics methods with return generics
        System.out.println(getFirst(intArrays));
        System.out.println(getFirst(doubleArrays));
        System.out.println(getFirst(characterArrays));

        // generics class
        MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
        myInt.getValue();

        MyGenericClass<Double> myDouble = new MyGenericClass<>(1.0);
        myDouble.getValue();
    }

    public static <T> void displayArray(T[] array) {
        for (T x : array) {
            System.out.print(x + " ");
        }
        System.out.println("");
    }

    public static <T> T getFirst(T[] array) {
        return array[0];
    }

    public static class MyGenericClass<T extends Number> { //bounded types
        public MyGenericClass(T x) {
            this.x = x;
        }

        T x;

        public T getValue() {
            return x;
        }
    }
}
