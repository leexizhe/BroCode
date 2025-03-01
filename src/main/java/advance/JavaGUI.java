package advance;

import javax.swing.*;

public class JavaGUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your name"));
        JOptionPane.showMessageDialog(null, "Your age is " + age);
    }
}
