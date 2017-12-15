package lv.akurss.lesson11.practice;
import java.io.*;

public class FileInputExample {
    public static void main(String[] args) throws IOException {

        File file = new File("test.txt");

        try(InputStream stream = new FileInputStream(file)) {

            int symbol;
            while ((symbol = stream.read()) != -1){ //vn4ale prisvaetsja symbol, a potom prokru4ivaetsja
            System.out.print(" "+symbol);
    }

    }
    catch (IOException e){
            e.printStackTrace();
}


    }
}
