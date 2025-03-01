package basic;

public class Random {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();

        // print negative to positive 2 billion
        int x = random.nextInt();
        System.out.println(x);

        // print 0 to 10
        int y = random.nextInt(6);
        System.out.println(y);

        // print double between 0 to 1
        double z = random.nextDouble();
        System.out.println(z);

        // print boolean
        boolean a = random.nextBoolean();
        System.out.println(a);
    }
}
