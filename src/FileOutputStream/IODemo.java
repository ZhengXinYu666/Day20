package FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO流用来处理设备之间的数据传输
 *  上传文件和下载文件
 *  Java对数据的操作是通过流的方式
 *  Java用于操作流的对象都在IO包中
 *
 *  一般讨论IO流的时候，未明确按哪种分类来说
 *  默认按数据类型来分
 *
 *  需求：往一个文本文件中输入一句话：hello,io.
 *
 *  分析：
 *      这个操作最好是采用字符流做，但是字符流在字节流之后出现的。
 *      由于我要往文件中写一句话，所以要采用的是字节输出流
 *
 *      分析后直到要使用OutputStream
 *      发现该流对象是一个抽象类，不能实例化
 *      找一个具体子类
 *      File
 *      连起来
 *      FileOutputStream
 *
 *  注意：每种基类的子类都是以父类名作为后缀名
 *
 *  字节输出流操作步骤
 *      A：创建字节输出流对象
 *      B：写数据
 *      C：释放资源
 */
public class IODemo {
    public static void main(String[] args) {
        //创建字节流输出对象
        //File file = new File("fos.txt");
////        FileOutputStream fos = new FileOutputStream(file);
        try {
            FileOutputStream fos = new FileOutputStream("fos.txt");
            /**
             * 创建字节流对象做了那几件事情？
             * 1、调用系统功能去创建文件
             * 2、创建fos对象
             * 3、把fos对象指向这个文件
             */
            //写数据---write()方法
            fos.write("hello,io".getBytes());
            //释放资源
            fos.close();
            /**
             * 为什么一定要close呢？
             * A：让流对象变成垃圾，这样就可以被垃圾回收期回收了
             * B：通知系统去释放跟该文件相关的资源
             */
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
