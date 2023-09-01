package Advance;

public class File {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("src/secret.txt");
        if (file.exists()) {
            System.out.println("file exist");
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.getPath());
            System.out.println(file.isFile());
        } else {
            System.out.println("file doesn't exist");
        }
    }
}
