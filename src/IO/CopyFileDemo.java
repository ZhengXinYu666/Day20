package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 需求：把网络基础1.pdf的内容复制到桌面Demo文件夹的中 网络基础1s.pdf
 *
 * 数据源：网络基础1.pdf---读取数据---FileInputStream
 *
 * 目的地：网络基础1s.pdf---写出数据---FileOutputStream
 *
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/Z/DeskTop/网络基础1.pdf");

        FileOutputStream fos = new FileOutputStream("/Users/Z/DeskTop/Demo/网络基础1s.pdf");

        int by = 0;
        while((by=fis.read())!= -1){
            fos.write(by);
        }

        //释放资源
        fos.close();
        fis.close();

    }
}
