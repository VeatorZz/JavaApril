package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class demo8 {
    //这种方法最好用
    public static void main(String[] args) throws IOException {
        InputStream inputStream =new FileInputStream("test2.txt");
        Scanner scanner =new Scanner(inputStream);
        String s = scanner.next();
        System.out.println(s);
        inputStream.close();
    }
}
