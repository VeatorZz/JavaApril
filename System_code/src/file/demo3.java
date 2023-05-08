package file;

import java.io.File;
import java.io.IOException;

public class demo3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        //文件删除
        File file =new File("helloworld.txt");
        file.delete();
        file.createNewFile();
        file.deleteOnExit();
        Thread.sleep(5000);
        System.out.println(file.exists());
    }
}
