package file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class demo7 {
    public static void main(String[] args) throws IOException {
        //学会使用字符流读一下文件
        Reader reader =new FileReader("test2.txt");

        char[] buffer =new char[1024];
        int len =reader.read(buffer);
        for (int i = 0; i < len; i++) {
            System.out.println(buffer[i]);
        }

        //打开之后记得关闭
        reader.close();
// 还有更简单的写法
    }
}
