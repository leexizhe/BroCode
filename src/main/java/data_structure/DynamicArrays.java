package data_structure;

public class DynamicArrays {

    public static void main(String[] args) {

        DynamicArrays arrays = new DynamicArrays(2);
        System.out.println("isEmpty : " + arrays.isEmpty());
        System.out.println("capacity : " + arrays.capacity);
        arrays.add("A");
        arrays.add("B");
        arrays.add("C");
        arrays.add("D");
        arrays.add("E");

        // capacity triple due to size of 5
        System.out.println("capacity :" + arrays.capacity);
        System.out.println(arrays.printArray());

        // insert
        arrays.insert(2, "Z");
        System.out.println(arrays.search("Z"));
        System.out.println(arrays.printArray());

        // capacity is half
        arrays.delete("Z");
        arrays.delete("A");
        arrays.delete("B");
        arrays.delete("C");
        System.out.println(arrays.search("Z"));
        System.out.println("capacity : " + arrays.capacity);
        System.out.println(arrays.printArray());
    }

    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArrays() {
        this.array = new Object[capacity];
    }

    public DynamicArrays(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data) {
        if (size >= capacity) {
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data) {
        if (size >= capacity) {
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }

    public void delete(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                for (int j = i + 1; j < size; j++) {
                    array[j - 1] = array[j];
                }
                array[size - 1] = null;
                size--;
                if (size <= capacity / 3) {
                    shrink();
                }
                break;
            }
        }
    }

    public int search(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    private void grow() {
        int newCapacity = capacity * 2;
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        capacity = newCapacity;
    }

    private void shrink() {
        int newCapacity = capacity / 2;
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        capacity = newCapacity;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public String printArray() {
        String string = "";
        for (int i = 0; i < capacity; i++) {
            string += array[i] + ", ";
        }
        if (!string.isEmpty()) {
            string = string.substring(0, string.length() - 2);
        }
        return string;
    }
}
