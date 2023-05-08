package file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class demo13 {
    public static void main(String[] args) throws IOException {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入要扫描的路径");
        String rootPath =scanner.next();
        File root =new File(rootPath);
        if(!root.exists()){
            System.out.println("您输入的路径不存在,无法进行扫描");
            return;
        }
        System.out.println("请输入要删除的文件名中的字符");
        String toDelete =scanner.next();

        //准备进行递归,通过递归的方式,来找到所有的文件
        //找到所有的文件之后,再尝试进行删除
        scanDir(root,toDelete);

    }
    public static void scanDir(File rootDir,String toDelete) throws IOException {
         File[] files=rootDir.listFiles();
         if(files ==null){
             //空目录,直接返回
             return;
         }
         for(File f:files){
             if(f.isDirectory()){
                 //目录,就进行递归
                 scanDir(f,toDelete);
             }else{
                 //普通文件
                 tryDelete(f,toDelete);
             }
         }
    }
    public static  void tryDelete(File f,String toDelete) throws IOException {
        //看看当前文件名是否包含了toDelete,如果包含,就删除,否则啥也不干
        if(f.getName().contains(toDelete)){
            try{
                System.out.println("是否要删除文件"+f.getCanonicalPath());
                Scanner scanner=new Scanner(System.in);
                String choice = scanner.next();
                if(choice.equals("Y")){
                    f.delete();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }

}
