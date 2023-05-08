package file;

import java.io.File;

//创建目录
public class demo4 {
    public static void main(String[] args) {
        File file =new File("test");
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println("================");
        file.mkdir();
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
    }
}
