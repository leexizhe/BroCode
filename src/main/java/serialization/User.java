package serialization;

import java.io.Serializable;

public class User implements Serializable {
    String name;
    int age;

    public void sayHello() {
        System.out.println("hello " + name + " your age is " + age);
    }
}
