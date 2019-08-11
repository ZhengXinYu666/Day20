package IO;

import java.io.*;

/**
 * 提供了字节缓冲区流
 * BufferedOutputStream  写数据
 * BufferedInputStream  读数据
 * 带缓冲区的字节类会提高效率
 * 缓冲区类---高效类
 * 构造方法可以指定缓冲区大小，但一般默认就足够用了
 *
 * 为什么不传递一个具体的文件或者文件路径？而是传递一个OutPutStream对象呢？
 *
 * 因为,字节缓冲区流仅仅提供缓冲区，为高效而设计的。真正的读写操作还得靠基本的流对象实现
 *
 */
public class IO_BufferedIO {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("/Users/Z/DeskTop/编程题.doc");
//        FileOutputStream fos = new FileOutputStream("/Users/Z/DeskTop/Demo/编程题.doc");
//        BufferedInputStream bis = new BufferedInputStream(fis);
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //简单写法
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("bos.txt"));
        //写数据
        bos.write("hello".getBytes());

        //释放资源
        bos.close();


    }
}
