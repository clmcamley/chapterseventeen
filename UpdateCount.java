//Exercise 17.8

import java.io.*;

public class UpdateCount {
    public static void main(String[] args) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile("Exercise17_08.dat", "rw");) {
            int count = 0;

            if (raf.length() > 0) {
                count = raf.readInt();
            }

            raf.seek(0);
            raf.writeInt(++count);
            System.out.println("This program has been executed " + count + " times.");
        }
    }
}
