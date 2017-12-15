package lv.akurss.lesson11.practice;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.File;


public class FileOutputExample {

    public static void main(String[] args) {
       byte[] bytes = "Hello world".getBytes();
        File output = new File("test.txt");
        try(OutputStream stream = new FileOutputStream(output,true)){ //true (append) dopisivatj false *default - sozdavatj zanovo
            stream.write(bytes);
           // for (byte aByte: bytes){
           //     stream.write(aByte);
           // }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
