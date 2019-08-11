package FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 字节输入流操作步骤：
 *      1、创建字节输入流对象
 *      2、调用read方法读取数据，并把数据显示在控制台
 *      3、释放资源
 *
 *  读取数据的方式
 *      A：int read()：一次读取一个字节
 *      B:int read(byte[] b)：一次读取一个自接数组
 */
public class IODemo {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
         FileInputStream fis = new FileInputStream("fos.txt");

         //调用read方法读取数据，并把数据显示在控制台
//        int by = fis.read();
//        System.out.println(by);
//        System.out.println((char)by);
//
//        //第二次读取
//         by = fis.read();
//        System.out.println(by);
//        System.out.println((char)by);
//
//        //第三次读取
//        by = fis.read();
//        System.out.println(by);
//        System.out.println((char)by);
        //发现代码重复度很高，用循环
        //如果读取到的数据是-1，说明读取到了文件末尾了
//        int by = fis.read();
//        while(by != -1){
//            System.out.println((char)by);
//            by = fis.read();
//        }

        //最终版
        int by = 0;
        //读取，赋值，判断
        while((by=fis.read()) != -1){
            System.out.println((char)by);
        }

        //释放资源
        fis.close();
    }
}
