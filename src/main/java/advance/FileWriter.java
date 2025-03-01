package advance;

import java.io.IOException;

public class FileWriter {
    public static void main(String[] args) {

        try {
            java.io.FileWriter writer = new java.io.FileWriter("src/secret.txt");
            writer.write("Roses are red \nViolets are blue \nBooty booty booty booty \nRockin' everywhere!");
            writer.append("\n(A poem by Bro)");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
