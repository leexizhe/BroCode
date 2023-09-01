package Serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.name = "bro";
        user.age = 18;


        try {
            FileOutputStream fileOutputStream  = new FileOutputStream("UserInfo.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(user);
            objectOutputStream.close();
            fileOutputStream.close();
            user.sayHello();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
