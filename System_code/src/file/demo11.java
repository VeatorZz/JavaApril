package file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class demo11 {
    public static void main(String[] args) {
        try(Writer writer=new FileWriter("test2.txt") ) {
       writer.write("hello world");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
