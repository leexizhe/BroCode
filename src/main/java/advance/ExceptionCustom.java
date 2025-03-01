package advance;

import java.util.Scanner;

public class ExceptionCustom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age!");
        int age = scanner.nextInt();
        try {
            checkAge(age);
        } catch (AgeException e) {
            throw new RuntimeException(e);
        }
    }

    private static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("You are underage!");
        } else {
            System.out.println("You are old!");
        }
    }

    static class AgeException extends Exception {

        AgeException(String message) {
            super(message);
        }
    }
}
