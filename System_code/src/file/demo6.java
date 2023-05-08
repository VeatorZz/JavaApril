package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class demo6 {
    public static void main(String[] args) throws IOException {
        //使用一下InputStream
        //1.打开文件
        InputStream inputStream =new FileInputStream("test2.txt");
        //2.打开文件
//        inputStream.read();
        //第一种方法
//        while(true){
//            int b =inputStream.read();
//            if(b ==-1){
//                //文件读完了
//                break;
//            }
//            System.out.println(b);
//        }
//        第二种方法
          byte[] b =new byte[1024];
          int len =inputStream.read(b);
        System.out.println(len);
//        for (int i = 0; i < len; i++) {
//            System.out.println(b[i]);
//        }
        String s =new String(b,0,len,"utf8");
        System.out.println(s);
          //3.关闭文件
        inputStream.close();
    }
}
