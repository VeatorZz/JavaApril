package file;

import java.io.File;

public class demo5 {
    public static void main(String[] args) {
        File file1 =new File("./test1.txt");
        File file2 =new File("./test1.txt");
        file1.renameTo(file2);
    }
}
