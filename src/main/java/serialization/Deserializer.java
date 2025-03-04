package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public class Deserializer {
    public static void main(String[] args) {
        User user = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("G:\\My Drive\\projects\\BroCodeJava\\UserInfo.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            user = (User) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println(user.age);
            System.out.println(user.name);
            user.sayHello();

            long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
            System.out.println("serialVersionUID: " + serialVersionUID);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
