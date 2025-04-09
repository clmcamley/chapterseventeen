//Exercise 17.2

import java.io.*;

public class CreateBinaryDataFile {
    public static void main(String[] args) throws IOException {
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise17_02.dat", true));) {
            for (int i = 0; i < 100; i++) {
                output.writeInt((byte)(Math.random() * 10000));
            }
        }
    }
}
