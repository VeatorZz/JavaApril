package file;

import java.io.File;
import java.io.IOException;

//演示file类的一些常见用法
public class demo1 {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        System.out.println(file.getParent());
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
    }

}
