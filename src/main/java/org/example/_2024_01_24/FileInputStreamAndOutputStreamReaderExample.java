package org.example._2024_01_24;

import java.io.*;

public class FileInputStreamAndOutputStreamReaderExample {
    public static void main(String[] args) {

        try (FileInputStream inputStream = new FileInputStream("mem.png");
             FileOutputStream outputStream = new FileOutputStream("mem333.png")) {
            int b;

            while ((b = inputStream.read()) != -1) {
                outputStream.write(b);
            }

            System.out.println("\n");
            System.out.println("!!!DONE!!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
