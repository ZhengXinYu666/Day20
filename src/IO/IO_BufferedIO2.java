package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 虽然有两种方式可以读取
 * 但是，两种方式针对同一个独享在一段代码中只能用一个
 */
public class IO_BufferedIO2 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(
          new FileInputStream("bos.txt")
        );

        //读取数据
//        int by = 0;
//        while((by=bis.read())!= -1){
//            System.out.println((char)by);
//        }
//        System.out.println("----------");

        byte[] bys = new byte[1024];
        int len = 0;
        while((len = bis.read(bys))!= -1){
            System.out.println(new String(bys,0,len));
        }
        bis.close();
    }
}
