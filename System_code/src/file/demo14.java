package file;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.io.*;
import java.util.Scanner;

public class demo14 {
    //实现复制文件的秘密
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入要复制的文件路径:");
        String srcPath =scanner.next();
        File srcFile =new File(srcPath);
        if(!srcFile.exists()){
            System.out.println("要复制的文件不存在!");
            return;
        }
        if(!srcFile.isFile()){
            System.out.println("要复制的不是普通文件");
            return;
        }
        System.out.println("请输入要复制的目标路径:");
        String destPath= scanner.next();
        File destFile =new File(destPath);
        if(destFile.exists()){
            System.out.println("要复制到的目标已经存在");
            return;
        }
        //////
        //////进行拷贝工作
        //////
        try(InputStream inputStream =new FileInputStream(srcFile)) {
            try(OutputStream outputStream =new FileOutputStream(destFile)){
                byte[] buf =new byte[1024];
                while(true){
                    int len =inputStream.read(buf);
                    if(len ==-1){
                        //拷贝完成
                        break;
                    }
                    outputStream.write(buf,0,len);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
