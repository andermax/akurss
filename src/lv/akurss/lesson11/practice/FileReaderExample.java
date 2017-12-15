package lv.akurss.lesson11.practice;

import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {


        File input = new File("test.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(input))) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.print(line);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}