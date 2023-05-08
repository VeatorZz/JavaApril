package file;

import java.io.*;

public class demo12 {
    public static void main(String[] args) {
        try (OutputStream outputStream =new FileOutputStream("test2.txt")){
            //此处的PrintWriter 就和System.out有点类似
            PrintWriter printWriter =new PrintWriter(outputStream);
            printWriter.println("hello");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
