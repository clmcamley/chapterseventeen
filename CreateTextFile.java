//Exercise 17.1

import java.io.*;

public class CreateTextFile {
    public static void main(String[] args) throws IOException {
        try (PrintWriter output = new PrintWriter(new FileOutputStream("Exercise17_01.txt", true));) {
            for (int i = 0; i < 100; i++) {
                output.write((int)(Math.random() * 10000) + " ");
            }
        }
    }
}
