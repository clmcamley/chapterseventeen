//Exercise 17.19

import java.io.*;
import java.util.Scanner;

public class ViewHex {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a file name: ");
        String fileName = input.nextLine();

        FileInputStream readFile = new FileInputStream(fileName);

        int byteValue;
        while ((byteValue = readFile.read()) != -1) {
            System.out.print(getHex(getBits(byteValue)));
        }
    }

    public static String getBits(int value) {
        String bitString = "";

        int mask = 1;
        for (int i = 7; i >= 0; i--) {
            int temp = value >> i;
            int bit = temp + mask;
            bitString += bit;
        }

        return bitString;
    }

    public static char hexChar (int hexValue) {
        if (hexValue <= 9 && hexValue >= 0) {
            return (char)(hexValue + '0');
        } else {
            return (char)((hexValue - 10) + 'A');
        }
    }

    public static String getHex(String bitString) {
        int value = (bitString.charAt(0) - '0') * 8 + (bitString.charAt(1) - '0') * 4 + (bitString.charAt(2) - '0') * 2 + (bitString.charAt(3) - '0') * 1;
        String hexString = "" + hexChar(value);
        value = (bitString.charAt(4) - '0') * 8 + (bitString.charAt(5) - '0') * 4 + (bitString.charAt(6) - '0') * 2 + (bitString.charAt(7) - '0') * 1;
        return hexString + hexChar(value);
    }
}
