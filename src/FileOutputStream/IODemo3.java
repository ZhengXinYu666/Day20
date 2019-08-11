package FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 如何实现数据的换行？
 *  写入换行符号
 *      \n
 *          不同的系统针对不同的换行符号，识别是不同的
 *          win:\r\n
 *          Linux:\n
 *          Mac:\r
 *              而一些常见的高级记事本软件是可以识别任意换行符号的
 *
 * 如何实现数据的追加写入？
 *  构造方法加一个true参数就可以实现追加写入
 *
 */
public class IODemo3 {
    public static void main(String[] args) throws IOException {
       //创建字符输出流对象
        //FileOutputStream fos = new FileOutputStream("fos2.txt");
        FileOutputStream fos = new FileOutputStream("fos2.txt",true);

        //写数据
        for(int x= 0;x<10;x++){
            fos.write(("hello"+" "+x).getBytes());
            fos.write("\r\n".getBytes());
        }

        //释放资源
        fos.close();
    }
}
