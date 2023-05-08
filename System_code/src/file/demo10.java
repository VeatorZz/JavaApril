package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class demo10 {
    public static void main(String[] args) {
        try(OutputStream outputStream =new FileOutputStream("test2.txt")) {

            String s ="hello java";
            outputStream.write(s.getBytes(StandardCharsets.UTF_8));

        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
