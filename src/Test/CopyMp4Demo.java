package Test;

import java.io.*;

/**
 * 字节流四种方式复制文件
 * 1、基本字节流一次读写一个字节
 * 2、基本字节流一次读写一个字节数组
 * 3、高效字节流一次读写一个字节
 * 4、高效字节流一次读写一个字节数组
 *
 * 需求：桌面下的20.26.avi
 */
public class CopyMp4Demo {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        method1("/Users/Z/DeskTop/20.26.avi","/Users/Z/DeskTop/Demo/copy1.avi");
//        method2("/Users/Z/DeskTop/20.26.avi","copy2.avi");
//        method3("/Users/Z/DeskTop/20.26.avi","copy3.avi");
//        method4("/Users/Z/DeskTop/20.26.avi","copy4.avi");
        long end = System.currentTimeMillis();
        System.out.println("共耗时："+(end-start)+"毫秒");
    }

    //基本字节流一次读写一个字节
    public static void method1(String srcString,String destString) throws IOException {
        FileInputStream fis = new FileInputStream(srcString);
        FileOutputStream fos = new FileOutputStream(destString);
        int by = 0;
        while((by = fis.read())!= -1){
            fos.write(by);
        }
        fis.close();
        fos.close();
    }

    //基本字节流一次读写一个字节数组
    public static void method2(String srcString,String destString) throws IOException {
        FileInputStream fis = new FileInputStream(srcString);
        FileOutputStream fos = new FileOutputStream(destString);
        byte[] bys = new byte[1024];
        int len = 0;
        while((len = fis.read(bys))!= -1){
            fos.write(bys,0,len);
        }
        fis.close();
        fos.close();
    }

    //高效字节流一次一个字节
    public static void method3(String srcString,String destString) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream(srcString)
        );
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream(destString)
        );
        int by = 0;
        while((by=bis.read())!= -1){
            bos.write(by);
        }
        bis.close();
        bos.close();
    }

    //高效字节流一次一个字节
    public static void method4(String srcString,String destString) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream(srcString));
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream(destString));
        byte[] bys = new byte[1024];
        int len = 0;
        while((len = bis.read(bys))!= -1){
            bos.write(bys,0,len);
        }
        bis.close();
        bos.close();
    }

}
